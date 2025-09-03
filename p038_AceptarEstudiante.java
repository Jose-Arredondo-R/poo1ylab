import java.util.Scanner;

public class p038_AceptarEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Sexo (h/m): ");
        char sexo = sc.next().charAt(0);

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese calificación 1: ");
        double c1 = sc.nextDouble();

        System.out.print("Ingrese calificación 2: ");
        double c2 = sc.nextDouble();

        System.out.print("Ingrese calificación 3: ");
        double c3 = sc.nextDouble();

        // Cálculo del promedio
        double promedio = (c1 + c2 + c3) / 3.0;

        // Condiciones de aceptación
        boolean aceptada = (sexo == 'm' || sexo == 'M') &&
                           edad > 21 &&
                           promedio >= 8 && promedio <= 9.5;

        // Resultado
        System.out.println("\n--- Resultado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        if (aceptada) {
            System.out.println("Estado: ACEPTADA ");
        } else {
            System.out.println("Estado: RECHAZADA ");
        }

        sc.close();
    }
}

