import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");
        int num = s.nextInt();
        int maximo = 0;
        int minimo = Integer.MAX_VALUE;
        double total = 0;
        double contar = 0;

        while (esPrimo(num)) {
            contar++;
            if (num > maximo){
                maximo = num;
            }
            if (num < minimo){
                minimo = num;
            }
            total += num;
            num = s.nextInt();
        }
        double media = total/contar;

        System.out.printf("Has introducido %.0f números no primos. \n", contar);
        System.out.printf("Máximo: %d \n", maximo);
        System.out.printf("Mínimo: %d \n", minimo);
        System.out.printf("Media: %.2f \n", media);


        s.close();
    }
    public static boolean esPrimo(int num){
        if (num % 2 == 0){
            return true;
        }else{
            for(int contador = 3; contador < Math.sqrt(num); contador+=2){
                if(num % contador == 0)
                    return true;
            }
            return false;
        }
        
    }
}

