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
                break;
            case "martes":
                asignatura = "Digitalización";
                break;
            case "miercoles":
                asignatura = "Lenguaje de marca";
                break;
            case "jueves":
                asignatura = "Lenguaje de marca";
                break;
            case "viernes":
                asignatura = "Base de Datos";
                break;
                default:
                asignatura = "No existe el día introducido o no hay clase";
                break;
        }
        System.out.println("El " + dia + " hay a primera hora: " + asignatura);
        s.close();
        }
    }
