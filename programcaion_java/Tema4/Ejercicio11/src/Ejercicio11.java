import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca la hora: ");
        int hora = s.nextInt();
        System.out.printf("Introduzca los minutos: ");
        int mins = s.nextInt();

        if (mins > 60 || hora > 23){
            System.out.println("Introduzca una hora válida.");
        }else if (mins == 60) {
            mins = mins -60;
            hora = hora + 1;
            int mins_rest = 60 - mins;
            int hora_rest = 23 - hora;
            int segundos = (mins_rest * 60) + (hora_rest * 3600);
            System.out.println("Los segundos faltantes desde " + hora + ":" + mins + " hasta media noche son: " + segundos);
        }else{
            int mins_rest = 60 - mins;
            int hora_rest = 23 - hora;
            int segundos = (mins_rest * 60) + (hora_rest * 3600);
            System.out.println("Los segundos faltantes desde " + hora + ":" + mins + " hasta media noche son: " + segundos);
        }
        
        s.close();
    }
}
