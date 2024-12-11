public class PruebaCaballo {
    public static void main(String[] args){
        Caballo caballo = new Caballo("macho");

        System.out.println(caballo.getSexo());
        caballo.relinchar();
        caballo.comer("tetas");
    }
}
