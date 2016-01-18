<%--
  Created by IntelliJ IDEA.
  User: YUSIN
  Date: 16/1/18
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="box box-info">
  <div class="box-header with-border">
    <h3 class="box-title" id="jobTargetPartTitle">수집/검사 작업의 대상</h3>

    <div class="box-tools pull-right">
      <a href="#" id="jobTargetAddBtn" class="btn btn-sm btn-success btn-flat pull-right" onclick="">작업대상 추가</a>
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