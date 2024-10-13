<%--This file used by Action tag file --%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome</h1>
 
<%="Start of Forward tag" %>
<%out.println("<br/>"); %>
<%out.println(request.getParameter("name"));%>
<%out.println("<br/>"); %>
<%="End of Forward tag" %>
</body>
</html>