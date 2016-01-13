<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="box box-warning">

	<!-- box-header -->
	<div class="box-header">
		<h3 class="box-title"><b>Business Areas</b></h3>

		<div class="box-tools">
			<a href="#" class="btn btn-sm btn-warning btn-flat pull-left">Add New Biz Area</a>
		</div>
	</div>

	<!-- box-body -->
	<div class="box-body" style="overflow-y: scroll; width: auto; height: 40%">
		<div id="ruleSetLst">
			<jsp:include page="/show_target_biz_list.action"></jsp:include>
		</div>
	</div>

</div>
