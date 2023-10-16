<%-- 
    Document   : detail
    Created on : Oct 11, 2023, 1:17:23 PM
    Author     : 1112v
--%>
<%@page import="model.Student"%>
<%@page import="dal.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
    String rollCodeStr = request.getParameter("rollCode");
    int rollCode = Integer.parseInt(rollCodeStr);
    DAO d = new DAO();
    Student student = d.getStudent(rollCode);
    request.setAttribute("student", student);
%>
<h1>Student Detail</h1>

<p>Roll Code: ${student.rollCode}</p>
<p>Full Name: ${student.fullName}</p>
<p>Date of Birth: ${student.doB}</p>
<p>Gender: ${student.gender}</p>
<p>Major: ${student.major.major}</p>
    </body>
</html>
