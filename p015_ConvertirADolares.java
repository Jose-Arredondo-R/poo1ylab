import java.util.Scanner;
public class p015_ConvertirADolares {
    public static void main(String[] args) {
        double pesos, dolares, tasaCambio;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame la cantidad en pesos: ");
        pesos = obj.nextDouble();

        System.out.print("Dame la tasa de cambio (pesos por 1 dólar): ");
        tasaCambio = obj.nextDouble();

        dolares = pesos / tasaCambio;

        System.out.println("Equivalente en dólares: " + dolares);

        obj.close();
    }
}
