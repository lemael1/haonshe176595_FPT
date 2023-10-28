<%-- 
    Document   : discuss
    Created on : Oct 26, 2023, 11:07:48 PM
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

        <c:forEach items="${requestScope.Thread_list}" var="thlist" >
            <c:set var="threadId" value="${thlist.tid}"/>
            <br>
            Thread:${thlist.tcontent}<br>
            <c:forEach items="${requestScope.Comment_list}" var="cmtlist">
                <c:if test="${threadId == cmtlist.thread.tid}" >
                    ${cmtlist.account.displayname}:${cmtlist.ctitle}<br>
                </c:if>                     
            </c:forEach>  
            <form action="discuss" method="post">
                <input type="hidden" name="threadid1" value="${thlist.tid}">
                <input type="text" name="ctitle"><!-- comment -->
                <input type="submit" value="submit">
            </form>
        </c:forEach>
    </form
</body>
</html>
