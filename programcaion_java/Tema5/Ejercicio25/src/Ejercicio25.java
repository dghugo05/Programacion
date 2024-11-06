import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca un número: ");
        int div = s.nextInt();
        int numero = 0;
        int reves = 0;

        while (div > 0){
            numero = div % 10;
            div = div / 10;
            reves *= 10;
            reves += numero;
        }

        System.out.printf("%d", reves);

        s.close();
    }
}
