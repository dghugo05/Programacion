<%-- 
    Document   : reiniciar
    Created on : Mar 31, 2025, 8:56:14 PM
    Author     : nocturno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          session.invalidate();
          out.println("<div>Borrado con exito</div>");
        %>
    </body>
    <script>window.location.href ='index.jsp'</script>
</html>
