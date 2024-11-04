import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca un núemro: ");
        int num = s.nextInt();
        int contador = 1;

        while (num / 10 > 0) {
            num = num/10;
            contador += 1;
            
        }
        System.out.printf("El número introducido tiene: %d", contador);
        s.close();
    }
}
