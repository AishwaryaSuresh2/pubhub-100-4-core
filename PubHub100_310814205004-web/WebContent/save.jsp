<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a book</title>
</head>
<body>

<a href="home.jsp">HOME</a><br><br>
<form action="SaveServlet" method="post">

<br><br><br><center>
<font color="blue"><b>
Name<input type="text" name="name"/><br><br>
Authors Name<input type="text" name="author_name"/></b><br><br>
</font></center>
<center>
<button type="submit"> <font color="red"><i>Save</i></font></button></center>
</form>
</body>
</html>