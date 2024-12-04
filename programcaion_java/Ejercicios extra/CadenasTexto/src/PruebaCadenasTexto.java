import java.util.Scanner;

import org.alanturing.texto.CadenasTexto;

public class PruebaCadenasTexto {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca una frase: ");
        String texto = s.nextLine();

        System.out.println(CadenasTexto.contadorVocales(texto));
        System.out.println(CadenasTexto.InvertirPalabra(texto));
        System.out.println(CadenasTexto.esPalindromo(texto));

        s.close();
    }
}
