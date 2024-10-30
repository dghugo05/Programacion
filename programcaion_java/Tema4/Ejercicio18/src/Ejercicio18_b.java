import java.util.Scanner;

public class Ejercicio18_b {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca un número de máximo 5 cifras: ");

        int num = s.nextInt();

        if (-10 < num && num < 10){
            System.out.println("El número empieza por: " + num);
        }else if (-100<num && num<100){
            num = num/10;
            System.out.println("El número empieza por: " + num);
        }else if (-1000<num && num<1000){
            num = num/100;
            System.out.println("El número empieza por: " + num);
        }else if (-10000<num && num<10000){
            num = num/1000;
            System.out.println("El número empieza por: " + num);
        }else if(-100000<num && num<100000){
            num = num/10000;
            System.out.println("El número empieza por: " + num);
        }else{
            System.out.println("Introduzca un número válido.");
        }
        s.close();
    }
}