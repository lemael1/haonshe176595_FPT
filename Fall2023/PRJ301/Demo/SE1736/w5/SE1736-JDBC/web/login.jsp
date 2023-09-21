<%-- 
    Document   : login
    Created on : Jun 7, 2023, 1:26:52 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login form</h1>
        <h3 style="color: red">${requestScope.error}</h3>
        <form action="login" method="post">
            Username: <input type="text" name="user"/><br/>
            Password: <input type="password" name="pass"/><br/>
            <input type="submit" value="LOGIN"/>
        </form>
    </body>
</html>
