<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section class="content-header">
    <!--page head-->
    <h2><b>Schema Collection</b>
    </h2>
    <ul class="breadcrumb">
        <li class="active"><a href="home.action">Home</a></li>
        <li class="active">Schema Collection</li>
    </ul>
</section>

<section class="content">
    <div class="row">
        <div class="col-lg-6">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">Schema Collection List</h3>

                    <div class="box-tools">
                        <div class="input-group" style="width: 250px;">
                            <input name="table_search" class="form-control input-sm pull-right" type="text"
                                   placeholder="Search">

                            <div class="input-group-btn">
                                <button class="btn btn-default"><i class="fa fa-search"></i></button>
                                <button id="addSchemajobShow" class="btn btn-default" data-toggle="modal"
                                        onclick="showNewSchemajobModal()">
                                    <i class="glyphicon glyphicon-plus"></i></button>
                                <button class="btn btn-default"><i class="glyphicon glyphicon-cog"></i></button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.box-header -->
                <div class="box-body table-responsive no-padding">
                    <table class="table table-hover">
                        <tbody>
                        <tr>
                            <th>NAME</th>
                            <th>User</th>
                            <th>Date</th>
                            <th>CYCLE</th>
                        </tr>
                        <tr>
                            <td>183</td>
                            <td>John Doe</td>
                            <td>11-7-2014</td>
                            <td><span class="label label-success">Approved</span></td>
                            <th class="pull-right">
                                <button id="addBusinessLstShow" type="button" class="btn btn-default"
                                        data-toggle="modal"
                                        onclick="showAddBusinessListModal()">
                                    <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                                </button>
                                <button class="btn btn-default"><i class="glyphicon glyphicon-edit"></i></button>
                                <button class="btn btn-default"><i class="glyphicon glyphicon-remove"></i></button>
                            </th>
                        </tr>
                        <tr>
                            <td>219</td>
                            <td>Alexander Pierce</td>
                            <td>11-7-2014</td>
                            <td><span class="label label-warning">Pending</span></td>
                        </tr>
                        <tr>
                            <td>657</td>
                            <td>Bob Doe</td>
                            <td>11-7-2014</td>
                            <td><span class="label label-primary">Approved</span></td>
                        </tr>
                        <tr>
                            <td>175</td>
                            <td>Mike Doe</td>
                            <td>11-7-2014</td>
                            <td><span class="label label-danger">Denied</span></td>
                        </tr>
                        <tr>
                            <td>175</td>
                            <td>Mike Doe</td>
                            <td>11-7-2014</td>
                            <td><span class="label label-danger">Denied</span></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <!-- /.box-body -->
            </div>
        </div>
        <div class="col-lg-6">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">Business List</h3>

                    <div class="box-tools">
                        <div class="input-group" style="width: 50px;">
                            <div class="input-group-btn ">
                                <button class="btn btn-default"><i class="glyphicon glyphicon-cog"></i></button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.box-header -->
                <div class="box-body table-responsive no-padding">
                    <table class="table table-hover">
                        <tbody>
                        <tr>
                            <th>NAME</th>
                            <th>Descript</th>
                        </tr>
                        <tr>
                            <td>183</td>
                            <td>John Doe</td>
                        </tr>
                        <tr>
                            <td>219</td>
                            <td>Alexander Pierce</td>
                        </tr>
                        <tr>
                            <td>657</td>
                            <td>Bob Doe</td>
                        </tr>
                        <tr>
                            <td>175</td>
                            <td>Mike Doe</td>
                        </tr>
                        <tr>
                            <td>175</td>
                            <td>Mike Doe</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <!-- /.box-body -->
            </div>
        </div>
    </div>
</section>


<!-- ThiL modal is used for add a new Scheme job -->
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
                        <button type="button" class="btn btn-primary" id="submitNewBizArea" onclick="addBiz()">Add
                        </button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- ThiL modal is used for add a new Business List -->

<div class="modal fade" id="newAddListModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="addNewModalLabel2">New Business Area</h4>
            </div>

            <button type="button" class="btn btn-primary" id="submitNewBizArea2" onclick="addBiz()">Add</button>
            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
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

    function showAddBusinessListModal() {
        $("#newAddListModal").modal("show");
    }


</script>




