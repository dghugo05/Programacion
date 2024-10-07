import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca dos números con espcios: ");
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        System.out.println((num1 + num2) + "," + (num1 - num2) + "," + (num1 * num2) + "," + (num1 / num2));
        s.close();
    }
}
