<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>DBPAT</title>
	<!-- Tell the browser to be responsive to screen width -->
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<!-- Bootstrap 3.3.5 -->
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
	<!-- Font Awesome -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
	<!-- Ionicons -->
	<link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
	<!-- Theme style -->
	<link rel="stylesheet" href="dist/css/AdminLTE.min.css">
	<!-- AdminLTE Skins. Choose a skin from the css/skins
		 folder instead of downloading all of them to reduce the load. -->
	<link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">
	<!-- iCheck -->
	<link rel="stylesheet" href="plugins/iCheck/flat/blue.css">
	<!-- Morris chart -->
	<link rel="stylesheet" href="plugins/morris/morris.css">
	<!-- jvectormap -->
	<link rel="stylesheet" href="plugins/jvectormap/jquery-jvectormap-1.2.2.css">
	<!-- Date Picker -->
	<link rel="stylesheet" href="plugins/datepicker/datepicker3.css">
	<!-- Daterange picker -->
	<link rel="stylesheet" href="plugins/daterangepicker/daterangepicker-bs3.css">
	<!-- bootstrap wysihtml5 - text editor -->
	<link rel="stylesheet" href="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">

	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
</head>
<body>

<div class="container-fluid">
	<!--page head-->
	<h2><b>Business Area</b>
		<button id="addBizAreaShow" type="button" class="btn btn-default pull-right" data-toggle="modal"
		        onclick="showNewBizAreaModal()">
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
		</button>
	</h2>
	<ul class="breadcrumb">
		<li class="active"><a href="home.action">Home</a></li>
		<li class="active">Business Area</li>
	</ul>
</div>

<c:forEach varStatus="i" var="bizArea" items="${bizAreas}">
	<div class="container-fluid">
		<!-- Panel Group -->
		<div class="panel-group">
			<!--Each Panel-->
			<div class="panel panel-default">
				<div class="panel-heading">
					Business Name: ${bizArea.bizAreaNm}
					<div class="btn-group btn-group-sm pull-right" role="group">
						<a href="#" type="button" class="btn btn-success" id ="${bizArea.bizAreaId}" onclick="toTargetLst(this)">
							<span class="glyphicon glyphicon-screenshot" aria-hidden="true"></span>
						</a>
						<a href="#" type="button" class="btn btn-info" id ="${bizArea.bizAreaId}" onclick="findBizById(this)">
							<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
						</a>
						<a href="#" type="button" class="btn btn-danger" id="${bizArea.bizAreaId}" onclick="deleteBiz(this)">
							<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
						</a>
					</div>
				</div>
				<div class="panel-body">${bizArea.bizAreaDescr}</div>
			</div>
		</div>
	</div>
</c:forEach>

<!-- This modal is used for add a new business area -->
<div class="modal fade" id="newBizAreaModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="addNewModalLabel">New Business Area</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label for="newBizAreaName">Business Name</label>
					<input type="text" class="form-control" id="newBizAreaName" placeholder="Business Name"
					       name="newBizAreaName">
				</div>
				<div class="form-group">
					<label for="newBizAreaDesc">Business Description</label>
						<textarea class="form-control" rows="5" id="newBizAreaDesc"
						          placeholder="Business Description" name="newBizAreaDesc"></textarea>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary" id="submitNewBizArea" onclick="addBiz()">Add
				</button>
			</div>
		</div>
	</div>
</div>

<!-- This modal is used for modify a business area -->
<div class="modal fade" id="ModifyBizAreaModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="modifyModalLabel">Modify Business Area</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label for="modifyBizAreaName">Business Name</label>
					<input type="text" class="form-control" id="modifyBizAreaName" placeholder="Business Name"
					       name="modifyBizAreaName" value="">
				</div>
				<div class="form-group">
					<label for="modifyBizAreaDesc">Business Description</label>
						<textarea class="form-control" rows="5" id="modifyBizAreaDesc"
						          placeholder="Business Description" name="modifyBizAreaDesc"></textarea>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary" id="modifyBizArea" onclick="modifyBiz(this)">Modify
				</button>
			</div>
		</div>
	</div>
</div>

<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
	function showNewBizAreaModal() {
		$("#newBizAreaModal").modal("show");
	}

	function addBiz() {
		$.ajax({
			type: 'post',
			url: 'addBizArea.action',
			data: 'newBizAreaName=' + $("#newBizAreaName").val() + '&newBizAreaDesc=' + $("#newBizAreaDesc").val(),
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#newBizAreaModal").modal("hide");
					$("#newBizAreaModal").on('hidden.bs.modal', function () {
						$("#RightPart").load("showBizAreaLst.action");
					});
				}
			}
		})
	}

	function deleteBiz(e){
//		$.ajax({
//			type: 'get',
//			url: 'deleteBizArea.action?bizAreaId='+e.id,
//			success:function(data){
//				var result = $.parseJSON(data);
//				if(result.success){
//					alert("You deleted a Business Area!");
//					$("#RightPart").load("showBizAreaLst.action");
//				}
//			}
//		})
		$("#RightPart").load("deleteBizArea.action",{"bizAreaId":e.id},function(){
			alert("You deleted a Business Area!");
		});

	}

	function findBizById(e){
		$.ajax({
			type: 'get',
			url: 'findBizAreaById.action?bizAreaId='+e.id,
			success:function(data){
				$("#modifyBizAreaName").attr("value", data.bizAreaNm);
				$("#modifyBizAreaDesc").html(data.bizAreaDescr);
				$("#modifyBizArea").attr("name", data.bizAreaId);
				$("#ModifyBizAreaModal").modal("show");
			}
		})
	}

	function modifyBiz(){
		$.ajax({
			type: 'post',
			url: 'modifyBizAreaById.action',
			data: 'bizAreaId=' + $("#modifyBizArea").attr("name") +'&bizAreaNm=' + $("#modifyBizAreaName").val() + '&bizAreaDescr=' + $("#modifyBizAreaDesc").val(),
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#ModifyBizAreaModal").modal("hide");
					$("#ModifyBizAreaModal").on('hidden.bs.modal', function () {
						$("#RightPart").load("showBizAreaLst.action");
					});
				}
			}
		})
	}

	function toTargetLst(e){
		$("#RightPart").load("showTargetLst.action?bizAreaId="+e.id);
	}
</script>

</body>
</html>
