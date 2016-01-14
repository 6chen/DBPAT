<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<style>
	th {
		font-size: 15px;
		text-align: center;
	}

	td {
		font-size: 14px;
		text-align: center;
	}
</style>

<c:if test="${targetPoList != null && fn:length(targetPoList) > 0}">
	<table class="table table-hover">
		<thead>
		<tr>
			<th style="width: 10px">#</th>
			<th>검사대상 명칭</th>
			<th>검사 대상 유형</th>
			<th>검사 대상 IP</th>
			<th>포트</th>
			<th>DB 유형</th>
			<th>DB User</th>
			<th>DB PW</th>
			<th>DB SID</th>
			<th>스키마</th>
			<th></th>
		</tr>
		</thead>
		<tbody>
		<c:forEach varStatus="i" var="targetPo" items="${targetPoList}">
			<tr>
				<td style="width: 10px">${i.index+1}</td>
				<td style="width: 30px">${targetPo.trgtNm}</td>
				<td>${targetPo.trgtTyp}</td>
				<td>${targetPo.ip}</td>
				<td>${targetPo.prt}</td>
				<td>${targetPo.dbmsTypId}</td>
				<td>${targetPo.usrId}</td>
				<td>${targetPo.pw}</td>
				<td>${targetPo.sid}</td>
				<td>${targetPo.schm}</td>
				<td style="width: 10px;">
					<button name="${targetPo.trgtId}" type="button" class="btn btn-block btn-warning btn-xs"
					        onclick="showModifyTargetModal(this)">변경
					</button>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>

<c:if test="${targetPoList == null || fn:length(targetPoList) == 0}">
	<b>대상이 없습니다.</b>
</c:if>

<!-- 대상 수정 모달 창 -->
<div class="modal fade" id="modifyDbTargetModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
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
							<label for="oldDbTargetNm">DB Target Name</label>
							<input id="oldDbTargetNm" class="form-control col-xs-8  input-sm" type="text"
							       placeholder="Target Name"/>
						</div>
						<div class="col-xs-6">
							<label for="oldDbTargetType">DB Target Type</label>
							<select class="form-control col-xs-4  input-sm" id="oldDbTargetType">
								<option selected="selected" value="01">DBMS</option>
								<option value="02">WAS</option>
								<option value="03">Source File</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-6">
							<label for="oldDbTargetIP">DB Target IP</label>
							<input id="oldDbTargetIP" class="form-control  input-sm" type="text"
							       placeholder="IP (Ex: xxx.xxx.xxx.xxx)"/>
						</div>
						<div class="col-xs-6">
							<label for="oldDbTargetPt">DB Target Port</label>
							<input id="oldDbTargetPt" class="form-control  input-sm" type="text" placeholder="Port"/>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-6">
							<label for="oldDbUserNm">DB User Name</label>
							<input id="oldDbUserNm" class="form-control  input-sm" type="text"
							       placeholder="User Name"/>
						</div>
						<div class="col-xs-6">
							<label for="oldDbPw">DB Password</label>
							<input id="oldDbPw" class="form-control  input-sm" type="text" placeholder="Password"/>
						</div>
					</div>

					<div class="form-group row">
						<div class="col-xs-6">
							<label for="oldDbSID">DB SID</label>
							<input id="oldDbSID" class="form-control  input-sm" type="text" placeholder="DB SID"/>
						</div>
						<div class="col-xs-6">
							<label for="oldDbSchemaNm">DB Schema Name</label>
							<input id="oldDbSchemaNm" class="form-control input-sm" type="text"
							       placeholder="Schema name"/>
						</div>
					</div>

					<div class="form-group row">
						<div class="col-xs-6">
							<label for="oldDbmsType">DBMS Version</label>
							<select class="form-control col-xs-4 input-sm" id="oldDbmsType">
								<c:forEach varStatus="i" var="dbmsTypePo" items="${dbmsTypePoList}">
									<option value="${dbmsTypePo.dbmsTypId}">${dbmsTypePo.dbmsTypNm} ${dbmsTypePo.dbmsVer}</option>
								</c:forEach>
							</select>
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-danger pull-left" id="removeOldTarget" onclick="removeTarget()">삭제
				</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
				<button type="button" class="btn btn-warning" onclick="modifyOldDbTarget()" id="modifyOldDbTargetBtn">변경
				</button>
			</div>
		</div>
	</div>
</div>


<script>
	function showModifyTargetModal(e){
		$.ajax({
			type: 'post',
			url: '/find_one_target.action',
			data: {
				bizAreaId: $("#targetListHeader").attr("name"),
				trgtId: e.name
			},
			success: function (data) {
				$("#modifyOldDbTargetBtn").attr("name", data.trgtId);
				$("#removeOldTarget").attr("name", data.trgtId);
				$("#oldDbTargetNm").attr("value", data.trgtNm);
				$("#oldDbTargetType").attr("value", data.trgtTyp);
				$("#oldDbTargetIP").attr("value", data.ip);
				$("#oldDbTargetPt").attr("value", data.prt);
				$("#oldDbUserNm").attr("value", data.usrId);
				$("#oldDbPw").attr("value", data.pw);
				$("#oldDbSID").attr("value", data.sid);
				$("#oldDbSchemaNm").attr("value", data.schm);
				$("#oldDbmsType").val(data.dbmsTypId);
				$("#modifyDbTargetModal").modal("show");
			}
		})
	}

	function modifyOldDbTarget(){
		$.ajax({
			type: 'post',
			url: '/modify_target.action',
			data: {
				bizAreaId: $("#targetListHeader").attr("name"),
				trgtId: $("#modifyOldDbTargetBtn").attr("name"),
				trgtNm: $("#oldDbTargetNm").val(),
				trgtTyp: $("#oldDbTargetType").val(),
				ip: $("#oldDbTargetIP").val(),
				prt: $("#oldDbTargetPt").val(),
				usrId: $("#oldDbUserNm").val(),
				pw: $("#oldDbPw").val(),
				sid: $("#oldDbSID").val(),
				schm: $("#oldDbSchemaNm").val(),
				dbmsTypId: $("#oldDbmsType").val()
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#modifyDbTargetModal").modal("hide");
					$("#modifyDbTargetModal").on('hidden.bs.modal', function () {
						$("#targetList").load("show_target_trgt_list.action?bizAreaId=" + $("#targetListHeader").attr("name"));
					});
				}
			}
		})
	}

	function removeTarget(){
		$.ajax({
			type: 'post',
			url: 'remove_target.action',
			data: {
				bizAreaId: $("#targetListHeader").attr("name"),
				trgtId: $("#removeOldTarget").attr("name"),
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#modifyDbTargetModal").modal("hide");
					$("#modifyDbTargetModal").on('hidden.bs.modal', function () {
						$("#targetList").load("show_target_trgt_list.action?bizAreaId=" + $("#targetListHeader").attr("name"));
					});
				}
			}
		})
	}
</script>