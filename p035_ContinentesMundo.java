import java.util.Scanner;
public class p035_ContinentesMundo {
    public static void main(String[] args) {
System.out.println("dame un numero del 1 al 6 ");
        int num = new Scanner(System.in).nextInt();
        if (num >= 1 && num <= 6) {
            System.out.println("correcto");
            if (num == 1) {
                System.out.println("Africa");
            } else if (num == 2) {
                System.out.println("America");
            } else if (num == 3) {
                System.out.println("Asia");
            } else if (num == 4) {
                System.out.println("Europa");
            } else if (num == 5) {
                System.out.println("Oceania");
            } else {
                System.out.println("Antartida");
            }
        } else {
            System.out.println("incorrecto");
        }
    }
}