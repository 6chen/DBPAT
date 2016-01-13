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

<c:if test="${bizAreaPoList != null && fn:length(bizAreaPoList) > 0}">
	<table class="table table-hover">
		<thead>
		<tr>
			<th style="width: 10px">#</th>
			<th>업무 영역 명칭</th>
			<th>업무 영역 설명</th>
			<th></th>
		</tr>
		</thead>
		<tbody>
		<c:forEach varStatus="i" var="bizAreaPo" items="${bizAreaPoList}">
			<tr>
				<td>${i.index+1}</td>
				<td><a href="#" id="${bizAreaPo.bizAreaId}" data-toggle="tooltip"
				       data-original-title="Show Targets">${bizAreaPo.bizAreaNm}</a></td>
				<td>${bizAreaPo.bizAreaDescr}</td>
				<td style="width: 10px;">
					<button name="${bizAreaPo.bizAreaId}" type="button" class="btn btn-block btn-warning btn-xs"
					        onclick="showModifyBizAreaModal(this)">수정
					</button>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>

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
				<h4 class="modal-title" id="addNewModalLabel">업무 영역 수정</h4>
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
				<button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
				<button type="button" class="btn btn-warning" id="submitNewBizArea" onclick="modifyBiz()">수정
				</button>
			</div>
		</div>
	</div>
</div>

<script>
	function showModifyBizAreaModal(e) {
		$.ajax({
			type: 'post',
			url: 'find_biz_area_by_id.action?bizAreaId=' + $(e).attr("name"),
			success: function (data) {
				$("#submitNewBizArea").attr("name", data.bizAreaId);
				$("#oldBizAreaName").val(data.bizAreaNm);
				$("#oldBizAreaDesc").val(data.bizAreaDescr);
				$("#modifyBizAreaModal").modal("show");
			}
		})
	}

	function modifyBiz() {
		$.ajax({
			type: 'post',
			url: 'modify_biz.action',
			data: {
				bizAreaId: $("#submitNewBizArea").attr("name"),
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
</script>