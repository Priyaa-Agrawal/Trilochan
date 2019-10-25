<%-- 
    Document   : donation
    Created on : Aug 5, 2019, 11:34:53 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.trilochan.service.loginServlet" %>
<!DOCTYPE html>
<html lang="zxx" class="no-js">

<head>
	<!-- Mobile Specific Meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<!-- Favicon-->
	<link rel="shortcut icon" href="img/fav.png">
	<!-- Author Meta -->
	<meta name="author" content="colorlib">
	<!-- Meta Description -->
	<meta name="description" content="">
	<!-- Meta Keyword -->
	<meta name="keywords" content="">
	<!-- meta character set -->
	<meta charset="UTF-8">
	<!-- Site Title -->
	<title>Donation-Trilochan</title>

	<link href="https://fonts.googleapis.com/css?family=Lora:400,700|Roboto:300,400" rel="stylesheet">
	<!--==========================CSS================================= -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/themify-icons.css">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/owl.carousel.css">
	<link rel="stylesheet" href="css/magnific-popup.css">
	<link rel="stylesheet" href="css/nice-select.css">
	<link rel="stylesheet" href="css/main.css">
	<link rel="stylesheet" href="css/body.css">

<body>
	<!-- ================ Start Header Area ================= -->
     <%@include file="header.jsp" %>
	<!--================ End Header Area =================-->


	<!--================ Start top-section Area =================-->
	<section class="banner-area relative">
		<div class="overlay overlay-bg"></div>
		<div class="container">
			<div class="row justify-content-lg-end align-items-center banner-content">
				<div class="col-lg-5">
					<h1 class="text-white">Donation</h1>
				</div>
			</div>
		</div>
	</section>
	<!--================ End top-section Area ================= -->


	<!--================= Start of Donation blog============ -->
<div class="custom">
	<div class="container">
		<div class="jumbotron text-center">
			<h2>DONATION INFORMATION</h2><br>

		<p1 style="font-size: 22px;">I would like to make a donation in the amount of:</p1>
		<br><br>
		<form>
				<input type="radio" name="OTHERS"  checked>Rs.1000
				<input type="radio" name="OTHERS"  >Rs.500
				<input type="radio" name="OTHERS" >Rs.200
				<input type="radio" name="OTHERS" >Rs.100
				<input type="radio" name="OTHERS" >Rs.50
				<input type="radio" name="OTHERS" >Rs.20
				<input type="radio" name="OTHERS" >Rs.10
				<input type="radio" name="OTHERS" id="others" onclick="other()">Others<br>
				<p id="amt" style="display:none">
					<label for="amt"><b>Amount</b> </label>
					<input type="text" id="amt">
				</p>
			   
			</form>
	</div>
	</div>
</div>	

<div class="design">
		<div class="container">
			<div class="jumbotron text-center">
				<h2>TRIBUTE GIFT</h2><br>
			<div class="custom-control custom-checkbox">
				<input type="checkbox" class="custom-control-input" id="Checked" onclick="check()">
				<label class="custom-control-label" for="Checked">Check Here to donate in honor or memory of someone</label>
				<p id="text" style="display:none">
					
					<label for="name"><b>Name of the person to be honored:</b> </label>
					<input type="name" id="name">
				</p>
			</div>
			  
		</div>
	</div>
</div>

<div class="design">
		<div class="container">
			<div class="jumbotron text-center">
					<h1>DONAR INFORMATION</h1><br>

		<form>
			<div class="info">
				<div class="row">
						<label for="firstname"><b>First Name:</b> </label>
						<input type="name" class="form-control col-xs-2" id="firstname" placeholder="firstname">
					</div>
					<br>
					<div class="row">
						<label for="lastname"><b>Last Name:</b> </label>
						<input type="name" class="form-control col-xs-2" id="lastname" placeholder="lastname">
					</div>
					<br>
					<div class="row">	
						<label for="email"><b>Email:</b> </label>
						<input type="email" class="form-control col-xs-2" id="email" placeholder="email">
					</div>
					<br>	
					<div class="row">	
						<label for="phone"><b>PhoneNo: </b></label>
						<input type="phone" class="form-control col-xs-6" id="phone" placeholder="phone">
					</div>	
			</div>	
		</form>
		<button type="submit" class="btn btn-success">Donate</button>
		</div>
		</div>
	</div>	

	<!--============= End of Donation blog============== -->




	<!--================ start footer Area =================-->
	        <%@include file="footer.jsp" %>
	<!--================ End footer Area =================-->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script src="js/vendor/jquery-2.2.4.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
	 crossorigin="anonymous"></script>
	<script src="js/vendor/bootstrap.min.js"></script>
	<script src="js/jquery.ajaxchimp.min.js"></script>
	<script src="js/parallax.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/isotope.pkgd.min.js"></script>
	<script src="js/jquery.nice-select.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/countdown.js"></script>
	<script src="js/jquery.sticky.js"></script>
	<script src="js/main.js"></script>
	<script src="js/check.js"></script>
     
</body>
</html>
