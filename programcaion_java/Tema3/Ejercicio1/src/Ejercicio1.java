import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca dos número separados por espacios: ");
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        System.out.println(num1 * num2);
        s.close();
    }
}
