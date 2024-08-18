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
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Add Bank Account</title>
<style>
.navbar-custom {
	background-color: #1e2125;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-custom">
	<div class="container">
		<div class="d-flex justify-content-center w-100">
			<a class="navbar-brand Display-2 text-white font-weight-bold"
				href="AdminPortal.jsp">Admin Home</a>
		</div>
	</div>
	</nav>
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header">
						<h3 class="text-center">Add Bank Account</h3>
					</div>
					<div class="card-body">
						<form class="form-inline" action="AddBankAccountController"
							method="post">
							<input class="form-control mr-sm-2" name="customerID"
								id="customerID" type="text" placeholder="Search by Customer ID">
							<button class="btn btn-outline-success my-2 my-sm-20"
								type="submit">Search</button>
						</form>

						<c:choose>
							<c:when test="${not empty customerID}">
								<table class="table table-bordered mt-3">
									<tr>
										<th>Customer ID</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Username</th>
									</tr>
									<tr>
										<td>${customerID}</td>
										<td>${customerFirstName}</td>
										<td>${customerLastName}</td>
										<td>${username}</td>
									</tr>
								</table>
							</c:when>
							<c:otherwise>
								<p>No customer found with the given ID.</p>
							</c:otherwise>
						</c:choose>
						
						
							<form action="GenerateAccountNumberController" method="post">
							<button type="submit" class="btn btn-primary btn-block">Generate
								Account Number</button>
						</form>
						
							
					</div>
				</div>
				<div class="container">
		<h1 class="text-center">Customers not having bank Account</h1>

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
			</div>
		</div>
	</div>
	<!-- Bootstrap Scripts -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>
