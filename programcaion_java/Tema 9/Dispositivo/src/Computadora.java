public class Computadora extends Dispositivo implements Encendible{
    private String ram, disco, procesador, encendido;

    public Computadora(String ram, String disco, String procesador, String marca) {
        super(marca);
        this.ram = ram;
        this.disco = disco;
        this.procesador = procesador;
        encendido = "No";
    }

    public String toString(){
        return "Computadora| " + super.toString() + ", RAM: " + ram + ", Disco: " + disco + ", Procesador: " + procesador + "¿Esta encendida?" + encendido;
    }

    
    @Override
    public void encender() {
        if (encendido.equals("No")) {
            encendido = "Si";
        }
    }

    @Override
    public void apagar() {
        if (encendido.equals("Si")) {
            encendido = "No";
        }
    }
}
