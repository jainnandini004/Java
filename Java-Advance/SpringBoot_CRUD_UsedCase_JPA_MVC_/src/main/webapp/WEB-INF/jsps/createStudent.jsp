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
	<h1>Create Student</h1>
	<form:form method="post" action="/create-student">
		<table>
			<tr>
				<td>Enter Student Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Enter Student Class No:</td>
				<td><form:input path="class_no" /></td>
			</tr>
			<tr>
				<td>Enter Student Marks:</td>
				<td><form:input path="marks" /></td>
			</tr>
		</table>
		</br>
		</br>
		<input type="submit" value="Create" />

	</form:form>
</body>
</html>