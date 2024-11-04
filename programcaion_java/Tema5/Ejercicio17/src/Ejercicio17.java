import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Intruduzca un número: ");
        int num = s.nextInt();
        int total = num;

        if (num>=0){
            for (int contador = 1; contador<=100; contador++){
                num += 1;
                total += num;
            }
            System.out.printf("La suma de los 100 números siguientes de %d es: %d", num, total);
        }else{
            System.out.println("Introduzca un valor válido");
        }
        s.close();
    }
}
