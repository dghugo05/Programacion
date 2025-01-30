import java.util.Scanner;
public class CodigoPostalDiccionario {
static Gestion gestor = new Gestion();
static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu(){
        System.out.println("\t\t\tMenú de seleccion");
        System.out.println("\t\t\t1. Buscar");
        System.out.println("\t\t\t2. Agregar");
        System.out.printf("\t\t\tIntroduzca su opción: ");
        int seleccion = gestor.pedirEntero();
        seleccion(seleccion);
    }

    public static void seleccion(int seleccion){
        switch (seleccion) {
            case 1:
            
            case 2:
                System.out.printf("\t\t\tIntroduzca la ciudad que desea agregar:");
                s.next();
                String ciudad = s.nextLine();
                gestor.Agregar(ciudad);
                menu();
            default:
                break;
        }
    }
}
