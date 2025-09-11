import java.util.Scanner;

public class p051_SerieFibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("¿Número de términos que deseas imprimir?: ");
            int n = sc.nextInt();

            System.out.println("Los primeros " + n + " términos de la sucesión Fibonacci son:");

            int a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int siguiente = a + b;
                a = b;
                b = siguiente;
            }

            System.out.println(); // salto de línea

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = sc.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        sc.close();
    }
}
