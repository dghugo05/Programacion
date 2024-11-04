import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca la altura de la pirámide: ");
        int altura = s.nextInt();
        System.out.printf("Introduzca con que carácter quiere hacer la pirámide: ");
        s.nextLine();
        String caracter = s.nextLine();

        for(int fila = 1; fila<=altura; fila++){
            for(int espacios = fila; espacios < altura-1; espacios++){
                System.out.printf(" ");
            }
            for(int asterisco = 1; asterisco<= 2*fila-1; asterisco++){
                System.out.printf(caracter);
            }
        System.out.println("\n");
        }

        s.close();
    }
}
