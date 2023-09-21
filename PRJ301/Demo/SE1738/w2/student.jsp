<%-- 
    Document   : student
    Created on : May 18, 2023, 4:19:43 PM
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
        <h1>A student</h1>
        <form>
            code:<input type="number" name="code"/><br/>
            Name:<input type="text" name="fName"/><br/>
            mark:<input type="text" name="mark"/><br/>
            gender:<input type="radio" checked name="gender" value="true"/>Male
            <input type="radio" name="gender" value="false"/>Female
            <br/>
            <input type="submit" value="SUBMIT"/>
        </form>
        <jsp:useBean id="s" class="model.Student"/>
        <jsp:setProperty name="s" property="*"/>
        <h3>${s.student}</h3>
        <h3>${s.author}</h3>
    </body>
</html>
