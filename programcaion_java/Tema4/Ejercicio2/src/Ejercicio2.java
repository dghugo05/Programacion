import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un hora:");
        int hora = s.nextInt();
        if (hora > 6 && hora <= 12) {
            System.out.println("Buenos días");
        }else if (hora > 12 && hora <= 20) {
            System.out.println("Buenas tardes");
        }else if (hora > 21 && hora <=23 || hora <= 5) {
            System.out.println("Buenas noches");
        }else{
            System.out.println("Introduzca una hora válida");
        }
        s.close();
    }
}
