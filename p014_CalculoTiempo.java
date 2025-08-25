import java.util.Scanner;

public class p014_CalculoTiempo {
    public static void main(String[] args) {
        double horas, dias, minutos, segundos;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame la cantidad de horas: ");
        horas = obj.nextDouble();
        
        dias = horas / 24;             
        minutos = horas * 60;           
        segundos = horas * 3600;   

        System.out.println("Equivalente en días: " + dias);
        System.out.println("Equivalente en minutos: " + minutos);
        System.out.println("Equivalente en segundos: " + segundos);

        obj.close();
    }
}
