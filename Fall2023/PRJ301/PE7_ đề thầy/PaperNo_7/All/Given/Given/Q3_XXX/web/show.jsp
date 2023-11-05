<%-- 
    Document   : show
    Created on : Nov 5, 2023, 10:53:21 AM
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
        List of Subject:
        <select name="subject" onchange="doFilter()" id="subjectid">
            <option value="0">All Subject</option>
            <c:forEach items="${requestScope.list_subjects}" var="ls">
                <option value="${ls.subjectid}">${ls.subjectname}</option>
            </c:forEach>
        </select>
        <table border="1">
     
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>DoB</th>
                    <th>Gender</th>
                    <th>Subject</th>
                    <th>Select</th>
                </tr>
          
                <c:forEach items="${requestScope.list_info}" var="li">
                <tr>
                    <td>${li.studentid}</td>
                    <td>${li.studentname}</td>
                    <td>${li.birthdate}</td>
                    <td>${li.gender}</td>
                    <td>${li.subjectname}</td>
                    <td><a href="#">select</a></td>
                </tr>
                </c:forEach>
          
        </table>

        
        <script type="text/javascript">
        function doFilter() {
            var e = document.getElementById("subjectid");
            var option = e.value;
            window.location = "show?id_sbj=" + option;
        }
    </script>
    </body>
</html>
    