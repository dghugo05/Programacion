import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca un número de máximo 5 dígitos: ");

        int num = s.nextInt();

        if (-10<num && num<10){
            System.out.println("El número introducido es de 1 cifra.");
        }else if(-100<num && num<100){
            System.out.println("El número introducido es de 2 cifra.");
        }else if(-1000<num && num<1000){
            System.out.println("El número introducido es de 3 cifra.");
        }else if(-10000<num && num<10000){
            System.out.println("El número introducido es de 4 cifra.");
        }else if(-100000<num && num<100000){
            System.out.println("El número introducido es de 5 cifra.");
        }else{
            System.out.println("Introduzca un número válido.");
        }
        s.close();
    }
}
