import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca un número y separado por un espacio el exponente: ");
        int num = s.nextInt();
        int expo = s.nextInt();
        int calculo = num;


        if(expo<0 || num<0){
            System.out.println("Introduzca valores válidos.");
        }else{
            for (int contador = 1; contador <= expo; contador++){
                for (int cont = 1; cont < contador; cont ++)
                    calculo *= num;
                System.out.printf("%d^%d = %d \n", num, contador, calculo);
            }
        }

        s.close();
    }
}
