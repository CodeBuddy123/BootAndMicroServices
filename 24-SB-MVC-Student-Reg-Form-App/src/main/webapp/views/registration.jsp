<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Student Registration Form</h3>
	<form:form action="studentReg" method="POST" modelAttribute="student">
		
		<table>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName"/></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>
					<%-- <form:radiobutton path="gender"  value ="male"/>Male
					<form:radiobutton path="gender" value="female"/>Female --%>
					
					<form:radiobuttons path="gender" items="${genders}"/>
				</td>
			</tr>
			<tr>
				<td>Course</td>
				<td>
					<form:select path="course">
						<%--<form:option value="select">Select</form:option>
						<form:option value="java">Java</form:option>
						<form:option value="python">Python</form:option>
						<form:option value="selenium">Selenium</form:option> --%>
						<form:options items="${courses}"/>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>Timings</td>
				<td>
					<%--<form:checkbox path="timings" value="morning"/>Morning
					<form:checkbox path="timings" value="evening"/>Evening
					<form:checkbox path="timings" value="afternoon"/>Afternoon --%>
					<form:checkboxes items="${timings}" path="timings"/>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		
		</table>
	</form:form>
</body>
</html>