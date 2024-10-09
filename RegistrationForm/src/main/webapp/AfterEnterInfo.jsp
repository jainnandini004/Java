

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.registration.ConnectWithDB"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.registration.JavaBeanStruct"></jsp:useBean>
 <jsp:setProperty property="name" name="obj"/>
 <jsp:setProperty property="email" name="obj"/>
 <jsp:setProperty property="password" name="obj"/>
<% 
int status=ConnectWithDB.register(obj);
if (status>0)
{
out.println("<br/>");
out.println("Thank You, you are successfully registered");
out.println("<br/>");
}

%>
</body>
</html>