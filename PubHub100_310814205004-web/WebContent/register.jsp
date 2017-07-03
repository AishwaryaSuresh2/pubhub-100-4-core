
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>register</title>
</head>
<body >

<a href="home.jsp">HOME</a><br><br>
<form action="RegisterServlet" method="post">
<br><br><br><center>
<b><font color="blue">Name<input type="text" name="name"/><br><br>
Email<input type="email" name="email"/><br><br>
Password<input type="password" name="password"/><br><br></b></font></center>
<center>
<button type="submit"> <font color="red"><i>Register</i></font></button></center>
</form>

</body>
</html>