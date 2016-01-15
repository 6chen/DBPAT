<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<%--규칙 집합을 등록되어 있을 때 나타나는 화면--%>
<c:if test="${ruleSetPoList != null && fn:length(ruleSetPoList) > 0}">
	<!-- Split button -->
	<div class="row">
		<div class="form-group col-lg-3">
			<label><b>규칙 집합 명칭 :</b></label>
			<select class="form-control" onchange="showRuleSetDescr()" id="ruleSetTagSelect">
				<c:forEach varStatus="i" var="ruleSetPo" items="${ruleSetPoList}">
					<option value="${ruleSetPo.rlSetId}" name="${ruleSetPo.rlSetDescr}"> ${ruleSetPo.rlSetNm}</option>
				</c:forEach>
			</select>
		</div>

		<%--<c:forEach varStatus="i" var="ruleSetPo" items="${ruleSetPoList}">--%>
		<div class="form-group col-lg-9" >
			<p><b>규칙 집합 명칭 :</b></p>

			<p id="ruleSetDescriptionTagP">${ruleSetPoList[0].rlSetDescr}</p>
		</div>
		<%--</c:forEach>--%>
	</div>
</c:if>


<%--규칙 집합을 등록되어 있지 않을 때 나타나는 화면--%>
<c:if test="${ruleSetPoList == null || fn:length(ruleSetPoList) == 0}">
	<div class="row">
		<div class="form-group col-lg-3">
			<label><b>규칙 집합 명칭 :</b></label>
			<select class="form-control">
				<option>없음</option>
			</select>
		</div>

		<div class="form-group col-lg-9">
			<p><b>규칙 집합 명칭 :</b></p>

			<p>없음</p>
		</div>
	</div>
</c:if>

<script>
	function showRuleSetDescr(){
		$("#ruleSetDescriptionTagP").text($("#ruleSetTagSelect option:selected").attr("name"));
	}
</script>


