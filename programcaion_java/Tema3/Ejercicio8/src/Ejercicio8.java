import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca las horas trabajadas esta semana: ");
        double horas = s.nextDouble();
        System.out.println("TU salario semanal es de: " + (horas * 12));
        s.close();
    }
}
