

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Insert into 2 tables and many rows demo</h1>
        <form action="add" method="post">
            Id <input type="number" name="id"/><br/>
            Name <input type="text" name="name"/><br/>
            <c:forEach items="${requestScope.skills}" var="s">
                <input type="checkbox" name="sks" value="${s.id}"/>${s.name}<br/>
            </c:forEach>
                <input type="submit" value="SAVE"/>
        </form>
    </body>
</html>
