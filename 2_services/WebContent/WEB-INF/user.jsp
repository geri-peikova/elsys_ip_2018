<%@page import="org.elsys.ip.servlet.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<% if (request.getAttribute("Username").equals("admin")) { %>
<jsp:forward page = "admin.jsp" />
</head>
<%}else{ %>
<title>User</title>
</head>
<body>
	<html>
   <head><title>  </title></head>
   
   Welcome!!!

	<table>
		<tr>
			<th>ID</th>
			<td>${requestScope.ID}</td>
		</tr>
		<tr>
			<th>Username</th>
			<td>${requestScope.Username}</td>
		</tr>
		<tr>
			<th>Email</th>
			<td>${requestScope.Email}</td>
		</tr>
		
	</table>
</body>
<% } %>
</html>