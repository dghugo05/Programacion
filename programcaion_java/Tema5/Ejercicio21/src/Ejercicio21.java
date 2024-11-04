import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca un número: ");
        int num = s.nextInt();
        int contador = 0;
        int pares = 0;
        int impar = 0;
        int contador_impar = 0;

        while (num>=0){
            contador += 1;
            if (num>0){
                if(num%2 == 0){
                    pares = num;
                    if (num > pares){
                        pares = num;
                    }
                }else if (num%2 != 0){
                    impar += num;
                    contador_impar += 1;
                }else{
                    System.out.println("Introduzca un valor válido.");
                }
            }
            System.out.printf("Introduzca un número: ");
            num = s.nextInt();
        

        
    }
    s.close();
    System.out.printf("La cantidad de números introducidos es de %d, la media de los impares es: %d. Y el número para más grande es: %d", contador, (impar/contador_impar), pares);
}
}
