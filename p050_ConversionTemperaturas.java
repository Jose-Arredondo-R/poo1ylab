import java.util.Scanner;

public class p050_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            int inicial, fin;

            do {
                System.out.print("Temperatura Inicial (°C): ");
                inicial = sc.nextInt();
                System.out.print("Temperatura Final (°C): ");
                fin = sc.nextInt();

                if (fin < inicial) {
                    System.out.println(" Error: La temperatura final no puede ser menor a la inicial. Intenta de nuevo.");
                }
            } while (fin < inicial);

            System.out.println("------------------------------------");
            System.out.println("Centígrados    Farenheit");
            System.out.println("------------------------------------");

            for (int c = inicial; c <= fin; c++) {
                double f = (c * 9.0 / 5.0) + 32;
                System.out.printf("%-12d %.1f\n", c, f);
            }

            System.out.println("------------------------------------");

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = sc.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        sc.close();
    }
}
