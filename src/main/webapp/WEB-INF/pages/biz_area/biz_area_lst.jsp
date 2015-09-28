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
						<a href="#" type="button" class="btn btn-primary btn-xs">Modify</a>
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
				<h4 class="modal-title" id="myModalLabel">New Business Area</h4>
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
				<button type="button" class="btn btn-primary" id="submitNewBizArea" onclick="summitNewBiz()">Add
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

	function summitNewBiz() {
		$.ajax({
			type: 'post',
			url: 'biz_area_add.action',
			data: 'newBizAreaName=' + $("#newBizAreaName").val() + '&newBizAreaDesc=' + $("#newBizAreaDesc").val(),
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#newBizAreaModal").modal("hide");
					$("#newBizAreaModal").on('hidden.bs.modal', function () {
						$("#RightPart").load("biz_area_list.action");
					});
				}
			}
		})
	}

	function deleteBiz(e){
		$.ajax({
			type: 'get',
			url: '/biz_area_delete.action?bizAreaId='+e.id,
			success:function(data){
				var result = $.parseJSON(data);
				if(result.success){
					alert("You deleted a Business Area!");
					$("#RightPart").load("biz_area_list.action");
				}
			}
		})
	}

</script>

</body>
</html>
