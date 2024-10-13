<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%="Start of include tag" %>
<%out.println("<br/>"); %>
<jsp:include page="Demo.jsp">
<jsp:param value="Nandini" name="name"/>
</jsp:include>
<%out.println("<br/>"); %>
<%="End of include tag" %>
</body>
</html>