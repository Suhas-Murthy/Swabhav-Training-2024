<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<b><% out.print(new Date()); %></b>
<%--Expression Tag --%>
<h1><%= new Date() %></h1>
<%@include file="insert.jsp" %>
Welcome <%! String name = "Suhas"; 
 %>
<%= name %>
<%-- <%response.sendRedirect("http://moodle.apsit.org.in/moodle/"); %>--%>


<form action="welcome.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>

</body>
</html>