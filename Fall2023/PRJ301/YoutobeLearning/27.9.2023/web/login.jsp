<%-- 
    Document   : login
    Created on : Sep 27, 2023, 10:33:48 AM
    Author     : 1112v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% if(request.getAttribute("error")!= null){ 
        String error=(String)request.getAttribute("error");       
        %>
        <h1 style="color:red"> <%= error %></h1>
        <% }%>


        <form action="login" method="post">
            Enter username <input type="text" name="user"><br>
            Enter password <input type="password" name="pass"><br>
            <input type="submit" value="submit">


        </form>
    </body>
</html>
