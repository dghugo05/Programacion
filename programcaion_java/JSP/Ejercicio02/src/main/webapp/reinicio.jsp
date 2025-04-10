<%-- 
    Document   : reinicio.jsp
    Created on : Apr 7, 2025, 7:08:59 PM
    Author     : nocturno
--%>
<%@page import="javax.xml.bind.DatatypeConverter" %>
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
        %>
    </body>
    <script>document.location = "index.jsp";</script> 
</html>
