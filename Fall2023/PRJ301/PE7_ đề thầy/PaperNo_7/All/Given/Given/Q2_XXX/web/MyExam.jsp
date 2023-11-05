<%-- 
    Document   : MyExam
    Created on : Nov 4, 2023, 11:44:28 PM
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
            <form method="post" action="count">
                <table>
                    <tr>
                        <td>Enter an integer n:</td>
                        <td><input type="text" name="number" value="${number}"></td>
                    </tr>
                    <tr>
                        <td>Result:</td>
                        <td><input type="text" value="${count}"></td>
                    </tr><!-- comment -->
                    <tr>
                        <td><input type="submit" value="COUNT"></td>
                        <td>${msg}</td>
                    </tr>
                </table>
            </form>
        </body>
    </html>
