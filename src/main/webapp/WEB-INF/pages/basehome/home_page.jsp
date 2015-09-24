<%@ page import="java.io.File" %>
<%--
  Created by IntelliJ IDEA.
  User: YUSIN
  Date: 9/15/15
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>HomePage</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<style>
		#LeftPart {
			position: fixed;
			top: 63px;
			border-right-style: solid;
			border-width: 2px;
			border-color: #3e3f3a;
			height: 100%;
		}

		#RightPart {
			position: fixed;
			top: 63px;
			height: 100%;
			padding-right: 0px;
		}

	</style>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a href="home.action" class="navbar-brand">DBPAT <small>DataBase Performance Auditing Tool</small></a>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li>
					<img src="/images/usericon.png" alt="">
				</li>
				<li>
					<a href="#"> User Name </a>
				</li>
			</ul>
		</div>
	</div>
</nav>

<div class="container-fluid">
	<div class="row">
		<div id="LeftPart" class="col-md-2 col-xs-2">
			<iframe src="home_Left_Nav.action" frameborder="0" scrolling="no" width="100%" height="100%"></iframe>
		</div>
		<div id="RightPart" class="col-md-10 col-md-offset-2 col-xs-10 col-xs-offset-2">
			<iframe id="MainRightFrame" name="MainRightFrame" src="home_right_main.action" frameborder="0"
			        scrolling="auto" width="100%" height="100%"></iframe>
		</div>
	</div>
</div>

<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>
