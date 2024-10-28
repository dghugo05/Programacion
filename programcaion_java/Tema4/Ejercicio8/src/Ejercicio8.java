import java.util.Scanner;

public class Ejercicio8 {
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
            System.out.printf("La nota media de %2.1f, %2.1f, %2.1f, es %2.2f \n", nota1, nota2, nota3, media);
            if (media < 5){
                System.out.println("La nota sacada es un Insuficicente.");
            }else if (media >= 5 && media < 6){
                System.out.println("La nota es un Suficiente");
            }else if (media >= 6 && media < 7){
                System.out.println("La nota es un Bien");
            }else if (media >= 7 && media < 9){
                System.out.println("La nota es un Notable");
            }else{
                System.out.println("La nota es un Sobresaliente");
            }
        }
        s.close();
    }
}