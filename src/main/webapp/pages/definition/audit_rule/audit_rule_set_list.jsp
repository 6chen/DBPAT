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
				<option selected="selected">선택하세요</option>
				<c:forEach varStatus="i" var="ruleSetPo" items="${ruleSetPoList}">
					<option value="${ruleSetPo.rlSetId}" name="${ruleSetPo.rlSetDescr}"> ${ruleSetPo.rlSetNm}</option>
				</c:forEach>
			</select>
		</div>

		<div class="form-group col-lg-9">
			<p><b>규칙 집합 명칭 :</b></p>

			<p id="ruleSetDescriptionTagP">규칙집합을 선택하세요.</p>
		</div>
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
	function showRuleSetDescr() {
		var ruleSetId = $("#ruleSetTagSelect option:selected").val();
		if (ruleSetId != "선택하세요") {
			var ruleSetDesc = $("#ruleSetTagSelect option:selected").attr("name");
			$("#ruleSetDescriptionTagP").text(ruleSetDesc);
			$("#ruleLst").load("show_audit_rule_list.action?ruleSetId=" + ruleSetId);
		} else {
			$("#ruleSetDescriptionTagP").text("규칙집합을 선택하세요.");
			$("#ruleLst").load("show_audit_rule_list.action");
			$("#ruleDetailTitle").text("감리 규칙 등록 방법:");
			$("#ruleDetailPart").load("show_audit_rule_detail_info.action");
		}
	}


</script>
