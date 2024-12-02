public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        int num = 0;
        int contador_Suspensos = 0;
        int contador_Suficientes = 0;
        int contador_Bien = 0;
        int contador_Notable = 0;
        int contador_Sobresaliente = 0;
        for(int paso = 0; paso < 20; paso++){
            num = (int)(Math.random()*11);
            switch (num) {
                case 0,1,2,3,4:
                    System.out.println(num);
                    contador_Suspensos++;
                    break;
                case 5:
                    System.out.println(num);
                    contador_Suficientes++;
                    break;
                case 6:
                    System.out.println(num);
                    contador_Bien++;
                    break;
                case 7,8:
                    System.out.println(num);
                    contador_Notable++;
                    break;
                case 9,10:
                    System.out.println(num);
                    contador_Sobresaliente++;
            }
        }
        System.out.printf("Numero suspensos: %d\nNumero suficientes: %d\nNumero bienes: %d\nNumero notables: %d\nNumero sobresalientes: %d", contador_Suspensos, contador_Suficientes, contador_Bien, contador_Notable, contador_Sobresaliente);   
    }
}
