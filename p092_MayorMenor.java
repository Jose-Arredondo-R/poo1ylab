import java.util.Scanner;

class p092_MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas ingresar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nElementos del arreglo:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < n; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("\n\nNúmero mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }
}
