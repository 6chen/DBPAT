<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<div class="box box-info">
	<div class="box-header with-border">
		<h3 class="box-title" id="jobTargetPartTitle">수집/검사 작업의 대상</h3>

		<div class="box-tools pull-right">
			<a href="#" id="showJobTargetAddModalBtn" class="btn btn-sm btn-success btn-flat pull-right"
			   onclick="showAddNewJobTargetModal(this)">작업대상 추가</a>
		</div>
		<!-- /.box-tools -->
	</div>
	<!-- /.box-header -->
	<div class="box-body">
		<div id="jobTargetList">
			<jsp:include page="/show_job_target_list.action"></jsp:include>
		</div>
	</div>
	<!-- /.box-body -->
</div>
<!-- /.box -->

<!-- 작업대상 추가 버튼을 눌렀을 때 나타나는 모달 창 -->
<div class="modal fade" id="addJobTargetModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="addNewModalLabel">작업대상 추가</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label for="newJobTargetBizAreaSelectTag">업무영역 명칭</label>
					<select class="form-control" id="newJobTargetBizAreaSelectTag"
					        onchange="showTargetListByBizAreaId(this)">

					</select>
				</div>
				<div class="form-group">
					<label for="newJobTargetTargetSelectTag">Select</label>
					<select class="form-control" id="newJobTargetTargetSelectTag">
						<option value="00"> 먼저 업무영역을 선택하세요.</option>

					</select>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
				<button type="button" class="btn btn-success" id="addNewJobTargetBtn" onclick="addNewJobTarget(this)">추가
				</button>
			</div>
		</div>
	</div>
</div>


<script>
	function showAddNewJobTargetModal(e) {
		var jbId = $(e).attr("name");
		$("#addNewJobTargetBtn").attr("name", jbId);
		$("#newJobTargetTargetSelectTag").html("<option value='00'> 먼저 업무영역을 선택하세요.</option>");
		$.ajax({
			type: 'get',
			url: '/get_target_biz_list_no_add.action?jbId=' + jbId,
			success: function (data) {
				var selectTag = '<option value="00"> 선택하세요.</option>';
				$.each(data, function (key, bizAreaPo) {
					selectTag = selectTag + "<option value= " + bizAreaPo.bizAreaId + ">" + bizAreaPo.bizAreaNm + "</option>";
				});
				$("#newJobTargetBizAreaSelectTag").html(selectTag);
				$("#addJobTargetModal").modal("show");
			}
		})
	}

	function showTargetListByBizAreaId(e) {
		var jbId = $("#addNewJobTargetBtn").attr("name");
		var selectedJobTargetBizAreaId = $("#newJobTargetBizAreaSelectTag option:selected").val();
		$.ajax({
			type: 'get',
			url: '/get_target_list_by_biz_area_id_no_add.action?jbId=' + jbId + '&bizAreaId=' + selectedJobTargetBizAreaId,
			success: function (data) {
				var selectTag;
				if (data.length > 0) {
					$.each(data, function (key, TargetPo) {
						selectTag = selectTag + "<option value= " + TargetPo.trgtId + ">" + TargetPo.trgtNm + "</option>";
					});
				} else {
					selectTag = "<option>대상이 없습니다.</option>";
				}
				$("#newJobTargetTargetSelectTag").html(selectTag);
			}
		})
	}

	function addNewJobTarget(e) {
		var jbId = $(e).attr("name");
		var bizAreaId = $("#newJobTargetBizAreaSelectTag option:selected").val();
		var trgtId = $("#newJobTargetTargetSelectTag option:selected").val();
		$.ajax({
			type: 'post',
			url: 'add_new_job_target.action',
			data: {
				jbId: jbId,
				bizAreaId: bizAreaId,
				trgtId: trgtId
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#addJobTargetModal").modal("hide");
					$("#addJobTargetModal").on('hidden.bs.modal', function () {
						$("#jobTargetList").load("show_job_target_list.action?jbId=" + jbId);
					});
				}
			}
		})
	}
</script>