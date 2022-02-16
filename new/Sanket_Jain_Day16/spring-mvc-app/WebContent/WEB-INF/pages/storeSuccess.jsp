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
<h1>Users List: </h1>    
   <br/>  
	<a href = "getAll">Users</a><hr />
	<h3>${uList}</h3>
<h1>Users List</h1>  
	<table border="2" width="70%" cellpadding="2">  
	<tr><th>Id</th><th>Name</th><th>Password</th><th>Age</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="user" items="${uList}">   
   <tr>  
   <td>${user.userId}</td>  
   <td>${user.name}</td>  
   <td>${user.password}</td>  
   <td>${user.age}</td>  
   <td><a href="editById/${user.userId}">Edit</a></td>  
   <td><a href="deleteById/${user.userId}" >Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
</div>
	<h3>${msg}</h3>
	
	<div>
	<h1>Find User By Id</h1>
	
	<form action = "getUserById" method = "get">
		UserId: <input type = 'number' name = 'userid' /> <br />
		<input type = 'submit' value = 'Get User' />
	</form>
	<form action = "deleteById" method ="delete">
		UserId: <input type = 'number' name = 'userId' /> <br />
		<input type = 'submit' value = 'Delete User' />
	</form>
	
	</div>
</body>
</html>