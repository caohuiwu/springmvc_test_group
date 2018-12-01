<%--
  Created by IntelliJ IDEA.
  User: caohuiwu
  Date: 2018/11/30
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"  session="false" %>

<%
    final String queryString = request.getQueryString();
    final String url = request.getContextPath() + "/login" + (queryString != null ? "?" + queryString : "");
    response.sendRedirect(response.encodeURL(url));%>

