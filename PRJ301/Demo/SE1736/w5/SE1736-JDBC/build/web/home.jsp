<%-- 
    Document   : home
    Created on : May 29, 2023, 3:58:32 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            *{
                margin: 0 auto;
                text-align: center;
            }
            table,th,tr,td{
                border: 1px solid blue;
                border-collapse: collapse;
            }
            a{
                text-decoration: none;
            }
        </style>
    </head>
    <body>
        <h1>The list of categories</h1>
        <h3><a href="authen?action=add">Addnew</a></h3>
        <table width="60%">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Describe</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${requestScope.data}" var="c">
                <c:set var="id" value="${c.id}"/>
                <tr>
                    <td>${id}</td>
                    <td>${c.name}</td>
                    <td>${c.describe}</td>
                    <td>
                        <a href="#" onclick="doDelete('${id}')">Delete</a>
                        &nbsp;&nbsp;&nbsp;
                        <a href="authen?action=update&id=${id}">Update</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <script type="text/javascript">
            function doDelete(id){
                if(confirm("ban co chac la xoa category voi id "+id+" khong?")){
                    window.location.href="authen?action=delete&id="+id;
                }
            }
        </script>
    </body>
</html>
