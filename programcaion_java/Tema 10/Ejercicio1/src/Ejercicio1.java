import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> compañeros = new ArrayList<>();

        compañeros.add("Hugo");
        compañeros.add("Juan");
        compañeros.add("Pedro");
        compañeros.add("Luis");
        compañeros.add("Carlos");
        compañeros.add("Jorge");

        for(String compañero: compañeros) {
            System.out.println(compañero);
        }
    }
}
