<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <meta name="author" content="pan_junbiao的博客">
</head>
<body>
<div align="center">请输入个人信息
    <form name="form1" method="post" action="a01/Servlet">
        <table>
            <tr>
                <td>姓名：</td>
                <td><input type="text" name="user" style="width:200px" /></td>
            </tr>
            <tr>
                <td>号码：</td>
                <td><input type="password" name="password" style="width:200px"/></td>
            </tr>
            <!-- 以下是提交、取消按钮 -->
            <tr align='right'>
                <td>
                    <input type="submit" value="提交" />
                </td>
                <td>
                    <input type="reset" value="取消" />
                </td>
            </tr>
        </table>
    </form>
    <div align="center"> 号码输入错误，请重新输入。
</div>
</body>
</html>