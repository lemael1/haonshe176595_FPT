<%-- 
    Document   : list
    Created on : Oct 27, 2023, 4:07:51 PM
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
        <form action="list" method="post">
            <input type="radio" name="list" value="Candidate"><!-- comment -->
            Candidate
            <input type="radio" name="list" value="Member">
            Member
            <input type="submit" value="Search">
        </form>
        <c:set var="choice_raw" value="${requestScope.choice_raw}"></c:set>
        <c:if test="${choice_raw!=null}">
            <table border="1px">
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>gender</th>
                    <th>dob</th><!-- <th>id</th> -->
                    <th>Group</th>
                </tr>
                <c:forEach items="${requestScope.list}" var="l">
                    <tr>
                        <td>${l.id}</td>
                        <td><a><a href="detail?id=${l.id}&choice=${choice_raw}">${l.name}</a></td>
                        <td>${l.gender}</td><!-- comment -->
                        <td>${l.dob}</td>
                        <td>${l.groupname}</td>                                                         
                    </tr>
                </c:forEach>
            </table>
        </c:if>

    </body>
</html>
