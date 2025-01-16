public class Gato {
    private String raza, color, nombre;
    private int edad;

    public Gato(String raza, int edad, String color, String nombre) {
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String toString() {
        return "Raza: " + raza + ", edad: " + edad + ", color: " + color + ", nombre: " + nombre;
    }
}
