import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura (número mayor o igual a 5): ");
        int altura = s.nextInt();

        if (altura % 2 == 0 || altura < 5){
            System.out.println("La altura introducida no es correcta.");
        }else{
            for(int largo = 0; largo < altura; largo++){
                System.out.printf("M");
                for(int fila = 2; fila < altura; fila++){
                    if(largo == 0 || largo == altura-1 || largo == altura/2){
                        System.out.printf("M");
                    }else{
                        System.out.printf(" ");
                    }
                }
                System.out.println("M");
            }
        }


        s.close();
    }
}
