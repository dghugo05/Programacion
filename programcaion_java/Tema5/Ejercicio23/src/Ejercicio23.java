import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca los número que quiera: ");
        int num = 0;
        int contador = 0;
        int suma = 0;

        while (suma<=10000) {
            num = s.nextInt();
            suma += num;
            contador++;
        }

        int media = suma / contador;
        System.out.printf("El total de la suma es de: %d. \nLa cantidad de números introducidos es de %d. \nY la media de los números es: %d", suma, contador, media);



        s.close();
    }
}
