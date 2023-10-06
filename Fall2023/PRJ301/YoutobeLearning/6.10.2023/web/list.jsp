<%-- 
    Document   : list
    Created on : Oct 6, 2023, 2:53:12 PM
    Author     : 1112v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #wrapper{
                font-family: arial;
                margin-left: 30px;
                width: 90%;
            }
            .clr{
                clear:both;
            }
            /* phan menu */
            #menu_tab{
                width: 100%;
            }
            ul.menu{
                float:left;
                background: url(images/background_menu.jpg)repeat-x;
                display: block;
                list-style-type: none;
                font-weight:bold;
                height: 55px;
                padding: 12px;
                width: 100%;               
            }
            ul.menu li{
                display:inline;
                font-size:14px;
                padding-top:15px;
                text-align: center;
                line-height: 30px;
                color:#E2D9BC;
            }
            ul.menu li a{
                margin: 10px;
                padding-left:0px;
                text-decoration: none;
                text-align: center;
                color:#E2D9BC;
                position: relative;              
            }
            ul.menu li a img{
                float:left;
                margin-left: 10px;
            }
            ul.menu li a:hover{
                color:#F90;
            }
            ul.menu li a:active{
                color:#FF0
            }
            ul.menu li a:focus{
                color:#96F;
            }
            #content{
                margin-left: 20px;
            }
            table{
                border-collapse: collapse;
            }
            td{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
