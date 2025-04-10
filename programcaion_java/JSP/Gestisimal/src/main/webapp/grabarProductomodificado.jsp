<%@page import="pool.ConnectionPool"%>
<%@page import="productos.Producto"%>
<%@page import="productos.GestorInventario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!-- Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

        <title>Gestisimal</title>
    </head>
    <body>
        <%  
            ConnectionPool pool = new ConnectionPool("jdbc:mariadb://localhost:3306/gestisimal", "root", "");
            GestorInventario gestor = new GestorInventario(pool.getConnection());
            
            request.setCharacterEncoding("UTF-8");
            try{
                Producto producto = new Producto(Long.valueOf(request.getParameter("codigo")), request.getParameter("descripcion"),
                Double.valueOf(request.getParameter("precioCompra")), Double.valueOf(request.getParameter("precioVenta")),
                Integer.valueOf(request.getParameter("stock")));
                gestor.update(producto);
            }catch(Exception e){
                out.println("<div>" + e.getMessage() + "</div>");
            }finally{
                pool.closeAll();
            }
        %>
        <br>
        <a href="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span> Página principal</button>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>
</html>
