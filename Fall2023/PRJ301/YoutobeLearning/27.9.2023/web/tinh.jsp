<%-- 
    Document   : tinh
    Created on : Sep 29, 2023, 9:25:21 AM
    Autdor     : 1112v
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            *{
                margin:auto;
            }
            .label,input,select,option{
                font-size: 30px;
                color: blue;
            }
            .nen{
                width: 40%;
                height: auto;
                background: bisque;
            }

        </style>
    </head>
    <body>
        <div class="nen">
            <h1>A Simple Calculate</h1>
            <hr><!-- comment -->
            <form>

                <table>

                    <tr>
                        <td class="label">Enter Operand1 </td> 
                        <td><input type="text" name="1stNum"></td>
                    </tr>
                    <tr>
                        <td class="label">Enter Operand2 :</td> 
                        <td>
                            <input type="text" name="2ndNum">
                        </td>

                    </tr>
                    <tr>
                        <td class="label">Select Operation: </td> 
                        <td>
                            <select>
                                <option value="+">+</option>
                                <option value="-">-</option>
                                <option value="x">x</option>
                                <option value=":">:</option>
                            </select>
                        </td>

                    </tr>
                    <tr>
                        <td>                                                  
                        </td>
                        <td><input type="submit" value="Calculate"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
