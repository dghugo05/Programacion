import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el radio del cono: ");
        double radio = s.nextDouble();
        System.out.println("Introduzca la altura del cono: ");
        double altura = s.nextDouble();
        System.out.println(altura + " " + radio);
        double ar = (((double)1/(double)3) * (3.14 * (radio * radio))) * altura;
        System.out.println("El volumen del cono es de: " + ar);
        s.close();
    }
}
