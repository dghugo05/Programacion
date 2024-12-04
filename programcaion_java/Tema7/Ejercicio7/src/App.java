import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca el número que deseas introducir: ");
        int num = s.nextInt();
        System.out.printf("Introduzca el número por el que desea sustituir: ");
        int sustituto = s.nextInt();

        int []numeros = new int[100];

        for(int paso = 0; paso < 100; paso++){
            numeros[paso] = (int)(Math.random()*21);
            System.out.printf(numeros[paso] + " ");
        }
        System.out.println("\n");
        for(int paso = 0; paso < 100; paso++){
            if(numeros[paso] == num){
                numeros[paso] = sustituto;
            }
            System.out.printf(numeros[paso] + " ");
        }
    }
}
