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

<%--만약 등록된 수집작업이 있으면 테이블 형태로 나타남--%>
<c:if test="${jobPoList != null && fn:length(jobPoList) > 0}">
	<table class="table table-hover">
		<thead>
		<tr>
			<th style="width: 10px">#</th>
			<th style="width: 200px">수집작업 명칭</th>
			<th></th>
		</tr>
		</thead>
		<tbody>
			<%--등록된 모든 검사작업을 반복 출력하는 부분--%>
		<c:forEach varStatus="i" var="jobPo" items="${jobPoList}">
			<tr>
				<td style="width: 10px">${i.index+1}</td>
				<td style="width: 30px"><a href="#" onclick="showJobTargetList(this); return false;"
				                           name="${jobPo.jbId}" data-toggle="tooltip"
				                           data-original-title="Show Detail"
						>${jobPo.jbNm}</a></td>
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

<%--만약 등록된 수집작업이 없으면 아래와 같은 메시지를 출력--%>
<c:if test="${jobPoList == null || fn:length(jobPoList) == 0}">
	<div class="row" style="text-align: center">
		<b>수집 작업이 없습니다.</b>
	</div>
</c:if>

<script>

</script>
