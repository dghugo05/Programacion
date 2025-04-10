<%-- 
    Document   : multiplicar
    Created on : Mar 13, 2025, 8:10:01 PM
    Author     : nocturno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="multiplicar.css"/>
        <script src="multiplicar.js" defer></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 08</title>
    </head>
    <body>
        <table>
            <tr>
                <th>Multiplo</th>
                <th>Multplicador</th>
                <th>Resultado</th>
            </tr>
            <% 
                int multiplo = Integer.valueOf(request.getParameter("multiplo"));
                for(int multiplicador = 0; multiplicador < 11; multiplicador++){
                    out.println("<tr>");
                    out.println("<td>" + multiplo + "</td>");
                    out.println("<td>" + multiplicador + "</td>");
                    out.println("<td>" + (multiplo*multiplicador) + "</td>");
                    out.println("</tr>");
                }%>
        </table>
        <input id="volver" type="button" name="Volver" value="Volver">
    </body>
</html>
