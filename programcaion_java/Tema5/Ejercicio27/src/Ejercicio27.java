import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca un número: ");
        int num = s.nextInt();
        int contador_mult = 0;
        int suma = 0;

        for(int i = 1; i <= num; i++){
            if (i % 3 == 0) {
                contador_mult ++;
                suma += num;
                System.out.printf("%d ", i);
            }
        }
        System.out.printf("\nEl número de múltplos es de: %d.\nY la suma total es de: %d", contador_mult, suma);
        s.close();
    }
}
