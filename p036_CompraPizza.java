import java.util.Scanner;

public class p036_CompraPizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precio = 0;
        System.out.println("Elija tamaño de pizza (chica $5, mediana $10, grande $20): ");
        String tamaño = sc.nextLine();

        if (tamaño.equalsIgnoreCase("chica")) {
            precio = 5;
        } else if (tamaño.equalsIgnoreCase("mediana")) {
            precio = 10;
        } else if (tamaño.equalsIgnoreCase("grande")) {
            precio = 20;
        } else {
            System.out.println("Tamaño no válido.");
            sc.close();
            return;
        }

        System.out.println("¿Cuántas pizzas desea comprar?");
        int cantidad = sc.nextInt();

        double total = precio * cantidad;
        double descuento = (total > 2000) ? total * 0.15 : 0;
        double totalFinal = total - descuento;

        // Salida
        System.out.println("\n--- Resumen ---");
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total sin descuento: $" + total);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);

        sc.close();
    }
}
