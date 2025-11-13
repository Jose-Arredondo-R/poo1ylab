// p076_NumeroMenor.java
import java.util.Scanner;

public class p076_NumeroMenor {

    /**
      @param a
      @param b
      @param c
      @param d 
      @return 
     */
    public static int menorDeCuatro(int a, int b, int c, int d) {
        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;
        if (d < menor) menor = d;
        return menor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 4 números enteros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println("El menor número es: " + menorDeCuatro(a, b, c, d));
        sc.close();
    }
}
