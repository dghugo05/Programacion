import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = s.nextInt();
        System.out.printf("Ahora introduzca la anchura (como mínimo 4): ");
        int anchura = s.nextInt();
        int posicionPezAltura = (int)(Math.random()*(altura-2)+1);
        int posicionPezAnchura = (int)(Math.random()*(anchura-2)+1);

        if(esValido(altura, anchura)){
            for(int peceraAltura = 0; peceraAltura < altura; peceraAltura++){
                for(int peceraAnchura = 0; peceraAnchura < anchura; peceraAnchura++){
                    if (filaCompleta(peceraAltura, altura)) {
                        System.out.printf("* ");
                    }else if (pezAltura(peceraAnchura, posicionPezAnchura, peceraAltura, posicionPezAltura)) {
                        System.out.printf("& ");
                    }else if (inicioYFinalFila(peceraAnchura, anchura)){
                        System.out.printf("* ");
                    }else{
                        System.out.printf("  ");
                    }
                }
                System.out.println("");
            }
        }


        s.close();
    }

    public static boolean esValido(int altura, int anchura) {
        if (altura >=4 && anchura >=4) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean filaCompleta(int peceraAltura, int altura){
        if(peceraAltura == 0 || peceraAltura == altura-1){
            return true;
        }else{
            return false;
        }
    }

    public static boolean inicioYFinalFila(int peceraAnchura, int anchura){
        if (peceraAnchura == 0 || peceraAnchura == anchura-1) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean pezAltura(int peceraAnchura, int posicionPezAnchura, int peceraAltura, int posicionPezAltura){
        if (peceraAnchura == posicionPezAnchura && peceraAltura == posicionPezAltura) {
            return true;
        }else{
            return false;
        }
    }
}
