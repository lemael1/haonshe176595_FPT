<%-- 
    Document   : register
    Created on : Oct 30, 2023, 7:00:55 PM
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
        <form action="register" method="post">
        Student Code: <input type="text" name="studentcode"><!-- comment --><br>
        Student Name: <input type="text" name="studentname"><br>
        Dob : <input type="date" name="dob"><!-- comment --><br>
        <input type="submit" value="Send">
        </form>
    </body>
</html>
