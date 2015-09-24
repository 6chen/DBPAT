<%--
  Created by IntelliJ IDEA.
  User: YUSIN
  Date: 9/17/15
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Business Area</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>

<div class="container-fluid">
	<!--page head-->
	<h1>Business Area
		<button type="button" class="btn btn-default pull-right" data-toggle="modal" data-target="#bizAreaModal">Add
			New
		</button>
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

<!-- This modal is used for add a new business area -->
<div class="modal fade" id="bizAreaModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="myModalLabel">New Business Area</h4>
			</div>
			<form role="form" action="biz_area_add.action" method="post">
				<div class="modal-body">
					<div class="form-group">
						<label for="newBizAreaName">Business Name</label>
						<input type="text" class="form-control" id="newBizAreaName" placeholder="Business Name" name="newBizAreaName">
					</div>
					<div class="form-group">
						<label for="newBizAreaDesc">Business Description</label>
						<textarea class="form-control" rows="5" id="newBizAreaDesc"
						          placeholder="Business Description" name="newBizAreaDesc"></textarea>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="submit" class="btn btn-primary">Add</button>
				</div>
			</form>
		</div>
	</div>
</div>

<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>
