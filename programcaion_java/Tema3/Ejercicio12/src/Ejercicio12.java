import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la nota del primer examen: ");
        double nota = s.nextDouble();
        System.out.println("¿Qué nota desea sacar en el Trimestre?");
        double trim = s.nextDouble();
        double primer = nota * 0.4;
        double segun = (trim - primer)/0.6;
        System.out.println(segun);
        s.close();
    }
}
