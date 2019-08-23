<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/8/10
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>Password</title>
    <!-- load CSS -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">
    <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="css/bootstrap_1.min.css">
    <!-- https://getbootstrap.com/ -->
    <link rel="stylesheet" href="css/templatemo-style.css">
    <!-- Templatemo style -->
</head>

<body background="img/input-bg-06.jpg">

<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <header class="text-center tm-site-header">
                <div class="tm-site-logo"></div>
                <h1 class="pl-4 tm-site-title">My Passwords</h1>
            </header>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="tm-video-container">
                <%--                <video id="tm-welcome-video" class="tm-welcome-video" autoplay loop muted>--%>
                <%--                    <source src="/web/videos/video.mp4" type="video/mp4">--%>
                <%--                    Your browser does not support the video tag.--%>
                <%--                </video>--%>
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
<div class="container tm-container-2">
    <div class="row">
        <div class="col-lg-12">
            <p class="tm-text-orange tm-font-400"><a href="addPassword.jsp">Add Password</a>&nbsp&nbsp&nbsp&nbsp&nbsp<a href="menu.jsp">Back to menu</a></p>
        </div>
    </div>
    <div class="row tm-section-mb">
        <div class="col-lg-12">

            <c:forEach items="${sessionScope.passwordLists}" var="m">
                <div class="tm-timeline-item">
                    <div class="tm-timeline-item-inner">
                        <img src="img/img-02.jpg" alt="Image" class="rounded-circle tm-img-timeline">
                        <div class="tm-timeline-connector">
                            <p class="mb-0">&nbsp;</p>
                        </div>
                        <div class="tm-timeline-description-wrap">
                            <div class="tm-bg-dark-light tm-timeline-description">
                                <h3 class="tm-text-orange tm-font-400"> ${m.username}</h3>
                                <p> ${m.password}</p>
                                <p class="tm-text-orange float-right mb-0">
                                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp${m.location}</p>
                                <a href="DeletePasswordServlet?username=${m.username}&password=${m.password}&location=${m.location}">Delete</a>
                            </div>
                        </div>
                    </div>
                    <div class="tm-timeline-connector-vertical"></div>
                </div>
            </c:forEach>
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
