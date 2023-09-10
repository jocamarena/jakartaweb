<%--
  Created by IntelliJ IDEA.
  User: JOSEJ
  Date: 9/9/2023
  Time: 8:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="memory-servlet" >
    <label for="name">Name</label>
    <input type="text" id="name" name="name" value=""><br>
    <label for="title">Memory Title</label>
    <input type="text" id="title" name="title" value=""><br>
    <label for="body" name="body">Memory</label>
    <input type="text" id="body" name="body" value=""><br>
    <input type="submit" value="Save">
</form>
</body>
</html>
