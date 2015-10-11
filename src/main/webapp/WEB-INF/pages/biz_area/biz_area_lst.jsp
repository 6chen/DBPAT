<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section class="content-header">
	<h1>
		Business Area
		<small>list of all Biz Area</small>
	</h1>
	<ol class="breadcrumb">
		<li><a href="/home.action"><i class="fa fa-dashboard"></i> Home</a></li>
		<li class="active">Business Area</li>
	</ol>
</section>

<section class="content">
	<div class="box">
		<div class="box-header with-border">
			<h3 class="box-title">Business Area List</h3>
			<div class="box-tools pull-right">
				<button class="btn btn-default btn-sm" onclick="showNewBizAreaModal()">
					<i class="fa fa-plus"></i>
				</button>
			</div>
		</div>

		<!-- /.box-header -->
		<div class="box-body">
			<ul class="products-list product-list-in-box">
				<c:forEach varStatus="i" var="bizArea" items="${bizAreas}">
					<li class="item">
						<div class="product-img">
							<img src="dist/img/default-50x50.gif" alt="Product Image">
						</div>
						<div class="product-info">
							<span class="product-title"><b>${bizArea.bizAreaNm}</b></span>

							<div class="btn-group btn-group-sm pull-right" role="group">
								<a href="#" type="button" class="btn btn-success" id="${bizArea.bizAreaId}"
								   onclick="toTargetLst(this)">
									<span class="glyphicon glyphicon-screenshot" aria-hidden="true"></span>
								</a>
								<a href="#" type="button" class="btn btn-info" id="${bizArea.bizAreaId}"
								   onclick="findBizById(this)">
									<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
								</a>
								<a href="#" type="button" class="btn btn-danger" id="${bizArea.bizAreaId}"
								   onclick="deleteBiz(this)">
									<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
								</a>
							</div>
                        <span class="product-description">
		                        ${bizArea.bizAreaDescr}
                        </span>
						</div>
					</li>
					<!-- /.item -->
				</c:forEach>
			</ul>
		</div>
		<!-- /.box-body -->
	</div>
</section>

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

	function deleteBiz(e) {
		$("#RightPart").load("deleteBizArea.action", {"bizAreaId": e.id}, function () {
			alert("You deleted a Business Area!");
		});

	}

	function findBizById(e) {
		$.ajax({
			type: 'get',
			url: 'findBizAreaById.action?bizAreaId=' + e.id,
			success: function (data) {
				$("#modifyBizAreaName").attr("value", data.bizAreaNm);
				$("#modifyBizAreaDesc").html(data.bizAreaDescr);
				$("#modifyBizArea").attr("name", data.bizAreaId);
				$("#ModifyBizAreaModal").modal("show");
			}
		})
	}

	function modifyBiz() {
		$.ajax({
			type: 'post',
			url: 'modifyBizAreaById.action',
			data: 'bizAreaId=' + $("#modifyBizArea").attr("name") + '&bizAreaNm=' + $("#modifyBizAreaName").val() + '&bizAreaDescr=' + $("#modifyBizAreaDesc").val(),
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

	function toTargetLst(e) {
		$("#RightPart").load("showTargetLst.action?bizAreaId=" + e.id);
	}
</script>