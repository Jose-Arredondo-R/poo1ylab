import java.util.Scanner;

public class p080_Angulo {

    /**
     * @param angulo
     * @return
     */
    public static String tipoAngulo(double angulo) {
        if (angulo < 90)
            return "Agudo";
        else if (angulo == 90)
            return "Recto";
        else if (angulo > 90 && angulo < 180)
            return "Obtuso";
        else if (angulo == 180)
            return "Llano";
        else if (angulo > 180 && angulo < 360)
            return "Cóncavo";
        else
            return "Indefinido";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un ángulo entre 0 y 360 grados: ");
        double ang = sc.nextDouble();

        if (ang >= 0 && ang <= 360)
            System.out.println("El ángulo es: " + tipoAngulo(ang));
        else
            System.out.println("Error: el ángulo debe estar entre 0 y 360 grados.");

        sc.close();
    }
}
