<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<style>
	th {
		/*font-size: 14px;*/
		text-align: center;
	}

	td {
		font-size: 14px;
		text-align: center;
	}
</style>

<%--만약 등록된 검사작업이 있으면 테이블 형태로 나타남--%>
<c:if test="${jobPoList != null && fn:length(jobPoList) > 0}">
	<table class="table table-hover">
		<thead>
		<tr>
			<th style="width: 10px">#</th>
			<th style="width: 200px">검사작업 명칭</th>
			<th></th>
		</tr>
		</thead>
		<tbody>
			<%--등록된 모든 검사작업을 반복 출력하는 부분--%>
		<c:forEach varStatus="i" var="jobPo" items="${jobPoList}">
			<tr>
				<td>${i.index+1}</td>
				<td><a href="#" onclick="showJobTargetList(this); return false;"
				       name="${jobPo.jbId}" data-toggle="tooltip"
				       data-original-title="Show Detail"
						>${jobPo.jbNm}</a></td>
				<td style="width: 5px;">
					<button name="${jobPo.jbId}" type="button" class="btn btn-block btn-info btn-xs"
					        onclick="showUsedRuleSetModal(this)">규칙
					</button>
				</td>
				<td style="width: 5px;">
					<button name="${jobPo.jbId}" type="button" class="btn btn-block btn-warning btn-xs"
					        onclick="showModifyJobModal(this)">변경
					</button>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>

<%--만약 등록된 검사작업이 없으면 아래와 같은 메시지를 출력--%>
<c:if test="${jobPoList == null || fn:length(jobPoList) == 0}">
	<div class="row" style="text-align: center">
		<b>검사 작업이 없습니다.</b>
	</div>
</c:if>

<!-- 작업을 수정할 때 나타나는 모달 창 -->
<div class="modal fade" id="usedRuleSetModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="addNewModalLabel">적용된 검사 규칙</h4>
			</div>
			<div class="modal-body">
				<div class="form-group" id="jobUsedRuleSetList">
					<div class="checkbox">
						<label>
							<input type="checkbox" value="ck1">
							Checkbox 1
						</label>
					</div>

					<div class="checkbox">
						<label>
							<input type="checkbox" value="ck2">
							Checkbox 2
						</label>
					</div>

					<div class="checkbox">
						<label>
							<input type="checkbox" value="ck3">
							Checkbox 3
						</label>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
				<button type="button" class="btn btn-warning" id="saveJobRuleSetBtn" onclick="saveRuleSetChange(this)">
					저장
				</button>
			</div>
		</div>
	</div>
</div>

<script>
	function showUsedRuleSetModal(e) {
		var jbId = $(e).attr("name");
		$("#saveJobRuleSetBtn").attr("name", jbId);
		$.ajax({
			type: 'get',
			url: '/show_selected_job_rule_set_list.action?jbId=' + jbId,
			success: function (data) {
				var ckdBoxTag = "";
				if (data.length > 0) {
					$.each(data, function (key, JobRuleSetRelPo) {
						ckdBoxTag += "<div class='checkbox'> <label> <input type='checkbox' value='" + JobRuleSetRelPo.rlSetId + "'";
						if (JobRuleSetRelPo.ckdYn == "Y") {
							ckdBoxTag += " checked='checked'"
						}
						ckdBoxTag += ">" + JobRuleSetRelPo.rlSetNm + "</label> </div>";
					});
				}
				$("#jobUsedRuleSetList").html(ckdBoxTag);
			}
		})
		$("#usedRuleSetModal").modal("show");
	}

	function saveRuleSetChange(e) {
		var jbId = $(e).attr("name");
		var selectedRuleSetArr = new Array();

		$("#jobUsedRuleSetList [type='checkbox']:checked").each(function () {
			selectedRuleSetArr.push($(this).attr("value"));
		})

		$.ajax({
			type: 'post',
			url: '/job_rule_set_save.action',
			data: {
				jbId: jbId,
				selectedRuleSetArr: selectedRuleSetArr
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#usedRuleSetModal").modal("hide");
//					$("#usedRuleSetModal").on('hidden.bs.modal', function () {
//						showAllJobList();
//					});
//					alert(selectedRuleSetArr);
				}
			}
		})
	}
</script>
