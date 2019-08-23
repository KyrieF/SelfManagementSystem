<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Menu</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/materialize.min.css">
    <link rel="stylesheet" href="css/tooplate.css">
</head>

<body id="menu">
<div class="container tm-home-mt tm-home-container">
    <div class="row">
        <div class="col-12">
            <div class="tm-home-left">
                <h1 class="tm-site-title">Main menu</h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
            <div class="tm-home-left mt-3 font-weight-light">
                <p class="tm-mb-35">Timeless Blog is a personal dairy book,go to write your own timeless!</p>
                <p class="tm-mb-35">Password List helps you to remember your passwords in case of forgetting.</p>
                <p class="tm-mb-35"><a href="index.jsp">Go back?</a> </p>
            </div>
        </div>
        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
            <ul class="list-group tm-home-list tm-bg-black font-weight-light">

                <li class="d-flex justify-content-between align-items-center">
                    <a href="MyFootstepServlet" class="tm-white-text"> 1.Timeless Blog</a>
                </li>
                <li class="d-flex justify-content-between align-items-center">
                    <a href="MyPasswordListServlet" class="tm-white-text"> 2.Password List</a>
                </li>
            </ul>
        </div>
    </div>
</div>
</body>

</html>
