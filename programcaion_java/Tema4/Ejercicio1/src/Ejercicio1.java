import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un día de la semana: ");
        String dia = s.nextLine();
        String asignatura;
        switch (dia) {
            case "lunes":
                asignatura = "Entornos de Desarrollo";
                System.out.println("El " + dia + " hay a primera hora: " + asignatura);
                break;
            case "martes":
                asignatura = "Digitalización";
                System.out.println("El " + dia + " hay a primera hora: " + asignatura);
                break;
            case "miercoles":
                asignatura = "Lenguaje de marca";
                System.out.println("El " + dia + " hay a primera hora: " + asignatura);
                break;
            case "jueves":
                asignatura = "Lenguaje de marca";
                System.out.println("El " + dia + " hay a primera hora: " + asignatura);
                break;
            case "viernes":
                asignatura = "Base de Datos";
                System.out.println("El " + dia + " hay a primera hora: " + asignatura);
                break;
            case "sabado", "domingo":
                System.out.println("Tiene que ser un día de lunes a viernes.");
                break;
            default:
                System.out.println("No existe el día introducido o no hay clase");
                break;
        }
        s.close();
        }
    }
