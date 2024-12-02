public class Ejercicio23 {
    public static void main(String[] args) throws Exception {
        for(int veces = 0; veces < 5; veces++){
            System.out.println(tirada_dados());
        }
    }

    public static int dado(){
        int num;
        num = (int)(Math.random()*6)+1;
        return num;
    }

    public static String tirada_dados(){
        switch (dado()) {
            case 1:
                return "As";
            case 2:
                return "K";
            case 3:
                return "Q";
            case 4:
                return "J";
            default:
                return String.valueOf(dado());
        }
    }
}
