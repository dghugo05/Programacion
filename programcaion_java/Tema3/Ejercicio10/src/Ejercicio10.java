import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la cantidad que quiere transformar de mibibytes:");
        double mb = s.nextDouble();
        System.out.println("La conversion es :" + (mb*1024));
        s.close();
    }
}
