import java.util.Scanner;

public class p085_NombresEdades {
    public static void main(String[] args) {
        int n, suma = 0, promedio = 0;
        Scanner obj = new Scanner(System.in);

        // Limpiar pantalla (solo funciona en algunas consolas)
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Preguntar cuántos nombres
        System.out.print("¿Cuántos nombres deseas procesar? ");
        n = obj.nextInt();

        String[] nombres = new String[n];
        int[] edades = new int[n];

        // Captura de datos
        for (int i = 0; i < n; i++) {
            obj.nextLine(); // limpiar buffer
            System.out.printf("Dame el nombre %d: ", i + 1);
            nombres[i] = obj.nextLine();
            System.out.printf("Dame la edad de %s: ", nombres[i]);
            edades[i] = obj.nextInt();
        }

        // Mostrar resultados
        System.out.println("\nLos nombres capturados son:\n");
        System.out.printf("Nombre\tEdad\n");

        for (int i = 0; i < n; i++) {
            System.out.printf("%s\t%d\n", nombres[i], edades[i]);
            suma += edades[i];
        }

        promedio = suma / n;
        System.out.printf("\nEl promedio de edades es %d\n", promedio);

        obj.close();
    }
}
