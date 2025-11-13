import java.util.Scanner;

public class p063_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos términos? ");
        int n = sc.nextInt();

        double suma = 0.0;
        System.out.print("Salida: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            if (i < n)
                System.out.print("+");
            suma += 1.0 / i;
        }
        System.out.println("\nSuma " + suma);

        sc.close();
    }
}
