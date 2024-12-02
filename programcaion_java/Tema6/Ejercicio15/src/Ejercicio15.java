public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        int numCompas = (int)(Math.random()*29);
        if (comprobacion(numCompas)) {
            for(int compas = 0; compas < numCompas/4; compas++){
                for(int notas = 0; notas < 4; notas++){
                    System.out.printf(notaMusical() +" ");
                }
                System.out.printf("|");
            }
            System.out.println("|");
        }
    }

    public static boolean comprobacion(int numCompas){
        if(numCompas < 4 || numCompas > 28 || numCompas % 4 != 0){
            return false;
        }else{
            return true;
        }
    }

    public static String notaMusical(){
        switch ((int)(Math.random()*4+1)) {
            case 1:
                return "do";
            case 2:
                return "re";
            case 3:
                return "mi";
            case 4:
                return "fa";
            case 5:
                return "sol";
            case 6:
                return "la";
            case 7:
                return "si";
            default:
                return "Error";
        }
    }
}
