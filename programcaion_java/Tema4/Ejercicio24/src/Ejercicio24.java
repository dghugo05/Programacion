import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("1 - Programador junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.printf("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = s.nextInt();
        System.out.printf("¿Cuántos días ha estado de viaje visitando clientes? ");
        int viaje = s.nextInt();
        System.out.printf("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int estado = s.nextInt();

        double pre_viaje = viaje * 30;

        switch (cargo) {
            case 1:
                double pre_cargo = 950;
                double bruto = pre_cargo+pre_viaje;
                switch (estado) {
                    case 1:
                        int ret_estado = 25;
                        double pre_estado = (bruto*ret_estado)/100;
                        double neto = pre_cargo + pre_viaje - pre_estado;
                        System.out.println("-----------------------------------------");
                        System.out.printf("| Sueldo base %25.2f | \n", pre_cargo);
                        System.out.printf("| Dietas ( %d viajes) %18.2f | \n", viaje, pre_viaje);
                        System.out.println("|---------------------------------------|");
                        System.out.printf("| Sueldo bruto %24.2f | \n", bruto);
                        System.out.printf("| Retención IRPF (%d%%) %16.2f | \n", ret_estado, pre_estado);
                        System.out.println("|---------------------------------------|");
                        System.out.printf("| Sueldo neto %25.2f | \n", neto);
                        System.out.println("-----------------------------------------");
                        break;
                    case 2:
                        ret_estado = 20;
                        pre_estado = (bruto*ret_estado)/100;
                        neto = pre_cargo + pre_viaje - pre_estado;
                        System.out.println("-----------------------------------------");
                        System.out.printf("| Sueldo base %25.2f | \n", pre_cargo);
                        System.out.printf("| Dietas ( %d viajes) %18.2f | \n", viaje, pre_viaje);
                        System.out.println("|---------------------------------------|");
                        System.out.printf("| Sueldo bruto %24.2f | \n", bruto);
                        System.out.printf("| Retención IRPF (%d%%) %16.2f | \n", ret_estado, pre_estado);
                        System.out.println("|---------------------------------------|");
                        System.out.printf("| Sueldo neto %25.2f | \n", neto);
                        System.out.println("-----------------------------------------");
                        break;
                
                    default:
                        System.out.println("Introduzca un valor válido.");
                        break;
                }
                break;
            case 2:
                pre_cargo = 1200;
                bruto = pre_cargo+pre_viaje;
                switch (estado) {
                    case 1:
                        int ret_estado = 25;
                        double pre_estado = (bruto*ret_estado)/100;
                        double neto = pre_cargo + pre_viaje - pre_estado;
                        System.out.println("-----------------------------------------");
                        System.out.printf("| Sueldo base %25.2f | \n", pre_cargo);
                        System.out.printf("| Dietas ( %d viajes) %18.2f | \n", viaje, pre_viaje);
                        System.out.println("|---------------------------------------|");
                        System.out.printf("| Sueldo bruto %24.2f | \n", bruto);
                        System.out.printf("| Retención IRPF (%d%%) %16.2f | \n", ret_estado, pre_estado);
                        System.out.println("|---------------------------------------|");
                        System.out.printf("| Sueldo neto %25.2f | \n", neto);
                        System.out.println("-----------------------------------------");
                        break;
                    case 2:
                        ret_estado = 20;
                        pre_estado = (bruto*ret_estado)/100;
                        neto = pre_cargo + pre_viaje - pre_estado;
                        System.out.println("-----------------------------------------");
                        System.out.printf("| Sueldo base %25.2f | \n", pre_cargo);
                        System.out.printf("| Dietas ( %d viajes) %18.2f | \n", viaje, pre_viaje);
                        System.out.println("|---------------------------------------|");
                        System.out.printf("| Sueldo bruto %24.2f | \n", bruto);
                        System.out.printf("| Retención IRPF (%d%%) %16.2f | \n", ret_estado, pre_estado);
                        System.out.println("|---------------------------------------|");
                        System.out.printf("| Sueldo neto %25.2f | \n", neto);
                        System.out.println("-----------------------------------------");
                        break;
                
                    default:
                        System.out.println("Introduzca un valor válido.");
                        break;
                }
                break;
            case 3:
                pre_cargo = 950;
                bruto = pre_cargo+pre_viaje;
                switch (estado) {
                    case 1:
                        int ret_estado = 25;
                        double pre_estado = (bruto*ret_estado)/100;
                        double neto = pre_cargo + pre_viaje - pre_estado;
                        System.out.println("-----------------------------------------");
                        System.out.printf("| Sueldo base %25.2f | \n", pre_cargo);
                        System.out.printf("| Dietas ( %d viajes) %18.2f | \n", viaje, pre_viaje);
                        System.out.println("|---------------------------------------|");
                        System.out.printf("| Sueldo bruto %24.2f | \n", bruto);
                        System.out.printf("| Retención IRPF (%d%%) %16.2f | \n", ret_estado, pre_estado);
                        System.out.println("|---------------------------------------|");
                        System.out.printf("| Sueldo neto %25.2f | \n", neto);
                        System.out.println("-----------------------------------------");
                        break;
                    case 2:
                        ret_estado = 20;
                        pre_estado = (bruto*ret_estado)/100;
                        neto = pre_cargo + pre_viaje - pre_estado;
                        System.out.println("-----------------------------------------");
                        System.out.printf("| Sueldo base %25.2f | \n", pre_cargo);
                        System.out.printf("| Dietas ( %d viajes) %18.2f | \n", viaje, pre_viaje);
                        System.out.println("|---------------------------------------|");
                        System.out.printf("| Sueldo bruto %24.2f | \n", bruto);
                        System.out.printf("| Retención IRPF (%d%%) %16.2f | \n", ret_estado, pre_estado);
                        System.out.println("|---------------------------------------|");
                        System.out.printf("| Sueldo neto %25.2f | \n", neto);
                        System.out.println("-----------------------------------------");
                        break;
                
                    default:
                        System.out.println("Introduzca un valor válido.");
                        break;
                }
                break;
        
            default:
                System.out.println("Introduzca un valor válido.");
                break;
        }
        s.close();
    }
}
