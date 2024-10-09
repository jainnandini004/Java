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

<h1>Update Student</h1>
<form:form method="post" action="/update-student/${id}">
    <table>
        <tr>
            <td>Student Name: </td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Student Class_no: </td>
            <td><form:input path="class_no"/></td>
        </tr>
        <tr>
            <td>Student Marks: </td>
            <td><form:input path="marks"/></td>
        </tr>
       
        <tr>
            <td></td>
            <td><input type="submit" value="Update" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>