import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca la base imponible: ");
        double imponible = s.nextInt();
        System.out.printf("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String iva = s.nextLine();
        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String cod = s.nextLine();


        
        System.out.printf("Base imponible %16.2", imponible);
        
        s.close();
    }
}
