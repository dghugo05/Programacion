import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int combinacion = 1234;
        System.out.printf("Introduzca el código de la caja fuerte: ");
        int codigo = s.nextInt();
        int contador = 1;

        while (contador<=4){
            if (codigo == combinacion) {
                System.out.println("La caja fuerte ha sido abierta con éxito.");
                break;
            }else{
                System.out.printf("la combinación es incorrecta, quedan %d \n", (4-contador));
                System.out.printf("Introduzca la clave: ");
                codigo = s.nextInt();
                contador +=1 ;
            }
        }


        s.close();
    }
}
