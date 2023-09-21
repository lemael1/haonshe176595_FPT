<%-- 
    Document   : wall
    Created on : Mar 27, 2021, 8:25:40 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <c:forEach items="${requestScope.posts}" var="post">
        +${post.content}<br>
        <c:forEach items="${post.comments}" var="comment">
            -${comment.content}<br>
        </c:forEach>
        <form action="wall" method="post"/>
            new comment for post ${post.id}
            <input type="text" name="ccontent"/>
            <input type="hidden" name="pid" value="${post.id}"/>
            <input type="submit" value="Submit"/>
        </form>

    </c:forEach>
</body>
</html>
