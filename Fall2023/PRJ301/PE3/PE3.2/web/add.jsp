<%-- 
    Document   : add
    Created on : Oct 25, 2023, 11:24:18 AM
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
        <form method="post" action="add">
            <table>
                <tr>
                    <td>Paper ID</td>
                    <td><input type="text" name="paperid"></td>
                </tr>
                <tr>
                    <td>Title</td>
                    <td><input type="text" name="title"></td>
                </tr>
                <tr>
                    <td>Paper ID</td>
                    <td><input type="date" name="date">(yyyy-MM-dd)</td>
                    
                </tr>    
                <c:forEach items="${requestScope.author_list}" var="al">
                    <tr>
                        <td> </td>
                        <td><input type="checkbox" name="auid" value="${al.authorid}">${al.authorname}</td>
                    </tr>
                </c:forEach>
                <br><!-- comment -->
                

            </table>
                    <input type="submit" value="submit">
        </form>
    </body>
</html>
