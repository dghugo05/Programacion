import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("1 - Programador junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.printf("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = s.nextInt();
        System.out.printf("¿Cuántos días ha estado de viaje visitando clientes?");
        System.out.printf("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    }
}
