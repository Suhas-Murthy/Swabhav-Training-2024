<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	if (session.getAttribute("customerID") == null) {
		response.sendRedirect("Login.jsp");
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Home</title>
<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
/* Navbar styling */
.navbar-custom {
	background-color: #1e2125; /* Dark slate */
}

.navbar-custom .navbar-brand, .navbar-custom .nav-link {
	color: white; /* Light grey */
}
/* Button styling */
.btn-custom {
	margin: 10px;
	width: 100%;
	border-radius: 10px;
	font-size: 18px;
	padding: 10px 0;
	font-weight: bold;
}

/* Card section styling */
.content-card {
	background-color: #ffffff; /* White */
	color: #343a40; /* Dark grey for text */
	border-radius: 15px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	padding: 40px;
	text-align: center;
	height: 100%;
}

.content-container {
	margin-top: 20px;
	display: flex;
	justify-content: center;
	align-items: center;
	height: calc(100vh - 180px);
}
</style>
</head>
<body>

	<!-- Navbar Section -->
	<nav class="navbar navbar-expand-lg navbar-custom">
	<div class="container">
		<div class="d-flex  w-100">
			<a class="navbar-brand Display-2 font-weight-bold"
				href="CustomerPortal.jsp">Customer Home</a>
		</div><div>
		            <span class="navbar-text text-light">
                Welcome, <%= session.getAttribute("customerFirstName") %>
                <%= session.getAttribute("customerLastName") %>
            </span>
		            <span class="navbar-text text-light">
                Balance:  <%= session.getAttribute("accountBalance") %>
            </span>
            </div>
			<button class="btn btn-outline-warning"
				onclick="location.href='LogoutController';">Logout</button>
	</div>
	</nav>

	<!-- Button Row Section -->
	<div class="container mt-4">
		<div class="row text-center">
			<div class="col-md-4">
				<button class="btn btn-custom btn-outline-primary"
					onclick="location.href='PassbookController';">Passbook</button>
			</div>
			<div class="col-md-4">
				<button class="btn btn-custom btn-outline-primary"
					onclick="location.href='NewTransaction.jsp';">New
					Transaction</button>
			</div>
			<div class="col-md-4">
				<button class="btn btn-custom btn-outline-primary"
					onclick="location.href='EditProfile.jsp';">Edit Profile</button>
			</div>
		</div>
	</div>

	<!-- Content Section in Card -->
	<div class="content-container">
		<div class="card content-card w-75">
			<div class="card-body">
				<h3>Customer Passbook</h3>
				<p>A passbook is a booklet provided by the bank that records all your account transactions and balance details.</p>
				<hr>
				<h3>New Transaction</h3>
				<p>A new transaction refers to any recent credit, debit, or transfer made to or from your account.</p>
				<hr>
				<h3>Edit Profile</h3>
				<p>Edit Profile allows you to update your personal information, such as First Name, Last Name, and Password.</p>
			</div>
		</div>
	</div>

	<!-- Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>