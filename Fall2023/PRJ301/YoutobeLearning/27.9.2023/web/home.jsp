<%-- 
    Document   : home
    Created on : Sep 27, 2023, 9:46:35 AM
    Author     : 1112v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <<link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <div id="menu_tab"></div>
        <%@include file="menu.jsp" %>
        <div class="clr"></div>
        <div>
        </div>
        <div class="girl">
            <%@include file="girl.jsp" %>
            
        </div>
        
        <div class="clr"></div>
        <div class="footer">
            <%@include file="footer.jsp" %>
        </div>

    </body>
</html>
