<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="box box-info">

	<!-- box-header -->
	<div class="box-header">
		<h3 class="box-title"><b>Targets</b></h3>

		<div class="box-tools pull-right">
			<a href="#" class="btn btn-sm btn-info btn-flat pull-left">Add New Target</a>
		</div>
	</div>

	<!-- box-body -->
	<div class="box-body" style="overflow-y: scroll; width: auto; height: 40%">
		<div id="ruleSetLst">
			<jsp:include page="/show_target_trgt_list.action"></jsp:include>
		</div>
	</div>
</div>