<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/8/10
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>Add Password</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/materialize.min.css">

</head>

<body background="img/input-bg-06.jpg">

<div class="container">
    <div class="row">
        <div class="col-lg-12">

        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="tm-video-container">

                <div id="tm-video-loader"></div>
                <div id="tm-video-text-overlay" class="tm-video-text-overlay d-none">
                    <h1>
                        <div id="rotate" class="tm-video-text">
                            <div>This is timeless</div>
                            <div>We are invincible</div>
                            <div>Quite unbeatable</div>
                            <div>and indestructible</div>
                        </div>
                    </h1>
                </div>

            </div>
        </div>
    </div>
</div>
<div class="container">
    <div class="row tm-register-row tm-mb-35">
        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 tm-login-l">
            <form action="AddPasswordServlet" method="post" class="tm-bg-black p-5 h-100">
                <div class="input-field">
                    <input placeholder="Username" required name="username" type="text" class="validate" required>
                </div>
                <div class="input-field">
                    <input placeholder="Password" required name="password" type="text" class="validate" required>
                </div>
                <div class="input-field">
                    <input placeholder="Location" required name="location" type="text" class="validate" required>
                </div>
                <div class="tm-flex-lr">
                    <button type="submit" class="waves-effect btn-large btn-large-white px-4 black-text rounded-0">
                        Add
                    </button>
                </div>
            </form>
        </div>
        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 tm-login-r">
            <header class="font-weight-light tm-bg-white p-5 h-100">
                <h3 class="mt-0 text-white font-weight-light">Write Please</h3>
                <p style="color:white">Dear.${sessionScope.loginUser.nickname},welcome to use Kyrie's first webapp,may this will help you to remember your passwords!</p>
            </header>
        </div>
    </div>
</div>

<hr>

</div>
<!-- .container -->

<script src="js/jquery.min.js"></script>
<!-- <script src="js/jquery-3.2.1.slim.min.js"></script> -->
<script src="js/templatemo-script.js"></script>

</body>
</html>
<script>

    //取出传回来的参数error并与yes比较
    var errori = '<%=request.getParameter("error")%>';
    if (errori == 'yes') {
        alert("Write footstep failed!");
    }
</script>