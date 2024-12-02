import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca un número entero (mayor que cero): ");
        int num = s.nextInt();
        int nuevo_num = 0;
        int aux = num;
        int reves = 0;
        int cifra = 0;
        int contador = 0;

        while (aux > 0) {
            reves = (reves * 10) + (aux % 10);
            aux /= 10;
            cifra++;
        }

        for(int paso = 0; paso < cifra; paso++){
            if (gusano(reves)){
                nuevo_num = (nuevo_num*10) + (reves%10);
            }else{
                contador++;
            }
            reves /= 10;
        }
        if(contador == 0){
            System.out.println("El gusano numérico no se ha comido ningún dígito.");
        }else{
            System.out.printf("Después de haber sido comido por el gusano numérico se queda en %d", nuevo_num);
        }
        
        s.close();
    }


    public static boolean gusano(int reves) {
        if (reves%10 != 0 && reves%10 != 8) {
            return true;
        } else {
            return false;
        }
    }

}
