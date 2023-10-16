<%-- 
    Document   : list
    Created on : Oct 6, 2023, 4:10:39 PM
    Author     : 1112v
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="model.Major" %>
<%@page import="model.Student" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
    <center>
        <table border="1px">
            <tr>
                <th>RollCode</th>
                <th>FullName</th>
                <th>DoB</th>
                <th>Gender</th>
                <th>Major</th>              
            </tr>
            <%
    List<Major> l = (List<Major>) request.getAttribute("data");
     for(int i=0;i<l.size();i++){    
        %>
        <tr>
            <td><%= l.get(i).getStudent().getRollCode() %></td>
            <<td><%= l.get(i).getStudent().getFullName() %></td><!-- comment -->
            <td><%= l.get(i).getStudent().getDoB() %></td><!-- comment -->
            <td><%= l.get(i).getStudent().getGender() %></td><!-- comment -->
            <td><%= l.get(i).getMajor() %></td><!-- comment -->
            
        </tr>
        
        <%}%>
        </table>
    </center>

</body>
</html>
