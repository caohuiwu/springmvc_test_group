<%--
  Created by IntelliJ IDEA.
  User: caohuiwu
  Date: 2018/11/30
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" session="false" contentType="text/html; charset=utf-8" %>

<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>登录</title>
</head>
<body>
    <form action="/login" method="post">
        <h5>User registration</h5>
        <p>
            <label>姓名：</label>
            <input type="text" id="username" name="username" tabindex="1">
        </p>

        <p>
            <label>密码：</label>
            <input type="text" id="password" name="password" tabindex="2">
        </p>

        <p>
            <label>年龄：</label>
            <input type="text" id="age" name="age" tabindex="3">
        </p>
        <p id="buttons">
            <input id="submit" type="submit" tabindex="4" value="登录">
            <input id="reset" type="reset" tabindex="5" value="reset">
        </p>
    </form>
</body>
</html>

