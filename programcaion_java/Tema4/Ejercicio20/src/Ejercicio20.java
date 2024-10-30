import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca un número de máximo 5 cifras: ");

        int num = s.nextInt();


        if(-100<num && num<100){
            if (num/10 == num%10){
                System.out.println("El número es capicúa");
            }else{
                System.out.println("El número introducido no es capicúa");
            }
        }else if(-1000<num && num<1000){
            if (num/100 == num%10){
                System.out.println("El número es capicúa");
            }else{
                System.out.println("El número introducido no es capicúa");
            }
        }else if(-10000<num && num<10000){
            if (num/1000 == num%10 && (num/100)%10 == (num/10)%10){
                System.out.println("El número es capicúa");
            }else{
                System.out.println("El número introducido no es capicúa");
            }
        }else if(-100000<num && num<100000){
            if (num/10000 == num%10 && (num/1000)%10 == (num/10)%10){
                System.out.println("El número es capicúa");
            }else{
                System.out.println("El número introducido no es capicúa");
            }
        }else{
            System.out.println("Introduzca un número válido.");
        }
        s.close();
    }
}
