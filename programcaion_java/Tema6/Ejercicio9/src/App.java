public class App {
    public static void main(String[] args) throws Exception {
        int num = 0;
        int contador = 0;
        while(bucle(num)){
            num = (int)(Math.random()*101);
            if(num == 24){
                continue;
            }else if(comprobacionPares(num)){
                System.out.printf("%d ,",num);
                contador++;
            }
        }
        System.out.printf("\nSe han imprimido: %d",contador);
    }

    public static boolean bucle(int num){
        if (num != 24){
            return true;
        }else{
            return false;
        }
    }

    public static boolean comprobacionPares(int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
