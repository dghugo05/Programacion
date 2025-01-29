import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        for(int paso = 0; paso < 10; paso++) {
            System.out.printf("Ingrese un número: ");
            nums.add(s.nextInt());
        }
        Collections.sort(nums);
        System.out.println("Los números ingresados son: " + nums);
        s.close();
    }
}
