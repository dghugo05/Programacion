import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca el carácter con el que desea realizar la pirámide: ");
        String caracter = s.nextLine();
        System.out.printf("Introduzca de que lado desea que empieze el vértice de la pirámide \n1 = Arriba \n2 = Abajo \n3 = Derecha \n4 = Izquierda\n");
        String direccion = s.nextLine();
        switch (direccion) {
            case "1":
                System.out.println("  " + caracter + "  ");
                System.out.println(" " + caracter + caracter + caracter + " ");
                System.out.println(caracter + caracter + caracter + caracter + caracter);
                break;
            case "2":
                System.out.println(caracter +caracter +caracter +caracter +caracter);
                System.out.println(" " + caracter + caracter + caracter + " ");
                System.out.println("  " + caracter + "  ");
                break;
            case "3":
                System.out.println(caracter);
                System.out.println(caracter + " " + caracter);
                System.out.println(caracter + " " +caracter + " " +caracter);
                System.out.println(caracter + " " +caracter);
                System.out.println(caracter);
                break;
            case "4":
                System.out.println("    " + caracter);
                System.out.println("  " + caracter + " " +caracter);
                System.out.println(caracter + " " + caracter + " " +caracter);
                System.out.println("  " + caracter + " " + caracter);
                System.out.println("    " + caracter);
                break;
            default:
                break;
        }
        s.close();
    }
}
