<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer Information</h1>
<table border='1' bgcolor='lightblue'>
<tr>
	<td>Customer Name</td>
	<td>${customer.customerName}</td>
</tr>
<tr>
	<td>Customer Email</td>
	<td>${customer.customerEmail}</td>
</tr>
<tr>
	<td>Customer Phone</td>
	<td>${customer.customerPhone}</td>
</tr>
</table>
<a href="customer">Go Back</a>
</body>
</html>