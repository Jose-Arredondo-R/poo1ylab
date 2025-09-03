import java.util.Scanner;
public class p026_TipoAngulo {
    public static void main(String[] args) {


        System.out.println("dame un angulo entre 0 y 360");
        int angulo = new Scanner(System.in).nextInt();
        if (angulo < 0 || angulo > 360) {
            System.out.println("angulo correcto: ");
        } else if (angulo < 90) {
            System.out.println("angulo agudo");
        } else if (angulo == 90) {
            System.out.println("angulo recto");
        } else if (angulo > 90 && angulo < 180) {
            System.out.println("angulo obtuso");
        } else if (angulo == 180) {
            System.out.println("angulo llano");
        } else if (angulo > 180 && angulo < 360) {
            System.out.println("angulo concavo");
        } else if (angulo == 360) {
            System.out.println("angulo completo");
        } else {
            System.out.println("angulo fuera de rango");
            System.out.println("hay te ves, voy a bracho...");
        }
    }
}
