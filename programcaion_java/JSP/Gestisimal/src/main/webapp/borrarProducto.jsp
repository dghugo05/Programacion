<%@page import="pool.ConnectionPool"%>
<%@page import="productos.Producto"%>
<%@page import="productos.GestorInventario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            ConnectionPool pool = new ConnectionPool("jdbc:mariadb://localhost:3306/gestisimal", "root", "");
            GestorInventario gestor = new GestorInventario(pool.getConnection());
                     
            request.setCharacterEncoding("UTF-8");            
            try{
                gestor.delete(Long.valueOf(request.getParameter("codigo")));
            }catch(Exception e){
                out.println("<div>" + e.getMessage() + "</div>");
            }finally{
                pool.closeAll();
            }                  

        %>
        <script>document.location = "index.jsp"</script> 
    </body>
</html>
