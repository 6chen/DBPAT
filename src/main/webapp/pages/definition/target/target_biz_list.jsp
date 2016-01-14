<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<style>
	th {
		/*font-size: 14px;*/
		text-align: center;
	}

	td {
		font-size: 14px;
		text-align: center;
	}
</style>

<%--만약 등록된 업무영역이 있으면 테이블 형태로 나타남--%>
<c:if test="${bizAreaPoList != null && fn:length(bizAreaPoList) > 0}">
	<table class="table table-hover">
		<thead>
		<tr>
			<th style="width: 10px">#</th>
			<th style="width: 200px">업무영역 명칭</th>
			<th>업무영역 설명</th>
			<th></th>
		</tr>
		</thead>
		<tbody>
		<%--등록된 모든 업무영역을 반복 출력하는 부분--%>
		<c:forEach varStatus="i" var="bizAreaPo" items="${bizAreaPoList}">
			<tr>
				<td style="width: 10px">${i.index+1}</td>
				<td style="width: 30px"><a href="#" onclick="showTargetOfThisBizArea(this);return false;"
				                           name="${bizAreaPo.bizAreaId}" data-toggle="tooltip"
				                           data-original-title="Show Targets"
						>${bizAreaPo.bizAreaNm}</a></td>
				<td>${bizAreaPo.bizAreaDescr}</td>
				<td style="width: 10px;">
					<button name="${bizAreaPo.bizAreaId}" type="button" class="btn btn-block btn-warning btn-xs"
					        onclick="showModifyBizAreaModal(this)">변경
					</button>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>

<%--만약 등록된 업무영역이 없으면 아래와 같은 메시지를 출력--%>
<c:if test="${bizAreaPoList == null || fn:length(bizAreaPoList) == 0}">
	<b>등록된 업무 영역이 없습니다.</b>
</c:if>

<!-- This modal is used for modify a business area -->
<div class="modal fade" id="modifyBizAreaModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
						aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="addNewModalLabel">업무 영역 변경</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label for="oldBizAreaName">업무 영역 명칭</label>
					<input type="text" class="form-control" id="oldBizAreaName" placeholder="Business Name"
					       name="oldBizAreaName">
				</div>
				<div class="form-group">
					<label for="oldBizAreaDesc">업무 영역 설명</label>
						<textarea class="form-control" rows="5" id="oldBizAreaDesc"
						          placeholder="Business Description" name="oldBizAreaDesc"></textarea>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-danger pull-left" id="removeOldBizArea" onclick="removeBiz()">삭제
				</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
				<button type="button" class="btn btn-warning" id="modifyNewBizArea" onclick="modifyBiz()">변경</button>
			</div>
		</div>
	</div>
</div>

<script>
//	수정하려고 각 업무영역 레코드 맨 뒤에 있는 변경 버튼을 클릭할 때 변경을 위한 모달 창을 나타난다.
//	나타나기 전에 해당 업무영역 아이디 값을 통해서 최신 정보를 가져와서 모달 창의 해당 위치에 출력함.
	function showModifyBizAreaModal(e) {
		$.ajax({
			type: 'post',
			url: 'find_biz_area_by_id.action?bizAreaId=' + $(e).attr("name"),
			success: function (data) {
				$("#modifyNewBizArea").attr("name", data.bizAreaId);
				$("#removeOldBizArea").attr("name", data.bizAreaId);
				$("#oldBizAreaName").val(data.bizAreaNm);
				$("#oldBizAreaDesc").val(data.bizAreaDescr);
				$("#modifyBizAreaModal").modal("show");
			}
		})
	}

//수정을 위한 모달 창에 있는 변경 버튼을 통해서 실제 업무영역의 내용을 변경하기 위함 부분
	function modifyBiz() {
		$.ajax({
			type: 'post',
			url: 'modify_biz.action',
			data: {
				bizAreaId: $("#modifyNewBizArea").attr("name"),
				bizAreaNm: $("#oldBizAreaName").val(),
				bizAreaDescr: $("#oldBizAreaDesc").val()
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
//					업데이트가 성공적으로 이루어진 후에 모달 창을 닫은 후에 업무영역 리스트 부분만을 갱신함
					$("#modifyBizAreaModal").modal("hide");
					$("#modifyBizAreaModal").on('hidden.bs.modal', function () {
						$("#bizList").load("show_target_biz_list.action");
					});
				}
			}
		})
	}

//  업무영역을 삭제하는 부분
	function removeBiz() {
		$.ajax({
			type: 'post',
			url: 'remove_biz.action',
			data: {
				bizAreaId: $("#removeOldBizArea").attr("name"),
				bizAreaNm: $("#oldBizAreaName").val(),
				bizAreaDescr: $("#oldBizAreaDesc").val()
			},
			success: function (data) {
				var result = $.parseJSON(data);
				if (result.success) {
					$("#modifyBizAreaModal").modal("hide");
					$("#modifyBizAreaModal").on('hidden.bs.modal', function () {
						$("#bizList").load("show_target_biz_list.action");
					});
				}
			}
		})
	}

//  업무영역 리스트에서 업무영역 명칭을 클릭한 후에 전체 화면 아래에 있는 감리대상 리스트를 나타나게 하는 부분
//  업무영역의 아이디를 통해서 업무영역별 등록된 감리 대상 리스트를 출력하는 방식이라서 감리 대상을 조회할 때 해당 업무영역 아이디를 적용함
	function showTargetOfThisBizArea(e) {
		$("#targetListHeader").html("<b>Targets</b>  <span class=\"badge bg-green\">in</span>&nbsp;<b>" + $(e).text() + "</b>");
		$("#targetListHeader").attr("name", $(e).attr("name"));
		$("#targetList").load("show_target_trgt_list.action?bizAreaId=" + $(e).attr("name"));
	}

</script>