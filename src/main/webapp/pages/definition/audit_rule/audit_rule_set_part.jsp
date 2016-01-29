<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="box">

	<!-- box-header -->
	<div class="box-header">
		<h3 class="box-title"><b>Audit Rule Set</b></h3>

		<div class="box-tools">
			<a href="#" class="btn btn-sm btn-success btn-flat" id="addRuleSetModalBtn" onclick="showAddRuleSetModal()">추가</a>
			<a href="#" class="btn btn-sm btn-warning btn-flat" onclick="showModifyRuleSetModal()">변경</a>
		</div>
	</div>

	<!-- box-body -->
	<div class="box-body" style="overflow-y: scroll; width: auto; height: auto">
		<div id="ruleSetLst">
			<jsp:include page="/show_audit_rule_set_list.action"></jsp:include>
		</div>
	</div>

</div>

<%--Rule Set Add Modal--%>
<div class="modal fade" id="addRuleSetModal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">×</span></button>
				<h4 class="modal-title">규칙집합 추가</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label for="newRuleSetName">규칙집합 명칭:</label>
					<input type="text" class="form-control" id="newRuleSetName" placeholder="Rule Set Name"
					       name="newRuleSetName">
				</div>
				<div class="form-group">
					<label for="newRuleSetDesc">규칙집합 설명:</label>
						<textarea class="form-control" rows="5" id="newRuleSetDesc"
						          placeholder="Rule Set Description" name="newRuleSetDesc"></textarea>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
				<button type="button" class="btn btn-success" id="addRuleSetSummitBtn" onclick="addRuleSet()">추가
				</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

<%--Rule Set Modify Modal--%>
<div class="modal fade" id="modifyRuleSetModal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">×</span></button>
				<h4 class="modal-title">규칙집합 변경</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label for="oldRuleSetName">규칙집합 명칭:</label>
					<input type="text" class="form-control" id="oldRuleSetName" placeholder="Rule Set Name"
					       name="oldRuleSetName">
				</div>
				<div class="form-group">
					<label for="oldRuleSetDesc">규칙집합 설명:</label>
						<textarea class="form-control" rows="5" id="oldRuleSetDesc"
						          placeholder="Rule Set Description" name="oldRuleSetDesc"></textarea>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-danger pull-left" id="removeOldTargetBtn"
				        onclick="removeRuleSet(this)">삭제
				</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
				<button type="button" class="btn btn-warning" id="modifyRuleSetSummitBtn" onclick="modifyRuleSet(this)">
					변경
				</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

<script>
	function showAddRuleSetModal() {
		$("#newRuleSetName").val("");
		$("#newRuleSetDesc").val("");
		$("#addRuleSetModal").modal("show");
	}

	function showModifyRuleSetModal() {
		var oldRuleSetId = $("#ruleSetTagSelect option:selected").val();
		var oldRuleSetNm = $("#ruleSetTagSelect option:selected").text();
		var oldRuleSetDesc = $("#ruleSetTagSelect option:selected").attr("name");

		$("#modifyRuleSetSummitBtn").attr("name", oldRuleSetId);
		$("#removeOldTargetBtn").attr("name", oldRuleSetId);
		$("#oldRuleSetName").val(oldRuleSetNm);
		$("#oldRuleSetDesc").val(oldRuleSetDesc);

		$("#modifyRuleSetModal").modal("show");
	}

	function addRuleSet() {
		$.ajax({
			type: 'post',
			url: '/add_new_rule_set.action',
			data: {
				rlSetNm: $("#newRuleSetName").val(),
				rlSetDescr: $("#newRuleSetDesc").val()
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#addRuleSetModal").modal("hide");
					$("#addRuleSetModal").on('hidden.bs.modal', function () {
						$("#ruleSetLst").load("show_audit_rule_set_list.action");
					});
				}
			}
		})
	}

	function modifyRuleSet(e) {
		$.ajax({
			type: 'post',
			url: 'modify_old_rule_set.action',
			data: {
				rlSetId: $(e).attr("name"),
				rlSetNm: $("#oldRuleSetName").val(),
				rlSetDescr: $("#oldRuleSetDesc").val()
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#modifyRuleSetModal").modal("hide");
					$("#modifyRuleSetModal").on('hidden.bs.modal', function () {
						$("#ruleSetLst").load("show_audit_rule_set_list.action");
					});
				}
			}
		})
	}

	function removeRuleSet(e) {
		$.ajax({
			type: 'get',
			url: 'remove_rule_set.action?ruleSetId=' + $(e).attr("name"),
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#modifyRuleSetModal").modal("hide");
					$("#modifyRuleSetModal").on('hidden.bs.modal', function () {
						$("#ruleSetLst").load("show_audit_rule_set_list.action");
					});
				}
			}
		})
	}


</script>