<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Edit Users page</title>
</head>
<body>
<h1>Edit Users page</h1>
<p>Here you can edit the existing team.</p>
<p>${message}</p>
<form:form method="POST" commandName="resourceper" action="${pageContext.request.contextPath}/RPS/edit/${user.id}.html">
 <table>
 <tbody> 
	 <tr>
		<td>Full Name:</td>
		<td><form:input path="resource" />
		</td>
	</tr> 
	<tr>
		<td>Resource Status: </td>
		<td><form action="radiobuttons" path="active"></form></td>
	</tr>
	
	<tr>
		<td><input type="submit" value="Edit" /></td>
		<td><input type="submit" value="Delete"  onclick="form.action='${pageContext.request.contextPath}/RPS/delete/${user.id}.html',form.method='POST'"/></td>
		<td></td>
	</tr>
</tbody>
</table> 
</form:form>

<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>
</body>
</html>