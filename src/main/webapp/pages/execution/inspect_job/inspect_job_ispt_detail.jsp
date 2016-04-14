<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<style>
	th {
		font-size: 12px;
		text-align: center;
		vertical-align: middle;
	}

	td {
		font-size: 12px;
		text-align: center;
	}
</style>


<div class="box box-solid box-success">
  <div class="box-header">
    <h3 class="box-title">검사작업 수행 내역</h3>
  </div>
  <!-- /.box-header -->
  <div class="box-body">
    <table class="table table-hover">
      <thead>
      <tr>
        <th>업무영역</th>
        <th>대상서버</th>
        <%--<th>규칙위반SQL_Id</th>--%>
        <th>규칙위반SQL_Text</th>
        <th>위반 규칙</th>
        <th>위반항목 개수</th>
        <th>검사시간</th>
        <%--<th>검사 종료시간</th>--%>
      </tr>
      </thead>
      <tbody>
      <%--등록된 모든 검사작업을 반복 출력하는 부분--%>
      <c:forEach varStatus="i" var="jobIsptDtlVo"
                 items="${jobIsptDtlVoList}">
        <tr data-toggle="tooltip" data-original-title="SQLID: ${jobIsptDtlVo.sqlId}">
          <td>${jobIsptDtlVo.bizAreaNm}</td>
          <td>${jobIsptDtlVo.trgtNm}</td>
          <%--<td>${jobIsptDtlVo.sqlId}</td>--%>
          <td style="width: 800px;">${jobIsptDtlVo.sqlText}</td>
          <td style="width: 100px;">${jobIsptDtlVo.rlNm}</td>
          <td>${jobIsptDtlVo.isptRlt}</td>
          <td>${jobIsptDtlVo.jbIsptEdTm}</td>
          <%--<td>${jobIsptDtlVo.jbIsptStTm}</td>--%>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
  <!-- /.box-body -->
</div>