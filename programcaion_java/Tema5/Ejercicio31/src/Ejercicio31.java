import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("introduzca la altura de la L: ");
        int altura = s.nextInt();


        for(int fila = 1; fila<=altura; fila++)
            if(fila<= altura-1){
                System.out.println("*");
            }else{
                for(int ancho = 1; ancho <= (altura+1)/2; ancho++){
                    System.out.printf("* ");
                }   
            }
            

        s.close();
    }
}
