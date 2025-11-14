package p129_ExcepcionDulces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ninos = 0;
        int dulces = 0;

        while (true) {
            try {
                System.out.print("Numero de niños en el barrio : ");
                ninos = sc.nextInt();

                System.out.print("Cantidad de dulces existente : ");
                dulces = sc.nextInt();

                int resultado = dulces / ninos;

                System.out.println("A cada niño le tocan " + resultado + " dulces.");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Los niños y los dulces, deben ser cantidades numéricas");
                sc.nextLine(); // limpiar buffer

            } catch (ArithmeticException e) {
                System.out.println("Si no hay dulces, no puedo repartir dulces");
                sc.nextLine(); // limpiar buffer
            }
        }
    }
}
