<%-- 
    Document   : list
    Created on : Sep 22, 2023, 4:06:34 PM
    Author     : 1112v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@page import="model.Student" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="list" >
            <table border="1px">
                <thead>
                <th>ID</th>
                <th>Name</th>
                <th>Dob</th>
                <th>Gender</th>
                </thead>
                <tbody>
                    <%
                    List<Student> newlist =(List<Student>)request.getAttribute("data");
                    for(int i=0;i<newlist.size();i++){
                    %>
                    <tr> 
                        <th><%= newlist.get(i).getID() %></th>
                        <th><%= newlist.get(i).getName() %></th>
                        <th><%= newlist.get(i).getDob() %></th>
                        <th><%= newlist.get(i).getGender() %></th>
                    </tr>
                            <%
                            }
                            %>
                </tbody>
            </table>

        </form>
    </body>
</html>
