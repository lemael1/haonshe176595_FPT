<%-- 
    Document   : list
    Created on : Oct 6, 2023, 4:10:39 PM
    Author     : 1112v
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
    <center>
        <a href="add.jsp"> Create</a><br>
        <form action="list" >
        Sort<select name="choice" >
            <option value="gender">Gender</option>
            <option value="major">Major</option>
            <option></option>
            
            
        </select>
                    <input type="submit" >

        </form>
        <table border="1px">
            <tr>
                <th>RollCode</th>
                <th>FullName</th>
                <th>DoB</th>
                <th>Gender</th>
                <th>Major</th>  
                <th>Detail</th>
            </tr>
            <c:forEach items="${requestScope.data}" var="s">
                <tr>
                    <td>${s.rollCode}</td>
                    <td>${s.fullName}</td><!-- comment -->
                    <td>${s.doB}</td><!-- comment -->
                    <td>${s.gender}</td><!-- comment -->
                    <td>${s.major.major}</td>
                    <td><a href="detail.jsp?rollCode=${s.rollCode}">Detail</a></td>
                </tr>

            </c:forEach>


        </table>
    </center>

</body>
</html>
