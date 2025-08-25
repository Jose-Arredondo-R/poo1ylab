import java.util.Scanner;
public class p003_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);
        System.out.println("dame la base");
        base = obj.nextInt();
        System.out.println("dame la altura");
        altura = obj.nextInt();
        area = base * altura / 2.0;
        System.out.println(String.format("un triangulo de base %d y altura %d tiene un area de %f", base, altura, area));
        obj.close();
      
      }


}