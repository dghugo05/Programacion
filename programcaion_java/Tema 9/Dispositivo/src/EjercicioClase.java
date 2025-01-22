import java.util.Scanner;

public class EjercicioClase {
    public static void main(String[] args) throws Exception {
        GestionDispositivos gestion = new GestionDispositivos();

        gestion.agregarDispositivo();
        gestion.mostrarDispositivos();
        gestion.mostrarComputadora();
        gestion.mostrarTelevisor();
    }

    public void menu(){
        Scanner s = new Scanner(System.in);

    }
}
