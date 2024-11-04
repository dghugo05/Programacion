import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca un número: ");
        int num = s.nextInt();
        System.out.println("----------------------------------------------------------");
        System.out.printf("| %16s | %18s | %14s | \n", "Número", "Cuadrado", "Cubo");
        int contador = 1;

        for (int i = num; contador<=5; i++){
            double cuadrado = Math.pow(i, 2);
            double cubo = Math.pow(i,3);
            contador +=1;
            System.out.println("|--------------------------------------------------------|");
            System.out.printf("| %16d | %18.0f | %14.0f | \n", i, cuadrado, cubo);
        }
        System.out.println("----------------------------------------------------------");

        s.close();
    }
}
