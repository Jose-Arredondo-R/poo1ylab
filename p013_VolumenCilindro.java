import java.util.Scanner;
public class p013_VolumenCilindro {
    public static void main(String[] args) {
        double radio, altura, volumen;
        Scanner obj = new Scanner (System.in);
        System.out.println("dame el valor del radio");
        radio = obj.nextDouble();
        System.out.println("dame el valor de la altura");
        altura = obj.nextDouble();
        volumen = Math.PI * (radio * radio) * altura;
        System.out.println("el volumen del cilindo es " + volumen);
        obj.close();


    
}

}