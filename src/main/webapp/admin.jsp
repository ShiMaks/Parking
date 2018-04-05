<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title></title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style3.css" rel="stylesheet" type="text/css" media="all" />	
<link href="css/bootstrap.min.css" rel="stylesheet" />
<script src="js/bootstrap.js"></script>
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Trekking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.googleapis.com/css?family=Quicksand:300,400,700' rel='stylesheet' type='text/css'>
<!--//fonts-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>



</head>
<body>
<!--header-->
	<div class="header">
		<div class="container">
		<div class="header-top">		
			<div class="logo">
				<h3 style="color:#ffffff"></h3>
			</div>		
				<div class="top-nav">
					
					<ul class="icon1 sub-icon1">
						
						<ul class="sub-icon1 list">
						  
						</ul>
					</ul>
					<!--script-->
				<script>
					$("span.menu").click(function(){
						$(".top-nav ul").slideToggle(500, function(){
						});
					});
			</script>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		</div>
		<div class="banner banner-in">
			
		</div>
		<!---->
		<div class="container">
		<div class="check-out">
		
		
		<form action="MainServlet" method="GET">
			<input type="hidden" name="command" value="create_book" />
			<input type="submit" value="create car" class=" hvr-shutter-in-horizontal"/>
		</form>	

		
		<h2>List Car</h2>
		
     <table class="table">
		  <tr>
			<th>Car ID</th>
			<th>Brand Name</th>		
			<th>Model</th>
			<th>Delete Car</th>
			<th>Update Car</th>
		  </tr>
		  <tr>
		  	<c:forEach items="${listCars}" var="car" >
		    <td><h4><c:out value="${car.getId()}" /></h4></td>
			<td><h4><c:out value="${car.getBrandName()}" /></h4>
			
			<div class="clearfix"> </div></td>
			<td><h4><c:out value="${car.getModel()}" /></h4></td>
			<td>
				<form action="MainServlet" method="GET">
					<input type="hidden" name="command" value="deleteCar" />
					<input type="hidden" name="car_id" value="${car.getId()}" />
					<input type="submit" class=" hvr-shutter-in-horizontal" value="delete"/>
				</form>
			</td>		
			<td>
				<form action="SimpleServlet" method="GET">
					<input type="hidden" name="command" value="updateCar" />
					<input type="hidden" name="book_id" value="${car.getId()}" />
					<input type="submit" class=" hvr-shutter-in-horizontal" value="update"/>
				</form>
			</td>
		  </tr>
		 </c:forEach>
	</table>
	
</body>
</html>