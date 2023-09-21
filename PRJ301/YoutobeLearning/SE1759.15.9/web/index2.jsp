<%-- 
    Document   : index2
    Created on : Sep 15, 2023, 3:40:24 PM
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
        <h1>Hello World!</h1>
        <h2 style="color:red">
            <% 
               String hoten ="Nguyen Sy Hao";
               out.println(hoten);       
            %>
        </h2>
        <h1 style="color:chocolate">
            Ten toi la   <%= hoten %>            
        </h1>
    </body>
</html>
