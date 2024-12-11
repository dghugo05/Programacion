public class Animal {

    private String sexo, raza, nombre;
    private int edad;
    private double altura, peso;

    Animal(int edad, String sexo, String nombre){
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;
    }

    Animal(String raza, double altura, double peso){
        this.raza = raza;
        this.altura = altura;
        this.peso = peso;
    }
}