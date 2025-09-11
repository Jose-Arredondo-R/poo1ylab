import java.util.Scanner;

public class p048_ImparesAscendente {
    public static void main(String[] args) {
        int n;
        int contador = 0;
        float prom;
        float suma = 0;
        char continuar;
        Scanner sc = new Scanner(System.in);
        Scanner obj = new Scanner(System.in);
        do {
            System.out.println(" dame el limite de los numeros impares ");
            n = obj.nextInt();
            System.out.println(" numeros impares entre 1 a " + n);
            for (int i = 1; i <= n; i += 2) {
                System.out.print(" " + i);
                suma += i;
                contador++;
            }
            if (contador > 0) {
                prom = suma / contador;
            } else {
                prom = 0;
            }
            System.out.printf(" La suma es : %.2f ", suma);
            System.out.printf(" Elpromedio es : %.2f ", prom);
            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = sc.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        sc.close();
    }

}