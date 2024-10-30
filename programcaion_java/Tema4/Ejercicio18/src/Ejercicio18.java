import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca un número de máximo 5 cifras: ");

        String num = s.nextLine();

        if (num.length() <= 5){
            num = num.substring(0, 1);
            System.out.println("El número empieza por: " + num);
        }else{
            System.out.println("Introduzca un número válido.");
        }
        s.close();
    }
}
