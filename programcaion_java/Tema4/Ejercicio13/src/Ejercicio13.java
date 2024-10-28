import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.printf("Introduzca los número que desea ordenar, separados por espacios: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a < b && c < b){
            if (a < c){
                System.out.printf("El orden de los número de menor a mayor es: %2d %2d %2d \n", a, c, b);
                System.out.printf("El orden de los número de mayor a menor es: %2d %2d %2d", b, c, a);
            }else{
                System.out.printf("El orden de los número de menor a mayor es: %2d %2d %2d \n", c, a, b);
                System.out.printf("El orden de los número de mayor a menor es: %2d %2d %2d", b, a, c);
            }
        }else if (b < a && c < a){
            if (b < c){
                System.out.printf("El orden de los número de menor a mayor es: %2d %2d %2d \n", b, c, a);
                System.out.printf("El orden de los número de mayor a menor es: %2d %2d %2d", a, c, b);
            }else{
                System.out.printf("El orden de los número de menor a mayor es: %2d %2d %2d \n", b, a, c);
                System.out.printf("El orden de los número de mayor a menor es: %2d %2d %2d", c, a, b);
            }
        }else{
            if (b < a){
                System.out.printf("El orden de los número de menor a mayor es: %2d %2d %2d \n", b, a, c);
                System.out.printf("El orden de los número de mayor a menor es: %2d %2d %2d", c, a, b);
            }else{
                System.out.printf("El orden de los número de menor a mayor es: %2d %2d %2d \n", a, b, c);
                System.out.printf("El orden de los número de mayor a menor es: %2d %2d %2d", c, b, a);
            }
        }
        s.close();
    }
}
