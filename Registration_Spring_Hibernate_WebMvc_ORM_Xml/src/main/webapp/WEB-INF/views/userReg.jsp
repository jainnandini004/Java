<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- ...................................................................... -->
<!-- FORWARD GOING -->

<h2> Employee Registration Page</h2>

<form action="registerUser" >

<pre>
 Enter Employee Id: <input type="text" name="id"/><br/>
 Enter Employee FirstName: <input type="text" name="firstname"/><br/>
 Enter Employee LastName: <input type="text" name="lastname"/><br/>
 
 <input type="submit" value="register"/>
 
</pre>

</form>

<!-- ...................................................................... -->
<!-- BACKWARD GOING -->
<br/>
${result}


</body>
</html>