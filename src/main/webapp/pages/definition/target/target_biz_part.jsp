<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="box box-warning">

	<!-- box-header -->
	<div class="box-header">
		<h3 class="box-title"><b>Business Areas</b></h3>

		<div class="box-tools">
			<a href="#" class="btn btn-sm btn-success btn-flat pull-left" onclick="showNewBizAreaModal()">업무 영역 추가</a>
		</div>
	</div>

	<!-- box-body -->
	<div class="box-body" style="overflow-y: scroll; width: auto; height: 40%">
		<div id="bizList">
			<jsp:include page="/show_target_biz_list.action"></jsp:include>
		</div>
	</div>

</div>

<!-- This modal is used for add a new business area -->
<div class="modal fade" id="newBizAreaModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="addNewModalLabel">업무 영역 추가</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label for="newBizAreaName">업무 영역 명칭</label>
					<input type="text" class="form-control" id="newBizAreaName" placeholder="Business Name"
					       name="newBizAreaName">
				</div>
				<div class="form-group">
					<label for="newBizAreaDesc">업무 영역 설명</label>
						<textarea class="form-control" rows="5" id="newBizAreaDesc"
						          placeholder="Business Description" name="newBizAreaDesc"></textarea>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
				<button type="button" class="btn btn-success" id="submitNewBizArea" onclick="addBiz()">추가
				</button>
			</div>
		</div>
	</div>
</div>


<script>
	function showNewBizAreaModal() {
		$("#newBizAreaName").val("")
		$("#newBizAreaDesc").val("")
		$("#newBizAreaModal").modal("show");
	}

	function addBiz() {
		$.ajax({
			type: 'post',
			url: 'add_new_biz.action',
			data: {
				bizAreaNm: $("#newBizAreaName").val(),
				bizAreaDescr: $("#newBizAreaDesc").val()
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#newBizAreaModal").modal("hide");
					$("#newBizAreaModal").on('hidden.bs.modal', function () {
						$("#bizList").load("show_target_biz_list.action");
					});
				}
			}
		})
	}
</script>