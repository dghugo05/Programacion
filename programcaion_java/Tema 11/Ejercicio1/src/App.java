import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedWriter escribir = new BufferedWriter(new FileWriter("numeros.dat"));
        BufferedReader leer = new BufferedReader( new FileReader("numeros.dat"));

        String linea1 = "";
        boolean bandera = true;
        int contador = 0;

        while (bandera) {
            if(esPrimo(contador)){
                escribir.write(contador+ "\n");
            }else if(contador > 500){
                bandera = false;
            }
            contador++;
        }
        escribir.close();
        
        while(linea1 != null){
            linea1 = leer.readLine();
            System.out.println(linea1 + "\t");
        }
        leer.close();
    }

    private static boolean esPrimo(int paso){
        boolean bandera = true;
        for(int numero = 2; numero < Math.sqrt(paso); numero++){
            if(paso / numero == 0){
                bandera = false;
            }else{
                bandera = true;
            }
        }
        return bandera;
    }
}
