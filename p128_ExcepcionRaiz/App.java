package p128_ExcepcionRaiz;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un número: ");
            double n = sc.nextDouble();

            if (n < 0) {
                throw new Exception("Error no puedo calcular la raíz cuadrada");
            }

            double r = Math.sqrt(n);
            System.out.printf("El resultado es: %.2f\n", r);
        } catch (Exception e) {
            System.out.println("Error no puedo calcular la raíz cuadrada");
        }
    }
}
