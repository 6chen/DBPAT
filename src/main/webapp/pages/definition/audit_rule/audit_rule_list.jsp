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

<c:if test="${rulePoList == null || fn:length(rulePoList) == 0}">
  <div class="row" style="text-align: center">
    <b>규칙이 없습니다.</b>
  </div>
</c:if>

<c:if test="${rulePoList != null && fn:length(rulePoList) > 0}">
	<table class="table table-hover">
		<thead>
		<tr>
			<th>#</th>
			<th>규칙 명칭 </th>
			<th>규칙 클래스</th>
			<%--<th></th>--%>
			<%--<th>규칙 설명</th>--%>
		</tr>
		</thead>
		<tbody>
		<c:forEach varStatus="i" var="rulePo" items="${rulePoList}">
			<tr>
				<td>${i.index+1}</td>
				<td><a href="#" name="${rulePo.rlId}" data-toggle="tooltip" data-original-title="Show Detail Info" onclick="showRuleDetail(this)"> ${rulePo.rlNm} </a></td>
				<td>${rulePo.rlCls}</td>
				<%--<td style="width: 10px;">--%>
					<%--<button name="${rulePo.rlId}" type="button" class="btn btn-block btn-warning btn-xs"--%>
					        <%--onclick="showModifyRuleModal(this)">변경--%>
					<%--</button>--%>
				<%--</td>--%>
				<%--<td>${fn:substring(rule.rlDescr, 0, 10)}...</td>--%>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>

<script>
	function showRuleDetail(e){
		$("#ruleDetailTitle").html("<b>" + $(e).text() + "</b>의 상세 정보");
		$("#ruleDetailPart").load("show_audit_rule_modify_page.action?ruleId=" + $(e).attr("name"));

	}
</script>
