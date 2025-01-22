public class Televisor extends Dispositivo implements Encendible{
    private int diagonal;
    private String tecnologia, encendido;

    public Televisor(int diagonal, String tecnologia, String marca) {
        super(marca);
        this.diagonal = diagonal;
        this.tecnologia = tecnologia;
        encendido = "No";
    }

    public String toString(){
        return "Televisor| " + super.toString() + " Diagonal: " + diagonal + ", Tecnologia: " + tecnologia + "¿Esta encendida?" + encendido;
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
