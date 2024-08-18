<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%if(session.getAttribute("adminID") == null){
	response.sendRedirect("Login.jsp");
}
%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
		<h1 class="text-center">All Transactions</h1>

		<c:if test="${not empty transactions}">
			<div class="table-responsive">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>Transaction ID</th>
							<th>Transaction Amount</th>
							<th>Transaction Date</th>
							<th>Transaction Type</th>
							<th>Sender Account</th>
							<th>Receiver Account</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="transaction" items="${transactions}">
							<tr>
								<td>${transaction.transactionID}</td>
								<td>${transaction.transactionAmount}</td>
								<td>${transaction.transactionDate}</td>
								<td>${transaction.transactionType}</td>
								<td>${transaction.senderAccountNumber}</td>
								<td>${transaction.receiverAccountNumber}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</c:if>

		<c:if test="${empty transactions}">
			<p class="no-customers">No transactions found.</p>
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