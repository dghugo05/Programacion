public class Caballo {
    int edad;
    double altura, peso;
    String raza, color, sexo, nombre;

    Caballo(String sexo){
        this.sexo = sexo;
        this.color = color;
        this.altura = altura;
        this.nombre = nombre;
    }

    String getSexo(){
        return this.sexo;
    }

    String getNombre(){
        return this.nombre;
    }

    double getAltura(){
        return this.altura;
    }

    String getColor(){
        return this.color;
    }

    void relinchar(){
        System.out.println("hihihiha");
    }

    public String toString(){
        return "Caballo:" + nombre + "de raza" + raza + "de color" + color + "de altura" + altura;
    }

    void comer(String comida){
        if(comida.equals("zanahoria")){
            System.out.println("mmm zanahoria.");
        }else if(comida.equals("tetas")){
            System.out.println("Si no se tratan de las tetas de tu abuela mejor matate");
        }else{
            System.out.println("Puaaj, solo quiero Zanahorias primo, o te doy plomo.");
        }
    }
}
