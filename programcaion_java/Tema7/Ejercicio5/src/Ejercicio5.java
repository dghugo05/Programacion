import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Vaya ingresando numeros: ");

        int maximo = 0;
        int minimo = Integer.MAX_VALUE;

        String [] num = new String[10];
        for(int paso = 0; paso < 10; paso++){
            num[paso] = s.nextLine();
        }

        for(String n:num){
            if(Integer.parseInt(n) < minimo){
                minimo = Integer.parseInt(n);
            }else if(Integer.parseInt(n) > maximo){
                maximo = Integer.parseInt(n);
            }
        }
        for(int paso = 0; paso < 10; paso++){
            if(num[paso].equals(Integer.toString(maximo))){
                num[paso] += " Maximo";
            }else if(num[paso].equals(Integer.toString(minimo))){
                num[paso] += " Minimo";
            }
        }
        for(int paso = 0; paso < 10; paso++){
            System.out.printf("%s,", num[paso]);
        }
    }
}
