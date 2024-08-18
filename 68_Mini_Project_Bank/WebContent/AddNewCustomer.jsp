<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Customer</title>
<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
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
	margin-bottom: 70px;
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
<script>
function validateForm() {
    var firstName = document.getElementById('customerFirstName').value;
    var lastName = document.getElementById('customerLastName').value;
    var namePattern = /^[A-Za-z]+$/; // Regex pattern to allow only letters

    if (!namePattern.test(firstName)) {
        alert("First Name should contain only letters.");
        return false; // Prevent form submission
    }

    if (!namePattern.test(lastName)) {
        alert("Last Name should contain only letters.");
        return false; // Prevent form submission
    }

    return true; // Allow form submission
}
</script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-custom">
	<div class="container">
		<div class="d-flex justify-content-center w-100">
			<a class="navbar-brand Display-2 font-weight-bold" href="AdminPortal.jsp">Admin Home</a>
		</div>
	</div>
	</nav>
	<!-- Form Container -->
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="form-container">
					<div class="form-header">Add New Customer</div>
					<form action="AddNewCustomerController" method="get" onsubmit="return validateForm()">
						<div class="form-group">
							<label for="firstName">Customer First Name</label>
							<input type="text" class="form-control" id="customerFirstName" name="customerFirstName"
								placeholder="Customer First Name" required>
						</div>
						<div class="form-group">
							<label for="lastName">Customer Last Name (if you don't have last name then write NA)</label>
							<input type="text" class="form-control" id="customerLastName" name="customerLastName"
								placeholder="Customer Last Name" required>
						</div>
						<div class="form-group">
							<label for="email">Email ID</label>
							<input type="email" class="form-control" id="username" name="username" placeholder="Email ID" required>
						</div>
						<div class="form-group">
							<label for="password">Password</label>
							<input type="password" class="form-control" id="password" name="password" placeholder="Password" required>
						</div>
						<div class="text-center md-5">
							<button type="submit" class="btn btn-success">Submit</button>
							<button type="reset" class="btn btn-info">Cancel</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>



<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%if(session.getAttribute("adminID") == null){
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
	margin-bottom: 70px;
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
		<div class="d-flex justify-content-center w-100">
			<a class="navbar-brand Display-2 font-weight-bold" href="AdminPortal.jsp">Admin
				Home</a>
		</div>
	</div>
	</nav>
	<!-- Form Container -->
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="form-container">
					<div class="form-header">Add New Customer</div>
					<form action="AddNewCustomerController" method="get">
<!-- 						<div class="form-group">
							<label for="customerId">Customer ID</label> <input
								type="text" class="form-control" id="customerID" name="customerID"
								placeholder="CustomerID" required>
						</div> -->
						<div class="form-group">
							<label for="firstName">Customer First Name</label> <input
								type="text" class="form-control" id="customerFirstName" name="customerFirstName"
								placeholder="Customer First Name" required>
						</div>
						<div class="form-group">
							<label for="lastName">Customer Last Name (if you don't have last name then write NA) </label> <input
								type="text" class="form-control" id="customerLastName" name="customerLastName"
								placeholder="Customer Last Name" required>
						</div>
						<div class="form-group">
							<label for="email">Email ID</label> <input type="email"
								class="form-control" id="username" name="username" placeholder="Email ID" required>
						</div>
						<div class="form-group">
							<label for="password">Password</label> <input type="password"
								class="form-control" id="password" name="password" placeholder="Password" required>
						</div>
						<div class="text-center md-5">
							<button type="submit" class="btn btn-success">Submit</button>
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
</html> --%>