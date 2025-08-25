import java.util.Scanner;
public class p011_calcularangulo {
    public static void main(String[] args) {
        double lado1, lado2, angulo;

        Scanner obj = new Scanner(System.in);
        System.out.println("dame el lado 1");
        lado1 = obj.nextDouble();
        System.out.println("dame el lado 2");
        lado2 = obj.nextDouble();
        angulo = 180 - (lado1 + lado2);
        System.out.println("el angulo es " + angulo + "grados");
        obj.close();

    }

}
