<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="box">

	<!-- box-header -->
	<div class="box-header">
		<h3 class="box-title"><b>Audit Rule Set</b></h3>

		<div class="box-tools">
			<a href="#" class="btn btn-sm btn-default btn-flat pull-left">Add New Audit Rule Set</a>
		</div>
	</div>

	<!-- box-body -->
	<div class="box-body" style="overflow-y: scroll; width: auto; height: 30%">
		<div id="ruleSetLst">
			<jsp:include page="/show_audit_rule_set_list.action"></jsp:include>
		</div>
	</div>

</div>
