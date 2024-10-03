import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) throws Exception {
        //Ejercicio5
        Scanner sc = new Scanner(System.in);
        double pesetas, euros;
        System.out.println("Introduzca la cantidad de pesetas que desea convertir:");
        pesetas = sc.nextDouble();
        euros = pesetas / 166.386;
        System.out.println("La conversión de " + pesetas + " pesetas a euros es de : " + String.format("%.2f", euros) + " euros" );
        sc.close();
    }
}
