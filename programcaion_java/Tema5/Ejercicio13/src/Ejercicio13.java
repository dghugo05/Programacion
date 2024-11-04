import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int positivo = 0;
        int negativo = 0;

        for (int contador = 1; contador <= 10; contador++){
            System.out.printf("Introduzca un número: ");
            int num = s.nextInt();
            
            if (num >= 0){
                positivo += 1;
            }else{
                negativo += 1;
            }
        }
        System.out.printf("La cantidad de números positivos introducidos es: %d, y de números negativos: %d", positivo, negativo);
        s.close();
    }
}
