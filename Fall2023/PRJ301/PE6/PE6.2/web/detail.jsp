<%-- 
    Document   : detail
    Created on : Oct 28, 2023, 12:36:14 PM
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
        <c:set var="i" value="${requestScope.i}"></c:set>
        <table border="1px">
            <tr>
                <th>Name</th>
                <th>Gender</th>
                <th>Dob</th>
                <th>GroupName</th>
                <th>User Create</th>
            </tr>
            <tr>
                <td>${i.name}</td>
                <td>${i.gender}</td>
                <td>${i.dob}</td>
                <td>${i.groupname}</td>
                <td>${i.created_by}</td>
            </tr>
        </table>
    </body>
</html>
