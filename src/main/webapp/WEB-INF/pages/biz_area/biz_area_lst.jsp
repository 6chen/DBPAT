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
		<button id="addBizAreaShow" type="button" class="btn btn-default pull-right" data-toggle="modal"
		        onclick="showNewBizAreaModal()">
			Add New
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
						<a href="#" type="button" class="btn btn-primary btn-xs" id ="${bizArea.bizAreaId}" onclick="findBizById(this)">Modify</a>
						<a href="#" type="button" class="btn btn-danger btn-xs" id="${bizArea.bizAreaId}" onclick="deleteBiz(this)">Delete</a>
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
		$.ajax({
			type: 'get',
			url: 'deleteBizArea.action?bizAreaId='+e.id,
			success:function(data){
				var result = $.parseJSON(data);
				if(result.success){
					alert("You deleted a Business Area!");
					$("#RightPart").load("showBizAreaLst.action");
				}
			}
		})
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
</script>

</body>
</html>
