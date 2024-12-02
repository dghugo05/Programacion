import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Ingrese un número: ");
        int [] num = new int[10];

        for(int paso = 0; paso < 10; paso++){
            int numero = s.nextInt();
            num[paso] = numero;
        }

        for(int paso = 9; paso >= 0; paso--){
            System.out.printf("%d,", num[paso]);
        }
    }
}
