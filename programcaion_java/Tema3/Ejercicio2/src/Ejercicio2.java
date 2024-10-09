import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el número de euros que desea convertir a pesetas: ");
        double euros = s.nextDouble();
        System.out.printf("%.0f", euros * 166.386);
        s.close();
    }
}
