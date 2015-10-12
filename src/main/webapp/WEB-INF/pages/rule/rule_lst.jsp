<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<style>
	th {
		/*font-size: 14px;*/
		text-align: center;
	}

	td {
		/*font-size: 14px;*/
		text-align: center;
	}
</style>

<c:if test="${rules.size() == 0}">
	<div class="container-fluid">
		<br>
		<div class="callout callout-warning">
			<h4>Tip!</h4>
			<p> Please add a new rule in this list! </p>
		</div>
	</div>
</c:if>
<c:if test="${rules.size() != 0}">
	<table class="table table-hover">
		<thead>
		<tr>
			<th>#</th>
			<th>Rule Name</th>
			<th>Rule Class</th>
			<th>Rule Description</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach varStatus="i" var="rule" items="${rules}">
			<tr>
				<td>${i.index+1}</td>
				<td><a href="#" name="${rule.rlId}" data-toggle="tooltip" data-original-title="Show Detail Info" onclick="loadRuleDetailModify(this)"> ${rule.rlNm} </a></td>
				<td>${rule.rlCls}</td>
				<td>${fn:substring(rule.rlDescr, 0, 10)}...</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>