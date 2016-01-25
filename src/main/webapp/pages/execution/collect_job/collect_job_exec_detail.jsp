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

<div class="box box-solid box-success">
  <div class="box-header" style="text-align: center">
    <h3 class="box-title" style="font-size: 13px"><b>수행 내역</b></h3>
  </div>
  <!-- /.box-header -->
  <div class="box-body no-padding">
    <c:if test="${collectJobExecDetailPoList == null || fn:length(collectJobExecDetailPoList) == 0}">
      <div class="row" style="text-align: center; font-size: 12px">
        수행내역 없습니다.
      </div>
    </c:if>
    <c:if test="${collectJobExecDetailPoList != null && fn:length(collectJobExecDetailPoList) > 0}">
      <table class="table table-hover">
        <thead>
        <tr>
          <th>업무영역</th>
          <th>대상서버</th>
          <th>수집테이블명칭</th>
          <th>수집시작시간</th>
          <th>수집종료시간</th>
            <%--<th>소유시간</th>--%>
        </tr>
        </thead>
        <tbody>
          <%--등록된 모든 검사작업을 반복 출력하는 부분--%>
        <c:forEach varStatus="i" var="collectJobExecDetailPo" items="${collectJobExecDetailPoList}">
          <tr>
            <td>${collectJobExecDetailPo.bizAreaNm}</td>
            <td>${collectJobExecDetailPo.trgtNm}</td>
            <td>${collectJobExecDetailPo.clctTabNm}</td>
            <td>${collectJobExecDetailPo.jbItmExecStTm}</td>
            <td>${collectJobExecDetailPo.jbItmExecEdTm}</td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
    </c:if>
  </div>
  <!-- /.box-body -->
</div>