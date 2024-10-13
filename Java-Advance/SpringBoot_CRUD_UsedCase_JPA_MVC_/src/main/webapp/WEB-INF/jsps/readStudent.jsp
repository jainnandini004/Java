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

<h1>Existing Students</h1>
    <table border="1" width="90%" cellpadding="4">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Class_no</th>
            <th>Marks</th>
            <th>Update</th>
            <th>Delete</th>
           
        </tr>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.class_no}</td>
                <td>${student.marks}</td>
                
                <td><a href="/update-student/${student.id}">Update</a></td>
                <td><a href="/delete-student/${student.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
<br/>
<a href="/create-student">Create Student</a>

</body>
</html>