import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) throws Exception {
        //Ejercicio 4
        Scanner sc = new Scanner(System.in);
        double euros, pesetas;
        System.out.println("Introduzca la cantidad de euros");
        euros = sc.nextDouble();
        pesetas = euros * 166.386;
        System.out.println("La conversión de " + euros + " euros " + " a pesetas es de " + pesetas + " pesetas");
        sc.close();
    }
}
