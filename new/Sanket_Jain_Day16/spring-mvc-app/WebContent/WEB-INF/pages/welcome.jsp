<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<a href="/spring/user/store/store">Add Employee</a>  
<a href="/spring-mvc-app/spring/user/getAll">View Employees</a> 
</div>
	<h3>${msg}</h3>
	<h1>This is the welcome page that can show dynamic data</h1>
	<h3>${date}</h3>
	<div>
	<h1>User By ID: </h1>
	<h3>${user}</h3>
	</div>
</body>
</html>