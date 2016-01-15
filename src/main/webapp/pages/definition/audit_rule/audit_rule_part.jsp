<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="box box-success">

	<!-- box-header -->
	<div class="box-header">
		<h3 class="box-title"><b>Audit Rule</b></h3>

		<div class="box-tools">
			<a href="#" class="btn btn-sm btn-success btn-flat pull-left">추가</a>
		</div>
	</div>

	<!-- box-body -->
	<div class="box-body" style="overflow-y: scroll; width: auto; height: auto">
		<div id="ruleSetLst">
			<jsp:include page="/show_audit_rule_list.action"></jsp:include>
		</div>
	</div>

</div>
