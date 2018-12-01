<%--
  Created by IntelliJ IDEA.
  User: caohuiwu
  Date: 2018/11/30
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success page</title>
</head>
<body>
    <h5>greeting was successful</h5>
    <p>
        name：${requestScope.user.username}<br /> password：${requestScope.user.password}<br /> age：${requestScope.user.age}<br />
    </p>
</body>
</html>
