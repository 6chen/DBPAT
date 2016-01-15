<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>DBPAT</title>
	<!-- Tell the browser to be responsive to screen width -->
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<!-- Bootstrap 3.3.5 -->
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
	<!-- Font Awesome -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
	<!-- Ionicons -->
	<link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
	<!-- Theme style -->
	<link rel="stylesheet" href="dist/css/AdminLTE.min.css">
	<!-- bootstrap dual list -->
	<link rel="stylesheet" href="dist/css/bootstrap-duallistbox.css">
	<!-- AdminLTE Skins. Choose a skin from the css/skins
		 folder instead of downloading all of them to reduce the load. -->
	<link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">
	<!-- iCheck -->
	<link rel="stylesheet" href="plugins/iCheck/flat/blue.css">
	<!-- Morris chart -->
	<link rel="stylesheet" href="plugins/morris/morris.css">
	<!-- jvectormap -->
	<link rel="stylesheet" href="plugins/jvectormap/jquery-jvectormap-1.2.2.css">
	<!-- Date Picker -->
	<link rel="stylesheet" href="plugins/datepicker/datepicker3.css">
	<!-- Daterange picker -->
	<link rel="stylesheet" href="plugins/daterangepicker/daterangepicker-bs3.css">
	<!-- bootstrap wysihtml5 - text editor -->
	<link rel="stylesheet" href="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->

	<style>
		.main-header {
			position: fixed;
		}
	</style>
</head>
<body class="hold-transition skin-green sidebar-mini fixed">
<div class="wrapper">
	<header class="main-header ">
		<!-- Logo -->
		<a href="home.action" class="logo">
			<!-- mini logo for sidebar mini 50x50 pixels -->
			<span class="logo-mini"><b>SQL</b></span>
			<!-- logo for regular state and mobile devices -->
			<span class="logo-lg"><b>SQL Audit</b> Tool</span>
		</a>
		<!-- Header Navbar: style can be found in header.less -->
		<nav class="navbar navbar-static-top" role="navigation">
			<!-- Sidebar toggle button-->
			<a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
				<span class="sr-only">Toggle navigation</span>
			</a>
		</nav>
	</header>

	<aside class="main-sidebar">
		<!-- Inner sidebar -->
		<div class="sidebar">
			<!-- user panel (Optional) -->
			<div class="user-panel">
				<div class="pull-left image">
					<img src="dist/img/manager.png" class="img-circle" alt="User Image">
				</div>
				<div class="pull-left info">
					<p>User Name</p>
					<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
				</div>
			</div>
			<!-- /.user-panel -->

			<!-- Search Form (Optional) -->
			<%--<form action="#" method="get" class="sidebar-form">--%>
			<%--<div class="input-group">--%>
			<%--<input type="text" name="q" class="form-control" placeholder="Search...">--%>
			<%--<span class="input-group-btn">--%>
			<%--<button type="submit" name="search" id="search-btn" class="btn btn-flat"><i--%>
			<%--class="fa fa-search"></i></button>--%>
			<%--</span>--%>
			<%--</div>--%>
			<%--</form>--%>
			<!-- /.sidebar-form -->

			<!-- Sidebar Menu -->
			<ul class="sidebar-menu">
				<li class="header"><b>DEFINITION</b></li>
				<!-- Optionally, you can add icons to the links -->
				<li><a href="#" id="showTargetMainA"><span>Target</span></a></li>
				<li><a href="#" id="showAuditRuleMainA"><span>Audit Rule</span></a></li>
				<li><a href="#" id="showJobMainA"><span>Job</span></a></li>
				<li class="treeview">
					<a href="#"><span>Multilevel</span> <i class="fa fa-angle-left pull-right"></i></a>
					<ul class="treeview-menu">
						<li><a href="#">Link in level 2</a></li>
						<li><a href="#">Link in level 2</a></li>
					</ul>
				</li>
				<li class="header"><b>JOB MANAGEMENT</b></li>
				<li class="treeview">
					<a href="#"><span>Collection Job</span> <i class="fa fa-angle-left pull-right"></i></a>
					<ul class="treeview-menu">
						<li><a href="#">Schema Collection</a></li>
						<li><a href="#">SQL Collection</a></li>
					</ul>
				</li>
			</ul>
			<!-- /.sidebar-menu -->
		</div>
		<!-- /.sidebar -->
	</aside>
	<!-- /.main-sidebar -->



	<div class="content-wrapper"> <%--style="min-height: 916px;"--%>
		<div id="RightPart" >

		</div>

		<%--<div id="refHomeBottom" style=""></div>--%>
	</div>

	<footer class="main-footer">
		<div class="pull-right hidden-xs">
			by <b>DBSIN</b>
		</div>
		<strong><a href="http://www.pknu.ac.kr" target="_blank"> Pukyoung International University</a> Database and Ecommerce Lab.</strong>
	</footer>

</div>

<!-- jQuery 2.1.4 -->
<script src="plugins/jQuery/jQuery-2.1.4.min.js"></script>
<script>
	$(function () {
		//페이지 초기화할 때 오른쪽 서브 페이지를 호출하는 이벤트
		$("#RightPart").load("show_home_contents.action");

		//왼쪽 메뉴바 링크 이벤트들
		$("#showTargetMainA").click(function () {
			$("#RightPart").load("show_target_main.action");
		})

		$("#showAuditRuleMainA").click(function () {
			$("#RightPart").load("show_audit_rule_main.action");
		})

		$("#showJobMainA").click(function () {
			$("#RightPart").load("show_job_main.action");
		})

//		$(".sidebar-menu > li[class != 'treeview']").click(function () {
//			var page = null;
//			switch ($(this).find("span").html()) {
//				case "Target":
//					page = "show_target_main.action";
//					break;
//				case "Audit Rule":
//					page = "show_audit_rule_main.action";
//					break;
//			}
//			$("#RightPart").load(page);
//		});

		$(".sidebar-menu > li > ul > li > a").click(function () {
			var page = null;
			switch ($(this).html()) {
				case "Schema Collection":
					page = "showSchemaLst.action";
					break;
			}
			$("#RightPart").load(page);
		});
	});
</script>
<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<%--<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->--%>
<script>
	$.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.5 -->
<script src="bootstrap/js/bootstrap.min.js"></script>

<!-- bootstrap dual list -->
<script src="bootstrap/js/jquery.bootstrap-duallistbox.js"></script>
<!-- Morris.js charts -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="plugins/morris/morris.min.js"></script>
<!-- Sparkline -->
<script src="plugins/sparkline/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="plugins/knob/jquery.knob.js"></script>

<!-- daterangepicker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
<script src="plugins/daterangepicker/daterangepicker.js"></script>
<!-- datepicker -->
<script src="plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="plugins/fastclick/fastclick.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/app.min.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="dist/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="dist/js/demo.js"></script>


</body>
</html>
