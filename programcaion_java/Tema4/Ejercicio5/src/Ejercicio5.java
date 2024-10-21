import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.printf("Por favor, introduzca el valor de a: ");
        double a = s.nextInt();
        System.out.println("Ahora introduzca el valor de b: ");
        double b = s.nextInt();

        if (a == 0){
            System.out.println("Esa ecuación no tiene solución real.");
        }else{
            System.out.println("x = " + (-b/a));
        }

        s.close();
    }
}
