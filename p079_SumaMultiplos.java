import java.util.Scanner;

public class p079_SumaMultiplos {

    /**
     * @param ini
     * @param fin
     * @param multiplo
     * @return
     */
    public static int sumaMultiplos(int ini, int fin, int multiplo) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % multiplo == 0)
                suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== SUMA DE MÚLTIPLOS =====");
            System.out.println("1. Suma múltiplos de 3");
            System.out.println("2. Suma múltiplos de 4");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            if (opcion == 1 || opcion == 2) {
                System.out.print("Inicio del rango: ");
                int ini = sc.nextInt();
                System.out.print("Fin del rango: ");
                int fin = sc.nextInt();

                if (ini < fin) {
                    int multiplo = (opcion == 1) ? 3 : 4;
                    int resultado = sumaMultiplos(ini, fin, multiplo);
                    System.out.println("Suma de múltiplos de " + multiplo + ": " + resultado + "\n");
                } else {
                    System.out.println("Error: el inicio debe ser menor que el fin.\n");
                }
            } else if (opcion != 3) {
                System.out.println("Opción inválida\n");
            }
        } while (opcion != 3);

        sc.close();
    }
}
