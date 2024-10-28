import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.printf("Escriba su mes de nacimiento: ");
        String mes = s.nextLine();
        System.out.printf("Introduzca su día de nacimiento: ");
        int dia = s.nextInt();

        switch (mes.toLowerCase()) {
            case "enero":
                if (dia < 1 || dia > 31){
                    System.out.println("Asegurese de ingresar un a fecha válida.");
                }else if (dia<20){
                    System.out.println("Su signo zodiacal es Capricornio.");
                }else{
                    System.out.println("su signo zodiacal es Acuario.");
                }
                break;
            case "febrero":
                if (dia < 1 || dia > 29){
                    System.out.println("Asegurese de ingresar un a fecha válida.");
                }else if (dia<19){
                    System.out.println("Su signo zodiacal es Acuario.");
                }else{
                    System.out.println("su signo zodiacal es Piscis.");
                }
                break;
            case "marzo":
                if (dia < 1 || dia > 31){
                    System.out.println("Asegurese de ingresar un a fecha válida.");
                }else if (dia<21){
                    System.out.println("Su signo zodiacal es Piscis.");
                }else{
                    System.out.println("su signo zodiacal es Aries.");
                }
                break;
            case "abril":
                if (dia < 1 || dia > 30){
                    System.out.println("Asegurese de ingresar un a fecha válida.");
                }else if (dia<20){
                    System.out.println("Su signo zodiacal es Aries.");
                }else{
                    System.out.println("su signo zodiacal es Tauro.");
                }
                break;
            case "mayo":
                if (dia < 1 || dia > 31){
                    System.out.println("Asegurese de ingresar un a fecha válida.");
                }else if (dia<21){
                    System.out.println("Su signo zodiacal es Tauro.");
                }else{
                    System.out.println("su signo zodiacal es Géminis.");
                }
                break;
            case "junio":
                if (dia < 1 || dia > 30){
                    System.out.println("Asegurese de ingresar un a fecha válida.");
                }else if (dia<21){
                    System.out.println("Su signo zodiacal es Géminis.");
                }else{
                    System.out.println("su signo zodiacal es Cáncer.");
                }
                break;
            case "julio":
                if (dia < 1 || dia > 31){
                    System.out.println("Asegurese de ingresar un a fecha válida.");
                }else if (dia<23){
                    System.out.println("Su signo zodiacal es Cáncer.");
                }else{
                    System.out.println("su signo zodiacal es Leo.");
                }
                break;
            case "Agosto":
                if (dia < 1 || dia > 31){
                    System.out.println("Asegurese de ingresar un a fecha válida.");
                }else if (dia<23){
                    System.out.println("Su signo zodiacal es Leo.");
                }else{
                    System.out.println("su signo zodiacal es Virgo.");
                }
                break;
            case "septiembre":
                if (dia < 1 || dia > 30){
                    System.out.println("Asegurese de ingresar un a fecha válida.");
                }else if (dia<23){
                    System.out.println("Su signo zodiacal es Virgo.");
                }else{
                    System.out.println("su signo zodiacal es Libra.");
                }
                break;
            case "octubre":
                if (dia < 1 || dia > 31){
                    System.out.println("Asegurese de ingresar un a fecha válida.");
                }else if (dia<23){
                    System.out.println("Su signo zodiacal es Libra.");
                }else{
                    System.out.println("su signo zodiacal es Escorpio.");
                }
                break;
            case "noviembre":
                if (dia < 1 || dia > 30){
                    System.out.println("Asegurese de ingresar un a fecha válida.");
                }else if (dia<22){
                    System.out.println("Su signo zodiacal es Escorpio.");
                }else{
                    System.out.println("su signo zodiacal es Sagitario.");
                }
                break;
            case "diciembre":
                if (dia < 1 || dia > 31){
                    System.out.println("Asegurese de ingresar un a fecha válida.");
                }else if (dia<22){
                    System.out.println("Su signo zodiacal es Sagitario.");
                }else{
                    System.out.println("su signo zodiacal es Capricornio.");
                }
            default:
                System.out.println("Introduzca una fecha válida");
                break;
        }
        s.close();
    }
}
