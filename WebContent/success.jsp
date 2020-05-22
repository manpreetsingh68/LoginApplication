<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.loginapp.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h3>Login successful!</h3>

<%
User user = (User)request.getAttribute("user");
%>

Hello <%= user.getUserName() %>! Your user ID is <%= user.getUserId() %>.

</body>
</html>