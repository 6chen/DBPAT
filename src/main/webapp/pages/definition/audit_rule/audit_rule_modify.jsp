<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form role="form" lpformnum="1" _lpchecked="1">
	<div class="box-body">
		<div class="row">
			<div class="col-lg-6">
				<div class="form-group">
					<label for="oldRuleName">규칙 명칭</label>
					<input type="text" class="form-control" id="oldRuleName" placeholder="Rule Name"
					       value="${rulePo.rlNm}">
				</div>
			</div>
			<div class="col-lg-6">
				<div class="form-group">
					<label for="oldRuleClass">규칙 클래스</label>
					<input type="text" class="form-control" id="oldRuleClass" placeholder="Rule Class"
					       value="${rulePo.rlCls}">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="form-group">
					<label for="oldRuleDescr">규칙 설명</label>
					<textarea class="form-control" rows="5" id="oldRuleDescr"
					          placeholder="Rule Description" name="oldRuleDescr">${rulePo.rlDescr}</textarea>
				</div>
			</div>
		</div>
		<%--<div class="row">--%>
		<%--<div class="col-lg-12">--%>
		<%--<div class="form-group">--%>
		<%--<label for="newRuleExample">규칙 예시</label>--%>
		<%--<textarea class="form-control" rows="5" id="newRuleExample"--%>
		<%--placeholder="Rule Example" name="newRuleExample"></textarea>--%>
		<%--</div>--%>
		<%--</div>--%>
		<%--</div>--%>
	</div>
	<!-- /.box-body -->

	<div class="box-footer ">
		<a type="button" class="btn btn-danger btn-sm pull-left" id="removeRuleBtn" name="${rulePo.rlId}"
		   onclick="removeRule(this)">삭제</a>
		<a type="button" class="btn btn-warning btn-sm pull-right" id="modifyRuleBtn" name="${rulePo.rlId}"
		   onclick="modifyRule(this)">저장</a>
	</div>
</form>

<script>
	function modifyRule(e) {
		$.ajax({
			type: 'post',
			url: 'modify_old_rule.action',
			data: {
				rlId: $(e).attr("name"),
				rlNm: $("#oldRuleName").val(),
				rlCls: $("#oldRuleClass").val(),
				rlDescr: $("#oldRuleDescr").val(),
				rlSetId: $("#ruleSetTagSelect option:selected").val()
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#ruleDetailTitle").text("감리 규칙 등록 방법:");
					$("#ruleDetailPart").load("show_audit_rule_detail_info.action");
					$("#ruleLst").load("show_audit_rule_list.action?ruleSetId=" + $("#ruleSetTagSelect option:selected").val());
				}
			}
		})
	}

	function removeRule(e) {
		$.ajax({
			type: 'get',
			url: 'remove_rule.action?ruleId=' + $(e).attr("name"),
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#ruleDetailTitle").text("감리 규칙 등록 방법:");
					$("#ruleDetailPart").load("show_audit_rule_detail_info.action");
					$("#ruleLst").load("show_audit_rule_list.action?ruleSetId=" + $("#ruleSetTagSelect option:selected").val());
				}
			}
		})
	}
</script>


