import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Por favor, introduzca un número entero positivo: ");
        int num = s.nextInt();
        System.out.printf("Introduzca la posición dentro del número: ");
        int posición = s.nextInt();
        System.out.printf("Introduzca el nuevo dígito: ");
        int nuevo = s.nextInt();
        int aux = num;
        int reves = 0;
        int cifras = 0;
        int nuevo_num = 0;


        while (aux > 0) {
            reves = ((reves*10) + (aux%10));
            aux /= 10;
            cifras++;
        }

        for(int paso = 1; paso < cifras; paso++){
            if(paso == posición){
                nuevo_num = (nuevo_num * 10) + nuevo;
        }
        nuevo_num = (nuevo_num*10) + (reves%10);
        reves /= 10;
    }
    System.out.println(nuevo_num);
        s.close();


    }
}
