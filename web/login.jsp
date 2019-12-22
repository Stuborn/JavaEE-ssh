<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>宿舍管理系统-登陆</title>

    <!-- CSS -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/form-elements.css">
    <link rel="stylesheet" href="assets/css/style.css">

    <!-- Javascript -->
    <script src="assets/js/jquery-1.12.4.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.backstretch.min.js"></script>
    <script src="assets/js/scripts.js"></script>

</head>

<body>
<%session.invalidate();%>
<!-- Top content -->
<div class="top-content">

    <div class="inner-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text">
                    <h1><strong>人事管理系统</strong></h1>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 form-box">
                    <div class="form-top">
                        <div class="form-top-left">
                            <h3>登陆系统</h3>
                            <p>请输入你的用户名与密码：</p>
                        </div>
                    </div>
                    <div class="form-bottom">
                        <span style="color: red"><s:property value="#request.tip"/></span>
                        <s:form role="form" action="login" method="post" cssClass="login-form">
                            <div class="form-group">
                                <label class="sr-only" for="form-username">用户名</label>
                                <s:textfield type="text" name="loginUser.id" placeholder="用户名" cssClass="form-username form-control login-textfield" id="form-username" cssStyle="margin-bottom: 22px;"/>
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="form-password">密码</label>
                                <s:textfield type="password" name="loginUser.password" placeholder="密码" cssClass="form-password form-control login-textfield" id="form-password" cssStyle="margin-bottom: 22px;"/>
                            </div>
                            <div class="err"></div>
                            <s:submit value="登陆"/>
                        </s:form>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 social-login">
                    <h3>没有账号？立即注册：</h3>
                    <div class="social-login-buttons">
                        <a class="btn btn-link-2" href="register.jsp">
                            Sign Up
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>


</body>
</html>