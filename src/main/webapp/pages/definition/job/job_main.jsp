<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<section class="content-header">
	<h1>
		Audit Job
		<small>감리작업은 수집작업 및 검사작업으로 나눌 수 있다</small>
	</h1>
	<ol class="breadcrumb">
		<li><a href="/home.action"><i class="fa fa-dashboard"></i> Home</a></li>
		<li class="active">Audit Job Definition</li>
	</ol>
</section>

<section class="content">

	<%--작업들을 조회하기 위해 업무 영역 및 대상별 조회하는 기능 + 모두 조회하는 기능--%>
	<div id="jobSelectMethodPart">
		<jsp:include page="/show_job_select_method_part.action"></jsp:include>
	</div>

	<%--수집작업 및 검사작업 리스트를 나내나는 부분--%>
	<div class="row">
		<%--수집작업 리스트--%>
		<div class="col-lg-6">
			<div id="jobCollectJobPart">
				<jsp:include page="/show_job_collect_job_part.action"></jsp:include>
			</div>
		</div>

		<%--검사작업 리스트--%>
		<div class="col-lg-6">
			<div id="jobInspectJobPart">
				<jsp:include page="/show_job_inspect_job_part.action"></jsp:include>
			</div>
		</div>
	</div>

	<%--수집작업 및 검사작업 대상을 리스트 부분, 이 부분 안에서 대상을 CRUD할 수 있다.--%>
	<div id="jobTargetPart">
		<jsp:include page="/show_job_target_part.action"></jsp:include>
	</div>

	<%--검사작업에 적용되는 규칙 집합 및 규칙 리스트 부분, 검사 규칙 보기 버튼을 눌렀을 때만 보여줌--%>
	<div id="jobRulePart" style="visibility: hidden">
		<jsp:include page="/show_job_rule_part.action"></jsp:include>
	</div>

</section>

<!-- 작업을 수정할 때 나타나는 모달 창 -->
<div class="modal fade" id="modifyJobModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="addNewModalLabel">작업 수정</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label for="oldJobName">작업 명칭</label>
					<input type="text" class="form-control" id="oldJobName" placeholder="Business Name"
					       name="oldJobName">
				</div>
				<div class="form-group">
					<label>Select</label>
					<select class="form-control" id="oldJobType">
						<option value="01">수집 작업</option>
						<option value="02">검사 작업</option>
					</select>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-danger pull-left" id="removeJobBtn" onclick="removeJob(this)">삭제
				</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
				<button type="button" class="btn btn-warning" id="modifyJobBtn" onclick="modifyJob(this)">변경
				</button>
			</div>
		</div>
	</div>
</div>

<script>
	function showModifyJobModal(e) {
		$.ajax({
			type: 'get',
			url: '/find_job_by_id.action?jbId=' + $(e).attr("name"),
			success: function (data) {
				$("#modifyJobBtn").attr("name", data.jbId);
				$("#removeJobBtn").attr("name", data.jbId);
				$("#oldJobName").val(data.jbNm);
				$("#oldJobType").val(data.jbTyp);
				$("#modifyJobModal").modal("show");
			}
		})
	}

	function modifyJob(e) {
		$.ajax({
			type: 'post',
			url: '/modify_job.action',
			data: {
				jbId: $(e).attr("name"),
				jbNm: $("#oldJobName").val(),
				jbTyp: $("#oldJobType").val(),
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#modifyJobModal").modal("hide");
					$("#modifyJobModal").on('hidden.bs.modal', function () {
						showAllJobList();
					});
				}
			}
		})
	}

	function removeJob(e) {
		$.ajax({
			type: 'get',
			url: 'remove_job.action?jbId=' + $(e).attr("name"),
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#modifyJobModal").modal("hide");
					$("#modifyJobModal").on('hidden.bs.modal', function () {
						showAllJobList();
					});
				}
			}
		})
	}

	function showJobTargetList(e){
//		alert($(e).attr("name"));
		$("#showJobTargetAddModalBtn").attr("name", $(e).attr("name"));
//		$("#jobTargetPartTitle").html("<b>" + $(e).text() + "</b> 작업의 대상");
		$("#jobTargetList").load("show_job_target_list.action?jbId="+ $(e).attr("name"));
	}
</script>
