import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca su primera nota: ");
        double nota1 = s.nextDouble();
        System.out.printf("Introduzca su segunda nota: ");
        double nota2 = s.nextDouble();
        System.out.printf("Introduzca su tercera nota: ");
        double nota3 = s.nextDouble();
        if (nota1<0 || nota2<0 || nota3<0){
            System.out.println("Las notas introducidas deben ser positivas.");
        }else{
            double media = (nota1 + nota2 + nota3)/3;
            System.out.printf("La nota media de %2.1f, %2.1f, %2.1f, es %2.2f", nota1, nota2, nota3, media);
        }
        s.close();
    }
}
