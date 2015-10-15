<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
	<c:forEach varStatus="i" var="ruleSetRuleCntVo" items="${ruleSetRuleCntVos}">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" href="#collapse${i.index+1}" data-parent="#accordion" aria-expanded="true"
					   aria-controls="collapseOne">${ruleSetRuleCntVo.rlSetNm}</a>

					<c:if test="${ruleSetRuleCntVo.rlSetRlCnt > 0}">
						<small data-toggle="tooltip" data-original-title="View Rules"
						       class="label bg-green pull-right"><a href="#" onclick="changeRlLstParent(this)"
						                                            name="${ruleSetRuleCntVo.rlSetNm}"
						                                            id="${ruleSetRuleCntVo.rlSetId}">${ruleSetRuleCntVo.rlSetRlCnt}
							Rules</a></small>
					</c:if>
					<c:if test="${ruleSetRuleCntVo.rlSetRlCnt == 0}">
						<small data-toggle="tooltip" data-original-title="View Rules"
						       class="label bg-orange pull-right"><a href="#" onclick="changeRlLstParent(this)"
						                                            name="${ruleSetRuleCntVo.rlSetNm}"
						                                            id="${ruleSetRuleCntVo.rlSetId}">${ruleSetRuleCntVo.rlSetRlCnt}
							Rules</a></small>
					</c:if>

				</h4>
			</div>
			<div id="collapse${i.index+1}" class="panel-collapse collapse">
				<div class="panel-body">${ruleSetRuleCntVo.rlSetDescr}</div>
				<div class="panel-footer">
					<button type="button" class="btn btn-sm btn-info" onclick="showRuleSetModifyModal(this)"
					        name="${ruleSetRuleCntVo.rlSetId}">Modify
					</button>
					<button type="button" class="btn btn-sm btn-danger pull-right" onclick="deleteRuleSet(this)" name="${ruleSetRuleCntVo.rlSetId}">Delete
					</button>
				</div>
			</div>
		</div>
	</c:forEach>
</div>

<%--Rule Set Modify Modal--%>
<div class="modal fade" id="modifyRuleSetModal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">×</span></button>
				<h4 class="modal-title">Modify Rule Set</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label for="modifyRuleSetName">Rule Set Name</label>
					<input type="text" class="form-control" id="modifyRuleSetName" placeholder="Rule Set Name"
					       name="modifyRuleSetName">
				</div>
				<div class="form-group">
					<label for="modifyRuleSetDesc">Rule Set Description</label>
						<textarea class="form-control" rows="5" id="modifyRuleSetDesc"
						          placeholder="Rule Set Description" name="modifyRuleSetDesc"></textarea>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default pull-left" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary" id="modifySummitBtn" onclick="modifyRuleSet()">Save changes</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

<script>
	function showRuleSetModifyModal(e) {
		$.ajax({
			type: 'get',
			url: 'findRuleSetById.action?rlSetId=' + $(e).attr("name"),
			success: function (data) {
				$("#modifySummitBtn").attr("name", data.rlSetId);
				$("#modifyRuleSetName").val(data.rlSetNm);
				$("#modifyRuleSetDesc").val(data.rlSetDescr);
				$("#modifyRuleSetModal").modal("show");
			}
		})
	}

	function deleteRuleSet(e){
		$.ajax({
			type: 'get',
			url: 'removeRuleSetById.action?rlSetId=' + $(e).attr("name"),
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					loadRuleSetLst();
				}
			}
		})
	}

	function modifyRuleSet(e){
		$.ajax({
			type: 'post',
			url: 'modifyRuleSetById.action',
			data: {
				rlSetId : $("#modifySummitBtn").attr("name"),
				rlSetNm : $("#modifyRuleSetName").val(),
				rlSetDescr : $("#modifyRuleSetDesc").val()
			},
			success: function(data){
				var result = $.parseJSON(data);
				if (result.success) {
					$("#modifyRuleSetModal").modal("hide");
					$("#modifyRuleSetModal").on('hidden.bs.modal', function () {
						loadRuleSetLst();
					});
				}
			}
		})
	}
</script>
