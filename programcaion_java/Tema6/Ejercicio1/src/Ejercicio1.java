public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int tirada, total;
        total = 0;
        for(int paso = 0; paso < 3; paso++){
            tirada = (int) (Math.random() * 6 + 1);
            System.out.println(tirada);
            total += tirada;
        }
        System.out.println("El total es: " + total);
    }
}
