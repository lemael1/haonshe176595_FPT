<%-- 
    Document   : add
    Created on : Oct 11, 2023, 1:34:26 PM
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
        <form action="add">
            RollCode <input type="text" name="rollCode"><br>
            FullName <input type="text" name="fullName"><br>
            Dob<input type="date" name="dob" ><br>
            Gender<input type="radio" name="gen" value="0">Nam
            <input type="radio" name="gen" value="1">Nu 
            <br>
            Major<select name="major">
                <option value="SE">SE</option>
                <option value="IS">IS</option>
                <option value="AI">AI</option>
            </select>
            <br>
            <input type="submit" value="create">
        </form>
    </body>
</html>
