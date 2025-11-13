import java.util.Scanner;

public class p078_MedidasLongitud {

    /**
     * Convierte pulgadas a centímetros.
     * 
     * @param pulgadas valor en pulgadas
     * @return valor en centímetros
     */
    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    /**
     * @param metros
     * @return
     */
    public static double metrosAPies(double metros) {
        return metros * 3.281;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("===== CONVERSOR DE MEDIDAS =====");
            System.out.println("1. Pulgadas a centímetros");
            System.out.println("2. Metros a pies");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce pulgadas: ");
                    double pulgadas = sc.nextDouble();
                    System.out.println("Equivalente: " + pulgadasACentimetros(pulgadas) + " cm\n");
                }
                case 2 -> {
                    System.out.print("Introduce metros: ");
                    double metros = sc.nextDouble();
                    System.out.println("Equivalente: " + metrosAPies(metros) + " pies\n");
                }
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida\n");
            }
        } while (opcion != 3);
        sc.close();
    }
}
