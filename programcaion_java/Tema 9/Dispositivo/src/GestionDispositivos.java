import java.util.Arrays;
import java.util.Scanner;

public class GestionDispositivos{
    private Dispositivo [] dispositivos;
    private Dispositivo [] aux_Dispositivos;

    public GestionDispositivos(){
        dispositivos = new Dispositivo[0];
    }

    private int pedirEntero(){
        Scanner s = new Scanner(System.in);
        int entero = 0;
        boolean bandera = true;
        while(bandera){
            try{
                entero = s.nextInt();
                bandera = false;
            }catch (Exception e){
                System.out.println("Error, ingrese un valor entero.");
            }
        }
        return entero;
    }

    public void agregarDispositivo(){
        int cantidad, seleccion;
        Scanner s = new Scanner(System.in);
        System.out.printf("Cuantos dispositivos quieres agregar: ");
        cantidad = pedirEntero();
        aux_Dispositivos = Arrays.copyOf(dispositivos, dispositivos.length + cantidad);
        dispositivos = Arrays.copyOf(aux_Dispositivos, aux_Dispositivos.length);

        for(int paso = 0; paso < cantidad; paso++){
            System.out.printf("Seleccion el tipo de dispositivo:\n");
            System.out.printf("1. Computadora\n");
            System.out.printf("2. Televisor\n");
            seleccion = pedirEntero();
            selection(seleccion, Dispositivo.getContadorDispositivo());
        }
        s.close();
        
    }

    private void selection(int seleccion, int pasoArray){
        switch (seleccion) {
            case 1:
                    crearComputadora(pasoArray);
                break;
            case 2:
                crearTelevisor(pasoArray);
            default:
                break;
        }
    }

    private void crearTelevisor(int pasoArray){
        Scanner s = new Scanner(System.in);
        System.out.printf("Ingrese el tamaño del televisor: ");
        int tamaño = pedirEntero();
        System.out.printf("Ingrese la tecnología del televisor: ");
        String tecnologia = s.nextLine();
        System.out.printf("Ingrese3 la marca del televisor: ");
        String marca = s.nextLine();

        dispositivos[pasoArray] = new Televisor(tamaño, tecnologia, marca);
    }

    private void crearComputadora(int pasoArray){
        Scanner s = new Scanner(System.in);
        System.out.printf("Ingrese la RAM de la computadora: ");
        String ram = s.nextLine();
        System.out.printf("Ingrese el disco de la computadora: ");
        String disco = s.nextLine();
        System.out.printf("Ingrese el procesador de la computadora: ");
        String procesador = s.nextLine();
        System.out.printf("Ingrese al marca de la computadora: ");
        String marca = s.nextLine();
        dispositivos[pasoArray] = new Computadora(ram, disco, procesador, marca);
    }

    public void mostrarDispositivos(){
        for(int paso = 0; paso < Dispositivo.getContadorDispositivo(); paso++){
            ((Encendible)dispositivos[paso]).encender();
            System.out.println(dispositivos[0]);
        }
    }

    public void apagarDispositivos(){
        for(int paso = 0; paso < Dispositivo.getContadorDispositivo(); paso++){
            ((Encendible)dispositivos[paso]).apagar();
            System.out.println(dispositivos[paso]);
        }
        System.out.printf("Cantidad de dispositivos guardados: ", dispositivos.length);
    }

    public void mostrarComputadora(){
        for(int paso = 0; paso < Dispositivo.getContadorDispositivo(); paso++){
            if(dispositivos[0] instanceof Computadora){
                System.out.println(dispositivos[0]);
            }
        }
        System.out.printf("Cantidad de dispositivos guardados: ", dispositivos.length);
    }

    public void mostrarTelevisor(){
        for(int paso = 0; paso < Dispositivo.getContadorDispositivo(); paso++){
            if(dispositivos[0] instanceof Televisor){
                System.out.println(dispositivos[0]);
            }
        }
        System.out.printf("Cantidad de dispositivos guardados: ", dispositivos.length);
    }
}