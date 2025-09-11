import java.util.Scanner;

public class p049_ParesDescendente  {
    public static void main(String[] args) {
        int n; 
        int contador;
        float prom;
        float suma;
        char continuar;
        Scanner sc = new Scanner(System.in);

        do {
            suma = 0;
            contador = 0;

            System.out.println("Dame el límite de los números pares: ");
            n = sc.nextInt();

            System.out.println("Números pares entre 100 y " + n + ": ");
            for (int i = 100; i >= n; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    suma += i;
                    contador++;
                }
            }

            if (contador > 0) {
                prom = suma / contador;
            } else {
                prom = 0;
            }

            System.out.printf("\nLa suma es: %.2f", suma);
            System.out.printf("\nEl promedio es: %.2f\n", prom);

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = sc.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        sc.close();
    }
}
