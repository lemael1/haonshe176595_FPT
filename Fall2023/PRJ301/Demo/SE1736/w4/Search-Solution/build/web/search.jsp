
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            input,select{
                font-size: 24px;
                font-weight: bold;
                color: blue;
            }
        </style>   
    </head>
    <body>
        <h2>
        <form action="search">
            ID: <input type="text" name="id" value=""/> <br/>
            Name: <input type="text" name="name" value=""/> <br/>
            Gender 
            <input type="radio"  name="gender" value="male"/> Male 
            <input type="radio"  name="gender" value="female"/> Female 
            <input type="radio" checked name="gender" value="both"/> Both 
            <br/>
            Department: 
            <select name="did"> 
                <option value="0">-----ALL--------</option>
                <c:forEach items="${requestScope.depts}" var="d">
                <option  value="${d.id}">${d.name}</option>
                </c:forEach>    
            </select>
            <br/>
            Dob From <input type="date" name="from" value=""/> <br/>
            Dob To <input type="date" name="to" value=""/> <br/>
            <input type="submit" value="Search"/>
         </form>    
        <table border="1px" width="50%">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Dob</th>
                <th>Department</th>
            </tr>
            <c:forEach items="${emps}" var="e">
            <tr>
                <td>${e.id}</td>
                <td>${e.name}</td>
                <td>${e.gender?"Male":"Female"}</td>
                <td>${e.dob}</td>
                <td>${e.dept.name}</td>
            </tr>
            </c:forEach>
        </table>    
        </h2>
    </body>
</html>
