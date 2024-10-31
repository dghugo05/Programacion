import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Introduzca la base imponible: ");
        double imponible = s.nextInt();
        System.out.printf("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        s.nextLine();
        String IVA = s.nextLine();
        System.out.printf("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String cod = s.nextLine();

        switch (IVA.toLowerCase()) {
            case "general":
                int iva = 21;
                double promo = 0;
                double iva_pre = (imponible*iva)/100;
                double pre_iva = imponible + ((imponible*iva)/100);
                double total = imponible + ((imponible*iva)/100);
                switch (cod) {
                    case "nopro":
                        promo = 0;
                        total = total-promo;
                        System.out.printf("Base imponible %16.2f \n", imponible);
                        System.out.printf("IVA (%%%d) %21.2f \n", iva, iva_pre);
                        System.out.printf("Precio con IVA %16.2f \n", pre_iva);
                        System.out.printf("Cód. promo. (%s): %10.2f \n", cod, -(promo));
                        System.out.printf("TOTAL %25.2f \n", total);
                        break;
                    
                    case "mitad":
                        promo = pre_iva/2;
                        total = total-promo;
                        System.out.printf("Base imponible %16.2f \n", imponible);
                        System.out.printf("IVA (%%%d) %21.2f \n", iva, iva_pre);
                        System.out.printf("Precio con IVA %16.2f \n", pre_iva);
                        System.out.printf("Cód. promo. (%s): %10.2f \n", cod, -(promo));
                        System.out.printf("TOTAL %25.2f \n", total);
                        break;

                    case "meno5":
                        promo = 5;
                        total = total-promo;
                        System.out.printf("Base imponible %16.2f \n", imponible);
                        System.out.printf("IVA (%%%d) %21.2f \n", iva, iva_pre);
                        System.out.printf("Precio con IVA %16.2f \n", pre_iva);
                        System.out.printf("Cód. promo. (%s): %10.2f \n", cod, -(promo));
                        System.out.printf("TOTAL %25.2f \n", total);
                        break;

                    case "5porc":
                        promo = (total*5)/100;
                        total = total-promo;
                        System.out.printf("Base imponible %16.2f \n", imponible);
                        System.out.printf("IVA (%%%d) %21.2f \n", iva, iva_pre);
                        System.out.printf("Precio con IVA %16.2f \n", pre_iva);
                        System.out.printf("Cód. promo. (%s): %10.2f \n", cod, -(promo));
                        System.out.printf("TOTAL %25.2f \n", total);
                        break;
                
                    default:
                        System.out.println("Introduzca un valor válido.");
                        break;
                }
                
                break;

            case "reducido":
                iva = 10;
                promo = 0;
                iva_pre = (imponible*iva)/100;
                pre_iva = imponible + ((imponible*iva)/100);
                total = imponible + ((imponible*iva)/100);
                switch (cod) {
                    case "nopro":
                        promo = 0;
                        total = total-promo;
                        System.out.printf("Base imponible %16.2f \n", imponible);
                        System.out.printf("IVA (%%%d) %21.2f \n", iva, iva_pre);
                        System.out.printf("Precio con IVA %16.2f \n", pre_iva);
                        System.out.printf("Cód. promo. (%s): %10.2f \n", cod, -(promo));
                        System.out.printf("TOTAL %25.2f \n", total);
                        break;
                    
                    case "mitad":
                        promo = pre_iva/2;
                        total = total-promo;
                        System.out.printf("Base imponible %16.2f \n", imponible);
                        System.out.printf("IVA (%%%d) %21.2f \n", iva, iva_pre);
                        System.out.printf("Precio con IVA %16.2f \n", pre_iva);
                        System.out.printf("Cód. promo. (%s): %10.2f \n", cod, -(promo));
                        System.out.printf("TOTAL %25.2f \n", total);
                        break;

                    case "meno5":
                        promo = 5;
                        total = total-promo;
                        System.out.printf("Base imponible %16.2f \n", imponible);
                        System.out.printf("IVA (%%%d) %21.2f \n", iva, iva_pre);
                        System.out.printf("Precio con IVA %16.2f \n", pre_iva);
                        System.out.printf("Cód. promo. (%s): %10.2f \n", cod, -(promo));
                        System.out.printf("TOTAL %25.2f \n", total);
                        break;

                    case "5porc":
                        promo = (total*5)/100;
                        total = total-promo;
                        System.out.printf("Base imponible %16.2f \n", imponible);
                        System.out.printf("IVA (%%%d) %21.2f \n", iva, iva_pre);
                        System.out.printf("Precio con IVA %16.2f \n", pre_iva);
                        System.out.printf("Cód. promo. (%s): %10.2f \n", cod, -(promo));
                        System.out.printf("TOTAL %25.2f \n", total);
                        break;
                
                    default:
                        System.out.println("Introduzca un valor válido.");
                        break;
                }
                break;
            
            case "superreducido":
                iva = 4;
                promo = 0;
                iva_pre = (imponible*iva)/100;
                pre_iva = imponible + ((imponible*iva)/100);
                total = imponible + ((imponible*iva)/100);
                switch (cod) {
                    case "nopro":
                        promo = 0;
                        total = total-promo;
                        System.out.printf("Base imponible %16.2f \n", imponible);
                        System.out.printf("IVA (%%%d) %21.2f \n", iva, iva_pre);
                        System.out.printf("Precio con IVA %16.2f \n", pre_iva);
                        System.out.printf("Cód. promo. (%s): %10.2f \n", cod, -(promo));
                        System.out.printf("TOTAL %25.2f \n", total);
                        break;
                    
                    case "mitad":
                        promo = pre_iva/2;
                        total = total-promo;
                        System.out.printf("Base imponible %16.2f \n", imponible);
                        System.out.printf("IVA (%%%d) %21.2f \n", iva, iva_pre);
                        System.out.printf("Precio con IVA %16.2f \n", pre_iva);
                        System.out.printf("Cód. promo. (%s): %10.2f \n", cod, -(promo));
                        System.out.printf("TOTAL %25.2f \n", total);
                        break;

                    case "meno5":
                        promo = 5;
                        total = total-promo;
                        System.out.printf("Base imponible %16.2f \n", imponible);
                        System.out.printf("IVA (%%%d) %21.2f \n", iva, iva_pre);
                        System.out.printf("Precio con IVA %16.2f \n", pre_iva);
                        System.out.printf("Cód. promo. (%s): %10.2f \n", cod, -(promo));
                        System.out.printf("TOTAL %25.2f \n", total);
                        break;

                    case "5porc":
                        promo = (total*5)/100;
                        total = total-promo;
                        System.out.printf("Base imponible %16.2f \n", imponible);
                        System.out.printf("IVA (%%%d) %21.2f \n", iva, iva_pre);
                        System.out.printf("Precio con IVA %16.2f \n", pre_iva);
                        System.out.printf("Cód. promo. (%s): %10.2f \n", cod, -(promo));
                        System.out.printf("TOTAL %25.2f \n", total);
                        break;
                
                    default:
                        System.out.println("Introduzca un valor válido.");
                        break;
                }
                
            default:
                System.out.println("Introduzca un valor válido.");
                break;
        }
        
        
        s.close();
    }
}
