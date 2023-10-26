<%-- 
    Document   : search
    Created on : Oct 25, 2023, 2:07:15 PM
    Author     : 1112v
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <forM action="search" method="post">
            Name <input type="text" name="char"><!-- comment -->
            <input type="submit" value="Search">
        </form>
        <table border="1px">
            <tr>
                <th>sid</th>
                <th>name</th><!-- comment -->
                <th>gender</th><!-- comment -->
                <th>dob</th>
            </tr>
            <c:forEach items="${requestScope.studentlist}" var="s">
                <tr>
                    <td>${s.sid}</td>
                    <td>${s.name}</td><!-- comment -->
                    <td>${s.gender}</td><!-- comment -->
                    <td>${s.dob}</td><!-- comment -->
                </tr>
            </c:forEach>
        </table>
    </body>

</html>
