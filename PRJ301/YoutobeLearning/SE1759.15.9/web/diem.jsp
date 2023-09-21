<%-- 
    Document   : diem
    Created on : Sep 15, 2023, 5:13:51 PM
    Author     : 1112v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="diem" method="post">
            Toan <input type="text" name="Toan"/><br>
            Ly <input type="text" name="Ly"/><br><!-- Toan <input type="text" name="toan"/><br> -->
            Hoa <input type="text" name="Hoa"/><br><!-- comment -->
            Van <input type="text" name="Van"/><br><!-- comment -->
            Anh <input type="text" name="Anh"/><br>
            Truong Dai Hoc<select name="truong">
                <option value="FPT">FPT</option>
                <option value="HUST">HUST</option>
                <option value="UET">UET</option>
            </select>
            <br><!-- comment -->
            Khối <input type="checkbox" name="khoi" value="0"/>A
            <input type="checkbox" name="khoi" value="1"/>A1
            <input type="checkbox" name="khoi" value="2"/>D
            <br><!-- comment -->
            Điểm UT 
            <br><input type="radio" name="d" value="a"/>KV1(0)<br><!-- comment -->
            <input type="radio" name="d" value="b"/>KV2(0,5)<br>
            <input type="radio" name="d" value="c"/>KV3(1)<br>
            <input type="submit" value="tinh toan">



        </form>
        <% 
        String[]S=(String[])request.getAttribute("data1");
        if(S!=null){
        for(int i=0;i<S.length;i++){
        %>
        <h2><%= S[i] %></h2>
       <%}}%>
       <br>
       <% String m=(String)request.getAttribute("data2");
       if(m!=null){
       %>
       
       <h2> <%= m %>
           <% }%>
    </body>
</html>
