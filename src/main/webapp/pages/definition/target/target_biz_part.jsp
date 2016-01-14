<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="box box-warning">

	<!-- box-header -->
	<div class="box-header with-border">
		<h3 class="box-title"><b>Business Areas</b></h3>

		<div class="box-tools">
			<a href="#" class="btn btn-sm btn-success btn-flat pull-left" onclick="showNewBizAreaModal()">업무 영역 추가</a>
		</div>
	</div>

	<!-- box-body -->
	<%--업무영역을 리스트 나타나는 부분--%>
	<div class="box-body" style="overflow-y: scroll; width: auto; height: auto">
		<div id="bizList">
			<jsp:include page="/show_target_biz_list.action"></jsp:include>
		</div>
	</div>

</div>

<!-- 새로운 업무영역을 추가할 때 나타나는 모달 창  -->
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
//	신규 업무영역 추가하는 모달 창 중에 있는 값을 초기화하여 나타나게, 초기화 안 하면 전에 추가하는 내용을 그대로 존재
	function showNewBizAreaModal() {
		$("#newBizAreaName").val("")
		$("#newBizAreaDesc").val("")
		$("#newBizAreaModal").modal("show");
	}

// 신규 업무영역 추가 모달 창 안에 있는 추가 버튼을 눌러 실제 데이터를 삽입하기 위한 부분. 삽입 + 부분 화면 갱신
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
					// 삽입 성공한 후에 신규 추가 모달 차 닫는다 닫자마자 업무 영역 리스트 부분을 갱신함. 방금 추가한 것 나옴
					$("#newBizAreaModal").modal("hide");
					$("#newBizAreaModal").on('hidden.bs.modal', function () {
						$("#bizList").load("show_target_biz_list.action");
					});
				}
			}
		})
	}
</script>