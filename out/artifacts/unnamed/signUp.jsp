<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/8/9
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/materialize.min.css">
    <link rel="stylesheet" href="css/tooplate.css">
</head>

<body id="register">
<div class="container">
    <div class="row">
        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
            <header class="mb-5">
                <h3 class="mt-0 white-text">Sign-up Form</h3>
                <p class="grey-text mb-4">Just input your telephone number and password.</p>
                <p class="grey-text">It's a very easy process</p>
            </header>
        </div>
        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
            <form action="AddUserServlet" method="post" class="tm-signup-form">
                <div class="input-field">
                    <input placeholder="Phone"  name="tel" type="text" class="validate" required>
                </div>
                <div class="input-field">
                    <input placeholder="Password"  name="password" type="password" class="validate" required>
                </div>
                <div class="input-field">
                    <input placeholder="Re-type Password"  name="password2" type="password" class="validate" required>
                </div>
                <div class="input-field">
                    <input placeholder="Nickname"  name="nickname" type="text" class="validate" required>
                </div>
                <div class="text-right mt-4">
                    <button type="submit" class="waves-effect btn-large btn-large-white px-4 tm-border-radius-0">Sign Up</button>
                </div>
            </form>
        </div>
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
