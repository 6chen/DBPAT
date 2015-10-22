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
                                <button class="btn btn-default" onclick="editDBTarget()"><i
                                        class="glyphicon glyphicon-cog" aria-hidden="true"></i></button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.box-header -->
                <div class="box-body table-responsive no-padding">
                    <table id="dbschematab" class="table table-hover">
                        <thead>
                        <tr name="${job.jobId}">
                            <th>Name</th>
                            <th>Date</th>
                            <th>TYPE</th>
                            <th>CYCLE</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach varStatus="i" var="job" items="${jobs}">
                            <tr>
                                <td>${job.jobNm}</td>
                                <td>${job.jobstartDt}</td>
                                <td>${job.jobType}</td>
                                <td><span class="label label-success">${job.jobCycle}</span></td>
                                <td>
                                    <button class="btn btn-default" id="${job.jobId}" onclick="targetBizLst(this)"><i
                                            class="glyphicon glyphicon-screenshot"> </i></button>
                                    <button id="addBusinessLstShow" type="button" class="btn btn-default"
                                            data-toggle="modal"
                                            onclick="showAddBusinessListModal()">
                                        <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                                    </button>
                                    <button class="btn btn-default" id="${job.jobId}" onclick="findJobById(this)"><i
                                            class="glyphicon glyphicon-edit"></i></button>
                                    <button class="btn btn-default" id="${job.jobId}" onclick="deletejob(this)"><i
                                            class="glyphicon glyphicon-remove"></i></button>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <!-- /.box-body -->
            </div>
        </div>
        <div id="schemaTrgtLst" class="col-lg-6">
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


                        <thead>
                        <tr>
                            <th>NAME</th>
                            <th>Descript</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach varStatus="i" var="jobTrgtVo" items="${jobTrgtVos}">
                            <tr>
                                <td>${jobTrgtVo.target.trgtNm}</td>
                                <td>John Doe</td>
                            </tr>
                        </c:forEach>
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
                                <button id="btn-once" type="button" value="once" class="btn btn-primary">한번</button>
                            </div>
                            <div class="btn-group" role="group">
                                <button id="btn-min" type="button" value="min" class="btn btn-default">Min</button>
                            </div>
                            <div class="btn-group" role="group">
                                <button id="btn-hour" type="button" value="hour" class="btn btn-default">Hour</button>
                            </div>
                            <div class="btn-group" role="group">
                                <button id="btn-week" type="button" value="week" class="btn btn-default">Week</button>
                            </div>
                            <div class="btn-group" role="group">
                                <button id="btn-month" type="button" value="month" class="btn btn-default">Month
                                </button>
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
                        <button type="button" class="btn btn-primary" id="submitNewSchema" onclick="addSchemaLst()">Add
                        </button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- This modal is used for modify job List -->
<div class="modal fade" id="ModifySchemaJobModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="ModifyModalLabel">Modfiy Schema Collection</h4>
            </div>
            <div class="modal-body">
                <div role="form">
                    <div class="form-group">
                        <label for="ModifySchemajobName">Schema Name</label>
                        <input type="text" class="form-control" id="ModifySchemajobName" name="ModifySchemajobName"
                               value="" placeholder="SchemaJob Name">
                    </div>
                    <div class="form-group">
                        <label for="ModifySchemaDesc">SchemaJob Description</label>
						<textarea class="form-control" rows="5" id="ModifySchemaDesc"
                                  placeholder="Schema Description" name="ModifySchemaDesc"></textarea>
                    </div>
                    <div class="form-group">
                        <div class="btn-toolbar" role="toolbar">
                            <div class="btn-group" role="group">
                                <button id="Modifybtn-once" type="button" value="once" class="btn btn-primary">한번
                                </button>
                            </div>
                            <div class="btn-group" role="group">
                                <button id="Modifybtn-min" type="button" value="min" class="btn btn-default">Min
                                </button>
                            </div>
                            <div class="btn-group" role="group">
                                <button id="Modifybtn-hour" type="button" value="hour" class="btn btn-default">Hour
                                </button>
                            </div>
                            <div class="btn-group" role="group">
                                <button id="Modifybtn-week" type="button" value="week" class="btn btn-default">Week
                                </button>
                            </div>
                            <div class="btn-group" role="group">
                                <button id="Modifybtn-month" type="button" value="month" class="btn btn-default">Month
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="modifyJobScadule">Job Scadule</label>

                        <div class="input-group">
                            <input id="modifyJobScadule" name="modifyJobScadule" value="" class="form-control"
                                   type="text" placeholder="date">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">
                                        <span class="glyphicon glyphicon-calendar"></span>
                                    </button>
                                </span>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" id="submitModifySchema" onclick="modifyShema()">
                            Modify
                        </button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- ThiL modal is used for add a new Business List -->

<div class="modal fade bs-example-modal-lg" id="newAddListModal" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="addNewModalLabel2">New Business Area</h4>
            </div>
            <div class="modal-body">
                <form id="demoform" action="#" method="post">
                    <select multiple="multiple" size="10" name="duallistbox_demo1[]">
                        <option value="option1">Option 1</option>
                        <option value="option2">Option 2</option>
                        <option value="option3" selected="selected">Option 3</option>
                        <option value="option4">Option 4</option>
                        <option value="option5">Option 5</option>
                        <option value="option6" selected="selected">Option 6</option>
                        <option value="option7">Option 7</option>
                        <option value="option8">Option 8</option>
                        <option value="option9">Option 9</option>
                        <option value="option0">Option 10</option>
                    </select>
                    <br>
                    <button type="submit" class="btn btn-default btn-block">Submit data</button>
                </form>
            </div>
            <div class="modal-footer">
                <button type="submit" class="btn btn-primary" id="submitNewBizArea2" onclick="addBiz()">Add</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>


<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>

    $(function () {
        $("#dbschematab tbody tr td:last-child").hide()
    });

    function editDBTarget() {
        $("#dbschematab tbody tr td:last-child").toggle(100);
    }


    function showNewSchemajobModal() {
        $("#newSchemaJobModal").modal("show");
    }

    function showAddBusinessListModal() {
        $("#newAddListModal").modal("show");
    }

    var demo1 = $('select[name="duallistbox_demo1[]"]').bootstrapDualListbox();
    $("#demoform").submit(function () {
        alert($('[name="duallistbox_demo1[]"]').val());
        return false;
    });

    function addSchemaLst() {
        $.ajax({
            type: 'post',
            url: 'addJoblst.action',
            data: 'newSchemaName=' + $("#newSchemajobName").val() + '&newScadule=' + $("#JobScadule").val(),
            success: function (data) {
                var result = $.parseJSON(data);
                if (result.success) {
                    $("#newSchemaJobModal").modal("hide");
                    $("#newSchemaJobModal").on('hidden.bs.modal', function () {
                        $("#RightPart").load("showSchemaLst.action");
                    });
                }
            }
        })
    }

    function deletejob(e) {
        $("#RightPart").load("deletejob.action", {"jobid": e.id}, function () {
            alert("You deleted a Schema List!");
        });
    }

    function findJobById(e) {
        $.ajax({
            type: 'get',
            url: 'findSchemaById.action?jobId=' + e.id,
            success: function (data) {
                $("#ModifySchemajobName").attr("value", data.jobNm);
                $("#modifyJobScadule").attr("value", data.jobstartDt);
                $("#submitModifySchema").attr("name", data.jobId);
                $("#ModifySchemaJobModal").modal("show");
            }
        })
    }

    function modifyShema() {
        $.ajax({
            type: 'post',
            url: 'modifySchemaById.action',
            data: 'jobId=' + $("#submitModifySchema").attr("name") + '&jobNm=' + $("#ModifySchemajobName").val() + '&jobstartDt=' + $("#modifyJobScadule").val(),
            success: function (data) {
                var result = $.parseJSON(data);
                if (result.success) {
                    $("#ModifySchemaJobModal").modal("hide");
                    $("#ModifySchemaJobModal").on('hidden.bs.modal', function () {
                        $("#RightPart").load("showSchemaLst.action");
                    });
                }
            }
        })
    }

    function targetBizLst(e) {
        $("#RightPart").load("showTargetBizLst.action?jobId=" + e.id);

    }

</script>




