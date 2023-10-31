<%-- 
    Document   : insert
    Created on : Oct 30, 2023, 11:16:24 PM
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
        <c:set var="u" value="${requestScope.user}"></c:set>
        Session of: ${u.displayname}
        <br><!-- comment -->
        <form action="insert" method="post">
        Name : <input type="text" name="name"><br>
        Gender: 
        <input type="radio" name="gender" value="1"> Male
        <input type="radio" name="gender" value="0"><!-- comment -->FeMale
        <br>
        DOb: <input type="date" name="date"><!-- comment -->
        <br><!-- comment -->
        Group:
        <select name="group">
        <c:forEach items="${requestScope.list_group}" var="lg">
            <option value="${lg.gid}">${lg.gname}</option>
        </c:forEach>
        </select>
        <br><!-- comment -->
        <input type="hidden" name="by" value="${u.displayname}">
        <input type="submit" value="Save"><!-- comment -->
        </form>
    </body>
</html>
