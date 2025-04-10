<%-- 
    Document   : index
    Created on : Mar 13, 2025, 7:41:29 PM
    Author     : nocturno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="tabla.css"
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 08</title>
    </head>
    <body>
        <h1 id="titulo">Tabla de multiplicar</h1>
        <p id="introducir">Introduzca un número</p>
        <form action="multiplicar.jsp" method="post">
            <input type="text" name="multiplo">
            <br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
