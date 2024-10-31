import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca el precio de la entrada general: ");
        double precio = s.nextDouble();
        System.out.println("Ubicacion del asiento");
        System.out.println("1. Palco");
        System.out.println("2. Gallinero");
        System.out.printf("Introduzca su selección: ");
        int asiento = s.nextInt();
        System.out.println("¿Cuál es su tipo de entrada?");
        System.out.println("1. Público con invitación");
        System.out.println("2. Público local");
        System.out.println("3. Público foráneo");
        System.out.printf("Introduzca su selección: ");
        int tipo_Entrada = s.nextInt();

        if (asiento == 1){
            switch (tipo_Entrada) {
                case 1:
                    precio = precio - ((precio * 10)/100);
                    System.out.printf("El precio final de su entrada es de: %.2f€", precio);
                    break;
                
                case 2:
                    System.out.printf("El precio final de su entrada es de: %.2f€", precio);
                    break;

                case 3:
                    precio = precio + ((precio*10)/100);
                    System.out.printf("El precio final de su entrada es de: %.2f€", precio);
                    break;
                default:
                    System.out.println("Introduzca un valor válido.");
                    break;
            }
        }else if (asiento == 2) {
            switch (tipo_Entrada) {
                case 1:
                    precio = precio - ((precio * 5)/100);
                    System.out.printf("El precio final de su entrada es de: %.2f€", precio);
                    break;
                
                case 2:
                    System.out.printf("El precio final de su entrada es de: %.2f€", precio);
                    break;

                case 3:
                    precio = precio + ((precio*5)/100);
                    System.out.printf("El precio final de su entrada es de: %.2f€", precio);
                    break;
                default:
                    System.out.println("Introduzca un valor válido.");
                    break;
            }
        }else{
            System.out.println("introduzca un valor válido.");
        }

        s.close();
    }
}
