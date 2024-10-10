import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número de la semana: ");
        int num = s.nextInt();
        String dia;
        switch (num) {
            case 1:
                dia = "lunes";
                break;
            
            case 2:
                dia = "martes";
                break;
            
            case 3:
                dia = "miércoles";
                break;
            
            case 4:
                dia = "jueves";
                break;
            
            case 5:
                dia = "viernes";
                break;
            
            case 6:
                dia = "sábado";
                break;
            
            case 7:
                dia = "domingo";
                break;

            default:
                dia = "Día inexistente";
                break;
        }
        System.out.println("El día " + num + " de la semana es " + dia);
        s.close();
    }
}
