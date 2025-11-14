package p131_ExcepcionTemperatura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static double convertir(double c) throws TemperaturaExcesiva {
        if (c > 100) {
            throw new TemperaturaExcesiva("Temperatura demasiado alta, no se puede convertir");
        }
        return (c - 32) * 5 / 9;  // Según el ejemplo final
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Dame una temperatura en centigrados: ");
                double c = sc.nextDouble();

                double f = convertir(c);

                System.out.printf("%.2f grados centigrados, equivale a %.2f grados farenheit\n", c, f);
                break;

            } catch (InputMismatchException e) {
                System.out.println("La teperatura a convertir, debe ser un valor numérico");
                sc.nextLine();

            } catch (TemperaturaExcesiva e) {
                System.out.println("Error : " + e);
                sc.nextLine();
            }
        }
    }
}
