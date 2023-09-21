<%-- 
    Document   : home
    Created on : Sep 14, 2023, 10:43:22 PM
    Author     : 1112v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.DecimalFormat" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>The first example</h1>
        <h2 style="color:blue">
            <% 
               String name="Nguyen Sy Hao";                                  
               out.println("Hello "+name);                      
               double r=2;
              DecimalFormat f= new DecimalFormat("##.##");
            %>            
        </h2>
        <h2>
            Dien Tich la <%= f.format(Math.PI*r*r) %>
        </h2>
    </body>
</html>
