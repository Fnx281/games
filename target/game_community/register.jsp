<%--
  Created by IntelliJ IDEA.
  User: MyPc
  Date: 2021/10/16
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="head_navigation.jsp" %>
<html>
<head>
    <link href="css/register.css" rel="stylesheet"></head>
    <title>注册</title>
    <script>
        function checkUsername(){
            var username = $("#username").val();
            var reg_username = /^\w{8,20}$/;

            var flag = reg_username.test(username);

            if (flag){
                $("#username").css("border","");
            }else{
                $("#username").css("border","1px solid red");
            }
            return flag;
        }
        function checkPassword(){
            var password = $("#password").val();
            var reg_password = /^\w{8,20}$/;

            var flag = reg_password.test(password);

            if (flag){
                $("#password").css("border","");
            }else{
                $("#password").css("border","1px solid red");
            }
            return flag;
        }
        $(function (){
            $("#registerForm").submit(function (){
                return checkUsername() && checkPassword();
            })

            $("#username").blur(checkUsername)
            $("#pass word").blur(checkPassword)
        })
    </script>
</head>
<body>
<h3 class="text-center" id="headline">用户注册</h3>
<form action="${pageContext.request.contextPath}/registerServlet" method="get" id="registerForm">
    <div class="container">
        <div class="form-group row">
            <div class="col-md-8 col-md-offset-2">
                <label for="username">用户名：</label>
                <input type="text" class="form-control" id="username" name="username" placeholder="请输入用户名">
            </div>
        </div>
        <div class="form-group row">
            <div class="col-md-8 col-md-offset-2">
                <label for="password">密码：</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码"/>
            </div>
        </div>
        <div class="form-group row">
            <div class="col-md-8 col-md-offset-2">
                <label for="confirm_password">确认密码：</label>
                <input type="password" class="form-control" id="confirm_password" name="confirm_password"
                       placeholder="请再输入一次密码"/>
            </div>
        </div>

        <div class="form-group row">
            <div class="col-md-8 col-md-offset-2">
                <label for="birthday">出生日期：</label>
                <input type="date" class="form-control" id="birthday" name="birthday" placeholder="请输入年龄">
            </div>
        </div>

        <div class="form-group row">
            <div class="col-md-8 col-md-offset-2">
                <label>性别：</label>
                <input type="radio" name="gender" value="男" checked="checked"/>男
                <input type="radio" name="gender" value="女"/>女
            </div>
        </div>

        <div class="form-group row">
            <div class="col-md-8 col-md-offset-2">
                <label for="telePhone">手机号：</label>
                <input type="number" class="form-control" id="telePhone" name="telePhone" placeholder="请输入年龄">
            </div>
        </div>
        <div class="form-group row ">
            <div class="col-md-8 col-md-offset-2">
                <label for="email">Email：</label>
                <input type="text" class="form-control" id="email" aria-describedby="basic-addon1" name="email" placeholder="请输入邮箱地址"/>
            </div>
        </div>

        <div class="form-group row" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交"/>
            <input class="btn btn-default" type="reset" value="重置"/>
            <input class="btn btn-default" type="button" id="back" value="返回"/>
        </div>
        <script>
            document.getElementById("back").onclick = function () {
                window.history.back();
            }
        </script>
    </div>
</form>
</body>
</html>
