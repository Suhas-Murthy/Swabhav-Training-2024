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
<title>Add New Customer</title>
<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
/* Page styling */
body {
	background-color: white;
}

.form-container {
	background-color: #1e2125;
	border-radius: 8px;
	padding: 20px;
	margin-top: 50px;
	box-shadow: 0px 16px 32px rgba(0, 0, 0, 0.5);
}

.form-header {
	background-color: #1e2125;
	padding: 15px;
	text-align: center;
	border-radius: 8px;
	font-size: 24px;
	color: #ffffff; /* White text */
}

.form-group label {
	color: #ffffff; /* White text for labels */
}

.form-control {
	background-color: #ffffff; /* White input fields */
	color: #000000; /* Black text in inputs */
	border: none;
	border-radius: 5px;
	padding: 10px;
	margin-bottom: 15px;
}

.btn-group {
	text-align: center;
	margin-top: 20px;
}

.navbar-custom {
	background-color: #1e2125;
	color: white;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-custom">
	<div class="container">
		<div class="d-flex justify-content-start w-100">
			<a class="navbar-brand Display-2 font-weight-bold"
				href="CustomerPortal.jsp">Customer Portal</a>
		</div>
					<button class="btn btn-outline-danger"
				onclick="location.href='LogoutController';">Logout</button>
	</div>
	</nav>
	<!-- Form Container -->
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="form-container">
					<div class="form-header">Edit Customer</div>
					<form action="EditCustomerDetailsController" method="get">
					<p class="text-light">Fill only those details which you want to edit</p>
						<div class="form-group">
							<label for="firstName">Customer First Name</label> <input
								type="text" class="form-control" id="customerFirstName"
								name="customerFirstName" placeholder="Customer First Name">
						</div>
						<div class="form-group">
							<label for="lastName">Customer Last Name </label> <input type="text"
								class="form-control" id="customerLastName"
								name="customerLastName" placeholder="Customer Last Name">
						</div>
						<div class="form-group">
							<label for="newPassword">New Password:</label> <input
								type="password" class="form-control" id="newPassword" name="newPassword" placeholder="Enter New Password">
						</div>
						<div class="form-group">
							<label for="currentPassword">Current Password:<span class="text-danger font-weight-bold">*</span></label> <input
								type="password" class="form-control" id="password" name="password" placeholder="Enter Current Password"
								required>
						</div>

						<div class="text-center md-5">
							<button type="submit" class="btn btn-success">Edit</button>
							<button type="reset" class="btn btn-info">Cancel</button>
						</div>
					</form>
				</div>
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