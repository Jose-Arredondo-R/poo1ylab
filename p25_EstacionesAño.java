import java.util.Scanner;

public class p25_EstacionesAño {
    public static void main(String[] args) {
        System.out.println("dame un numero del 1 al 4");
        int est = new Scanner(System.in).nextInt();
        
        if (est >= 1 && est <= 4 ) {
            System.out.println("correcto");
            if (est == 1) {
                System.out.println("Primavera (Marzo, abril, mayo)");
            } else if (est == 2) {
                System.out.println("Verano (Junio, julio, agosto)");
            } else if (est == 3) {
                System.out.println("otoño (septiembre, octubre, noviembre)");
            } else if (est == 4) {
                System.out.println("invierno (Diciembre, febrero, enero)");
            }
        } else {
            System.out.println("Estación incorrecta.");

    }
}
}
