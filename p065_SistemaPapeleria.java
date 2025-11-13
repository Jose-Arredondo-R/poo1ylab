import java.util.Scanner;

public class p065_SistemaPapeleria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numVenta = 0;
        int cantCarta = 0, cantOficio = 0, cantDoble = 0;
        int totalCarta = 0, totalOficio = 0, totalDoble = 0;
        char otraVenta;

        System.out.println("---------------------------------");
        System.out.println("Papelería la Malena, SA. de CV.");
        System.out.println("Sistema de ventas de copias");
        System.out.println("---------------------------------");

        do {
            numVenta++;
            System.out.print("Venta: " + numVenta + "\n");
            System.out.print("Tipo de copia (C)arta $3,(O)ficio $4,(D)oble Of $6? ");
            char tipo = sc.next().toUpperCase().charAt(0);

            System.out.print("Cantidad ? ");
            int cantidad = sc.nextInt();

            switch (tipo) {
                case 'C':
                    cantCarta += cantidad;
                    totalCarta += cantidad * 3;
                    break;
                case 'O':
                    cantOficio += cantidad;
                    totalOficio += cantidad * 4;
                    break;
                case 'D':
                    cantDoble += cantidad;
                    totalDoble += cantidad * 6;
                    break;
                default:
                    System.out.println("Tipo no válido. No se registrará la venta.");
                    numVenta--;
                    break;
            }

            System.out.print("Otra venta (S/N) ? ");
            otraVenta = sc.next().toUpperCase().charAt(0);

        } while (otraVenta == 'S');

        // Calcular totales
        int totalCopias = cantCarta + cantOficio + cantDoble;
        int totalVentas = totalCarta + totalOficio + totalDoble;

        // Mostrar resumen
        System.out.println("---------------------------------------");
        System.out.println("Resumen diario de ventas");
        System.out.println("---------------------------------------");
        System.out.println("Ventas realizadas: " + numVenta);
        System.out.println("-------------------------");
        System.out.printf("Carta : %d - $ %d\n", cantCarta, totalCarta);
        System.out.printf("Oficio : %d - $ %d\n", cantOficio, totalOficio);
        System.out.printf("Doble Of. : %d - $ %d\n", cantDoble, totalDoble);
        System.out.println("-------------------------");
        System.out.printf("Tot. Ventas : %d - $ %d\n", totalCopias, totalVentas);

        // Mensaje según el total
        if (totalVentas < 50)
            System.out.println("Esta venta es una : Venta moderada");
        else if (totalVentas <= 100)
            System.out.println("Esta venta es una : Venta frecuente");
        else
            System.out.println("Esta venta es una : Venta superada");

        sc.close();
    }
}
