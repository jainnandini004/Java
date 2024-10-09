<%--JSP Action Tag-
 	jsp:forward
 	jsp:include
 	jsp:useBean
 	jsp:setProperty
    jsp:getProperty
   	jsp:param
   ...   --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>

<%--Same as request dispatcher in ServletDemo --%>
<jsp:forward page="Demo.jsp">
<jsp:param value="Nandini" name="name"/>
</jsp:forward>
</body>
</html>