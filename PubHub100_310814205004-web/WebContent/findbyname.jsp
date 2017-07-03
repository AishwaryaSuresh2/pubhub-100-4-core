<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<%-- <%@taglib url="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>find by name</title>
</head>
<body bgcolor="orange"><center>
<a href="home.jsp">HOME</a><br><br>
<p>Enter the book you want to search</p><br><br>
<Form action="FindByNameServlet">
NAME<input type="text" name="name"><br><br>
<button type="submit" >SEARCH</button>
</center>
</Form>

</body>
</html>