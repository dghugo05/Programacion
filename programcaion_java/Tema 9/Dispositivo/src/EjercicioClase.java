import java.util.Scanner;

public class EjercicioClase {
    public static void main(String[] args) throws Exception {


    }

    public void menu(){
        Scanner s = new Scanner(System.in);
        System.out.println( "1. Agregar dispositivo");
        System.out.println( "2. Mostrar dispositivos");
        System.out.println( "3. Mostrar computadoras");
        System.out.println( "4. Mostrar televisores");
        System.out.println( "5. Salir");
        System.out.printf("Ingrese una opción: ");
        int opcion = pedirEntero();

        s.close();
    }

    private void selection(int select){
        GestionDispositivos gestion = new GestionDispositivos();
        switch (select) {
            case 1:
                gestion.agregarDispositivo();
                menu();
            case 2:
                gestion.mostrarDispositivos();
                menu();
            case 3:
                gestion.mostrarComputadora();
                menu();
            case 4:
                gestion.mostrarTelevisor();
                menu();
            case 5:
                exit();
            default:
                break;
        }
    }

    private int pedirEntero(){
        Scanner s = new Scanner(System.in);
        int entero = 0;
        boolean bandera = true;
        while(bandera){
            try{
                entero = s.nextInt();
                bandera = false;
            }catch (Exception e){
                System.out.println("Error, ingrese un valor entero.");
            }
        }
        s.close();
        return entero;
    }

    public void exit(){
    }
}
