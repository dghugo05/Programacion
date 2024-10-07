import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la base del triángulo: ");
        double base = s.nextDouble();
        System.out.println("Introduzca la altura del triángulo: ");
        double altura = s.nextDouble();
        System.out.println("El área del triángulo es: " + ((base * altura) / 2 ));
        s.close();
    }
}
