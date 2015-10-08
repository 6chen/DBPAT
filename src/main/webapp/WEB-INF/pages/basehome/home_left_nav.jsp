<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<br>
<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
    <div class="panel panel-default">
        <div class="panel-heading" role="button" id="headingOne" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
            <h4 class="panel-title text-center">
                Definition
            </h4>
        </div>
        <div id="collapseOne" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingOne">
            <div class="panel-body">
                <ul class="nav nav-pills nav-stacked">
	                <li><a href="#">Business Area</a></li>
                    <li><a href="#">Auditing Rule Set</a></li>
                    <li><a href="#">Auditing Index</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="panel panel-default">
        <div class="panel-heading" role="button" id="headingTwo" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
            <h4 class="panel-title">
                JobManagement
            </h4>
        </div>
        <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
            <div class="panel-body">
                <ul class="nav nav-pills nav-stacked">
                    <li><a href="#">Schema Collection</a></li>
                    <li><a href="#">SQL Collection</a></li>
                    <li><a href="#">Inspection</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="panel panel-default">
        <div class="panel-heading" role="button" id="headingThree" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
            <h4 class="panel-title">
                 Management
            </h4>
        </div>
        <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
            <div class="panel-body">
                three
            </div>
        </div>
    </div>
</div>
<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
    $(function(){
        $(".panel-body > ul > li > a").click(function(){
	        var page = null;
			switch ($(this).html()){
				case "Business Area":
					page = "showBizAreaLst.action";
					break;
                case "Schema Collection":
                    page = "showSchemaLst.action";
                    break;
			}
            $("#RightPart").load(page);
        });
    });
</script>
</body>
</html>