import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Responda las preguntas con verdadero o falso");
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");
        String respuesta = s.nextLine();
        int contador = 0;

        if (respuesta.toLowerCase().equals("verdadero")){
            contador +=3;
        }

        System.out.println("2. Ha aumentado sus gastos de vestuario");
        respuesta = s.nextLine();

        if (respuesta.toLowerCase().equals("verdadero")){
            contador +=3;
        }

        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
        respuesta = s.nextLine();

        if (respuesta.toLowerCase().equals("verdadero")){
            contador +=3;
        }

        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        respuesta = s.nextLine();

        if (respuesta.toLowerCase().equals("verdadero")){
            contador +=3;
        }

        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        respuesta = s.nextLine();

        if (respuesta.toLowerCase().equals("verdadero")){
            contador +=3;
        }

        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        respuesta = s.nextLine();

        if (respuesta.toLowerCase().equals("verdadero")){
            contador +=3;
        }

        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado");
        respuesta = s.nextLine();

        if (respuesta.toLowerCase().equals("verdadero")){
            contador +=3;
        }

        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        respuesta = s.nextLine();

        if (respuesta.toLowerCase().equals("verdadero")){
            contador +=3;
        }

        System.out.println("9. Has notado que últimamente se perfuma más");
        respuesta = s.nextLine();

        if (respuesta.toLowerCase().equals("verdadero")){
            contador +=3;
        }

        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        respuesta = s.nextLine();

        if (respuesta.toLowerCase().equals("verdadero")){
            contador +=3;
        }

        if(contador <= 10){
            System.out.println("Puntuación = " + contador + " ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }else if(contador <= 22){
            System.out.println("Puntuación = " + contador + " Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        }else if(contador <= 30){
            System.out.println("Puntuación = " + contador + " Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }
}
