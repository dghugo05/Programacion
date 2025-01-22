import java.util.Arrays;
import java.util.Scanner;

public class GestionAlmacen {
    Scanner s = new Scanner(System.in);
    private Producto[] productos = new Producto[0], productos2 = new Producto[0];
    private int cantidad;
    private int productosGuardados;


    public void agregarProducto() {
        System.out.printf("Ingrese la cantidad de productos que desea añadir: ");
        cantidad = s.nextInt();
        rellenarProducto(cantidad);
    }

    private void rellenarProducto(int cantidadProductos) {
        productos2 = Arrays.copyOf(productos, productos.length + cantidadProductos);
        productos = Arrays.copyOf(productos2, productos2.length);
        int paso = 0;

        for(paso = productosGuardados; paso < productos.length; paso++) {
            System.out.println("\n\n\n\n\n\n");
            System.out.printf("Introduzca los datos del producto\n");
            System.out.printf("_________________________________\n");
            System.out.printf("Introduzca el código: ");
            String codigo = s.nextLine().toString();
            System.out.printf("Introduzca una breve descripción: ");
            String descripcion = s.nextLine();
            System.out.printf("Introduzca el precio de compra: ");
            double precioCompra = esDouble();
            System.out.printf("Introduzca el precio de venta: ");
            double precioVenta = esDouble();
            System.out.printf("Introduzca el stock del producto: ");
            int stock = esEntero();

            productos[paso] = new Producto(codigo, descripcion, precioCompra, precioVenta, stock);
            System.out.println("\n\n\n\n\n");
        }
    }

    public void quitarProducto(){
        System.out.printf("Ingrese la cantidad de productos que desea eliminar: ");
        cantidad = s.nextInt();
        eliminarProducto(cantidad);
    }

    private void eliminarProducto(int cantidad){
        for(int paso = 0; paso < cantidad; paso++){
            System.out.printf("Introduzca el código del producto que desea eliminar: ");
            s.next();
            String codigo = s.nextLine();
            for(int pasoArray = 0; pasoArray < productos.length; pasoArray++){
                if(productos[pasoArray].getCodigo().equals(codigo))
                    productos[pasoArray] = productos[productos.length-1]; 
                
                productos2 = Arrays.copyOf(productos, productos.length - 1);
                productos = Arrays.copyOf(productos2, productos2.length);
            }
        }
    }

    public void mostrarProductos() {
        for (Producto prod : productos) {
            System.out.println(prod);
        }
    }

    private int esEntero(){
        boolean bandera = true;
        int num = 0;
        while (bandera){
            try{
                num = Integer.parseInt(s.nextLine());
                bandera = false;
            }catch (Exception e){
                System.out.println("Error, tipo de dato erróneo");
            }
        }
        return num;
    }

    private double esDouble(){
        boolean bandera = true;
        int num = 0;
        while (bandera){
            try{
                num = Integer.parseInt(s.nextLine());
                bandera = false;
            }catch (Exception e){
                System.out.println("Error, tipo de dato erróneo");
            }
        }
        return num;
    }

    public void salir(){
        s.close();
        System.exit(0);
    }
}

