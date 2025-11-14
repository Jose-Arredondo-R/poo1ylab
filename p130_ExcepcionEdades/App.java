package p130_ExcepcionEdades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] edades = new int[5];

        System.out.println("Captura las edades de 5 perosnas:");

        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                    System.out.print("Edad persona " + (i + 1) + ": ");
                    edades[i] = sc.nextInt();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Introduce un número entero");
                    sc.nextLine(); // limpiar buffer
                }
            }
        }

        System.out.print("Captura terminada las edades son: ...\n");

        for (int e : edades) {
            System.out.print(e + " ");
        }

        System.out.println();
    }
}
