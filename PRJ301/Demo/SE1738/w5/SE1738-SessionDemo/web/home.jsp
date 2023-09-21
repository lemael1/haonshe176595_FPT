<%-- 
    Document   : home
    Created on : Jun 6, 2023, 3:05:04 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #wrapper{
                margin: auto;
                margin-left: 10%;
                margin-right: 10%;
            }
            ul.menu{
                display: inline-block;
            }
            ul.menu li{
                margin: 10px 16px;
                float: left;
                text-align: center;
                list-style: none;
                width: 150px;
                height: 30px;
                background: chocolate;
            }
            ul.menu li a{
                text-decoration: none;
                color: white;
            }

        </style>
    </head>
    <body>
        <div id="wrapper">
        <c:if test="${sessionScope.account==null}">
            <ul class="menu">
                <li><a href="home">Home</a></li>
                <li><a href="login.jsp">Login</a></li>
                <li><a href="#">Register</a></li>
            </ul>
        </c:if>
        <c:if test="${sessionScope.account!=null}">
            <ul class="menu">
                <li><a href="home">Home</a></li>
                <li><a href="logout">Logout</a></li>
                <li><a href="#">Profile</a></li>
                <li><a href="#">Change password</a></li>
            </ul>
            <h1>Hello ${sessionScope.account.username}</h1>
        </c:if>
        </div>
    </body>
</html>
