<%-- 
    Document   : Employee
    Created on : Sep 22, 2023, 4:49:50 PM
    Author     : 1112v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@page import="model.Employee" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1px">
                <thead>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Salary</th>
                </thead>
                <tbody>
                    <%
                    List<Employee> newlist =(List<Employee>)request.getAttribute("data");
                    for(int i=0;i<newlist.size();i++){
                    %>
                    <tr> 
                        <th><%= newlist.get(i).getID() %></th>
                        <th><%= newlist.get(i).getName() %></th>
                        <th><%= newlist.get(i).isGender() %></th>
                        <th><%= newlist.get(i).getSalary() %></th>
                    </tr>
                            <%
                            }
                            %>
                </tbody>
            </table>
    </body>
</html>
