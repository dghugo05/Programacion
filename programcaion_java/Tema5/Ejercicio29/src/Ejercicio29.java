import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca el límite: ");
        int num = s.nextInt();
        System.out.printf("Introduzca el divisor: ");
        int divisor = s.nextInt();

        if (num>=0) {
            for (int i=1; i<=num; i++){
                if (i%divisor!=0) {
                    System.out.printf("%d, ", i);
                }
            }

        }else{
            System.out.println("Introduzca números positivos.");
        }
        
        s.close();
    }
}
