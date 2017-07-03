<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%@taglib url="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>search</title>
</head>
<body>


<a href="home.jsp">HOME</a>
<form action="FindByNameServlet">
<table border=1><thead>
<tr>s
<th><b>ID</b></th><br><br>
<th><b>BOOK_NAME</b></th><br><br>
<th><b>PRICE</b></th><br><br>
<th><b>AUTHORS_NAME</b></th><br><br>
</tr></thead><tbody>
<C:forEach var="book" items="${books}">
<tr><br><br>
<td>${book.id}</td><br><br>
<td>${book.book_name}</td><br><br>
<td>${book.price}</td><br><br>
<td>${book.author_name}</td><br>
</tr></C:forEach></tbody>
</table>
</form>
</body>
</html>