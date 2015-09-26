<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>HomePage</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<style>
		body{
			padding-top: 63px;
		}
	</style>
</head>
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a href="home.action" class="navbar-brand">DBPAT</a>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li>
					<img src="images/usericon.png" alt="">
				</li>
				<li>
					<a href="#"> User Name </a>
				</li>
			</ul>
		</div>
	</div>
</nav>
<body>
<div id="mainBody" class="container-fluid">
	<div class="row">
		<div id="LeftPart" class="col-md-2">
		</div>
		<div id="RightPart" class="col-md-10">
		</div>
	</div>
</div>

<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
	$(function(){
		$("#LeftPart").load("home_Left_Nav.action");
		$("#RightPart").load("home_right_main.action");
	});
</script>
</body>
</html>
