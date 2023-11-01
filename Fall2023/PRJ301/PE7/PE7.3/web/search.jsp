<%-- 
    Document   : search
    Created on : Nov 1, 2023, 11:35:36 AM
    Author     : 1112v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
-<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="search" method="post">
            Group:
            <select name="groupid">
                <option value="0">ALL</option>
                <c:forEach items="${requestScope.list_group}" var="lg">
                    <option ${groupid == lg.gid ? "selected" : ""} value="${lg.gid}" >${lg.gname}</option>
                </c:forEach>
            </select>
            <br><!-- comment -->
            <input type="submit" value="Search">
        </form>

        <c:if test="${not empty requestScope.list_member}">
            <table border="1px">
                <tr>
                    <th>Mid</th>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>DoB</th>
                    <th>Gid</th>
                    <th>Created_by</th>
                </tr>
                <c:forEach items="${requestScope.list_member}" var="lm">
                    <tr>
                        <td>${lm.mid}</td>
                        <td>${lm.mname}</td>
                        <td>${lm.gender ? 'Nam' : 'Nữ'}</td>
                        <td>${lm.dob}</td>
                        <td>${lm.gid}</td>
                        <td>${lm.created_by}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>

    </body>
</html>
