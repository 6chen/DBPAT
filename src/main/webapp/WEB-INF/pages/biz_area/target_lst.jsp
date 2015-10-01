<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Target List</title>
	<link rel="stylesheet" href="/css/bootstrap.min.css">
	<style>
		th {
			font-size: 14px;
			text-align: center;
		}

		td {
			font-size: 12px;
			text-align: center;
		}
	</style>
</head>
<body>
<div class="container-fluid">
	<!--page head-->
	<h2><b>Target</b></h2>
	<ul class="breadcrumb">
		<li class="active"><a href="home.action">Home</a></li>
		<li><a href="#" onclick="goBackToBiz()">Business Area</a></li>
		<li class="active"><span id="bizAreaId" name="${bizArea.bizAreaId}"> ${bizArea.bizAreaNm}</span></li>
	</ul>
</div>


<%--DBMS Target--%>
<div class="container-fluid">
	<!-- Panel Group -->
	<div class="panel-group">
		<!--Each Panel-->
		<div class="panel panel-primary">
			<div class="panel-heading">
				DBMS Target
				<div class="pull-right">
					<a href="#" type="button" class="btn btn-default btn-xs" onclick="addDBTargetModal()">Add</a>
					<a href="#" type="button" class="btn btn-danger btn-xs" onclick="editDBTarget()">Edit</a>
				</div>
			</div>
			<div class="panel-body">
				<table id="dbTargetTab" class="table table-hover">
					<thead>
					<tr>
						<th>#</th>
						<th>Target Name</th>
						<th>Target Type</th>
						<th>IP</th>
						<th>Port</th>
						<th>User ID</th>
						<th>Password</th>
						<th>Server</th>
						<th>Schema</th>
						<th>DBMS Version</th>
					</tr>
					</thead>
					<tbody>
					<c:forEach varStatus="i" var="dbmsTargetVo" items="${dbmsTargetVos}">
						<tr name="${dbmsTargetVo.trgtId}">
							<td>${i.index+1}</td>
							<td>${dbmsTargetVo.trgtNm}</td>
							<td>${dbmsTargetVo.trgtTyp}</td>
							<td>${dbmsTargetVo.ip}</td>
							<td>${dbmsTargetVo.prt}</td>
							<td>${dbmsTargetVo.usrId}</td>
							<td>${dbmsTargetVo.pw}</td>
							<td>${dbmsTargetVo.serv}</td>
							<td>${dbmsTargetVo.schm}</td>
							<td>${dbmsTargetVo.dbmsType.dbmsTypNm} ${dbmsTargetVo.dbmsType.dbmsVer}</td>
							<td>
								<div class="btn-group">
									<button type='button' class='btn btn-primary btn-xs' name="${dbmsTargetVo.trgtId}"
									        onclick="modifyDbTarget(this)">
										Mdf
									</button>
									<button type='button' class='btn btn-danger btn-xs' name="${dbmsTargetVo.trgtId}"
									        onclick="removeDbTarget(this)">
										Del
									</button>
								</div>
							</td>
						</tr>

					</c:forEach>
					</tbody>
				</table>
				<c:if test="${dbmsTargetVos.size() == 0}">
					<p class="text-center"> Not Found </p>
				</c:if>
			</div>
		</div>
	</div>
</div>
<!-- This modal is used for DBMS target -->
<div class="modal fade" id="dbTargetModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">DB Target</h4>
			</div>
			<div class="modal-body">
				<form role="form">
					<div class="form-group row">
						<div class="col-xs-6">
							<label for="dbTargetName">DB Target Name</label>
							<input id="dbTargetName" class="form-control col-xs-8  input-sm" type="text"
							       placeholder="Target Name"/>
						</div>
						<div class="col-xs-6">
							<label for="dbTargetType">DB Target Type</label>
							<select class="form-control col-xs-4  input-sm" id="dbTargetType">
								<option selected="selected" value="01">DBMS</option>
								<option value="02">WAS</option>
								<option value="03">Source File</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-6">
							<label for="dbTargetIP">DB Target IP</label>
							<input id="dbTargetIP" class="form-control  input-sm" type="text"
							       placeholder="IP (Ex: xxx.xxx.xxx.xxx)"/>
						</div>
						<div class="col-xs-6">
							<label for="dbTargetPt">DB Target Port</label>
							<input id="dbTargetPt" class="form-control  input-sm" type="text" placeholder="Port"/>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-6">
							<label for="dbUserNm">DB User Name</label>
							<input id="dbUserNm" class="form-control  input-sm" type="text" placeholder="User Name"/>
						</div>
						<div class="col-xs-6">
							<label for="dbPw">DB Password</label>
							<input id="dbPw" class="form-control  input-sm" type="text" placeholder="Password"/>
						</div>
					</div>

					<div class="form-group row">
						<div class="col-xs-6">
							<label for="dbSID">DB SID</label>
							<input id="dbSID" class="form-control  input-sm" type="text" placeholder="DB SID"/>
						</div>
						<div class="col-xs-6">
							<label for="dbSchemaNm">DB Schema Name</label>
							<input id="dbSchemaNm" class="form-control input-sm" type="text" placeholder="Schema name"/>
						</div>
					</div>

					<div class="form-group row">
						<div class="col-xs-6">
							<label for="dbmsType">DBMS Version</label>
							<select class="form-control col-xs-4 input-sm" id="dbmsType">
								<c:forEach varStatus="i" var="dbmsType" items="${dbmsTypes}">
									<option value="${dbmsType.dbmsTypId}">${dbmsType.dbmsTypNm} ${dbmsType.dbmsVer}</option>
								</c:forEach>
							</select>
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary" onclick="addDbTarget()" id="dbTrgtModifySummit">Summit
				</button>
			</div>
		</div>
	</div>
</div>


<%--WAS Target--%>
<div class="container-fluid">
	<!-- Panel Group -->
	<div class="panel-group">
		<!--Each Panel-->
		<div class="panel panel-success">
			<div class="panel-heading">
				WAS Target
				<div class="pull-right">
					<a href="#" type="button" class="btn btn-default btn-xs" onclick="addWASTargetModal()">Add</a>
					<a href="#" type="button" class="btn btn-danger btn-xs">Edit</a>
				</div>
			</div>
			<div class="panel-body">
				<table class="table table-hover ">
					<thead>
					<tr>
						<th>#</th>
						<th>Target Name</th>
						<th>Target Type</th>
						<th>IP</th>
						<th>Port</th>
						<th>Path</th>
						<th>Collection Cycle</th>
					</tr>
					</thead>
					<tbody>
					<c:forEach varStatus="i" var="wasTargetVo" items="${wasTargetVos}">
						<tr>
							<td>${i.index+1}</td>
							<td>${wasTargetVo.trgtNm}</td>
							<td>${wasTargetVo.trgtTyp}</td>
							<td>${wasTargetVo.ip}</td>
							<td>${wasTargetVo.prt}</td>
							<td>${wasTargetVo.path}</td>
							<td>${wasTargetVo.clctCycl}</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				<c:if test="${wasTargetVos.size() == 0}">
					<p class="text-center"> Not Found </p>
				</c:if>
			</div>
		</div>
	</div>
</div>
<!-- This modal is used for WAS target -->
<div class="modal fade" id="wasTargetModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">WAS Target</h4>
			</div>
			<div class="modal-body">
				<form role="form">
					<div class="form-group row">
						<div class="col-xs-6">
							<label for="wasTargetName">WAS Target Name</label>
							<input id="wasTargetName" class="form-control col-xs-8 input-sm" type="text"
							       placeholder="Target Name"/>
						</div>
						<div class="col-xs-6">
							<label for="wasTargetType">WAS Target Type</label>
							<select class="form-control col-xs-4 input-sm" id="wasTargetType">
								<option>DBMS</option>
								<option selected="selected">WAS</option>
								<option>Source File</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-6">
							<label for="wasTargetIP">WAS Target IP</label>
							<input id="wasTargetIP" class="form-control input-sm" type="text"
							       placeholder="IP (Ex: xxx.xxx.xxx.xxx)"/>
						</div>
						<div class="col-xs-6">
							<label for="wasTargetPt">WAS Target Port</label>
							<input id="wasTargetPt" class="form-control input-sm" type="text" placeholder="Port"/>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-6">
							<label for="wasUserNm">WAS User Name</label>
							<input id="wasUserNm" class="form-control input-sm" type="text" placeholder="User Name"/>
						</div>
						<div class="col-xs-6">
							<label for="wasPw">WAS Password</label>
							<input id="wasPw" class="form-control input-sm" type="text" placeholder="Password"/>
						</div>
					</div>

					<div class="form-group row">
						<div class="col-xs-6">
							<label for="filePath">File Path</label>
							<input id="filePath" class="form-control input-sm" type="text" placeholder="File Path"/>
						</div>
						<div class="col-xs-6">
							<label for="collectCycle">Collect Cycle(Second)</label>
							<input id="collectCycle" class="form-control input-sm" type="text"
							       placeholder="Collect Cycle(Second)"/>
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary">Save changes</button>
			</div>
		</div>
	</div>
</div>

<%--Source File Target--%>
<div class="container-fluid">
	<!-- Panel Group -->
	<div class="panel-group">
		<!--Each Panel-->
		<div class="panel panel-info">
			<div class="panel-heading">
				Source File Target
				<div class="pull-right">
					<a href="#" type="button" class="btn btn-default btn-xs">Add</a>
					<a href="#" type="button" class="btn btn-danger btn-xs">Edit</a>
				</div>
			</div>
			<div class="panel-body">
				<table class="table table-hover ">
					<thead>
					<tr>
						<th>#</th>
						<th>Target Name</th>
						<th>Target Type</th>
						<th>IP</th>
						<th>Port</th>
						<th>Path</th>
					</tr>
					</thead>
					<tbody>
					<c:forEach varStatus="i" var="srcFIleTargetVo" items="${srcFIleTargetVos}">
						<tr>
							<td>${i.index+1}</td>
							<td>${srcFIleTargetVo.trgtNm}</td>
							<td>${srcFIleTargetVo.trgtTyp}</td>
							<td>${srcFIleTargetVo.ip}</td>
							<td>${srcFIleTargetVo.prt}</td>
							<td>${srcFIleTargetVo.path}</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				<c:if test="${srcFIleTargetVos.size() == 0}">
					<p class="text-center"> Not Found </p>
				</c:if>
			</div>
		</div>
	</div>
</div>
<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
	$(function () {
		$("#dbTargetTab tbody tr td:last-child").hide()
	})


	function addDBTargetModal() {
		$("#dbTargetModal").modal("show");
	}
	function addWASTargetModal() {
		$("#wasTargetModal").modal("show");
	}
	function editDBTarget() {
		$("#dbTargetTab tbody tr td:last-child").toggle(100);
	}
	function addDbTarget() {
		$.ajax({
			type: 'post',
			url: '/addDbTarget.action',
			data: {
				bizAreaId: $("#bizAreaId").attr("name"),
				trgtNm: $("#dbTargetName").val(),
				trgtTyp: $("#dbTargetType").val(),
				ip: $("#dbTargetIP").val(),
				prt: $("#dbTargetPt").val(),
				usrId: $("#dbUserNm").val(),
				pw: $("#dbPw").val(),
				serv: $("#dbSID").val(),
				schm: $("#dbSchemaNm").val(),
				dbmsTypId: $("#dbmsType").val()
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#dbTargetModal").modal("hide");
					$("#dbTargetModal").on('hidden.bs.modal', function () {
						$("#RightPart").load("showTargetLst.action?bizAreaId=" + result.bizAreaId);
					});
				}
			}
		})
	}
	function removeDbTarget(e) {
		$.ajax({
			type: 'post',
			url: '/removeDbTarget.action',
			data: {
				bizAreaId: $("#bizAreaId").attr("name"),
				trgtId: e.name
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#RightPart").load("showTargetLst.action?bizAreaId=" + result.bizAreaId);
				}
			}
		})
	}
	function goBackToBiz() {
		$("#RightPart").load("showBizAreaLst.action");
	}
	function modifyDbTarget(e) {
		$.ajax({
			type: 'post',
			url: '/findTargetById.action',
			data: {
				bizAreaId: $("#bizAreaId").attr("name"),
				trgtId: e.name
			},
			success: function (data) {
				$("#dbTrgtModifySummit").attr("name", data.trgtId);
				$("#dbTargetName").attr("value", data.trgtNm);
				$("#dbTargetType").attr("value", data.trgtTyp);
				$("#dbTargetIP").attr("value", data.ip);
				$("#dbTargetPt").attr("value", data.prt);
				$("#dbUserNm").attr("value", data.usrId);
				$("#dbPw").attr("value", data.pw);
				$("#dbSID").attr("value", data.serv);
				$("#dbSchemaNm").attr("value", data.schm);
				$("#dbmsType").val(data.dbmsType.dbmsTypId);
				$("#dbTargetModal").modal("show");
			}
		})
	}

</script>
</body>
</html>
