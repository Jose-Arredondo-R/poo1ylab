import java.util.Scanner;
public class p012_ConvertirTemperatura {
    public static void main(String[] args) {
       double fahrenheit, celsius;
        Scanner obj = new Scanner (System.in);
        System.out.println("dame los grados fahrenheit");
        fahrenheit = obj.nextDouble(); 
        celsius = (fahrenheit - 32) * (5.0/9.0);
        System.out.println("los grados fahrenheit convertidos son " + celsius);
        obj.close();

    }

}
