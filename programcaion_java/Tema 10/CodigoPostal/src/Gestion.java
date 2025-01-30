import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Gestion {

        private HashMap <String, ArrayList<Integer>> diccionario = new HashMap<>();

    public void Agregar(String ciudad){
        Scanner s = new Scanner(System.in);
        if(diccionario.containsKey(ciudad)){
            System.out.printf("\t\t\tIntroduzca el código postal que desea agregar");
            int cp = pedirEntero();
            if((diccionario.get(ciudad)).contains(cp)){
                System.out.println("\t\t\tEl código postal ya existe");
            }else{
                diccionario.get(ciudad).add(cp);
            }
        }else{
            System.out.println("\t\t\t¿Desea agregar " + ciudad + " al diccionario?(Y/N)");
            if(s.nextLine() == "Y"){
                ArrayList<Integer> cp = new ArrayList<>();
                diccionario.put(ciudad, cp);
            }
        }
        s.close();
    } 

    public int pedirEntero(){
        Scanner s = new Scanner(System.in);
        boolean badnera = true;
        int entero = 0;
        while(badnera){
            try{
                entero = s.nextInt();
                badnera = false;
            }catch (Exception e){
                System.out.println("\t\t\tError, por favor ingrese un número entero.");
            }
        }
        s.close();
        return entero;
    }
}
