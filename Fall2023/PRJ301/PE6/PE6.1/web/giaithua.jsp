<%-- 
    Document   : giaithua
    Created on : Oct 27, 2023, 3:42:10 PM
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
        <h1>Q1</h1>
        <form action="giaithua" method="post">
            Number:<input type="text" name="number"><!-- comment -->
            <br><!-- comment -->
            <input type="submit" value="Calculate">
        </form>
        
        <c:set var="number" value="${requestScope.number}"></c:set>
        <c:set var="result" value="${requestScope.result}"></c:set>
        <br><!-- comment -->
        <h1>
            ${number}!=${result}
        </h1>
        
        
    </body>
</html>
