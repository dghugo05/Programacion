import java.util.Scanner;

public class GestorGatos {
    Scanner s = new Scanner(System.in);
    Gato[] gatos = new Gato[4];
    private int cogerEntero(){
        
        boolean bandera = true;
        int num = 0;
        while (bandera){
            try{
                num = s.nextInt();
                bandera = false;
            }catch (Exception e){
                System.out.println("Error, tipo de dato erróneo");
            }
        }
        return num;
    }

    public Gato[] crearGatos() {
        String raza, color, nombre;
        int edad;
        for(int paso = 0; paso < gatos.length; paso++) {

            System.out.printf("Introduzca la raza del gato: ");
            raza = s.nextLine();

            System.out.printf("Introduzca la edad del gato: ");
            edad = cogerEntero();
            s.nextLine();

            System.out.printf("Introduzca el color del gato: ");
            color = s.nextLine();

            System.out.printf("Introduzca el nombre del gato: ");
            nombre = s.nextLine();

            
            gatos[paso] = new Gato(raza, edad, color, nombre);
        }
        return gatos;
    }

    public void mostrarGatos() {
        for(Gato gato : gatos ){
            System.out.println(gato);
        }
    }
}
