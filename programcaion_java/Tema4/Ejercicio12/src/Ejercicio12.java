import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("1.¿Qué significan las siglas EDES?");
        System.out.println("  a. Edamame");
        System.out.println("  b. End Game");
        System.out.println("  c. Entornos de desarrollo");
        String respuesta = s.nextLine();
        int contador = 0;

        if (respuesta.equals("c")){
            contador += 1;
        }else{
            contador -= 1;
        }

        System.out.println("2.¿Qué es java?");
        System.out.println("  a. Una comida");
        System.out.println("  b. Un lenguaje de programación");
        System.out.println("  c. El nombre de un bebe");
        respuesta = s.nextLine();

        if (respuesta.equals("b")){
            contador +=1;
        }else{
            contador -= 1;
        }

        System.out.println("3. Un intérprete  y un compilador lo mismo");
        System.out.println("  a. Verdadero");
        System.out.println("  b. Falso");
        System.out.println("  c. Depende del contexto");
        respuesta = s.nextLine();

        if (respuesta.equals("b")){
            contador += 1;
        }else{
            contador -=1;
        }

        System.out.println("4. ¿Cuáles son los principales componentes de la estructura de Von Neumann?");
        System.out.println("  a. Transistor, E/S , ALU, Bus");
        System.out.println("  b. ALU, E/S, Unidad de control, Bus, Socket");
        System.out.println("  c. ALU, E/S, Unidad de control, Bus");
        respuesta = s.nextLine();

        if (respuesta.equals("c")){
            contador += 1;
        }else{
            contador -=1;
        }

        System.out.println("5. ¿En PseInt se puede programar orientado a objetos?");
        System.out.println("  a. Si");
        System.out.println("  b. No");
        System.out.println("  c. Claro que si pishita");
        respuesta = s.nextLine();

        if (respuesta.equals("b")){
            contador += 1;
        }else{
            contador -=1;
        }

        System.out.println("La nota sacada en el examen es de: " + contador*2);


        s.close();
    }
}
