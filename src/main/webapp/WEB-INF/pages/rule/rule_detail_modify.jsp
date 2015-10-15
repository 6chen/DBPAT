<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form role="form" lpformnum="1" _lpchecked="1">
	<div class="box-body">
		<div class="row">
			<div class="col-lg-6">
				<div class="form-group">
					<label for="selectedRuleName">Rule Name</label>
					<input type="text" class="form-control" id="selectedRuleName" placeholder="Rule Name" value="${rule.rlNm}">
				</div>
			</div>
			<div class="col-lg-6">
				<div class="form-group">
					<label for="selectedRuleClass">Rule Class</label>
					<input type="text" class="form-control" id="selectedRuleClass" placeholder="Rule Class" value="${rule.rlCls}">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="form-group">
					<label for="selectedRuleDescr">Rule Description</label>
					<textarea class="form-control" rows="5" id="selectedRuleDescr"
					          placeholder="Rule Description" name="selectedRuleDescr">${rule.rlDescr}</textarea>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="form-group">
					<label for="selectedRuleExample">Rule Example</label>
					<textarea class="form-control" rows="5" id="selectedRuleExample"
					          placeholder="Rule Example" name="selectedRuleExample"></textarea>
				</div>
			</div>
		</div>
	</div>
	<!-- /.box-body -->

	<div class="box-footer">
		<a type="button" class="btn btn-primary btn-sm" id="modifyRuleBtn" name="${rule.rlId}" onclick="modifyRuleByRuleId(this)">Save Change</a>
		<a type="button" class="btn btn-danger btn-sm pull-right" id="deleteRuleBtn" name="${rule.rlId}" onclick="deleteRuleByRuleId(this)">Delete</a>
	</div>
</form>

<script>
	function deleteRuleByRuleId(e){
		$.ajax({
			type: 'get',
			url: 'deleteRule.action',
			data: {
				rlId: $(e).attr("name")
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					var deleteSuccessPage = '<div class="container-fluid">'+'<br><div class="callout callout-success">'+'<h4>Tip!</h4> <p>Successful to deleted a rule!</p> </div> </div>';
					$("#ruleDetail").html(deleteSuccessPage);
					loadRuleLstById($("#showAddRuleBtn").attr("name"));
					loadRuleSetLst();
				}
			}
		})
	}

	function modifyRuleByRuleId(e){
		$.ajax({
			type: 'post',
			url: 'modifyRule.action',
			data: {
				rlId: $(e).attr("name"),
				rlNm: $("#selectedRuleName").val(),
				rlCls: $("#selectedRuleClass").val(),
				rlDescr: $("#selectedRuleDescr").val()
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					var ModifySuccessPage = '<div class="container-fluid">'+'<br><div class="callout callout-success">'+'<h4>Tip!</h4> <p>Successful to modified a rule!</p> </div> </div>';
					$("#ruleDetail").html(ModifySuccessPage);
					loadRuleLstById($("#showAddRuleBtn").attr("name"));
				}
			}
		})
	}
</script>