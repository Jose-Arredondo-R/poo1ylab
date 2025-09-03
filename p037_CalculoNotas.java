import java.util.Scanner;
public class p037_CalculoNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, nota5, promedio;

        System.out.println("Ingrese la primera nota: ");
        nota1 = sc.nextFloat();

        System.out.println("Ingrese la segunda nota: ");
        nota2 = sc.nextFloat();

        System.out.println("Ingrese la tercera nota: ");
        nota3 = sc.nextFloat();

        System.out.println("Ingrese la cuarta nota: ");
        nota4 = sc.nextFloat();

        System.out.println("Ingrese la quinta nota: ");
        nota5 = sc.nextFloat();

        promedio = (nota1 + nota2 + nota3 + nota4 + nota5 ) / 5;

        if (promedio >= 0 && promedio <= 6)
        System.out.println("Quedas reprobado " + promedio);

        else if (promedio >= 6 && promedio <=7)
        System.out.println("Pasas de panzaso " + promedio);

        else if (promedio >= 7 && promedio <=8)
        System.out.println("Muy bien, puedes mejorar " + promedio);

        else if (promedio >= 8 && promedio <=9)
        System.out.println("Exelente sigue asi " + promedio);

        else if (promedio >= 9 && promedio <=10)
        System.out.println("perfecto tu esfuerzo valio la pena " + promedio);

        sc.close();
    }
}
