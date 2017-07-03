<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select all values</title>
</head>
<body>

<a href="home.jsp">HOME</a>

<table border=1><thead><center>
<tr>
<th><b><br>ID</b></th><br><br>
<th><b></b><br>BOOK_NAME</b></th><br><br>

<th><b><br>PRICE</b></th><br><br>
<th><b><br>AUTHORS_NAME</b></th><br><br>
</tr>
</thead>
<tbody>
<C:forEach var="book" items="${books}">
<tr><br><br>
<td><br>${book.id}<br></td><br><br>
<td><br>${book.book_name}<br></td><br><br>
<td><br>${book.price}<br></td><br><br>
<td><br>${book.author_name}<br></td><br></center>
</tr></C:forEach></tbody>
</table>


</body>
</html>