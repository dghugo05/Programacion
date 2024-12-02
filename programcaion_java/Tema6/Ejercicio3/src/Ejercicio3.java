public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        String palo, carta;
        int numeroCarta;
        palo = "";
        carta = "";
        for(int paso = 0; paso < 3; paso++){
            switch ((int)(Math.random()*4+1)) {
                case 1:
                    palo = "Oros";
                    break;
                case 2:
                    palo = "Bastos";
                    break;
                case 3:
                    palo = "Copas";
                    break;
                case 4:
                    palo = "Espadas";
                    break;
            }
            numeroCarta = (int)(Math.random()*10+1);
            switch (numeroCarta) {
                case 1:
                    carta = "As";
                    break;
                case 8:
                    carta = "Sota";
                    break;
                case 9:
                    carta = "Caballo";
                    break;
                case 10:
                    carta = "Rey";
                    break;
                default:
                    carta = String.valueOf(numeroCarta);
                    break;
            }    
            System.out.printf("%s de %s\n", carta, palo);
        }
    }
}
