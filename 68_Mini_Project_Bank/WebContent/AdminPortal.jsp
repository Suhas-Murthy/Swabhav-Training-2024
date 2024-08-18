<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%if(session.getAttribute("adminID") == null){
	response.sendRedirect("Login.jsp");
}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Admin Home</title>
<!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Navbar styling */
        .navbar-custom {
            background-color: #1e2125; /* Dark slate */
        }
        .navbar-custom .navbar-brand, 
        .navbar-custom .nav-link {
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
        <div class="d-flex w-100">
            <a class="navbar-brand Display-2 font-weight-bold" href="AdminPortal.jsp">Admin Home</a>
        </div>
        <button class="btn btn-outline-warning"  onclick="location.href='LogoutController';" >Logout</button>
    </div>
  <!--       <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button> -->
<!--         <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Add New Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Add Bank Account</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">View Customers</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">View Transactions</a>
                </li>
            </ul>
        </div> -->
    </nav>

    <!-- Button Row Section -->
    <div class="container mt-4">
        <div class="row text-center">
            <div class="col-md-3">
                <button class="btn btn-custom btn-outline-primary" onclick="location.href='AddNewCustomer.jsp';">Add New Customer</button>
            </div>
            <div class="col-md-3">
                <button class="btn btn-custom btn-outline-primary" onclick="location.href='AddBankAccountDisplayNoAccountDetails';">Add Bank Account</button>
            </div>
            <div class="col-md-3">
                <button class="btn btn-custom btn-outline-primary" onclick="location.href='ViewCustomerController';">View Customers</button>
            </div>
            <div class="col-md-3">
                <button class="btn btn-custom btn-outline-primary" onclick="location.href='ViewTransactionController';">View Transactions</button>
            </div>
        </div>
    </div>

    <!-- Content Section in Card -->
    <div class="content-container">
        <div class="card content-card w-75">
            <div class="card-body">
                <h3>Customer Addition</h3>
                <p>Manage customer information and add new customers to the system.</p>
                <hr>
                <h3>View Customers</h3>
                <p>Access and manage the list of all registered customers.</p>
                <hr>
                <h3>View Transactions</h3>
                <p>Review and analyze customer transactions within the system.</p>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>