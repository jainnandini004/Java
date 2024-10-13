<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.hibernate.dao.StudentDaoImpl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="stu" class="com.hibernate.entity.Student"></jsp:useBean>
<jsp:setProperty property="*" name="stu"/> <%-- property set in stu --%>

<%
int x = StudentDaoImpl.register(stu);

if(x>0)
{
	out.println("successfully registered");
}
%>

</body>
</html>