<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>宿舍管理系统-注册</title>

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
                            <h3>账户注册</h3>
                            <p>请输入你的用户名与密码：</p>
                        </div>
                    </div>
                    <div class="form-bottom">
                        <s:form action="register" method="post" cssClass="signup-form">
                            <span style="color: red"><s:property value="#request.tip"/></span>
                            <div class="form-group">
                                <label class="sr-only" for="form-username">用户名</label>
                                <s:textfield type="text" name="loginUser.userId" placeholder="用户名"
                                             cssClass="form-username form-control login-textfield" id="form-username"
                                             cssStyle="margin-bottom: 22px;"/>
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="form-password-1">密码</label>
                                <s:textfield type="password" placeholder="请输入密码"
                                             cssClass="form-password form-control login-textfield" id="form-password-1"
                                             cssStyle="margin-bottom: 22px;"/>
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="form-password-2">再次输入密码</label>
                                <s:textfield type="password" name="loginUser.userPassword" placeholder="再次输入密码"
                                             cssClass="form-password form-control login-textfield" id="form-password-2"
                                             cssStyle="margin-bottom: 22px;"/>
                            </div>
                            <div class="err"></div>
                            <s:submit value="注册"/>
                        </s:form>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 social-login">
                    <h3>已有账号？立即登陆：</h3>
                    <div class="social-login-buttons">
                        <a class="btn btn-link-2" href="login.jsp">
                            Login
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>


</body>

</html>