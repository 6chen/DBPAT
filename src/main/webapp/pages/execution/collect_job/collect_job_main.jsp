<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<section class="content-header">
	<h1>
		Collect Job Execution
		<small>등록된 모든 수집 작업의 리스트</small>
	</h1>
	<ol class="breadcrumb">
		<li><a href="/home.action"><i class="fa fa-dashboard"></i> Home</a></li>
		<li class="active">Collect Job Execution</li>
	</ol>
</section>

<section class="content">
	<div class="container-fluid">
		<div class="row">
			<div class="box box-solid">
				<div class="box-header with-border">
					<h3 class="box-title"><b>수잡 작업 리스트</b></h3>

				</div>
				<!-- /.box-header -->
				<div class="box-body">
					<div class="box-group" id="accordion">
						<!-- we are adding the .panel class so bootstrap.js collapse plugin detects it -->

						<c:if test="${jobPoList == null || fn:length(jobPoList) == 0}">
							<div class="row" style="text-align: center">
								<b>등록된 수집작업이 없습니다.</b>
							</div>
						</c:if>
						<c:if test="${jobPoList != null && fn:length(jobPoList) > 0}">
							<c:forEach varStatus="i" var="jobPo" items="${jobPoList}">
								<div class="panel box box-primary" name="${jobPo.jbId}" id="containPanel${jobPo.jbId}">
									<div class="box-header with-border">
										<h4 class="box-title">
											<a data-toggle="collapse" data-parent="#accordion" href="#collapse${jobPo.jbId}"
											   aria-expanded="ture" class="" onclick="showJobTargetInfo(this)">
													${jobPo.jbNm}
											</a>
										</h4>

									</div>
									<div id="collapse${jobPo.jbId}" class="panel-collapse collapse" aria-expanded="true"
									     style="">
										<div class="box-body" id="collectJobTargetlist${jobPo.jbId}">
										</div>
									</div>
								</div>
							</c:forEach>
						</c:if>
					</div>
				</div>
				<!-- /.box-body -->
			</div>
		</div>
	</div>
</section>

<script>
	function showJobTargetInfo(e) {
		var jbId = $(e).attr("href").replace("#collapse","");
//		$("#collapse"+ jbId +" > div").load("show_clct_job_target_list.action?jbId=" + jbId);
		$("#collectJobTargetlist"+ jbId).load("show_clct_job_target_list.action?jbId=" + jbId);
	}


</script>