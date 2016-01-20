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

<%--만약 등록된 작업대상이 있으면 테이블 형태로 나타남--%>
<c:if test="${jobTargetVoList != null && fn:length(jobTargetVoList) > 0}">
	<table class="table table-hover">
		<thead>
		<tr>
			<th style="width: 200px">작업실행 순번</th>
			<th style="width: 200px">업무영역 명칭</th>
			<th style="width: 200px">작업대상 서버명칭</th>
			<th></th>
		</tr>
		</thead>
		<tbody>
			<%--등록된 모든 검사작업을 반복 출력하는 부분--%>
		<c:forEach varStatus="i" var="jobTargetVo" items="${jobTargetVoList}">
			<tr>
				<td>${i.index+1}</td>
				<td>${jobTargetVo.bizAreaPo.bizAreaNm}</td>
				<td>${jobTargetVo.targetPo.trgtNm}</td>
				<td style="width: 5px;">
					<button name="${jobTargetVo.jbId},${jobTargetVo.execSeq}" type="button"
					        class="btn btn-block btn-danger btn-xs"
					        onclick="removeJobTargetVo(this)">삭제
					</button>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>

<%--만약 등록된 작업대상이 없으면 아래와 같은 메시지를 출력--%>
<c:if test="${jobTargetVoList == null || fn:length(jobTargetVoList) == 0}">
	<div class="row" style="text-align: center">
		<b>작업대상이 없습니다.</b>
	</div>
</c:if>

<script>
	function removeJobTargetVo(e) {
		var jbId = $("#showJobTargetAddModalBtn").attr("name");
		$.ajax({
			type: 'get',
			url: 'remove_job_target.action?jbIdExecSeqStr=' + $(e).attr("name"),
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#jobTargetList").load("show_job_target_list.action?jbId=" + jbId);
				}
			}
		})
	}
</script>
