<%--
  Created by IntelliJ IDEA.
  User: badelh
  Date: 5/25/2019
  Time: 2:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@include file="../srcpages/datatables-css.jsp" %>
    <%@include file="../srcpages/bootsrap.html" %>


    <title>Clients</title>

</head>
<body>
<%@include file="../srcpages/navbar.jsp" %>
<br>
<div class="container" style="width: 70%;">
    <table id="data" class="table table-striped table-bordered" >
        <thead>
        <tr>
            <th>Course Name</th>
            <th>Location</th>
            <th>Date Start</th>
            <th>Date End</th>
            <th>Number of Participents</th>
            <th>Action</th>

        </tr>
        </thead>
        <tbody>
            <tr>
                <td>Java</td>
                <td>Belfort</td>
                <td>23/09/2018</td>
                <td>01/07/2019</td>
                <td>28</td>
                <td><button type="button" class="btn btn-primary btn-sm" id ="">
                    <span class="glyphicon glyphicon-minus-sign">Enroll</span></button></td>
            </tr>




        </tbody>
    </table>
</div>
<%@include file="../srcpages/datatables-js.jsp" %>

</body>
</html>

