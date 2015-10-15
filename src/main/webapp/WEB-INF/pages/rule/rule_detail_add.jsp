<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form role="form" lpformnum="1" _lpchecked="1">
	<div class="box-body">
		<div class="row">
			<div class="col-lg-6">
				<div class="form-group">
					<label for="newRuleName">Rule Name</label>
					<input type="text" class="form-control" id="newRuleName" placeholder="Rule Name">
				</div>
			</div>
			<div class="col-lg-6">
				<div class="form-group">
					<label for="newRuleClass">Rule Class</label>
					<input type="text" class="form-control" id="newRuleClass" placeholder="Rule Class">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="form-group">
					<label for="newRuleDescr">Rule Description</label>
					<textarea class="form-control" rows="5" id="newRuleDescr"
					          placeholder="Rule Description" name="newRuleDescr"></textarea>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="form-group">
					<label for="newRuleExample">Rule Example</label>
					<textarea class="form-control" rows="5" id="newRuleExample"
					          placeholder="Rule Example" name="newRuleExample"></textarea>
				</div>
			</div>
		</div>
	</div>
	<!-- /.box-body -->

	<div class="box-footer">
		<a type="button" class="btn btn-primary btn-sm" id="addRuleBtn" onclick="addRule()">Summit</a>
	</div>
</form>

<script>
	function addRule() {
		$.ajax({
			type: 'post',
			url: 'addRule.action',
			data: {
				rlNm: $("#newRuleName").val(),
				rlCls: $("#newRuleClass").val(),
				rlDescr: $("#newRuleDescr").val(),
				rlSetId: $("#showAddRuleBtn").attr("name")
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					var addSuccessPage = '<div class="container-fluid">'+'<br><div class="callout callout-success">'+'<h4>Tip!</h4> <p>Successful to added a new rule!</p> </div> </div>';
					$("#ruleDetail").html(addSuccessPage);
					loadRuleLstById($("#showAddRuleBtn").attr("name"));
					loadRuleSetLst();
				}
			}
		})
	}
</script>