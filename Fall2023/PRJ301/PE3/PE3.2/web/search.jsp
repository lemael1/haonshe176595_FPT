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
        <form action="seach">
            Authors:<select name="authorname">
                <c:forEach items="${requestScope.list_author}" var="la" >
                    <option>
                        ${la.}
                    </option>
                </c:forEach>
            </select>
            <input type="submit" value="submit">
        </form>
        
    </body>
</html>
