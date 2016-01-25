<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<style>
	th {
		font-size: 12px;
		text-align: center;
	}

	td {
		font-size: 12px;
		text-align: center;
	}
</style>

<div class="row">
	<div class="col-lg-7">
		<div class="box box-solid box-default">
			<div class="box-header" style="text-align: center">
				<h3 class="box-title" style="font-size: 13px"><b>수집작업 대상</b></h3>
			</div>
			<!-- /.box-header -->
			<div class="box-body no-padding">
				<c:if test="${jobTargetVoList == null || fn:length(jobTargetVoList) == 0}">
					<div class="row" style="text-align: center">
						<b>작업대상이 없습니다.</b>
					</div>
				</c:if>
				<c:if test="${jobTargetVoList != null && fn:length(jobTargetVoList) > 0}">
					<table class="table table-hover">
						<thead>
						<tr>
							<th>순번</th>
							<th>업무영역</th>
							<th>대상서버</th>
							<th>IP</th>
							<th>PORT</th>
							<th>SID</th>
							<th>SCHEMA</th>
						</tr>
						</thead>
						<tbody>
							<%--등록된 모든 검사작업을 반복 출력하는 부분--%>
						<c:forEach varStatus="i" var="jobTargetVo" items="${jobTargetVoList}">
							<tr onclick="showJobHistByTrgt(this)" name="${jobTargetVo.jbId},${jobTargetVo.bizAreaPo.bizAreaId},${jobTargetVo.targetPo.trgtId}">
								<td>${i.index+1}</td>
								<td>${jobTargetVo.bizAreaPo.bizAreaNm}</td>
								<td>${jobTargetVo.targetPo.trgtNm}</td>
								<td>${jobTargetVo.targetPo.ip}</td>
								<td>${jobTargetVo.targetPo.prt}</td>
								<td>${jobTargetVo.targetPo.sid}</td>
								<td>${jobTargetVo.targetPo.schm}</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</c:if>
			</div>
			<!-- /.box-body -->
		</div>
	</div>
	<div class="col-lg-5" id="execHist${jbId}">
		<jsp:include page="/show_clct_job_all_hist.action"></jsp:include>
	</div>
</div>

<div class="row">
	<div id="execDetail${jbId}" class="col-lg-12">

	</div>
</div>

<script>
	function showJobHistByTrgt(e){

		var arr = new Array();
		arr = $(e).attr("name").split(',');
		alert(arr[0]);

//		alert($(e).attr("name"))
//		$(e).parent("div").css("background","green");

//		$("#containPanel"+arr[0]).css("background","green");


//		$("#containPanel"+arr[0]+"").html("<p>ok</p>");
	}
</script>
