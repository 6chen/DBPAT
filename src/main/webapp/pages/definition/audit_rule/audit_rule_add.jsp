<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form role="form" lpformnum="1" _lpchecked="1">
	<div class="box-body">
		<div class="row">
			<div class="col-lg-6">
				<div class="form-group">
					<label for="newRuleName">규칙 명칭</label>
					<input type="text" class="form-control" id="newRuleName" placeholder="Rule Name">
				</div>
			</div>
			<div class="col-lg-6">
				<div class="form-group">
					<label for="newRuleClass">규칙 클래스</label>
					<input type="text" class="form-control" id="newRuleClass" placeholder="Rule Class">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="form-group">
					<label for="newRuleDescr">규칙 설명</label>
					<textarea class="form-control" rows="5" id="newRuleDescr"
					          placeholder="Rule Description" name="newRuleDescr"></textarea>
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
		<a type="button" class="btn btn-success btn-sm pull-right" id="addRuleBtn" onclick="addRule()">저장</a>
	</div>
</form>

<script>
	function addRule() {
		$.ajax({
			type: 'post',
			url: 'add_new_rule.action',
			data: {
				rlNm: $("#newRuleName").val(),
				rlCls: $("#newRuleClass").val(),
				rlDescr: $("#newRuleDescr").val(),
				rlSetId: $("#ruleSetTagSelect option:selected").val()
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
//					var addSuccessPage = '<div class="container-fluid">'+'<br><div class="callout callout-success">'+'<h4>Tip!</h4> <p>Successful to added a new rule!</p> </div> </div>';

					$("#ruleDetailTitle").text("감리 규칙 등록 방법:");
					$("#ruleDetailPart").load("show_audit_rule_detail_info.action");
					$("#ruleLst").load("show_audit_rule_list.action?ruleSetId=" + $("#ruleSetTagSelect option:selected").val());
				}
			}
		})
	}
</script>