import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca el valor de a, b y c respectivamente:");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double discriminante = ((b*b)-(4*a*c));
        if (a == 0){
            if (b == 0){
                if (c == 0){
                    System.out.println("Esto es una identidad y no una ecuación.");
                }else{
                    System.out.println("Esta ecuación no tiene resultado real.");
                }
            }else{
                double resultado = -c/b;
                System.out.println("El resultado de esta ecuación es:" + resultado);
            }
        }else if (c == 0){
            double resultado = 0;
            double resultado_2 = -b/a;
            System.out.println("El resultado de esta ecuación son: " + resultado + " y " + resultado_2);
        }else if (b == 0){
            double resultado = +Math.sqrt(-c/a);
            double resultado_2 = -Math.sqrt(-c/a);
            System.out.println("El resultado de esta ecuación son: " + resultado + " y " + resultado_2);
        }else if (discriminante < 0){
            System.out.println("Esta ecuación no tiene resultado real.");
        }else if (b==0 && c==0){
            System.out.println("El resultado de la ecuación es x = 0");
        }else{
            double resultado = ((-b + Math.sqrt(discriminante))/(2*a));
            double  resultado_2 = ((-b - Math.sqrt(discriminante))/(2*a));
            System.out.printf("El resultado de esta ecuación son: %1.3f y %1.3f", resultado, resultado_2);
        }
        s.close();
    }
}
