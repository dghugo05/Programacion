import java.util.Arrays;
import java.util.Scanner;

public class GestionAlmacen {
    Scanner s = new Scanner(System.in);
    private Producto[] productos = new Producto[0];
    private Producto[] productos2 = new Producto[0];
    private Producto prods = new Producto(null);
    private int ultima_Posicion_Array;


    public void agregarProducto() {
        int cantidad;
        System.out.printf("Ingrese la cantidad de productos que desea añadir: ");
        cantidad = s.nextInt();
        rellenarProducto(cantidad);
    }

    public void rellenarProducto(int cantidadProductos) {
        productos2 = Arrays.copyOf(productos, productos.length + cantidadProductos);
        productos = Arrays.copyOf(productos2, productos2.length);
        int paso = 0;

        for(paso = 0; paso < productos.length; paso++) {
            if(esVacio(productos[paso])){
                System.out.println("\n\n\n\n\n\n");
                System.out.printf("Introduzca los datos del producto\n");
                System.out.printf("_________________________________\n");
                System.out.printf("introduzca una breve descripción: ");
                String descripcion = s.nextLine();
                System.out.printf("Introduzca el código: ");
                String codigo = s.nextLine();
                System.out.printf("Introduzca el precio de compra: ");
                double precioCompra = esDouble();
                System.out.printf("Introduzca el precio de venta: ");
                double precioVenta = esDouble();
                System.out.printf("Introduzca el stock del producto: ");
                int stock = esEntero();

                productos[paso] = new Producto(descripcion, codigo, precioCompra, precioVenta, stock);
                productos[paso].setvacio("no");
                System.out.println("\n\n\n\n\n");
            }
        }
        s.close();
        ultima_Posicion_Array = paso;
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

    private boolean esVacio(Producto producto){
        return prods.getvacio().equals("si");
    }
}

