import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("introduzca el número que desea comprobar: ");
        int num = s.nextInt();

        int resto = num%10;
        switch (resto) {
            case 0:
                System.out.println("El número introducido termina en 0.");
                break;
            case 1:
                System.out.println("El número introducido termina en 1.");
                break;
            case 2:
                System.out.println("El número introducido termina en 2.");
                break;
            case 3:
                System.out.println("El número introducido termina en 3.");
                break;
            case 4:
                System.out.println("El número introducido termina en 4.");
                break;
            case 5:
                System.out.println("El número introducido termina en 5.");
                break;
            case 6:
                System.out.println("El número introducido termina en 6.");
                break;
            case 7:
                System.out.println("El número introducido termina en 7.");
                break;
            case 8:
                System.out.println("El número introducido termina en 8.");
                break;
            case 9:
                System.out.println("El número introducido termina en 9.");
                break;
        
            default:
                System.out.println("Introduzca un número válido.");
                break;
        }

        s.close();
    }
}
