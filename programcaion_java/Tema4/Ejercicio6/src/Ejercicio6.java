import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Intrpoduzca la altura de la cual quiere calcular el tiempo de caída: ");
        double h = s.nextDouble();
        if (h<0){
            System.out.println("La altura introducida no tiene caída.");
        }else{
            double calculo = Math.sqrt((2*h)/9.81);
            System.out.printf("El tiempo que tarda hasta el suelo es: %2.2f segundos", calculo);
        }
        s.close();
    }
}
