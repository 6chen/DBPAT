<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<section class="content-header">
	<h1>
		Inspect Job Execution
		<small>검사 작업 실행 화면</small>
	</h1>
	<ol class="breadcrumb">
		<li><a href="/home.action"><i class="fa fa-dashboard"></i> Home</a></li>
		<li class="active">Inspect Job Execution</li>
	</ol>
</section>


<section class="content">
	<%--<div class="container-fluid">--%>
	<div class="row">
		<div class="col-lg-2">
			<div class="box box-solid box-default">
				<div class="box-header with-border">
					<h3 class="box-title">검사작업 리스트</h3>
				</div>
				<%--<div class="box-body">--%>
				<ul class="nav nav-pills nav-stacked">
					<c:if test="${jobPoList == null || fn:length(jobPoList) == 0}">
						<li style="text-align: center"><a href="#">등록된 검사작업이 없습니다</a></li>
					</c:if>
					<c:if test="${jobPoList != null || fn:length(jobPoList) > 0}">
						<c:forEach varStatus="i" var="jobPo" items="${jobPoList}">
							<li onclick="showIsptJobInfo(this)" name="${jobPo.jbId}" style="text-align: center"><a
									href="#">${jobPo.jbNm}</a></li>
						</c:forEach>
					</c:if>
				</ul>
				<%--</div>--%>
			</div>
		</div>
		<div class="col-lg-10" >
			<div id="isptJobDetailInfoPrt">
				<jsp:include page="/show_ispt_job_detail_info.action"></jsp:include>
			</div>

		</div>
	</div>
	<%--</div>--%>

	<div class="container-fluid">
	<div class="row">

		<%--<div class="col-lg-3" id="isptJobExecHistPrt">--%>
			<%--&lt;%&ndash;<jsp:include page="/show_ispt_job_exec_hist.action"></jsp:include>&ndash;%&gt;--%>
		<%--</div>--%>

		<div id="isptJobExecDetailPrt">
			<%--<jsp:include page="/show_ispt_job_exec_detail.action"></jsp:include>--%>
		</div>
	</div>
	</div>
</section>

<script>
	function showIsptJobInfo(e) {
//		alert($(e).attr("name"));
		var jbId = $(e).attr("name");
		$("#isptJobDetailInfoPrt").load("/show_ispt_job_detail_info.action?jbId=" + jbId);
//		$("#isptJobExecHistPrt").load("/show_clct_job_all_hist.action?jbId=" + jbId);
	}
</script>