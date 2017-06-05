<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<center>
	<form:form modelAttribute="user" action="/register" method="post">
		<table border="1">
			<tr>
				<td>Username</td> <td><form:input path="userName" type="text"/></td>
			</tr>
			<tr>
				<td>Password</td> <td><form:password path="userPassword"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>
</center>
</body>
</html>