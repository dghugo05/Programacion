import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca un día de la semana: ");
        String dia = s.nextLine();
        System.out.printf("Introduzca una hora: ");
        int hora = s.nextInt();
        System.out.printf("Introduzca los minutos: ");
        int mins = s.nextInt();

        switch (dia.toLowerCase()) {
            case "lunes":
                if (mins > 60 || hora > 23){
                    System.out.println("Introduzca una hora válida.");
                }else if (mins == 60) {
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 3 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 4 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }else{
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 3 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        int dia_hora = 4 * 24;
                        int hora_rest = 14-hora;
                        int hora_hast = (hora_rest) + dia_hora;
                        long mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d:%d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }
                break;
            case "martes":
                if (mins > 60 || hora > 23){
                    System.out.println("Introduzca una hora válida.");
                }else if (mins == 60) {
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 2 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 3 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }else{
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 2 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        int dia_hora = 3 * 24;
                        int hora_rest = 14-hora;
                        int hora_hast = (hora_rest) + dia_hora;
                        long mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d:%d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }
                
                break;
            case "miercoles":
                if (mins > 60 || hora > 23){
                    System.out.println("Introduzca una hora válida.");
                }else if (mins == 60) {
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 1 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 2 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }else{
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 1 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        int dia_hora = 2 * 24;
                        int hora_rest = 14-hora;
                        int hora_hast = (hora_rest) + dia_hora;
                        long mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d:%d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }
                break;
            case "jueves":
                if (mins > 60 || hora > 23){
                    System.out.println("Introduzca una hora válida.");
                }else if (mins == 60) {
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 0 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 1 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }else{
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 0 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        int dia_hora = 1 * 24;
                        int hora_rest = 14-hora;
                        int hora_hast = (hora_rest) + dia_hora;
                        long mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d:%d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }
                break;
            case "viernes":
                if (mins > 60 || hora > 23){
                    System.out.println("Introduzca una hora válida.");
                }else if (mins == 60) {
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 6 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 0 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }else{
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 6 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        int dia_hora = 0 * 24;
                        int hora_rest = 14-hora;
                        int hora_hast = (hora_rest) + dia_hora;
                        long mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d:%d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }
                break;
            case "sabado":
                if (mins > 60 || hora > 23){
                    System.out.println("Introduzca una hora válida.");
                }else if (mins == 60) {
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 5 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 6 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }else{
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 5 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        int dia_hora = 6 * 24;
                        int hora_rest = 14-hora;
                        int hora_hast = (hora_rest) + dia_hora;
                        long mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d:%d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }
                break;
            case "domingo":
                if (mins > 60 || hora > 23){
                    System.out.println("Introduzca una hora válida.");
                }else if (mins == 60) {
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 4 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 5 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }else{
                    if(hora > 15){
                        mins = mins -60;
                        hora = hora + 1;
                        int dia_hora = 4 * 24;
                        int hora_rest = 14 - hora;;
                        int hora_hast = (hora_rest + (15-hora)) + dia_hora;
                        int mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d : %d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }else{
                        int dia_hora = 5 * 24;
                        int hora_rest = 14-hora;
                        int hora_hast = (hora_rest) + dia_hora;
                        long mins_rest = (60 - mins) + (hora_hast*60);
                        System.out.printf("Los segundos faltantes desde %d:%d del %s hasta el fin de semana son: %d", hora, mins, dia, mins_rest);
                    }
                }
                break;
        
            default:
            System.out.println("introduzca un dia y horas válidos.");
                break;
        }

        s.close();
    }
}
