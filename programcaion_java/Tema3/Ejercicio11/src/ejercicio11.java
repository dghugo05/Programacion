import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de kibibytes que desea convertir: ");
        double kb = s.nextDouble();
        System.out.printf("la conversion es: %.5f",  (kb/(double)1024));
        s.close();
    }
}
