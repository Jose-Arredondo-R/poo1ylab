import java.util.Scanner;
public class p054_ArribaAbajo {
    public static void main(String[] args) {
        char opcion;
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("arriba o abajo ");
        System.out.println(" [1] arriba de 1 a n  ");
        System.out.println(" [2] abajo  de n a 1  ");
        System.out.println(" [3] salir ");
        System.out.println("Elige la opcion ? "); opcion = (char) obj.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("imprime numeros de 1 a n ");
                System.out.print("hasta donde ? "); n = obj.nextInt();
                for (int i = 1; i <= n; i++) {
                    System.out.print(" " + i);
                }
                break;
                case 2:
                System.out.println("imprime numeros de n a 1 ");
                System.out.print("desde donde ? "); n = obj.nextInt();
                for (int i = n; i >= 1; i--) {
                    System.out.print(" " + i);
                }
                break;
            case 3:
                System.out.println("salir "); break;
        
            default:
            System.out.println("uy noo elegiste mal ");
                break;
        }

    
    
    }

}
