<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<div class="box box-info">

	<!-- box-header -->
	<div class="box-header with-border">
		<h3 id="targetListHeader" class="box-title"><b>Targets</b></h3>

		<div class="box-tools">
			<a href="#" class="btn btn-sm btn-success btn-flat pull-right" onclick="showAddDBTargetModal()">감리 대상 추가</a>
		</div>
	</div>

	<!-- box-body -->
	<div class="box-body" style="overflow-y: scroll; width: auto; height: auto">
		<div id="targetList">
			<jsp:include page="/show_target_trgt_list.action"></jsp:include>
		</div>
	</div>
</div>

<!-- 대상 추가 모달 창 -->
<div class="modal fade" id="addDbTargetModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">감리 대상 추가</h4>
			</div>
			<div class="modal-body">
				<form role="form">
					<div class="form-group row">
						<div class="col-xs-6">
							<label for="newDbTargetName">DB Target Name</label>
							<input id="newDbTargetName" class="form-control col-xs-8  input-sm" type="text"
							       placeholder="Target Name"/>
						</div>
						<div class="col-xs-6">
							<label for="newDbTargetType">DB Target Type</label>
							<select class="form-control col-xs-4  input-sm" id="newDbTargetType">
								<option selected="selected" value="01">DBMS</option>
								<option value="02">WAS</option>
								<option value="03">Source File</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-6">
							<label for="newDbTargetIP">DB Target IP</label>
							<input id="newDbTargetIP" class="form-control  input-sm" type="text"
							       placeholder="IP (Ex: xxx.xxx.xxx.xxx)"/>
						</div>
						<div class="col-xs-6">
							<label for="newDbTargetPt">DB Target Port</label>
							<input id="newDbTargetPt" class="form-control  input-sm" type="text" placeholder="Port"/>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-6">
							<label for="newDbUserNm">DB User Name</label>
							<input id="newDbUserNm" class="form-control  input-sm" type="text"
							       placeholder="User Name"/>
						</div>
						<div class="col-xs-6">
							<label for="newDbPw">DB Password</label>
							<input id="newDbPw" class="form-control  input-sm" type="text" placeholder="Password"/>
						</div>
					</div>

					<div class="form-group row">
						<div class="col-xs-6">
							<label for="newDbSID">DB SID</label>
							<input id="newDbSID" class="form-control  input-sm" type="text" placeholder="DB SID"/>
						</div>
						<div class="col-xs-6">
							<label for="newDbSchemaNm">DB Schema Name</label>
							<input id="newDbSchemaNm" class="form-control input-sm" type="text"
							       placeholder="Schema name"/>
						</div>
					</div>

					<div class="form-group row">
						<div class="col-xs-6">
							<label for="newDbmsType">DBMS Version</label>
							<select class="form-control col-xs-4 input-sm" id="newDbmsType">
								<c:forEach varStatus="i" var="dbmsTypePo" items="${dbmsTypePoList}">
									<option value="${dbmsTypePo.dbmsTypId}">${dbmsTypePo.dbmsTypNm} ${dbmsTypePo.dbmsVer}</option>
								</c:forEach>
							</select>
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
				<button type="button" class="btn btn-success" onclick="addNewDbTarget()" id="addNewDbTarget">추가
				</button>
			</div>
		</div>
	</div>
</div>

<script>
	function showAddDBTargetModal() {
		if ($("#targetListHeader").text() == "Targets") {
			alert("업무영역을 선택한 후에 감리 대상을 추가하세요.")
		} else {
			$("#newDbTargetName").val("");
			$("#newDbTargetType").val("01");
			$("#newDbTargetIP").val("");
			$("#newDbTargetPt").val("");
			$("#newDbUserNm").val("");
			$("#newDbPw").val("");
			$("#newDbSID").val("");
			$("#newDbSchemaNm").val("");
//			$("#newDbmsType").val("");
			$("#addDbTargetModal").modal("show");
		}
	}

	function addNewDbTarget() {
		$.ajax({
			type: 'post',
			url: '/add_new_target.action',
			data: {
				bizAreaId: $("#targetListHeader").attr("name"),
				trgtNm: $("#newDbTargetName").val(),
				trgtTyp: $("#newDbTargetType").val(),
				ip: $("#newDbTargetIP").val(),
				prt: $("#newDbTargetPt").val(),
				usrId: $("#newDbUserNm").val(),
				pw: $("#newDbPw").val(),
				sid: $("#newDbSID").val(),
				schm: $("#newDbSchemaNm").val(),
				dbmsTypId: $("#newDbmsType").val()
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#addDbTargetModal").modal("hide");
					$("#addDbTargetModal").on('hidden.bs.modal', function () {
						$("#targetList").load("show_target_trgt_list.action?bizAreaId=" + $("#targetListHeader").attr("name"));
					});
				}
			}
		})
	}
</script>