<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<section class="content-header">
	<h1>
		Target Definition
		<small>감리 대상 리스트</small>
	</h1>
	<ol class="breadcrumb">
		<li><a href="/home.action"><i class="fa fa-dashboard"></i> Home</a></li>
		<li class="active">Target Definition</li>
	</ol>
</section>


<section class="content">
	<div class="callout callout-warning">
		<p>1. 감리 대상인 데이터베이스 등을 등록하려면 먼저 감리 대상이 소속되어 있는 업무영역을 등록하세요.</p>
	</div>

	<%--업무영역 리스트 부분 시작--%>
	<div class="container-fluid">
		<div class="row">
			<jsp:include page="/show_target_biz_part.action"></jsp:include>
		</div>
	</div>
	<%--업무영역 리스트 부분 끝--%>

	<div class="callout callout-info">
		<p>2. 등록된 업무영역 중에서 실제 감리 대상을 등록하세요</p>
	</div>

	<%--감리대상 리스트 부분 시작--%>
	<div class="container-fluid">
		<div class="row">
			<jsp:include page="/show_target_trgt_part.action"></jsp:include>
		</div>
	</div>
	<%--감리대상 리스트 부분 끝--%>


</section>
