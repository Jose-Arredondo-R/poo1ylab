import java.util.Scanner;

public class p077_DiaSemana {

    /**
     @param dia 
     @return 
    */
    public static String obtenerDiaSemana(int dia) {
        return switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Número fuera de rango (1 a 7)";
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entre 1 y 7: ");
        int dia = sc.nextInt();

        if (dia >= 1 && dia <= 7)
            System.out.println("Día correspondiente: " + obtenerDiaSemana(dia));
        else
            System.out.println("Error: el número debe estar entre 1 y 7.");

        sc.close();
    }
}
