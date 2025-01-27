public class Banco {
    public static void main(String[] args) throws Exception {
        menu();
    }

    private static void menu(){
        GestionBanco banco = new GestionBanco();
        banco.menu();
    }
}
