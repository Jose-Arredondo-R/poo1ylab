//pago a trabajadores

import java.util.Scanner;

public class p004pagaTrabajador { 
    public static void main(String[] args) {

        String nombre;
        double horas;
        double paga, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        nombre = obj.nextLine();
        System.out.print("Horas trabajadas: ");
        horas = obj.nextDouble();
        System.out.print("Paga por hora: ");
        paga = obj.nextDouble();
        tasa = 0.03;

        // cálculo
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        System.out.println("\nResumen de pagos");
        System.out.println(String.format("El trabajador %s trabajó %.2f horas, a una paga de %.2f pesos la hora, con una tasa de impuestos de %.2f", nombre, horas, paga, tasa));
        System.out.println(String.format("Paga bruta = %.2f", pagabruta));
        System.out.println(String.format("Impuesto = %.2f", impuesto));
        System.out.println(String.format("Paga neta = %.2f", paganeta));

        obj.close();
    }
}
// ...existing code...