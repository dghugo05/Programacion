import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca los precios de su factura separados por espacios: ");
        double pre1 = s.nextDouble();
        double pre2 = s.nextDouble();
        double pre3 = s.nextDouble();
        double total = pre1 + pre2 + pre3;
        double imponible = total * 0.21;
        System.out.println("El total de la factura es " + (total + imponible));
        s.close();
    }
}
