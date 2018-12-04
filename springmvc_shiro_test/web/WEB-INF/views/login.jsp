<%--
  Created by IntelliJ IDEA.
  User: caohuiwu
  Date: 2018/11/30
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login page</title>
</head>
<body>
    <h1>login page</h1>
    <form id="" action="login" method="post">
        <label>User Name</label>
        <input tyep="text" name="userName" maxLength="40"/>
        <label>Password</label>
        <input type="password" name="password"/>
        <input type="submit" value="login"/>
    </form>
    <%--用于输入后台返回的验证错误信息 --%>

</body>
</html>
