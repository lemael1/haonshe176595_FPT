<%-- 
    Document   : update
    Created on : Oct 5, 2023, 4:21:28 PM
    Author     : 1112v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Update a category</h1>
        <c:set var="c" value="${requestScope.category}"/>
        <form action="update" method="post">
            Input ID <input type="number" readonly name="id" value="${c.id}" ><br>
            Input name <input type="text" name="name" value="${c.name}"><br>
            Input describe <input type="text" name="describe" value="${c.describe}"><br>
            <input type="submit" value="Update">

        </form>
    </body>
</html>
