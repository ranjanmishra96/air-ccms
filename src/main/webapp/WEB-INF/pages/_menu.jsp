<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div style="border: 1px solid #ccc;padding:5px;margin-bottom:20px;">

  <a href="${pageContext.request.contextPath}/welcome">Home</a>

  | &nbsp;
 
   <a href="${pageContext.request.contextPath}/userInfo">User Info</a>
 
  | &nbsp;
 
  <a href="${pageContext.request.contextPath}/admin">Admin</a>
  
  |	&nbsp;
  
  <a href="${pageContext.request.contextPath}/US/listOfUsers.html">List Of User form</a>
  
  | &nbsp;
  
  <a href="${pageContext.request.contextPath}/US/add.html"> User Registration Form</a>
  
  | &nbsp;
  
  <c:if test="${pageContext.request.userPrincipal.name != null}">
 
     | &nbsp;
     <a href="${pageContext.request.contextPath}/logout">Logout</a>
    
  </c:if>
  
  |	&nbsp;
  
  <a href="${pageContext.request.contextPath}/RS/listOfResources.html">List Of Resource form</a>
  
  | &nbsp;
  
  <a href="${pageContext.request.contextPath}/RS/add.html"> Resource Form</a>
  
  | &nbsp;
 
</div>

</body>
</html>