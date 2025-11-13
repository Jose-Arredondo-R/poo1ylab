import java.util.Scanner;

public class p064_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos términos? ");
        int n = sc.nextInt();

        long numero = 0;
        long suma = 0;
        System.out.print("Salida: ");
        for (int i = 1; i <= n; i++) {
            numero = numero * 10 + 1; // construye 1, 11, 111, 1111...
            System.out.print(numero);
            if (i < n)
                System.out.print("+");
            suma += numero;
        }

        System.out.println("\nsuma " + suma);
        sc.close();
    }
}
