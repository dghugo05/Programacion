package org.alanturing.texto;

public class CadenasTexto {
    public static int contadorVocales(String texto) {
        String vocales = "aeiou";
        int contador = 0;
        for(int paso = 0; paso < texto.length(); paso++) {
            if(vocales.indexOf(Character.toLowerCase(texto.charAt(paso))) != -1){
                contador++;
            }
        }
        return contador;
    }

    public static String InvertirPalabra(String texto){
        String invertida = "";
        int largo = texto.length()-1;
        for(int paso = largo; paso >= 0; paso--){
            invertida += texto.charAt(paso);
        }
        return invertida;
    }

    public static String sinEspacio(String texto){
        int largo = texto.length();
        String sinEspacios = "";
        for(int paso = 0; paso < largo; paso++){
            if(texto.charAt(paso) != ' '){
                sinEspacios += texto.charAt(paso);
            }
        }
        return sinEspacios;
    }

    public static String minusculas(String frase){
        int largo = frase.length();
        String frase_Minuscula = "";
        for(int paso = 0; paso < largo; paso++){
            frase_Minuscula += Character.toLowerCase(frase.charAt(paso));
        }
        return frase_Minuscula;
    }

    public static boolean esPalindromo(String frase1){
        String frase_Normal = CadenasTexto.minusculas(CadenasTexto.sinEspacio(frase1));
        String frase_Invertida = CadenasTexto.InvertirPalabra(CadenasTexto.minusculas(CadenasTexto.sinEspacio(frase1)));
        if(frase_Normal.equals(frase_Invertida))
            return true;
        return false;
    }
}
