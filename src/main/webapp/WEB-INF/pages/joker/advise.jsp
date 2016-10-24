<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <title>Login Launch</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/cyborg/bootstrap.min.css">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <img width="30%" src="https://openclipart.org/image/2400px/svg_to_png/171490/RAJAWALI.png" class="center-block">
    <h3 class="text-center">Text</h3>
    <h2 class="text-center"><span class="glyphicon glyphicon-book" aria-hidden="true"></span> Text</h2>
    <hr>
    <form method="post" accept-charset="utf-8" autocomplete="on">
        <p class="text-center">
            <label for="username">Username:
                <input type="text"
                       name="username" id="username" size="25"
                       placeholder="e.g. administrator"
                       title="Username must be between 8 and 20 characters"
                       pattern="^[a-zA-Z][a-zA-Z0-9-_\.]{8,20}$" required="required" class="form-control">
            </label>
        </p>
        <p class="text-center">
            <label for="password">Today's Password:
                <input type="password"
                       name="password" id="password" size="25" placeholder="e.g. X8df!90EO"
                       title="Password must contain 1 uppercase, lowercase and number"
                       pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$"
                       required="required" class="form-control">
            </label>
        </p><%--
        <p class="text-center">
            <input type="checkbox" name="loginkeeping" id="loginkeeping"
                   value="loginkeeping"/> <label for="loginkeeping">Keep me
            logged in</label>
        </p>--%>
        <p class="text-center">
            <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-log-in"
                                                                aria-hidden="true"></span>
                Submit
            </button>
        </p>
    </form>
</div>
</body>
</html>