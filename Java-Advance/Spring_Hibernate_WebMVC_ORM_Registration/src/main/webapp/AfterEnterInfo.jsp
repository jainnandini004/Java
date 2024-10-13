<!-- //DONE -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="obj" class="com.hibernate.entity.Student"></jsp:useBean>
	<jsp:setProperty property="name" name="obj" />
	<jsp:setProperty property="email" name="obj" />
	<jsp:setProperty property="password" name="obj" />

	<form action="hello">

		<input type="submit" value="SUBMIT">

	</form>

</body>
</html>