<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>User ID</th>
<th>User Name</th>
<th>User Password</th>
</tr>
<c:forEach var="user" items="${users}">
<tr>
<td>"${user.getUserId()}"</td>
<td>"${user.getName()}"</td>
<td>"${user.getPassword()}"</td>
</tr>
</c:forEach>
</table>
</body>
</html>