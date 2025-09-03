    import java.util.Scanner;

public class p033_NumerosConsecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el primer número: ");
        int n1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int n3 = sc.nextInt();

        // Verificación
        if (n2 == n1 + 1 && n3 == n2 + 1) {
            System.out.println("Los números " + n1 + ", " + n2 + ", " + n3 + " son consecutivos.");
        } else {
            System.out.println("Los números no son consecutivos.");
        }

        sc.close();
    }
}

