<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<h2>Edit User Data : </h2>
	<h3>${uUser.userId}</h3>
	<form action = "/spring-mvc-app/spring/user/updateUser/${uUser.userId}" method = "post">
	Id: <input type = 'number' name = 'userId' value='${uUser.userId}' disabled=true/> <br />
		Name: <input type = 'text' name = 'n1' placeholder="${uUser.name}"/> <br />
		Password: <input type = 'password' name = 'n2' placeholder="${uUser.password}" /> <br />
		Age: <input type = 'number' name = 'n3' placeholder="${uUser.age}"/> <br />
		<input type = 'submit' value = 'Update' />
	</form>
</div>
</body>
</html>