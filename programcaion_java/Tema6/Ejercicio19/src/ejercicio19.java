public class ejercicio19{
    public static void main(String[] args) throws Exception {
        int num = 0;
        int minimo = Integer.MAX_VALUE;
        int maximo = 0;
        int total = 0;
        int media = 0;
        for(int paso = 0; paso <= 50; paso++){
            num = (int)(Math.random()*300-100);
            if(espar(num)){
                if (esMayor(maximo, num)) {
                    maximo = num;
                }
            }else if(esImpar(num)){
                if(esMenor(minimo, num)){
                    minimo = num;
                }
            }
            System.out.println(num);
            total += num;
        }
        media = total/50;
        System.out.printf("El máximo de los números pares es : %d\nEl mínimo de los números impares es: %d\nY la media es: %d", maximo, minimo, media);
    }

    public static boolean espar(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean esImpar(int num){
        if(num % 2 != 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean esMenor(int minimo, int num){
        if(num < minimo)
            return true;
        return false;
    }

    public static boolean esMayor(int maximo, int num){
        if(num > maximo)
            return true;
        return false;
    }
}
