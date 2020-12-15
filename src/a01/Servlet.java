
package a01;
 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 
/**
 * 登录验证Servlet类
 * @author pan_junbiao
 */
@WebServlet(name = "LoginServlet", urlPatterns = "/a01/Servlet")
public class Servlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // 将输出转换为中文
        request.setCharacterEncoding("UTF-8");
        // 设置输出为中文
        response.setCharacterEncoding("UTF-8");
        // 获取参数
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        boolean flag = false;
		try {
			Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
			Matcher m = p.matcher(password);
			flag = m.matches();
		} catch (Exception e) {
			flag = false;
		}
        // 登录验证信息
        if (flag)
        {
            // 如果验证成功，则转发succeed.jsp页面，并在页面显示用户名
            request.getRequestDispatcher("/success.jsp").forward(request, response);
        } else
        {
            // 如果验证失败，则重定向到登录页面
            response.sendRedirect("/web_2/Relogin.jsp");
        }
    }
}