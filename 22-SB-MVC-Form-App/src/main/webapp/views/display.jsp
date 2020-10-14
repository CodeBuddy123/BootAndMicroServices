<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Book Details</h1>
<table border="1" bgcolor='pink'>
<tr>
	<td>Book Name</td>
	<td>${book.bookName}</td>
</tr>
<tr>
	<td>Book Author</td>
	<td>${book.authorName}</td>
</tr>
<tr>
	<td>Book Price</td>
	<td>${book.bookPrice}</td>
</tr>
</table>

</body>
</html>