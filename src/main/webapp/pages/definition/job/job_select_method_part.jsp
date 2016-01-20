<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<div class="box">
	<div class="box-header with-border">
		<h3 class="box-title"><b>작업 조회 방식</b></h3>

		<div class="box-tools pull-right">
			<button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
		</div>
		<!-- /.box-tools -->
	</div>
	<!-- /.box-header -->
	<div class="box-body">
		<div class="row">
			<div class="border-right col-lg-4">
				<a class="btn btn-app" onclick="showAllJobList()">
					<i class="fa fa-edit"></i> 모두 보기
				</a>
				<a class="btn btn-app" onclick="showNewJobModal()">
					<i class="fa fa-save"></i> 작업 추가
				</a>
				<a class="btn btn-app" onclick="showJobListByCondition()">
					<i class="fa fa-play"></i> 조건별 보기
				</a>
			</div>
			<div class="col-lg-8">
				<div class="form-group col-lg-6">
					<label><b>업무영역 명칭 :</b></label>
					<select class="form-control" onchange="showAllTargetToSelect()" id="jobSelectMethodBizSelect">
						<option value='0' selected="selected">업무영역 선택하세요</option>
						<c:forEach varStatus="i" var="bizAreaPo" items="${bizAreaPoList}">
							<option value="${bizAreaPo.bizAreaId}"> ${bizAreaPo.bizAreaNm}</option>
						</c:forEach>
					</select>
				</div>

				<div class="form-group col-lg-6">
					<label><b>대상서버 명칭 :</b></label>
					<select class="form-control" onchange="showRuleSetDescr()" id="jobSelectMethodTargetSelect">
						<option value='0' selected="selected">먼저 업무영역 선택하세요</option>
					</select>
				</div>
			</div>
		</div>

	</div>
	<!-- /.box-body -->
</div>
<!-- /.box -->
</div>


<!-- 새로운 작업을 추가할 때 나타나는 모달 창 -->
<div class="modal fade" id="newJobModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="addNewModalLabel">작업 추가</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label for="newJobName">작업 명칭</label>
					<input type="text" class="form-control" id="newJobName" placeholder="Business Name"
					       name="newJobName">
				</div>
				<div class="form-group">
					<label>Select</label>
					<select class="form-control" id="newJobType">
						<option value="01">수집 작업</option>
						<option value="02">검사 작업</option>
					</select>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
				<button type="button" class="btn btn-success" id="addJobBtn" onclick="addJob()">추가
				</button>
			</div>
		</div>
	</div>
</div>

<script>
	function showAllJobList() {
		$("#jobCollectJobList").load("show_job_collect_job_list.action");
		$("#jobInspectJobList").load("show_job_inspect_job_list.action");
	}

	function showNewJobModal() {
		$("#newJobName").val("");
		$("#newJobType").val("01");
		$("#newJobModal").modal("show");
	}

	function addJob() {
		$.ajax({
			type: 'post',
			url: 'add_new_job.action',
			data: {
				jbNm: $("#newJobName").val(),
				jbTyp: $("#newJobType").val()
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#newJobModal").modal("hide");
					$("#newJobModal").on('hidden.bs.modal', function () {
						showAllJobList();
					});
				}
			}
		})
	}

	function showAllTargetToSelect(e){
		var selectedBizAreaId = $("#jobSelectMethodBizSelect option:selected").val();
		$.ajax({
			type: 'get',
			url: '/get_target_list_by_biz_area_id.action?bizAreaId=' + selectedBizAreaId,
			success: function (data) {
				var selectTag;
				if (data.length > 0) {
					$.each(data, function (key, TargetPo) {
						selectTag = selectTag + "<option value= " + TargetPo.trgtId + ">" + TargetPo.trgtNm + "</option>";
					});
				} else {
					selectTag = "<option value='0'>대상이 없습니다.</option>";
				}
				$("#jobSelectMethodTargetSelect").html(selectTag);
			}
		})
	}

	function showJobListByCondition(){
		var selectedBizAreaId = $("#jobSelectMethodBizSelect option:selected").val();
		var selectedTargetId = $("#jobSelectMethodTargetSelect option:selected").val();
		if(selectedBizAreaId == '0' || selectedTargetId =='0') {
			alert("업무영역 및 대상을 선택한 후에 클릭하세요.");
		}else{
			$("#jobCollectJobList").load("show_job_collect_job_list.action?bizAreaId=" + selectedBizAreaId + "&trgtId=" + selectedTargetId);
			$("#jobInspectJobList").load("show_job_inspect_job_list.action?bizAreaId=" + selectedBizAreaId + "&trgtId=" + selectedTargetId);
		}
	}
</script>