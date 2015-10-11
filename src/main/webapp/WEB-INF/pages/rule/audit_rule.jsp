<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<section class="content-header">
	<h1>
		Audit Rule
		<small>list of all Audit Rule</small>
	</h1>
	<ol class="breadcrumb">
		<li><a href="/home.action"><i class="fa fa-dashboard"></i> Home</a></li>
		<li class="active">Audit Rule</li>
	</ol>
</section>

<section class="content">
	<div class="row">
		<div class="col-lg-4 col-md-4" id="ruleLstLeft">
			<div class="box box-primary">
				<div class="box-header with-border">
					<h3 class="box-title">Rule Set List</h3>
					<div class="box-tools pull-right">
						<button class="btn btn-default btn-sm" onclick="showAddRuleSetModal()">
							<i class="fa fa-plus"></i>
						</button>
					</div>
				</div>
				<div class="box-body">
					<div id="ruleSetLst">
						<jsp:include page="/shwoRuleSetLst.action"></jsp:include>
					</div>
				</div>
			</div>
		</div>
		<div class="col-lg-8 col-md-8" id="ruleLstRight">
			<div class="box box-warning">
				<div class="box-header with-border">
					<h3 class="box-title" id="ruleListHead">Rule List</h3>

					<div class="box-tools pull-right">
						<button class="btn btn-default btn-sm">
							<i class="fa fa-plus"></i>
						</button>
					</div>
				</div>

				<div class="box-body no-padding" id="ruleLst">
					<div class="container-fluid">
						<br>
						<div class="callout callout-info">
							<h4>Tip!</h4>
							<p>Please Choice a Rule Set First !</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<%--Rule Set Add Modal--%>
<div class="modal fade" id="addRuleSetModal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">×</span></button>
				<h4 class="modal-title">Add New Rule Set</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label for="newRuleSetName">Rule Set Name</label>
					<input type="text" class="form-control" id="newRuleSetName" placeholder="Rule Set Name"
					       name="newRuleSetName">
				</div>
				<div class="form-group">
					<label for="newRuleSetDesc">Rule Set Description</label>
						<textarea class="form-control" rows="5" id="newRuleSetDesc"
						          placeholder="Rule Set Description" name="newRuleSetDesc"></textarea>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default pull-left" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary" id="addRuleSetSummitBtn" onclick="addRuleSet()">Add
				</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

<script>
	function loadRuleSetLst() {
		$("#ruleSetLst").load("shwoRuleSetLst.action");
	}

	function loadRuleLstById(ruleSetId) {
		$("#ruleLst").load("showRuleLstById.action?rlSetId=" + ruleSetId);
	}

	function showAddRuleSetModal() {
		$("#addRuleSetModal").modal("show");
	}

	function addRuleSet() {
		$.ajax({
			type: 'post',
			url: '/addRuleSet.action',
			data: {
				rlSetNm: $("#newRuleSetName").val(),
				rlSetDescr: $("#newRuleSetDesc").val()
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#addRuleSetModal").modal("hide");
					$("#addRuleSetModal").on('hidden.bs.modal', function () {
						loadRuleSetLst();
					});
				}
			}
		})
	}

	function changeRlLstParent(e) {
		$("#ruleListHead").html("Rule List of  <b class='text-yellow'> " + $(e).attr("name") + "</b>");
		loadRuleLstById($(e).attr("id"));
	}

</script>
