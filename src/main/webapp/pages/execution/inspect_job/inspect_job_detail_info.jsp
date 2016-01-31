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

<%--박스 -> 검사작업 상세 정보 (검사대상/검사규칙집합)--%>
<div class="box box-primary">
	<div class="box-header"  style="text-align: center">
		<h3 class="box-title"><b>검사작업 상세 정보</b></h3>
	</div>
	<div class="box-body">
		<%--검사대상 리스트 부분--%>
		<div class="row">
			<div class="col-lg-12">
				<div class="box box-solid box-primary">
					<div class="box-header" style="text-align: center">
						<h3 class="box-title">검사대상 리스트</h3>
					</div>
					<div class="box-body">

						<c:if test="${jobTargetVoList == null || fn:length(jobTargetVoList) == 0}">
							<div class="row"  style="text-align: center; font-size: 12px">
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
									<th>CLCTYN</th>
								</tr>
								</thead>
								<tbody>
								<c:forEach varStatus="i" var="jobTargetVo" items="${jobTargetVoList}">
									<tr onclick="showJobHistByTrgt(this)"
									    name="${jobTargetVo.jbId},${jobTargetVo.bizAreaPo.bizAreaId},${jobTargetVo.targetPo.trgtId}">
										<td>${i.index+1}</td>
										<td>${jobTargetVo.bizAreaPo.bizAreaNm}</td>
										<td>${jobTargetVo.targetPo.trgtNm}</td>
										<td>${jobTargetVo.targetPo.ip}</td>
										<td>${jobTargetVo.targetPo.prt}</td>
										<td>${jobTargetVo.targetPo.sid}</td>
										<td>${jobTargetVo.targetPo.schm}</td>
										<td>
											<c:if test="${jobTargetVo.clctedYn == 0}">
												<small class="label label-danger">
													미수집
												</small>
											</c:if>
											<c:if test="${jobTargetVo.clctedYn > 0}">
												<small class="label label-success">
													수집완료
												</small>
											</c:if>
										</td>
									</tr>
								</c:forEach>
								</tbody>
							</table>
						</c:if>
					</div>
				</div>
			</div>
		</div>
		<%--검사 규칙집합 부분 및 검사작업 수행이력 부분 --%>
		<div class="row">
			<%--검사 규칙집합 부분--%>
			<div class="col-lg-6">
				<div class="box box-solid box-info">
					<div class="box-header"  style="text-align: center">
						<h3 class="box-title">규칙집합 리스트</h3>
					</div>
					<div class="box-body">

						<c:if test="${ruleSetVoList == null || fn:length(ruleSetVoList) == 0}">
							<div class="row"  style="text-align: center; font-size: 12px">
								<b>검사규칙 없습니다.</b>
							</div>
						</c:if>
						<c:if test="${ruleSetVoList != null && fn:length(ruleSetVoList) > 0}">
							<table class="table">
								<thead>
								<tr>
									<th style="text-align: left;font-size: 12px">검사규칙집합</th>
								</tr>
								</thead>
								<tbody>

								<c:forEach varStatus="i" var="ruleSetVo" items="${ruleSetVoList}">
									<tr>
										<td style="vertical-align: middle; text-align: left; font-size: 15px">
											<small class="label label-default">
													${ruleSetVo.rlSetNm}
												<i class="fa fa-arrow-circle-down"></i>
											</small>
										</td>
									</tr>
								</c:forEach>
								</tbody>
							</table>
						</c:if>
					</div>
				</div>
			</div>
			<%--검사작업 수행이력 부분 --%>
			<div class="col-lg-6">
				<div id="isptJobExecHistPrt">
					<%--<jsp:include page="/show_ispt_job_exec_hist.action"></jsp:include>--%>
					<div class="box box-solid box-warning">
						<div class="box-header"  style="text-align: center">
							<h3 class="box-title">검사작업 수행 이역</h3>
						</div>
						<!-- /.box-header -->
						<div class="box-body">
							<c:if test="${JobExecHistVoList == null || fn:length(JobExecHistVoList) == 0}">
								<div class="row" style="text-align: center; font-size: 12px">
									<b>검사작업에 대한 수행이력이 없습니다.</b>
								</div>
							</c:if>
							<c:if test="${JobExecHistVoList != null && fn:length(JobExecHistVoList) > 0}">
								<table class="table table-hover">
									<thead>
									<tr>
										<th>차수</th>
										<th>시작시간</th>
										<th>종료시간</th>
											<%--<th>소유시간</th>--%>
									</tr>
									</thead>
									<tbody>
										<%--등록된 모든 검사작업을 반복 출력하는 부분--%>
									<c:forEach varStatus="i" var="jobExecHistVo"
									           items="${JobExecHistVoList}">
										<tr name="${jobExecHistVo.jbId},${jobExecHistVo.jbExecCnt}"
										    onclick="showJobExecDetail(this)">
											<td>${jobExecHistVo.jbExecCnt}</td>
											<td>${jobExecHistVo.jbExecSt}</td>
											<td>${jobExecHistVo.jbExecEd}</td>
										</tr>
									</c:forEach>
									</tbody>
								</table>
							</c:if>
						</div>
						<!-- /.box-body -->
					</div>
				</div>
			</div>
		</div>
	</div>


	<c:if test="${(jobTargetVoList != null && fn:length(jobTargetVoList) > 0) && (ruleSetVoList != null || fn:length(ruleSetVoList) > 0) && execYn != 0}">
		<div class="box-footer clearfix">
			<button type="button" class="btn btn-sm btn-success pull-left" id="isptJobExecBtn">
				검사작업 수행
				<i class="glyphicon glyphicon-play-circle"></i>
			</button>
		</div>
	</c:if>
</div>