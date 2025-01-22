public abstract class Publicacion {
    private int ISBN, anoPublicacion;
    private String titulo;

    public Publicacion(int ISBN, int anoPublicacion, String titulo) {
        this.ISBN = ISBN;
        this.anoPublicacion = anoPublicacion;
        this.titulo = titulo;
    }

    public String toString(){
        return "ISBN: " + ISBN + ", título: " + titulo + ", año de publicación: " + anoPublicacion;
    }
}
