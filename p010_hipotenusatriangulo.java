//la hipotenusa de un triángulo rectángulo dadas las longitudes de sus lados
import java.util.Scanner;

public class p010_hipotenusatriangulo {
    public static void main(String[] args) {
        double lado1, lado2, hipotenusa;
        //declaracion de variablas 
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame el lado 1: ");
        //imprime el texto dado 
        lado1 = obj.nextDouble();
        //lee las variables 
        System.out.print("Dame el lado 2: ");
        lado2 = obj.nextDouble();
        hipotenusa = Math.sqrt(lado1 * lado1 + lado2 * lado2);
        System.out.println("La hipotenusa es: " + hipotenusa);
        obj.close();
    }

}
