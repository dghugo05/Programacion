<%@page import="pool.ConnectionPool"%>
<%@page import="productos.Producto"%>
<%@page import="productos.GestorInventario"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./mio.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <title>Gestisimal</title>
    </head>
    <body>
        <div class="container">
            <br><br>
            <div class="panel panel-primary">
                <div class="panel-heading text-center"><h2>Gestisimal</h2></div>
                <div id="extra">
                    <%
                        String filtros = request.getParameter("filtros");
                        String valor = request.getParameter("busqueda");
                    %>
                    <form method="get" action="index.jsp">
                        <select id = "filtros" name = "filtros">
                            <option value="codigo">Codigo</option>
                            <option value="descripcion">Descripcion</option>
                            <option value="precioCompra">Precio de Compra</option>
                            <option value="precioVenta">Precio de Venta</option>
                            <option value="stock">Stock</option>
                        </select>
                        <input id="barra" type="text" name="busqueda" size="40">
                        <button id="busqueda" type="submit" value="buscar" class="btn btn-primary"><span class="glyphicon glyphicon-search"></span> Buscar</button>
                    </form>
                </div>
                    <%  
                        ConnectionPool pool = new ConnectionPool("jdbc:mariadb://localhost:3306/gestisimal", "root", "");
                        GestorInventario gestor = new GestorInventario(pool.getConnection());
                        ArrayList<Producto> productos = null;
                        try{
                            productos = gestor.requestAll(filtros, valor);
                            if(productos.isEmpty()){
                                out.println("<div>Error No hay productos</div>");
                            }else{
                    %>
                    <table class="table table-striped">
                        <tr><th>Código</th><th>Descripción</th><th>Precio de Compra</th><th>Precio de Venta</th><th>Stock</th><th></th><th></th></tr>
                        <form method="get" action="grabarProducto.jsp">
                            <tr><td><input type="text" name="codigo" size="5"></td>
                                <td><input type="text" name="descripcion" size="30"></td>
                                <td><input type="text" name="precioCompra" size="5"></td>
                                <td><input type="text" name="precioVenta" size="5"></td>
                                <td><input type="text" name="stock" size="20"></td>
                                <td><button type="submit" value="Añadir" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Añadir</button></td><td></td></tr>           
                        </form>
                    <%
                        for(Producto producto : productos){
                        out.println("<tr><td>" + producto.getCodigo() + "</td>" +
                        "<td>" + producto.getDescripcion() + "</td>" + 
                        "<td>" + producto.getPrecioCompra() + "</td>" +
                        "<td>" + producto.getPrecioVenta() + "</td>" +
                        "<td>" + producto.getStock() + "</td>");
                        
                    %>
                    <td>
                        <form method="get" action="modificarProducto.jsp">
                            <input type="hidden" name="codigo" value="<%= producto.getCodigo() %>">
                            <input type="hidden" name="descripcion" value="<%= producto.getDescripcion() %>">
                            <input type="hidden" name="precioCompra" value="<%= producto.getPrecioCompra() %>">
                            <input type="hidden" name="precioVenta" value="<%= producto.getPrecioVenta() %>">
                            <input type="hidden" name="stock" value="<%= producto.getStock() %>">
                            <button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-pencil"></span> Modificar</button>
                        </form>
                    </td>
                    <td>
                        <form method="get" action="borrarProducto.jsp">
                            <input type="hidden" name="codigo" value="<%= producto.getCodigo() %>"/>
                            <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span> Eliminar</button>
                        </form>
                    </td></tr>
                    <%
                        }
                        }
                    }catch(Exception e){
                        out.println("<div>" + e.getMessage() + "</div>");
                    }finally{
                        pool.closeAll();
}
                    %>
                    
                    </table>
                </div>
                    <div class="text-center">&copy; Gestisimal</div>
            </div>
        </div>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
