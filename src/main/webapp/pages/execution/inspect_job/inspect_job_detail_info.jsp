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

<div class="box box-solid box-primary">
	<div class="box-header">
		<h3 class="box-title">검사작업 상세 정보 (검사대상/검사규칙집합)</h3>
	</div>
	<div class="box-body">
		<div class="col-lg-9 border-right">
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

		<div class="col-lg-3">
			<c:if test="${ruleSetVoList == null || fn:length(ruleSetVoList) == 0}">
				<div class="row" style="text-align: center">
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
	<c:if test="${(jobTargetVoList != null && fn:length(jobTargetVoList) > 0) && (ruleSetVoList != null || fn:length(ruleSetVoList) > 0) && execYn != 0}">
	<div class="box-footer clearfix">
		<button type="button" class="btn btn-sm btn-success pull-left" id="isptJobExecBtn">
			검사작업 수행
			<i class="glyphicon glyphicon-play-circle"></i>
		</button>
	</div>
	</c:if>
</div>