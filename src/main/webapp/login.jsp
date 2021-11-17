<%--
  Created by IntelliJ IDEA.
  User: MyPc
  Date: 2021/10/16
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/head_navigation.css">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <title>登录</title>
    <style>
        #con1 {
            margin-top: 70px;

        }

        label {
            color: #323131;
        }

        body {
            background-image: linear-gradient(to right, #4f93d2 0%, #5eb66d 80%);
            background-size: 100% 100%;
        }

        #bt1 {
            margin-top: 10px;
        }

        #register {
            margin-top: 20px;
        }

        #user_password {
            background: #ffffff;
            color: #000000;
            font-size: 15px;
        }

        #username {
            background: #ffffff;
            color: #050505;
            font-size: 15px;
        }

    </style>

</head>
<body>


<form action="${pageContext.request.contextPath}/LoginServlet" method="post">

    <div id="con1" class="container center-block">
        <h2 class="text-center" style="color: #282727">登录</h2>
        <div class="row form-group center-block">
            <div class="col-md-4 col-md-offset-4 col-sm-4  col-sm-offset-4">
                <label for="username">用户名：</label>
                <input type="text" class="form-control" id="username" name="username" placeholder="请输入账号">
            </div>
        </div>
        <div class="row form-group center-block">
            <div class="col-md-4 col-md-offset-4 col-sm-4 col-sm-offset-4">
                <label for="password">密码：</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
            </div>
        </div>
        <div class="row form-group center-block">
            <div class="col-md-2 col-md-offset-4 col-sm-4 col-sm-offset-4">
                <label for="vcode">验证码：</label>
                <input type="text" name="verifycode" class="form-control" id="verifycode" placeholder="请输入验证码">
                <a href="javascript:refreshCode()"><img style="color: #0a04d5"
                                                        src="${pageContext.request.contextPath}/CheckCodeServlet"
                                                        title="看不清点击刷新" id="vcode"/></a>
            </div>
        </div>
        <div class="row form-group center-block">
            <div class="col-md-4 col-md-offset-4 col-sm-4  col-sm-offset-4">
                <button type="submit" id="bt1" class="btn btn-primary btn-block">点击登录</button>
            </div>
        </div>
        <div class="row" id="register">
            <div>
                <a class="col-md-2 col-md-offset-4 col-sm-4  col-sm-offset-2" href=""
                   style="color:#3359de">忘记账号或者密码了?</a>
                <a class="col-md-1 col-md-offset-1 col-sm-2  col-sm-offset-2" href="register.jsp" style="color:#3359de">立即注册</a>
            </div>
        </div>
    </div>
</form>
</body>
</html>
