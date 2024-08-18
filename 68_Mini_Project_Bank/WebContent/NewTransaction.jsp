<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%
	if (session.getAttribute("customerID") == null) {
		response.sendRedirect("Login.jsp");
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en"> 
<head> 
    <meta charset="UTF-8"> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
    <title>New Transaction</title> 
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"> 
    <style>
                /* Navbar styling */
        .navbar-custom {
            background-color: #1e2125; /* Dark slate */
        }
        .navbar-custom .navbar-brand, 
        .navbar-custom .nav-link {
            color: white; /* Light grey */
        }
        
        /* Navbar-like Heading */
        .header-container {
            background-color: #1e2125; /* Dark slate */
            padding: 20px 0;
            text-align: center;
        }

        .header-container h1 {
            color: #ffffff; /* White text */
            margin: 0;
        }

        /* Form container styling */
        .form-container {
            background-color: #1e2125; /* Dark slate */
            border-radius: 8px;
            padding: 20px;
            margin-top: 50px;
            box-shadow: 0px 16px 32px rgba(0, 0, 0, 0.5);
            color: #ffffff; /* White text */
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

        /* Input field styling */
        .form-control {
            background-color: lightgrey; /* Light grey background */
            color: #343a40; /* Dark grey text */
        }

        /* Hide and show account number */
        #toAccountNumberGroup {
            display: none;
        }
    </style>
</head> 
<body> 
 

<input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
    
    <nav class="navbar navbar-expand-lg navbar-custom">
         <div class="container">
        <div class="d-flex w-100">
            <a class="navbar-brand Display-2 font-weight-bold" href="CustomerPortal.jsp">Customer Home</a>
        </div>
        <button class="btn btn-outline-warning"  onclick="location.href='LogoutController';" >Logout</button>
    </div>
    </nav>
 
    <!-- Spacer --> 
    <div class="my-4"></div> 
 
    <!-- Transaction Form --> 
    <div class="container form-container"> 
        <form action="NewTransactionController" method="post"> 
            <div class="form-group"> 
                <label for="transactionType">Type of Transaction:</label> 
                <select id="transactionType" name="transactionType" class="form-control" onchange="toggleToAccountNumber(this)"> 
                    <option value="">Select</option> 
                    <option value="credit">Credit</option> 
                    <option value="debit">Debit</option> 
                    <option value="transfer">Transfer</option> 
                </select> 
            </div> 
 
            <div class="form-group" id="toAccountNumberGroup"> 
                <label for="toAccountNumber">To Account Number:</label> 
                <input type="text" id="toAccountNumber" name="toAccountNumber" class="form-control" placeholder="Enter account number"> 
            </div> 
 
            <div class="form-group"> 
                <label for="amount">Amount:</label> 
                <input type="text" id="amount" name="amount" class="form-control" placeholder="Enter amount" required> 
            </div> 
 
            <div class="form-group"> 
                <button type="submit" class="btn btn-primary btn-custom">Submit</button> 
                <button type="reset" class="btn btn-secondary btn-custom">Cancel</button> 
            </div> 
        </form> 
    </div> 
 
    <!-- JavaScript to handle the conditional display of the "To Account Number" field --> 
    <script> 
        function toggleToAccountNumber(selectElement) { 
            var toAccountNumberGroup = document.getElementById("toAccountNumberGroup"); 
            if (selectElement.value === "transfer") { 
                toAccountNumberGroup.style.display = "block"; 
            } else { 
                toAccountNumberGroup.style.display = "none"; 
            } 
        } 
    </script>
    
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	
    <script>
        document.addEventListener('DOMContentLoaded', function () {
            var status = "<%= request.getAttribute("transactionStatus") %>";

            if (status === "success") {
                swal("Success", "Transaction completed successfully!", "success");
            } else if (status === "failure") {
                swal("Error", "Transaction failed. Please try again.", "error");
            }
        });
    </script> 
 
</body> 
</html>







<%-- 





<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
	margin-bottom: 20px;
	text-align: center;
	border-radius: 8px;
	font-size: 24px;
	color: #ffffff; /* White text */
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
	background-color: lightgrey; /* White */
	color: #343a40; /* Dark grey for text */
	border-radius: 15px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	padding: 40px;
	height: 100%;
}

.content-container {
	margin-top: 20px;
	display: flex;
	justify-content: center;
	align-items: center;
	/* height: calc(100vh - 180px); */
}
</style>
</head>
<body>

	<!-- Navbar Section -->
	<nav class="navbar navbar-expand-lg navbar-custom">
	<div class="container">
		<div class="d-flex justify-content-center w-100">
			<a class="navbar-brand Display-2 font-weight-bold"
				href="CustomerPortal.jsp">Customer Home</a>
		</div>
	</div>

	</nav>

	<!-- Content Section in Card -->
	<div class="content-container">
		<div class="card content-card w-75">
			<div class="card-body">

				<div class="form-header">Make New Transaction</div>
				<form method="post" action="NewTransactionController">
					<div class="form-group">
						<label for="transactionType">Select Transaction Type:</label> <select
							id="transactionType" name="transactionType" class="form-control">
							<option>Select</option>
							<option value="Credit">Credit</option>
							<option value="Debit">Debit</option>
							<option value="Transfer">Transfer</option>
						</select>
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Go</button>
					</div>
				</form>


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
</body>
</html> --%>