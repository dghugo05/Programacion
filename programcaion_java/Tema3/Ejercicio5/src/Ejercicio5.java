import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura del rectángulo :");
        double altura = s.nextDouble();
        System.out.println("Introduzca el ancho del rectángulo: ");
        double ancho = s.nextDouble();
        System.out.println("El area del rectangulo es: " + (altura * ancho));
        s.close();
    }
}
