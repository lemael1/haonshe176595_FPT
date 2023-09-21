<%-- 
    Document   : new
    Created on : May 23, 2023, 2:22:24 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EL Example</h1>
        <form method="post">
            enter number 1:<input type="text" name="num1" value="${param.num1}" /><br/>
            enter number 2:<input type="text" name="num2" value="${param.num2}" /><br/>
            enter number 3:<input type="text" name="num3" value="${param.num3}"/><br/>
            Gender:<input type="radio" checked name="gender" value="1"/>Male
            <input type="radio" name="gender" value="0"/>Female<br/>
            Color:
            <input type="checkbox" name="color" value="red"/>RED
            <input type="checkbox" name="color" value="blue"/>BLUE
            <input type="checkbox" name="color" value="chocolate"/>CHOCOLATE<br/>
            <input type="submit" value="Calculator"/>
        </form>
        <h3>Sum: ${param.num1+param.num2+param.num3}</h3>
        <img src="${(param.gender eq '1'?'images/male-icon.png':'images/female-icon.png')}"/>
        <h3>Color: ${paramValues.color==null?'':Arrays.toString(paramValues.color)}</h3>
        <c:set var="n1" value="${param.num1}"/>
        <c:set var="c" value="to an an"/>
        <h2>Name:${c} and num 1:${n1}</h2>
        <c:if test="${param.gender eq '1'}">
            <img src="images/male-icon.png" />
        </c:if>
        <c:if test="${!(param.gender eq '1')}">
            <img src="images/female-icon.png" />
        </c:if>   
        <c:set var="mark" value="4"/>
        <h3>
            <c:if test="${mark>=5}">
                Pass
            </c:if>
            <c:if test="${mark<5}">
                Fail
            </c:if>     
        </h3>
        <h3 style="color: chocolate">
            <c:choose>  
                <c:when test="${mark<5 && mark>=0}">  
                    weak  
                </c:when>  
                <c:when test="${(mark>=5)&&(mark<6.5)}">  
                    average
                </c:when>
                <c:when test="${mark>=6.5 && mark<8}">  
                    well
                </c:when>  
                <c:when test="${mark>=8 && mark<=10}">  
                    excellent!!
                </c:when>  
                <c:otherwise>  
                    ngu si
                    
                </c:otherwise>  
            </c:choose>
        </h3>
        <h3 style="color: blue">
            <c:forEach begin="${1}" end="${10}" var="i" step="2">
                ${i}&nbsp;&nbsp;&nbsp;
            </c:forEach>

        </h3>
    </body>
</html>
