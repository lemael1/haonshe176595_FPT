<%-- 
    Document   : cal
    Created on : May 22, 2023, 2:26:24 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EL example</h1>
        <form method="post">
            enter number 1:<input type="text" name="num1" value="${param.num1}"/><br/>
            enter number 2:<input type="text" name="num2" value="${param.num2}"/><br/>
            enter number 3:<input type="text" name="num3" value="${param.num3}"/><br/>
            Gender:
            <input type="radio" checked name="gender" value="1"/>Male
            <input type="radio" name="gender" value="0"/>Female<br/>
            Color:
            <input type="checkbox" name="color" value="red"/>RED
            <input type="checkbox" name="color" value="blue"/>Blue
            <input type="checkbox" name="color" value="yellow"/>Yellow<br/>
            <input type="submit" value="CALCULATOR"/>
        </form>
        <h3>Sum:${param.num1+param.num2+param.num3}</h3>
        <img src="${(param.gender eq '1'?'images/male-icon.png':'images/female-icon.png')}"/>
        <h3>Color:${(paramValues.color)==null?'':Arrays.toString(paramValues.color)}</h3>
    </body>
</html>
