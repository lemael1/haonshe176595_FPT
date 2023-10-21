<%-- 
    Document   : info
    Created on : Oct 20, 2023, 4:37:07 PM
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
    <%
        String StudentID=(String)request.getAttribute("studentID");
        String paperCode=(String)request.getAttribute("paperCode");
    %>
    <body>
        <table border="1px">
            <tr>
                <th>Student ID</th>
                <th><%= StudentID %></th>
            </tr>
            <tr>
                <th>Paper Code</th>
                <th>
                    <%= paperCode %>
                </th>
            </tr>
        </table>


    </body>
</html>
