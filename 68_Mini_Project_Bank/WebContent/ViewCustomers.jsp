<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%if(session.getAttribute("adminID") == null){
	response.sendRedirect("Login.jsp");
}
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Customer List</title>

<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<style>
/* Navbar styling */
.navbar-custom {
	background-color: #1e2125; /* Dark slate */
}

.navbar-custom .navbar-brand, .navbar-custom .nav-link {
	color: white; /* Light grey */
}

body {
	background-color: #f8f9fa;
	font-family: Arial, sans-serif;
}

.container {
	margin-top: 50px;
}

h1 {
	color: #343a40;
	margin-bottom: 30px;
}

table {
	background-color: #ffffff;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

thead {
	background-color: #007bff;
	color: white;
}

th, td {
	text-align: center;
	padding: 12px;
}

th {
	font-size: 1.1rem;
}

td {
	font-size: 0.95rem;
}

.no-customers {
	text-align: center;
	font-size: 1.2rem;
	color: #dc3545;
	margin-top: 20px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-custom h-10">
		<div class="container">
			<div class="d-flex justify-content-center w-100">
				<a class="navbar-brand Display-2 font-weight-bold" href="AdminPortal.jsp">Admin Home</a>
			</div>
		</div>
	</nav>
	<div class="container">
		<h1 class="text-center">All Customers</h1>

		<!-- Search Form -->
		<form action="ViewCustomerController" method="get">
			<div class="form-row">
				<div class="form-group col-md-3">
					<input type="text" class="form-control" name="customerID" placeholder="Customer ID">
				</div>
				<div class="form-group col-md-3">
					<input type="text" class="form-control" name="firstName" placeholder="First Name">
				</div>
				<div class="form-group col-md-3">
					<input type="text" class="form-control" name="lastName" placeholder="Last Name">
				</div>
				<div class="form-group col-md-3">
					<button type="submit" class="btn btn-primary btn-block">Search</button>
				</div>
			</div>
		</form>

		<!-- Display Customer Table -->
		<c:if test="${not empty customers}">
			<div class="table-responsive">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>Customer ID</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Username</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="customer" items="${customers}">
							<tr>
								<td>${customer.customerID}</td>
								<td>${customer.customerFirstName}</td>
								<td>${customer.customerLastName}</td>
								<td>${customer.username}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</c:if>

		<c:if test="${empty customers}">
			<p class="no-customers">No customers found.</p>
		</c:if>
	</div>

	<!-- Bootstrap JS and dependencies (Optional if you have interactive components) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>


<!--  This is the old code without filters-->

<%-- <!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Customer List</title>

<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<style>
/* Navbar styling */
.navbar-custom {
	background-color: #1e2125; /* Dark slate */
}

.navbar-custom .navbar-brand, .navbar-custom .nav-link {
	color: white; /* Light grey */
}

body {
	background-color: #f8f9fa;
	font-family: Arial, sans-serif;
}

.container {
	margin-top: 50px;
}

h1 {
	color: #343a40;
	margin-bottom: 30px;
}

table {
	background-color: #ffffff;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

thead {
	background-color: #007bff;
	color: white;
}

th, td {
	text-align: center;
	padding: 12px;
}

th {
	font-size: 1.1rem;
}

td {
	font-size: 0.95rem;
}

.no-customers {
	text-align: center;
	font-size: 1.2rem;
	color: #dc3545;
	margin-top: 20px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-custom h-10">
		<div class="container">
			<div class="d-flex justify-content-center w-100">
				<a class="navbar-brand Display-2 font-weight-bold"
					href="AdminPortal.jsp">Admin Home</a>
			</div>
		</div>
	</nav>
	<div class="container">
		<h1 class="text-center">All Customers</h1>

		<c:if test="${not empty customers}">
			<div class="table-responsive">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>Customer ID</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Username</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="customer" items="${customers}">
							<tr>
								<td>${customer.customerID}</td>
								<td>${customer.customerFirstName}</td>
								<td>${customer.customerLastName}</td>
								<td>${customer.username}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</c:if>

		<c:if test="${empty customers}">
			<p class="no-customers">No customers found.</p>
		</c:if>
	</div>

	<!-- Bootstrap JS and dependencies (Optional if you have interactive components) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
 --%>