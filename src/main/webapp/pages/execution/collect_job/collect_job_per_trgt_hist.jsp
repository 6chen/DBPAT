<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<style>
  th {
    font-size: 12px;
    text-align: center;
  }

  td {
    font-size: 12px;
    text-align: center;
  }
</style>

<div class="box box-solid box-default">
  <div class="box-header" style="text-align: center">
    <h3 class="box-title" style="font-size: 13px"><b>작업대상별 수행이력</b></h3>
  </div>
  <!-- /.box-header -->
  <div class="box-body no-padding">
    <c:if test="${JobExecHistVoList == null || fn:length(JobExecHistVoList) == 0}">
      <div class="row" style="text-align: center; font-size: 12px">
        수집작업은 수행하지 않았습니다.
      </div>
    </c:if>
    <c:if test="${JobExecHistVoList != null && fn:length(JobExecHistVoList) > 0}">
      <table class="table table-hover">
        <thead>
        <tr>
          <th>차수</th>
          <th>시작시간</th>
          <th>종료시간</th>
            <%--<th>소유시간</th>--%>
        </tr>
        </thead>
        <tbody>
          <%--등록된 모든 검사작업을 반복 출력하는 부분--%>
        <c:forEach varStatus="i" var="jobExecHistVo" items="${JobExecHistVoList}">
          <tr>
            <td>${jobExecHistVo.jbExecCnt}</td>
            <td>${jobExecHistVo.jbExecSt}</td>
            <td>${jobExecHistVo.jbExecEd}</td>
            <td>
            </td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
    </c:if>
  </div>
  <!-- /.box-body -->
</div>