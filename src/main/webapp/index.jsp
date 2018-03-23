﻿<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.8/css/materialize.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.8/js/materialize.min.js"></script>
</head>
<body>
<div class="container">
    <div>
        <h3 class="center-align">注册</h3>
    </div>
    <div class="row">
        <div class="container">
            <form class="col s12" action="register" method="post" enctype="multipart/form-data">
                <div class="input-field">
                    用户名: <input id="userName" name="userName" type="text" class="validate" length="10">
                </div>
                <div class="input-field">
                    密码: <input id="passsWord" name="passsWord" type="password" class="validate" length="20">
                </div>
                <div class="file-field input-field">
                    <div class="btn">
                        <span>头像</span>
                        <input type="file" name="profilePicture">
                    </div>
                    <div class="file-path-wrapper">
                        <input class="file-path validate" type="text">
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        生日: <input type="date" class="datepicker" id="birth" name="birth">
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        邮箱:<input id="email" name="email" type="email" class="validate">
                    </div>
                </div>
                <div class="center-align">
                    <button class="btn waves-effect waves-light" type="submit" name="action">submit
                        <i class="material-icons right">send</i>
                    </button>
                </div>
            </form>
        </div>

    </div>
</div>
</body>
<script>
    $('.datepicker').pickadate({
        selectMonths: true, // Creates a dropdown to control month
        selectYears: 15 // Creates a dropdown of 15 years to control year
    });
</script>
</html>