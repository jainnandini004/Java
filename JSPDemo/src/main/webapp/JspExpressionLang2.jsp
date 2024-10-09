<!-- Using Java Beans -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.javabean.Java1" isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- Used for creating Object -->
<jsp:useBean id="obj" class="com.javabean.Java1"/>

<!-- Used for accessing Properties -->
<jsp:setProperty property="*" name="obj"/>

<%-- 
<jsp:setProperty property="id" name="obj"/>
<jsp:setProperty property="name" name="obj"/>
 --%>
 
 
 <%-- 
 Instead of jsp getProperty
<jsp:getProperty property="id" name="obj"/>
<jsp:getProperty property="name" name="obj"/>
 --%>
 
Student Id :${obj.id};
Student Name:${obj.name};

</body>
</html>