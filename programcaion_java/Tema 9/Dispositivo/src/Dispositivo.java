public abstract class Dispositivo {
    private static int contadorDispositivo = 0;
    private String marca;

    public Dispositivo(String marca) {
        this.marca = marca;
        contadorDispositivo++;
    }

    public Dispositivo (){ 
    }

    public static int getContadorDispositivo() {
        return contadorDispositivo;
    }

    public static void setContador(int contadorDispositivo){
        Dispositivo.contadorDispositivo = contadorDispositivo;
    }

    public String toString(){
        return "Marca: " + marca;
    }
}
