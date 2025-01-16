import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca 8 números: ");
        String []numeros = new String[8];
        int num;


        for(int paso = 0; paso < 8; paso++){
            numeros[paso] = s.nextLine();
        }
        
        for(int paso = 0; paso < 8; paso++){
            num = Integer.parseInt(numeros[paso]);
            if(esPar(num)){
                numeros[paso] += " par ";
            }else{
                numeros[paso] += " impar ";
            }
            System.out.printf(numeros[paso] + " ");
        }
        s.close();
    }

    public static boolean esPar(int num){
        return num%2==0;
    }
}
