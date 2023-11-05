<%-- 
    Document   : show
    Created on : Nov 3, 2023, 2:24:28 PM
    Author     : duongpv
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        List of subjects: <select name="subject" onchange="doFilter()" id="subjectid">
            <option value="0">All subjects</option>
            <c:forEach items="${lst_sbjs}" var="s">
                <option value="${s.id}" ${s.id == id_subject ? "selected": ""}>${s.name}</option>
            </c:forEach>
            
        </select>
        
        <table border="2">
            <thead>
                <th>Code</th>
                <th>Name</th><!-- comment -->
                <th>Date of Birth</th>
                <th>Gender</th><!-- comment -->
                <th>Suject</th>
                <th></th>
            </thead>
            <tbody>
                <c:forEach items="${lst_stds}" var="su">
                    <tr>
                        <td>${su.code}</td>
                        <td>${su.name}</td><!-- comment -->
                        <td>${su.dob}</td><!-- comment -->
                        <td>${su.gender? "Male": "Female"}</td><!-- comment -->
                        <td>${su.subject}</td>
                        
                        <td><a href="show?id_student=${su.code}&id_subject_dt=${id_subject}">Select</td>
                    </tr>
                    
                </c:forEach>
            </tbody>
            
        </table>
        <%
            if(request.getAttribute("detail_std") != null){
            
        %>
        
            Detail Infomation:
            </br>
            Code: <input type="text" value="${detail_std.code}">
            Name: <input type="text" value="${detail_std.name}"><!-- comment --></br><!-- comment -->
            Date of birth <input type="text" value="${detail_std.dob}"><!-- comment -->
            Gender: <input type="radio" ${detail_std.gender == true? "checked": ""}> Male
            <input type="radio" ${detail_std.gender == false? "checked": ""}> Female
            </br><!-- comment -->
            Subject: <input type="text" value="${detail_std.subject}">
                
        
        
        <%
            }
            %>
    <script type="text/javascript">
        function doFilter() {
            var e = document.getElementById("subjectid");
            var option = e.value;
            window.location = "show?id_sbj=" + option;
        }
    </script>
    </body>
</html>
