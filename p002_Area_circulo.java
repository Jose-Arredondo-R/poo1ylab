//calcula el area de un circulo dado el radio

import java.util.Scanner;
//importa la clase Scanner, utilizada para la entrada de datos 

public class p002_Area_circulo {
    public static void main(String[] args) {
        double radio, area; 
try (//Define dos variables tipo double, para almacenar números con decimales: radio y area
        Scanner lradio = new Scanner(System.in)) {
                //Crea una instancia de la clase Scanner llamada lradio, que utilizará la entrada por teclado (System.in) para leer los valores del usuario
                        System.out.println ("Calculando el area de un circulo");
                //Lee la entrada del usuario usando el nombre de la instancia lradio seguido del metodo nextFloat(), y lo guarda en radio
                        System.out.print("Dame el radio del circulo: ");
                        radio = lradio.nextFloat();
        }
area = Math.PI * Math.pow(radio,2);

    System.out.println(" El circulo de radio "  +  radio  +  " tiene un area de " + area);
}


    
}