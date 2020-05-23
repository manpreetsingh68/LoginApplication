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

<jsp:useBean id="user" class="com.loginapp.dto.User" scope="request">
	<jsp:setProperty property="userName" name="user" value="newUser"/>
</jsp:useBean>

Hello <jsp:getProperty property="userName" name="user"/> 

</body>
</html>