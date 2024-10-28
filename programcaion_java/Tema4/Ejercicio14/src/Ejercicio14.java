import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.printf("Introduzca un número para comprobar: ");
        int num = s.nextInt();

        if (num%2 == 0){
            if (num%5 == 0){
                System.out.println("EL número introducido es par y divisible entre 5");
            }else{
                System.out.println("El número introducido es par, pero no divisible entre 5");
            }
        }else if (num%5 == 0){
            System.out.println("El número introducido no es par, pero si divisible entre 5");
        }else{
            System.out.println("El número introducido no es ni par ni divisible entre 5");
        }
    }
}
