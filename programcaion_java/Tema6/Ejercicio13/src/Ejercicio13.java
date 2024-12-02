public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        int dado1 = dado1();
        int dado2 = dado2();
        while (tirada(dado1, dado2)) {
            System.out.println(dado1 + " " + dado2);
            dado1 = dado1();
            dado2 = dado2();
    }
    }

    public static boolean tirada(int dado1, int dado2){
        if (dado1 == dado2) {
            return false;
        }else{
            return true;
        }
    }

    public static int dado1(){
        int dado1 = (int)(Math.random()*6+1);
        return dado1;
    }

    public static int dado2(){
        int dado2 = (int)(Math.random()*6+1);
        return dado2;
    }
}
