<%-- 
    Document   : thongbao
    Created on : Oct 26, 2023, 9:33:57 PM
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
        <c:set var="thongbao" value="${requestScope.result}"/>
        <h3>
            ${thongbao}
        </h3>
    </body>
</html>
