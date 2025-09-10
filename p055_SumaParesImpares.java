import java.util.Scanner;
public class p055_SumaParesImpares {
    public static void main(String[] args) {
        char opcion;
        int n;
        int suma = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("imprime suma de pares o impares  ");
        System.out.println(" [1] arriba de 2 a n  ");
        System.out.println(" [2] abajo  de n a 1  ");
        System.out.println(" [3] salir ");
        System.out.println("Elige la opcion ? "); opcion = (char) obj.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("imprime numeros pares de 2 a n ");
                System.out.print("hasta donde ? "); n = obj.nextInt();
                for (int i = 2; i <= n; i+= 2) {
                    System.out.print(" " + i);
                    suma += i;
                }
                System.out.println("\nsuma de pares " + suma);
                break;
                case 2:
                System.out.println("imprime numeros de n a 1 ");
                System.out.print("desde donde ? "); n = obj.nextInt();
                n = (n % 2 == 0) ? n - 1 : n;
                for (int i = n; i >= 1; i -= 2) {
                    System.out.print(" " + i);
                    suma += i;
                }
                System.out.println("\nsuma de impares " + suma);
                break;
            case 3:
                System.out.println("salir "); break;
        
            default:
            System.out.println("uy noo elegiste mal ");
                break;
        }

    
    
    }

}