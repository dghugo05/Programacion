public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        int num;
        int maximo = 0;
        int minimo = Integer.MAX_VALUE;
        int media = 0;

        for(int paso = 0; paso < 50; paso++){
            num = (int)(Math.random()*100 + 100);
            if(num <= minimo){
                minimo = num;
            }
            if(num >= maximo){
                maximo = num;
            }
            media += num;
            System.out.printf(num + "; ");
        }
        System.out.printf("\nEl máximo es: %d\nEl minimo es: %d\nLa media es: %d", maximo, minimo, media/50 );
    }
}
