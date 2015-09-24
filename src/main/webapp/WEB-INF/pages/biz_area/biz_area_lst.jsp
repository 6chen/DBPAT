<%--
  Created by IntelliJ IDEA.
  User: YUSIN
  Date: 9/17/15
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Business Area</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>

<div class="container-fluid">
	<!--page head-->
	<h1>Business Area
		<button type="button" class="btn btn-default pull-right">Add New</button>
	</h1>
</div>
<hr/>
<c:forEach varStatus="i" var="bizArea" items="${bizAreas}">
	<div class="container-fluid">
		<!-- Panel Group -->
		<div class="panel-group">
			<!--Each Panel-->
			<div class="panel panel-default">
				<div class="panel-heading">
					Business Name: ${bizArea.bizAreaNm}
					<div class="pull-right">
						<a href="#" type="button" class="btn btn-info btn-xs">Target</a>
						<a href="#" type="button" class="btn btn-primary btn-xs">Modify</a>
						<button type="button" class="btn btn-danger btn-xs">Delete</button>
					</div>
				</div>
				<div class="panel-body">${bizArea.bizAreaDescr}</div>
			</div>
		</div>
	</div>
</c:forEach>

<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>
