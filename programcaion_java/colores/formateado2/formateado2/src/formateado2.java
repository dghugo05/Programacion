public class formateado2 {
  public static void main(String[] args) {
    System.out.println("  Artículo    Precio/caja   Nºcajas");
    System.out.println("-------------------------------------");
    System.out.printf("%-10s         %8.2f     %6d\n", "manzanas", 4.5, 10);
    System.out.printf("%-10s         %8.2f     %6d\n", "peras", 2.75, 120);
    System.out.printf("%-10s         %8.2f     %6d\n", "aguacates", 10.0, 6);
    System.out.printf("%-10s         %8.2f     %6d\n", "platanos", 3.17, 22);
    System.out.printf("%-10s         %8.2f     %6d\n", "Piñas", 5.75, 2 );
  }
}
