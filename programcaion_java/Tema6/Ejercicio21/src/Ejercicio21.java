public class Ejercicio21 {
    public static void main(String[] args) throws Exception {
        for(int paso = 0; paso < 5; paso++){
            System.out.println(moneda() + " - " + caraCruz());
        }
    }
    public static String caraCruz(){
        int num = (int)(Math.random()*2+1);
        if(num == 1){
            return "Cara";
        }else{
            return "Cruz";
        }
    }

    public static String moneda(){
        switch ((int)(Math.random()*8)){
            case 0:
                return "1 céntimo";
            case 1:
                return "2 céntimos";
            case 2:
                return "5 céntimos";
            case 3:
                return "10 céntimos";
            case 4:
                return "20 céntimos";
            case 5:
                return "50 céntimos";
            case 6:
                return "1 euro";
            case 7:
                return "2 euros";
            default:
                return "No hay moneda";
        }
    }
}
