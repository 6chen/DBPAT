<%--
  Created by IntelliJ IDEA.
  User: mtkim
  Date: 2015-10-06
  Time: 오후 3:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>SQL Collection</title>
  <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid">
  <!--page head-->
  <h2><b>SQL Collection</b>
    <button id="addSqljobShow" type="button" class="btn btn-default pull-right" data-toggle="modal"
            onclick="showNewsqljobModal()">
      <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
    </button>
  </h2>
  <ul class="breadcrumb">
    <li class="active"><a href="home.action">Home</a></li>
    <li class="active">SQL Collection</li>
  </ul>
</div>

<!-- This modal is used for add a new sql job -->
<div class="modal fade" id="newSQLJobModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="addNewModalLabel">New SQL Collection</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label for="newSQLjobName">SQLJob Name</label>
          <input type="text" class="form-control" id="newSQLjobName" placeholder="SQLJob Name"
                 name="newSQLJobName">
        </div>
        <div class="form-group">
          <label for="newSQLjobDesc">SQLJob Description</label>
						<textarea class="form-control" rows="5" id="newSQLjobDesc"
                                  placeholder="SQLJob Description" name="newSQLJobDesc"></textarea>
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" id="submitNewBizArea" onclick="addBiz()">Add
        </button>
      </div>
    </div>
  </div>
</div>

<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
  function showNewsqljobModal() {
    $("#newBizAreaModal").modal("show");
  }

</script>

</body>
</html>
