<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello Form</h1>

	<form action="LoginController" method="get">
		Name: <input type="text" name="name"><br><br>
		Username:<input type="email" name="username">
		<p>Username is your Email ID</p>
		<button style="color:white; background-color: green;padding:2px 18px;"><b>Go</b></button>
	</form>
</body>
</html>