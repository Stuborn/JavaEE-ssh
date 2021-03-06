<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>宿舍管理系统-首页</title>
    <!-- Bootstrap Styles-->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet"/>
    <!-- FontAwesome Styles-->
    <link href="assets/css/font-awesome.css" rel="stylesheet"/>
    <!-- Morris Chart Styles-->
    <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet"/>
    <!-- Custom Styles-->
    <link href="assets/css/custom-styles.css" rel="stylesheet"/>
    <!-- Google Fonts-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'/>
</head>

<body>
<div id="wrapper">
    <!--/. NAV TOP -->
    <%@ include file="navbar.jsp" %>
    <!--/. NAV SIDE -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">
                <li>
                    <a class="active-menu" href="index.jsp"><i class="fa fa-dashboard"></i> 首页</a>
                </li>
                <s:if test="#session.user.userRight==4">
                    <li>
                        <a href="building.jsp"><i class="fa fa-desktop"></i> 楼宇管理</a>
                    </li>
                </s:if>
                <s:if test="#session.user.userRight>=3">
                    <li>
                        <a href="dorm.jsp"><i class="fa fa-bar-chart-o"></i> 宿舍管理</a>
                    </li>
                </s:if>
            </ul>
        </div>
    </nav>
    <!-- 页面主内容 -->
    <div id="page-wrapper">
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-header">
                        首页
                        <small>宿舍概况</small>
                    </h1>
                </div>
            </div>
            <!-- /. ROW -->
            <div class="row">
                <div class="col-md-3 col-sm-12 col-xs-12">
                    <div class="panel panel-primary text-center no-boder bg-color-green green">
                        <div class="panel-left pull-left green">
                            <i class="fa fa-bar-chart-o fa-5x"></i>

                        </div>
                        <div class="panel-right pull-right">
                            <h3>1
                            </h3>
                            <strong> 用户数量</strong>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-12 col-xs-12">
                    <div class="panel panel-primary text-center no-boder bg-color-blue blue">
                        <div class="panel-left pull-left blue">
                            <i class="fa fa-users fa-5x"></i>
                        </div>

                        <div class="panel-right pull-right">
                            <h3>2
                            </h3>
                            <strong> 楼宇数量</strong>

                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-12 col-xs-12">
                    <div class="panel panel-primary text-center no-boder bg-color-red red">
                        <div class="panel-left pull-left red">
                            <i class="fa fa-comments fa-5x"></i>

                        </div>
                        <div class="panel-right pull-right">
                            <h3>15 </h3>
                            <strong> 宿舍数量 </strong>

                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-12 col-xs-12">
                    <div class="panel panel-primary text-center no-boder bg-color-brown brown">
                        <div class="panel-left pull-left brown">
                            <i class="fa fa-user fa-5x"></i>

                        </div>
                        <div class="panel-right pull-right">
                            <h3>3
                            </h3>
                            <strong>管理员账号</strong>

                        </div>
                    </div>
                </div>
            </div>
            <%--
                        <div class="row">
                            <div class="col-md-12">
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        昨日出勤
                                    </div>
                                    <div class="panel-body">
                                        <div id="morris-line-chart"></div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-xs-6 col-md-3">
                                <div class="panel panel-default">
                                    <div class="panel-body easypiechart-panel">
                                        <h4>正常</h4>
                                        <div class="easypiechart" id="easypiechart-blue" data-percent="82"><span
                                                class="percent">82%</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-6 col-md-3">
                                <div class="panel panel-default">
                                    <div class="panel-body easypiechart-panel">
                                        <h4>迟到</h4>
                                        <div class="easypiechart" id="easypiechart-red" data-percent="13">
                                            <span class="percent">11%</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-6 col-md-3">
                                <div class="panel panel-default">
                                    <div class="panel-body easypiechart-panel">
                                        <h4>早退</h4>
                                        <div class="easypiechart" id="easypiechart-teal" data-percent="5"><span
                                                class="percent">5%</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-6 col-md-3">
                                <div class="panel panel-default">
                                    <div class="panel-body easypiechart-panel">
                                        <h4>请假</h4>
                                        <div class="easypiechart" id="easypiechart-orange" data-percent="2"><span
                                                class="percent">2%</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
            --%>
            <footer style="text-align: center"><p>Copyright &copy; 2019.ZJUT All rights reserved.</footer>
        </div>
        <!-- /. PAGE INNER -->
    </div>
    <!-- /. PAGE WRAPPER -->
</div>
<!-- /. WRAPPER -->
<!-- JS Scripts-->
<!-- jQuery Js -->
<script src="assets/js/jquery-1.12.4.min.js"></script>
<!-- Bootstrap Js -->
<script src="assets/js/bootstrap.min.js"></script>

<!-- Metis Menu Js -->
<script src="assets/js/jquery.metisMenu.js"></script>
<!-- Morris Chart Js -->
<script src="assets/js/morris/raphael-2.1.0.min.js"></script>
<script src="assets/js/morris/morris.js"></script>


<script src="assets/js/easypiechart.js"></script>
<script src="assets/js/easypiechart-data.js"></script>
<!-- Custom Js -->
<script src="assets/js/custom-scripts.js"></script>
<script src="assets/js/custom.js"></script>


</body>

</html>
