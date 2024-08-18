<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<title>Login</title>
<style>


.material-symbols-outlined {
color:black;
  font-variation-settings:
  'FILL' 1,
  'wght' 400,
  'GRAD' 0,
  'opsz' 40
}

</style>
</head>
<body
	style="font-family: sans-serif; background-image: url(LoginBankingImage.png); background-repeat: no-repeat; background-attachment: fixed; background-size: cover;">
	<nav class="navbar justify-content-center my-20 h1">
	<div class="container-xxl">
		<a href="#intro" class="navbar-brand"> <span
			class="fw-bold text-light"> AurionSwabhav Bank - Digital
				Banking Website </span>
		</a>
	</div>
	</nav>
	<hr class="bg-light">
	<input type="hidden" id="status"
		value="<%=request.getAttribute("status")%>">
	<div class="mx-auto pt-3 rounded text-white"
		style="background-color: rgba(0, 0, 0, 0.85); height: 300px; width: 390px; margin: 60px">
		<h3 class="px-3 py-1 text-center font-weight-bold">Bank Login</h3>
		<hr class="bg-light">
		
		<form action="LoginController" method="post" class="px-3 py-3">
			<div class="input-group mb-4">
				<span class="input-group-text bg-warning border border-warning"
					style="width: 50px;"> <span class="material-symbols-outlined">
person
</span>
				</span> <input type="text" class="form-control" placeholder="Username"
					name="username" required>
			</div>
			<div class="input-group mb-4">
				<span class="input-group-text bg-warning border border-warning"
					style="width: 50px;"> <span class="material-symbols-outlined">
password
</span>
				</span> <input type="password" class="form-control" placeholder="Password"
					name="password" required>
			</div>
			<div class="d-flex justify-content-end">
								<button type="submit" class="btn btn-warning mr-2">Submit</button>
								<button type="reset" class="btn btn-secondary justify-content-end">Cancel</button>
							</div>
		</form>
	</div>




<%-- 

	<input type="hidden" id="status"
		value="<%=request.getAttribute("status")%>">
	<div class="container mt-2 mb-2 pb-5 pt-3">
		<div class="row">
			<div class="col-12 col-sm-8 col-md-6 m-auto">
				<div class="card">
					<img src="banking-login-img.png" class="card-img-top w-auto"
						style="height: 300px" alt="...">
					<div class="card-body opacity-25">
						<center>
							<h2>
								<b>BANK LOGIN</b>
							</h2>
						</center>
						<form action="LoginController" method="post">
							<div class="form-group">
								<span class="material-symbols-outlined"> person </span>Username:<input
									type="text" class="form-control" name="username"
									placeholder="Enter username" required>
							</div>
							<div class="form-group">
								Password:<input type="password" class="form-control"
									name="password" placeholder="Enter password" required><br>
							</div>


							<br>
							<div class="text-center md-5">
								<button type="submit" class="btn btn-success">Submit</button>
								<button type="reset" class="btn btn-secondary">Cancel</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div> --%>

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
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">

	<script type="text/javascript">
		var status = document.getElementById("status").value;
		if (status == "failed") {
			swal("Sorry", "Wrong Username or Password", "error");
		}
	</script>
</body>
</html>