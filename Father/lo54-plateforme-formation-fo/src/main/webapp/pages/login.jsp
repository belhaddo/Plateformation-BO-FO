<%--
  Created by IntelliJ IDEA.
  User: badelh
  Date: 5/25/2019
  Time: 2:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <%@include file="../srcpages/bootsrap.html" %>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>
<body>
<%@include file="../srcpages/navbar.jsp" %>
<br>
<div class="container"  style="width : 60%; height: 250px ; border-radius: 10px;   box-shadow: 10px 10px grey;
             background-color: gainsboro;">
    <form action="/Login" class="was-validated" method="post">

        <div class="form-group col-sm-12">
            <label for="fname">Email : </label>
            <input type="email" class="form-control" id="fname" placeholder="Enter email" name="email" required>
        </div>

        <div class="form-group col-sm-12">
            <label for="lname">Password : </label>
            <input type="password" class="form-control" id="lname" placeholder="Enter password" name="pwd" required>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>

</div>

</body>
</html>
