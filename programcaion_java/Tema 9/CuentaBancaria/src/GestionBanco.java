import java.util.Arrays;
import java.util.Scanner;

public class GestionBanco{
    private CuentaBancaria cuentas[];
    private CuentaBancaria cuenta_aux[];
    private CuentaBancaria cuenta;
    private int ultimaPosicion;

    public GestionBanco(){
    }

    public void menu(){
        System.out.println("        ----Menú de Seleccion----");
        System.out.println("            1. Crear Cuenta");
        System.out.println("            2. Depositar dinero");
        System.out.println("            3. Retirar dinero");
        System.out.println("            4. Consultar saldo");
        System.out.println("            5. Dar de baja");
        System.out.println("            6. Salir");
        System.out.println("        -------------------------");
        System.out.printf("        Ingrese una opción: ");
        selection(pedirEntero());
    }

    public void selection(int opcion){
        switch (opcion) {
            case 1:
                agregarCuenta();
            case 2:
                ingresar();
            case 3:
            case 4:
            case 5:
            case 6:
        
            default:
                break;
        }
    }

    private void agregarCuenta(){
        cuenta_aux = Arrays.copyOf(cuentas, cuentas.length + 1);
        cuentas = cuenta_aux;
        System.out.println("        ----Tipos de cuenta----");
        System.out.println("            1. Cuenta Corriente");
        System.out.println("            2. Cuenta Ahorro");
        System.out.println("        -----------------------");
        System.out.printf("        Ingrese una opción: ");
        int tipoCuenta = pedirEntero();
        System.out.println("        ----Tipos de interés----");
        System.out.println("            1. Interés fijo");
        System.out.println("            2. Interés variable");
        System.out.printf("        Ingrese una opción: ");
        int tipoInteres = pedirEntero();
        if(tipoCuenta > 0 && tipoCuenta < 3){
            if(tipoCuenta == 1)
                cuentas[ultimaPosicion] = new CuentaCorriente(interes(tipoInteres));
            cuentas[ultimaPosicion] = new CuentaAhorro(interes(tipoInteres));
            ultimaPosicion++; 
        }
        
    }

    private double interes(int tipoInteres){
        if(tipoInteres == 1)
            return 1.50;
        return 0.05 + (0.1 - 0.05) * Math.random();
    }

    private void ingresar(){
        Scanner s = new Scanner(System.in);
        boolean bandera = true;
        System.out.printf("        Ingrese el nombre del titular de la cuenta: ");
        int posicionCuenta = buscarCuenta(cuentas, s.nextLine());
        if(posicionCuenta != -1){
            while(bandera){
                System.out.printf("Introduzca la cantidad que desea ingresar:");
                double cantidad = pedirReal();
                if(cantidad > 0){
                    cuentas[posicionCuenta].depositar(cantidad);
                    bandera = false;
                }else{
                    System.out.println("        Error: La cantidad ingresada no es válida.");
                }
            }
        }else{
            System.out.println("No se encontró la cuenta");
        }
        s.close();
    }

    private int pedirEntero(){
        Scanner s = new Scanner(System.in);
        int opcion = 0;
        boolean bandera = true;
        while (bandera) {
            try {
                if(opcion < 1 && opcion > 6)
                    System.out.println("Ingrese una opción válida.");
                opcion = s.nextInt();
                bandera = false;
            }catch (Exception e){
                System.out.println("Error: ingrese una opción válida");
            }
        }
        s.close();
        return opcion;
    }

    private double pedirReal(){
        Scanner s = new Scanner(System.in);
        double num = 0;
        boolean bandera = true;
        while (bandera) {
            try {
                num = s.nextDouble();
                bandera = false;
            }catch (Exception e){
                System.out.println("Ingrese un número real.");
            }
        }
        s.close();
        return num;
    }

    private int buscarCuenta(CuentaBancaria[] cuentas, String nombre){
        for(int paso = 0; paso < ultimaPosicion; paso++){
            if(cuentas[paso].titular.equals(nombre))
                return paso;
        }
        return -1;
    }

    private int tiempoTranscurrido(){
        return (int) Math.round((((System.currentTimeMillis() - cuenta.TiempoCreacion)/1000.0)/30)*10)/10;
    }
}