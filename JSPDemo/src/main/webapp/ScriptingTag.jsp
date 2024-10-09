<%--SCRIPTING TAG --%>
<%--
	1.Scriplet Tag(Java code)
	2.Expression Tag(Java Code)
	3.Declarative Tag(Java Code)
--%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- scriplet tag -->
<%
out.println("Scripting Tag");
out.println("<br/>");
%>


<!-- Expression tag -->
<%="Expression"+"Tag"%>


<!-- Declarative tag -->
<%!
  	int num1=2;
	int num2=4;
  	int sum(int x,int y)
  {
	 return x+y; 
  }

%>


<%
out.println("<br/>");
out.println("Declarative Tag");
out.println("<br/>");
out.println("Number1 : " +num1);
out.println("<br/>");
out.println("Number2 : " +num2);
int x = sum(6,4);
out.println("<br/>");
out.println("Sum of "+num1+" and " +num2+ " = "+x);

%>


</body>
</html>