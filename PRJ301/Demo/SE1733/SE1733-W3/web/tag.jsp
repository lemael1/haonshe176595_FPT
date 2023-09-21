<%-- 
    Document   : jstl_tag
    Created on : May 22, 2023, 3:06:40 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Core tag Example</h1>
        <c:set var="name" value="To an an"/>
        <h3>hello ${name}</h3>
        <h3>
            <c:set var="s" value="0"/>
            day so:
            <c:forEach begin="1" end="10" var="i" step="2">
                ${i}&nbsp;&nbsp;
                <c:set var="s" value="${s+i}"/>
            </c:forEach>
            <br/>
            Sum:${s}
        </h3>
        <h3 style="color: chocolate">
            day ${requestScope.num} so ngau nhien co 2 chu so:
            <c:forEach items="${requestScope.arr}" var="i">
                ${i}&nbsp;&nbsp;
            </c:forEach>
        </h3>
        <c:set var="mark" value="12"/>
        <h3>
            <c:if test="${mark>=5 && mark<=10}">
                Pass
            </c:if>
            <c:if test="${mark<5 && mark>=0}">
                Fail
            </c:if>    
            <br/>
            <c:choose>
                <c:when test="${mark>=0 && mark<5}">
                    Weak
                </c:when>
                <c:when test="${mark>=5 && mark<6.5}">
                    Average
                </c:when>
                <c:when test="${mark>=6.5 && mark<8}">
                    well
                </c:when>
                <c:when test="${mark>=8 && mark<=10}">
                    excellent!!!
                </c:when>
                <c:otherwise>
                    mark only from 0 to 10
                </c:otherwise>    
            </c:choose>     
        </h3>
        <table border="1px" width="40%">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
            </tr>
            <c:forEach items="${requestScope.data}" var="s">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.name}</td>
                    <td><img src="${s.gender?'images/male-icon.png':
                                    'images/female-icon.png'}"/></td>
                </tr>
            </c:forEach>
        </table>
        <h3>
            ${Math.PI}<br/>
            <fmt:formatNumber pattern="##.##" value="${Math.PI}"/>
            <br/>
            <%= new Date()%><br/>
            <c:set var="d" value="<%= (new Date())%>"/>
            today:<fmt:formatDate pattern="dd/MM/yyyy" value="${d}"/>
        </h3>
    </body>
</html>
