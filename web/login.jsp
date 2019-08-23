<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/8/10
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/materialize.min.css">
    <link rel="stylesheet" href="css/tooplate.css">
</head>

<body id="login">
<div class="container">
    <div class="row tm-register-row tm-mb-35">
        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 tm-login-l">
            <form action="LoginServlet" method="post" class="tm-bg-black p-5 h-100">
                <div class="input-field">
                    <input placeholder="Phone" required name="tel" type="text" class="validate">
                </div>
                <div class="input-field mb-5">
                    <input placeholder="Password" required  name="password" type="password" class="validate">
                </div>
                <div class="tm-flex-lr">
                    <a href="signUp.jsp" class="white-text small">Create New Account?</a>
                    <button type="submit" class="waves-effect btn-large btn-large-white px-4 black-text rounded-0">Login</button>
                </div>
            </form>
        </div>
        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 tm-login-r">
            <header class="font-weight-light tm-bg-black p-5 h-100">
                <h3 class="mt-0 text-white font-weight-light">Your Login</h3>
            </header>
        </div>
    </div>
    <div class="row">

    </div>

</div>

<script src="js/jquery-3.2.1.slim.min.js"></script>
<script src="js/materialize.min.js"></script>
<script>
    $(document).ready(function () {
        $('select').formSelect();
    });
</script>
</body>

</html>
<script>

    //取出传回来的参数error并与yes比较
    var errori ='<%=request.getParameter("error")%>';
    if(errori=='yes'){
        alert("Sign up failed!");
    }
</script>
