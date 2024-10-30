import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Nota del primer control:");
        double nota_1 = s.nextDouble();
        System.out.printf("Nota del segundo control: ");
        double nota_2 = s.nextDouble();
        double media = (nota_1 + nota_2) / 2;
        if (media >= 5) {
            System.out.printf("Tu nota de Programación es de: %.1f \n", media);
        } else {
            System.out.printf("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            s.nextLine();
            String recu = s.nextLine();
            if (recu.toLowerCase() == "apto") {
                System.out.println("Tu nota de Programación es 5");
            } else {
                System.out.printf("Tu nota de programación es: %.1f", media);
            }
        }
        s.close();
    }
}
