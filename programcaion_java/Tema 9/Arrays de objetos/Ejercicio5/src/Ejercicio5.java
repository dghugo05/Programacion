public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        GestionAlmacen gestor = new GestionAlmacen();

        gestor.agregarProducto();
        gestor.mostrarProductos();
        
        gestor.quitarProducto();
        gestor.mostrarProductos();
    }
}
