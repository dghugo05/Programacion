import java.util.ArrayList;
import java.util.Scanner;

public class InteraccionUsuario{
    private static Gestion gestor = new Gestion();
    private static Scanner s = new Scanner(System.in);
    public static String provincia = "";
    public static int cp = 0;

    public static void menu(){
        System.out.println("\t\t\tMenú de seleccion");
        System.out.println("\t\t\t1. Buscar");
        System.out.println("\t\t\t2. Agregar");
        System.out.println("\t\t\t3. Eliminar");
        System.out.println("\t\t\t4. Mostrar listado");
        System.out.println("\t\t\t5. Salir");
        System.out.printf("\t\t\tIntroduzca su opción: ");
        int seleccion = pedirEntero();
        seleccion(seleccion);
    }

    public static void seleccion(int selection){
        switch (selection) {
            case 1:
                gestor.saltoLinea();
                System.out.printf("\t\t\t" + introduzcaProvincia() + "de la cual desea saber los códigos postales: ");
                provincia = s.nextLine();
                gestor.buscar(provincia);
                System.out.println("Pulse ENTER para continuar");
                s.nextLine();
                gestor.saltoLinea();
                menu();
            case 2:
                gestor.saltoLinea();
                System.out.printf("\t\t\t"+ introduzcaProvincia() +"a la que desea agregar un código postal: ");
                s.nextLine();
                provincia = s.nextLine();
                int contador = 0;
                int contar = gestor.contieneProvinciaAgregar(provincia);
                if(contar == 0){
                    System.out.printf("\t\t\tIntroduzca el código postal que desea agregar: ");
                    cp = pedirEntero();
                    while(gestor.existeCodigoPostal(provincia, cp)){
                        if(contador != 0){
                            cp = pedirEntero();
                        }
                        contador++;
                    }
                }else{
                    System.out.println("\t\t\tLa ciudad introducida no se encuentra guardada.");
                    System.out.printf("\t\t\t¿Desea agregar " + provincia + " al diccionario?(Y/N)");
                    if(s.nextLine().toUpperCase().equals("Y")){
                        gestor.añadirDiccionario(provincia);
                        System.out.printf("\t\t\tIntroduzca el código postal que desea agregar: ");
                        cp = pedirEntero();
                        while(gestor.existeCodigoPostal(provincia, cp)){
                            if(contador != 0){
                                cp = pedirEntero();
                            }
                            contador++;
                        }
                    }
                }
                gestor.saltoLinea();
                menu();
            case 3:
                gestor.saltoLinea();
                System.out.println("\t\t\t1. Borrar ciudad");
                System.out.println("\t\t\t2. Borrar código postal");
                int seleccion = pedirEntero();
                System.out.printf("\t\t\t" + introduzcaProvincia() + "que desea borrar: ");
                if(seleccion == 1){
                    s.nextLine();
                    provincia = s.nextLine();
                    gestor.eliminarProvincia(provincia);
                }else{
                    provincia = s.nextLine();
                    gestor.contieneProvinciaEliminar(provincia);
                    System.out.printf("\t\t\tIntroduzca el código postal que desea eliminar: ");
                    cp = pedirEntero();
                    gestor.eliminarCodigoPostal(cp, provincia);
                }
                gestor.saltoLinea();
                menu();
            case 4:
                gestor.saltoLinea();
                gestor.mostrar();
                s.nextLine();
                s.nextLine();
                gestor.saltoLinea();
                menu();
            case 5:
                exit();
            default:
                break;
        }
    }

    public static String introduzcaProvincia(){
        return "Introduzca la provincia ";
    }

    public static void exit(){
        s.close();
    }

    public static int pedirEntero(){
        boolean badnera = true;
        int entero = 0;
        while(badnera){
            try{
                entero = s.nextInt();
                badnera = false;
            }catch (Exception e){
                gestor.saltoLinea();
                System.out.println("\t\t\tError, por favor ingrese un número entero.");
            }
        }
        return entero;
    }
}