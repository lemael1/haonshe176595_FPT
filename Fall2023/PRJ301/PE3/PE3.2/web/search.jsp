<%-- 
    Document   : search
    Created on : Oct 20, 2023, 4:59:38 PM
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
        <h1>Search</h1>
        <form action="search">
            Authors:<select name="authorid">
                <c:forEach items="${requestScope.list_author}" var="la" >
                    <option value="${la.authorid}">
                        ${la.authorname}
                    </option>
                </c:forEach>
            </select>
            <input type="submit" value="submit">
        </form>
        <c:set var="authorid" value="${requestScope.authorid}"/>
   <% if(request.getAttribute("authorid") != null){ %>
        <table border="1px">
            <tr>
                <th>Paper ID</th>
                <th> Title</th>
                <th>Published Date</th>
            </tr>
            <c:forEach items="${requestScope.papers}" var="p" >
                <tr>
                    <td>${p.paperid}</td>
                    <td>${p.title}</td><!-- comment -->
                    <td>${p.publishedDate}</td>
                </tr>
            </c:forEach>
        </table>
        <%}%>
    </body>
</html>
