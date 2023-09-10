<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><% Date today = new Date(); %> Hello World! <%= today %>
</h1>
<br/>
<a href="hello">Hello Servlet</a>
<a href="MemoryEntry.jsp">Memory Entry</a>
<a href="memory-servlet">Memory Servlet</a>
</body>
</html>