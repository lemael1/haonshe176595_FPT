<%-- 
    Document   : dientich
    Created on : Sep 15, 2023, 4:25:16 PM
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
        <form action="dientich" method="post" >
            Ban kinh hinh tron <input type="text" name="bankinh"><!-- comment -->
            <input type="submit" value="Tinh Dien tich">
        </form>
          <% 
             String S=(String)request.getAttribute("data");
             if(S!=null){
          %>
          
            <h2 style="color:red">
                <%= S %>
            </h2>
          <%}%>
    </body>
</html>
