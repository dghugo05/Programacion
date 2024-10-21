import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana:");
        int horas = s.nextInt();
        if (horas > 40) {
            int hora_1 = 40 * 12;
            int hora_2 = (horas - 40) * 16;
            int hora_total = hora_1 + hora_2;
            System.out.printf("El sueldo semanal que le corresponde es de " + hora_total + " euros");
        }else{
            int hora_total = horas * 12;
            System.out.printf("El sueldo semanal que le corresponde es de " + hora_total + " euros");
        }

        s.close();
    }
}
