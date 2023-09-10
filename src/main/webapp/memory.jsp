<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: JOSEJ
  Date: 9/9/2023
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Memory</title>
</head>
<body>
<a href="MemoryEntry.jsp">Add Memory</a>
<h1>Memory</h1>
<p>date: <% Date date = new Date(); %> <%= date %></p>
<core:forEach var="i" begin="1" end="2">
    <p>Iteration number: ${i}</p>
</core:forEach>
<core:forEach items="${memories}" var="memory">
    <p>Memory: ${memory}</p>
</core:forEach>
</body>
</html>
