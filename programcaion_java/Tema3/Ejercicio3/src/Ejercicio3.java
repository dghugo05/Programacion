import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el número de pesetas que desea convertir a euros: ");
        double pesetas = s.nextDouble();
        System.out.printf("%.0f", pesetas / 166.386);
        s.close();
    }
}
