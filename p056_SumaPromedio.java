import java.util.Scanner;

public class p056_SumaPromedio {
    public static void main(String[] args) {
        int n; 
        float suma, cal, prom;
        Scanner obj = new Scanner(System.in);

        suma = prom= 0; 
        System.out.println("calculamos la suma y promedio de n numeros ");
        System.out.println("cuantas calificaciones ? "); n = obj.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.printf("dame calificaciones ");
            cal = obj.nextFloat();
            suma += cal;

        }
        prom = suma / n;
        System.out.printf("suma es :  %.2f ", suma);
        System.out.printf("promedio es :  %.2f ", prom);

}

}