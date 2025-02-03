import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Gestion {
        private HashMap <String, ArrayList<Integer>> diccionario = new HashMap<>();

    public void añadirDiccionario(String provincia){
        ArrayList<Integer> codpost = new ArrayList<>();
        diccionario.put(provincia, codpost);
        saltoLinea();
    }

    public void buscar(String provincia){
        if(diccionario.containsKey(provincia)){
            System.out.printf("La provincia %s. Tiene los siguientes códigos postales: ", diccionario.get(provincia));
            for(int paso = 0; paso < diccionario.get(provincia).size(); paso++){
                if(paso == diccionario.get(provincia).size()-1){
                    System.out.printf("%d.", diccionario.get(provincia).get(paso));
                }else{
                    System.out.printf(" %d, ", diccionario.get(provincia).get(paso));
                }
            }
        }else{
            System.out.println("La provincia no existe");
        }
    }

    public int contieneProvinciaAgregar(String provincia){
        int contadorContener = 0;
        if(diccionario.size() == 0){
            contadorContener++;
            return contadorContener;
        }else if(diccionario.containsKey(provincia)){
            return contadorContener;
        }else{
            return -1;
        }
    }

    public void eliminarProvincia(String provincia){
                if(diccionario.containsKey(provincia)){
                    diccionario.remove(provincia);
                }else{
                    System.out.println("La provincia introducida no existe.");
                }
        }

    public void contieneProvinciaEliminar(String provincia){
                saltoLinea();
                if(diccionario.containsKey(provincia)){
                }else{
                    saltoLinea();
                    System.out.println("\t\t\tLa provincia introducida no existe.");
                }
    }

    public void eliminarCodigoPostal(int cp, String provincia){
        if(diccionario.get(provincia).contains(cp)){
            diccionario.get(provincia).remove(diccionario.get(provincia).indexOf(cp));
        }else{
            saltoLinea();
            System.out.println("\t\t\tEl código postal introducido no se encuentra en la ciudad.");
        }
    }

        public void mostrar(){
            for(Map.Entry<String, ArrayList<Integer>> clave:diccionario.entrySet()){
                String clava = clave.getKey();
                ArrayList <Integer> valores = clave.getValue();
                System.out.printf("La provincia: %s. Tiene los siguientes códigos postales:", clava);
                for(int paso = 0; paso < valores.size(); paso++){
                    if(paso == valores.size()-1){
                        System.out.printf("%d.", valores.get(paso));
                    }else{
                        System.out.printf(" %d, ", valores.get(paso));
                    }
                }
                System.out.println();
            }
            System.out.println("Pulse ENTER para continuar");
        }

    public boolean existeCodigoPostal(String ciudad, int cp){
        if((diccionario.get(ciudad)).contains(cp)){
            saltoLinea();
            System.out.println("\t\t\tEl código postal ya existe");
            saltoLinea();
            System.out.printf("\t\t\tIntroduzca un codigo postal válido: ");
            return true;
        }else{
            diccionario.get(ciudad).add(cp);
            return false;
        }
    }

    public void saltoLinea(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
    }
}
