<%-- 
    Document   : form
    Created on : Sep 15, 2023, 3:50:52 PM
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
        <form action="form" method="post" >
            Nam Sinh <input type="text" name="namsinh"><!-- comment -->
            <input type="submit" name="submit">
        </form>
        <% 
            String namsinh=(String)request.getAttribute("data");                           
        %>
        <h1 style="color:red">
            Toi sinh nam <%= namsinh %>
        </h1>
    </body>
</html>
