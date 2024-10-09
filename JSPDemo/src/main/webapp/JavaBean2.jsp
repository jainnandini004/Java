<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.javabean.Java1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!----------------------------- create object of Java1 class ------------------------------------------------->
	<jsp:useBean id="obj" class="com.javabean.Java1"></jsp:useBean>
	
	
<!------------------------------- set properties ------------------------------------------------------------->
	<jsp:setProperty property="id" name="obj" />
	<jsp:setProperty property="name" name="obj" />
	<jsp:setProperty property="email" name="obj" />
	
	
<!------------------------------- get properties ------------------------------------------------------------->
	Student Id :
	<jsp:getProperty property="id" name="obj" /><br /> 
	Student Name :
	<jsp:getProperty property="name" name="obj" /><br />
	Student Email :
	<jsp:getProperty property="email" name="obj" />
</body>
</html>