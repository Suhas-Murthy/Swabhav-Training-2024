<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html data-bs-theme="dark">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
	
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    
<title>AurionSwabhav Bank</title>
<style>
section {
	padding: 60px 0;
}

.video-bg {
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	object-fit: cover;
	/* Ensures the video covers the entire area without distortion */
}

footer{
    background-color: #111;
}
.footerContainer{
    width: 100%;
    padding: 70px 30px 20px ;
}
.socialIcons{
    display: flex;
    justify-content: center;
}
.socialIcons a{
    text-decoration: none;
    padding:  10px;
    background-color: white;
    margin: 10px;
    border-radius: 50%;
}
.socialIcons a i{
    font-size: 2em;
    color: black;
    opacity: 0,9;
}
/* Hover affect on social media icon */
.socialIcons a:hover{
    background-color: #111;
    transition: 0.5s;
}
.socialIcons a:hover i{
    color: white;
    transition: 0.5s;
}
.footerNav{
    margin: 30px 0;
}
.footerNav ul{
    display: flex;
    justify-content: center;
    list-style-type: none;
}
.footerNav ul li a{
    color:white;
    margin: 20px;
    text-decoration: none;
    font-size: 1.3em;
    opacity: 0.7;
    transition: 0.5s;

}
.footerNav ul li a:hover{
    opacity: 1;
}
.footerBottom{
    background-color: #000;
    padding: 20px;
    text-align: center;
}
.footerBottom p{
    color: white;
}
.designer{
    opacity: 0.7;
    text-transform: uppercase;
    letter-spacing: 1px;
    font-weight: 400;
    margin: 0px 5px;
}
@media (max-width: 700px){
    .footerNav ul{
        flex-direction: column;
    } 
    .footerNav ul li{
        width:100%;
        text-align: center;
        margin: 10px;
    }
    .socialIcons a{
        padding: 8px;
        margin: 4px;
    }
}
</style>
</head>

<body style="padding: 0 20px;">
	<!-- navbar -->
	<nav class="navbar">
	<div class="container-xxl">
		<a href="#intro" class="navbar-brand"> <span
			class="fw-bold text-light"> AurionSwabhav Bank - Digital
				Banking Website </span>
		</a>
		<button type="button" class="btn btn-outline-light"
			onclick="location.href='Login.jsp';">Login</button>
	</div>		
	</nav>
	<hr class="border-bottom-0 border-light">
	<!-- main image & intro text -->
	<section id="intro">
	<div class="container-lg">
		<div class="row justify-content-center align-items-center">
			<div class="col-md-6 text-center text-md-start">
				<h1>
					<div class="display-4">AurionSwabhav Bank</div>
					<div class="h4 text-muted">Innovative Solutions, Timeless
						Values.</div>
				</h1>
				<p class="lead my-4 text-muted">"Aurion" conveys a sense of
					innovation and excellence. "Swabhav" adds a touch of inherent
					values and authenticity.</p>
				<a href="Login.jsp" class="btn btn-secondary btn-lg">LOGIN</a>
			</div>
			<div class="col-md-5 text-center d-none d-md-block">
				<!-- <img class="img-fluid rounded" src="DigitalBankingVideo.mp4" alt=""> -->
				<video width="450" height="450" autoplay muted loop> <source
					src="DigitalBankingVideo.mp4" type="video/mp4"> Your
				browser does not support the video tag. </video>
			</div>
		</div>
	</div>
	</section>
	<div id="news">
	<video class="video-bg" width="100%" height="300" autoplay muted loop>
	<source src="BankingBGVideo.mp4" type="video/mp4"> Your
	browser does not support the video tag. </video>
</div>
    <footer>
    <div class="footerContainer">
        <div class="socialIcons">
            <a href=""><i class="fa-brands fa-facebook"></i></a>
            <a href=""><i class="fa-brands fa-instagram"></i></a>
            <a href=""><i class="fa-brands fa-twitter"></i></a>
            <a href=""><i class="fa-brands fa-github"></i></a>
            <a href=""><i class="fa-brands fa-youtube"></i></a>
            <a href="https://www.aurionpro.com/"><i class="fa-brands fa-chrome"></i></a>
        </div>
        <div class="footerNav">
            <ul><li><a href="#intro">Home</a></li>
                <li><a href="#news">News</a></li>
                <li><a href="">About</a></li>
                <li><a href="">Contact</a></li>
            </ul>
        </div>
        
    </div>
    <div class="footerBottom">
        <p>Copyright &copy;2024; Designed by <span class="designer">Suhas Murthy</span></p>
    </div>
</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</body>
</html>