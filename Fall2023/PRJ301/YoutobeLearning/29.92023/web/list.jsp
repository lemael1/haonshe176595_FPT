<%-- 
    Document   : list
    Created on : Oct 4, 2023, 10:49:46 AM
    Author     : 1112v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function doDelete(id){
                if(confirm("are U sure to delete category with id ="+id)){
                    window.location="delete?id="+id;
                }
            }
        </script>
    </head>
    <body>
    <center>
        <h1> List of Categories</h1>
        <h3><a href="add.jsp">Add new</a></h3>
        <table border="1px" width="40%">
            <tr>
                <th>ID</th>
                <th>Name</th><!-- <th></th> -->
                <th>Describe</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${requestScope.data}" var="c" >
                <c:set var="id" value="${c.id}"/>
                <tr>
                    <td>${id}</td>
                    <td>${c.name}</td>
                    <td>${c.describe}</td>
                    <td>
                        <a href="update?id=${id}">Update</a>&nbsp;&nbsp;&nbsp;
                        <a href="#" onclick="doDelete('${id}')">Delete</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </center>
</body>
</html>
