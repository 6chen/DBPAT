<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="box box-success">

	<!-- box-header -->
	<div class="box-header">
		<h3 class="box-title"><b>Audit Rule</b></h3>

		<div class="box-tools">
			<button href="#" class="btn btn-sm btn-success btn-flat pull-left" onclick="showAddRulePage()">추가</button>
		</div>
	</div>

	<!-- box-body -->
	<div class="box-body" style="overflow-y: scroll; width: auto; height: auto">
		<div id="ruleLst">
			<jsp:include page="/show_audit_rule_list.action"></jsp:include>
		</div>
	</div>
</div>


<script>
	function showAddRulePage(){
		var ruleSetId = $("#ruleSetTagSelect option:selected").val();
		if (ruleSetId != "선택하세요") {
			$("#ruleDetailTitle").text("새로운 규칙 추가");
			$("#ruleDetailPart").load("show_audit_rule_add_page.action");
		}else{
			alert("규칙집합을 선택한 후에 규칙 추가하세요.");
		}
	}
</script>



