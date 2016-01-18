<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<section class="content-header">
	<h1>
		Audit Rule
		<small>검사 항목에 의해서 구현된 검사 규칙 리스트</small>
	</h1>
	<ol class="breadcrumb">
		<li><a href="/home.action"><i class="fa fa-dashboard"></i> Home</a></li>
		<li class="active">Audit Rule Definition</li>
	</ol>
</section>

<section class="content">
	<%--검사 규칙 집합 리스트 부분 시작--%>
	<div class="container-fluid">
		<div class="row">
			<jsp:include page="/show_audit_rule_set_part.action"></jsp:include>
		</div>
	</div>
	<%--검사 규칙 집합 리스트 부분 끝--%>

	<div class="row">
		<%--검사 규칙 리스트 부분 시작--%>
		<div class="col-lg-4">
			<jsp:include page="/show_audit_rule_part.action"></jsp:include>
		</div>
		<%--검사 규칙 리스트 부분 끝--%>

		<%--검사 규칙 상세 부분 시작--%>
		<div class="col-lg-8">
			<jsp:include page="/show_audit_rule_detail_part.action"></jsp:include>
		</div>
		<%--검사 규칙 상세 부분 끝--%>
	</div>
</section>

