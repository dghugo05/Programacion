<%-- 
    Document   : index.jsp
    Created on : Mar 31, 2025, 9:04:30 PM
    Author     : nocturno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           ArrayList<Integer> numeros = (ArrayList<Integer>) session.getAttribute("numeros");
           if(numeros == null){
                numeros = new ArrayList<>();
                session.setAttribute("numeros", numeros);
            }else{
                if(Integer.valueOf(request.getParameter("numero")) >= 0){
                    numeros.add(Integer.valueOf(request.getParameter("numero")));
                }else{
                    int suma = 0;
                    for(int numero: numeros){
                        suma += numero;
                    }
                    out.println("<div>La media de los numeros introducidos es: " + (double)suma/numeros.size() + "</div>");
                }
            }
        %>
        <form method="post" action="index.jsp">
            <input type="text" placeholder="Introduzca un número" name="numero"></input>
            <button type="submit">Enviar</button>
        </form>
        <form method="post" action="reinicio.jsp">
            <button type="submit">Reiniciar</button>
        </form>
    </body>
</html>
