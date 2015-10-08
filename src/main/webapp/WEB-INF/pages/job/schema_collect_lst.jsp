<%--
  Created by IntelliJ IDEA.
  User: mtkim
  Date: 2015-10-06
  Time: 오후 4:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Scheme Collection</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid">
    <!--page head-->
    <h2><b>Scheme Collection</b>
        <button id="addSchemajobShow" type="button" class="btn btn-default pull-right" data-toggle="modal"
                onclick="showNewSchemajobModal()">
            <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
        </button>
    </h2>
    <ul class="breadcrumb">
        <li class="active"><a href="home.action">Home</a></li>
        <li class="active">Schema Collection</li>
    </ul>
</div>


<div class="container-fluid">
    <!-- Panel Group -->
    <div class="panel-group">
        <!--Each Panel-->
        <div class="panel panel-default">
            <div class="panel-heading">
                <div class="form">
                    <div class="form-group">
                        <div class="row">
                            <div class="col-lg-3">
                                <span class="input-group-addon" id="basic-addon1">Job name : </span>
                                <span class="input-group-addon" id="basic-addon2">변수 name </span>
                            </div>
                            <div class="col-lg-3">
                                <span class="input-group-addon" id="basic-addon3">Job 주기 : </span>
                                <span class="input-group-addon" id="basic-addon4">변수 주기 </span>
                            </div>
                            <div class="col-lg-3">
                                <span class="input-group-addon" id="basic-addon5">Job starttime : </span>
                                <span class="input-group-addon" id="basic-addon6">변수시간 </span>
                            </div>
                            <div class="col-lg-3">
                                <div class="btn-group pull-right">
                                    <a href="#" type="button" class="btn btn-info btn-sm" id="a1" onclick="">
                                        <span class="glyphicon glyphicon-screenshot" aria-hidden="true"></span>
                                    </a>
                                    <a href="#" type="button" class="btn btn-primary btn-sm" id="a2" onclick="">
                                        <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
                                    </a>
                                    <a href="#" type="button" class="btn btn-danger btn-sm" id="a3" onclick="">
                                        <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                    </a>
                                </div>
                            </div>

                            <%--<span class="input-group-addon" id="basic-addon3">Job name : </span>--%>
                            <%--<input type="text" class="form-control" id="basic-url" aria-describedby="basic-addon3">--%>
                        </div>
                    </div>
                </div>
            </div>
            <div class="panel-body">business lst</div>
        </div>
    </div>
</div>


<%--<div class="container-fluid">--%>
<%--<!-- Panel Group -->--%>
<%--<div class="panel-group">--%>
<%--<!--Each Panel-->--%>
<%--<div class="panel panel-default">--%>
<%--<div class="panel-heading">--%>
<%--<div class="form">--%>
<%--<div class="form-group">--%>
<%--<div class="col-xs-5">--%>
<%--<div class="input-group">--%>
<%--<span class="input-group-addon" id="basic-addon3">https://example.com/users/</span>--%>
<%--<input type="text" class="form-control" id="basic-url" aria-describedby="basic-addon3">--%>
<%--</div>--%>
<%--</div>--%>
<%--<div class="col-xs-5">--%>
<%--<a href="#" type="button" class="btn btn-info btn-sm" id="a1" onclick="">--%>
<%--<span class="glyphicon glyphicon-screenshot" aria-hidden="true"></span>--%>
<%--</a>--%>
<%--<a href="#" type="button" class="btn btn-primary btn-sm" id="a2" onclick="">--%>
<%--<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>--%>
<%--</a>--%>
<%--<a href="#" type="button" class="btn btn-danger btn-sm" id="a3" onclick="">--%>
<%--<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>--%>
<%--</a>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--<div class="panel-body">변수</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>


<!-- This modal is used for add a new Scheme job -->
<div class="modal fade" id="newSchemaJobModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="addNewModalLabel">New Schema Collection</h4>
            </div>
            <div class="modal-body">
                <div role="form">
                    <div class="form-group">
                        <label for="newSchemajobName">Schema Name</label>
                        <input type="text" class="form-control" id="newSchemajobName" placeholder="SchemaJob Name"
                               name="newSchemaJobName">
                    </div>
                    <div class="form-group">
                        <label for="newSchemaDesc">SchemaJob Description</label>
						<textarea class="form-control" rows="5" id="newSchemaDesc"
                                  placeholder="Schema Description" name="newSchemaDesc"></textarea>

                    </div>
                    <div class="form-group">

                        <div class="btn-toolbar" role="toolbar">
                            <div class="btn-group" role="group">
                                <button id="btn-once" type="button" class="btn btn-primary">한번</button>
                            </div>
                            <div class="btn-group" role="group">
                                <button id="btn-min" type="button" class="btn btn-default">Min</button>
                            </div>
                            <div class="btn-group" role="group">
                                <button id="btn-hour" type="button" class="btn btn-default">Hour</button>
                            </div>
                            <div class="btn-group" role="group">
                                <button id="btn-week" type="button" class="btn btn-default">Week</button>
                            </div>
                            <div class="btn-group" role="group">
                                <button id="btn-month" type="button" class="btn btn-default">Month</button>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="JobScadule">Job Scadule</label>

                        <div class="input-group">
                            <input id="JobScadule" class="form-control" type="text">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">
                                        <span class="glyphicon glyphicon-calendar"></span>
                                    </button>
                                </span>
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
    </div>
</div>

<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
    function showNewSchemajobModal() {
        $("#newSchemaJobModal").modal("show");
    }

</script>

</body>
</html>



