public class Revista extends Publicacion {
    private int numero;

    public Revista(int ISBN, String titulo, int añoPublicacion, int numero){
        super(ISBN, añoPublicacion, titulo);
        this.numero = numero;
    }

    public String toString(){
        return super.toString() + " Número: " + this.numero;
    }
}
