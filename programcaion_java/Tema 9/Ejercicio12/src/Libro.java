public class Libro extends Publicacion implements Prestable{
    private String prestado;

    public Libro(int ISBN, String titulo, int anoPublicacion){
        super(ISBN, anoPublicacion, titulo);
        this.prestado = "no prestado";
    }

    @Override
    public void presta(){
        if(prestado != "prestado")
            prestado = "prestado";
    }

    @Override
    public void devuelve(){
        if(prestado == "prestado"){
            prestado = "no prestado";
        }
    }

    @Override
    public boolean estaPrestado(){
        return prestado.equals("prestado");
    }

    public String toString(){
        return super.toString() + "(" + prestado + ")";
    }
}
