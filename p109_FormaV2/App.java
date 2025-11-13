package p109_FormaV2;

public class App {
    public static void main(String[] args) {
        Forma[] formas = new Forma[4];
        formas[0] = new Circulo("Rojo", true, 10.23);
        formas[1] = new Circulo("Verde", false, 99.12);
        formas[2] = new Rectangulo("Amarillo", false, 10.0, 20.0);
        formas[3] = new Rectangulo("Azul", true, 15.0, 44.0);

        System.out.println("Todas las formas :");
        for (Forma f : formas) {
            System.out.println(f.toString());
        }

        System.out.println("Calculando áreas y perimetros de las figuras:");
        for (Forma f : formas) {
            if (f instanceof Circulo) {
                System.out.println("La forma es un Circulo");
            } else {
                System.out.println("La forma es un Rectangulo");
            }
            System.out.println("El área es : " + f.getArea());
            System.out.println("El perímetro es : " + f.getPerimetro());
        }
    }
}
