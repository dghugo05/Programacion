import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca la altura de la U: ");
        int altura = s.nextInt();

        if (altura%2==0){
            for(int fila = 1; fila<=altura;fila++){
                System.out.printf("* ");
                for (int espcio = 1; espcio<= altura; espcio++){
                    System.out.printf(" ");
                }
                System.out.println("*");
                    }
            System.out.printf("  ");
                for (int asterisco = 1; asterisco<=altura/2 ; asterisco++){
                    System.out.printf("* ");
                }
        }else{
            for(int fila = 1; fila<=altura;fila++){
                System.out.printf("* ");
                for (int espcio = 1; espcio<= altura-1; espcio++){
                    System.out.printf(" ");
                }
                System.out.println("*");
                    }
            System.out.printf("  ");
            for (int asterisco = 1; asterisco<=altura/2 ; asterisco++){
                System.out.printf("* ");
            }
        }   
        
        s.close();
    }
}
