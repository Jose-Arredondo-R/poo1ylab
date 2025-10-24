package PuntoTriangulo;

public class Triangulo {
    private Punto v1;
    private Punto v2;
    private Punto v3;

    // Constructor
    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // Getters y Setters
    public Punto getV1() { return v1; }
    public void setV1(Punto v1) { this.v1 = v1; }

    public Punto getV2() { return v2; }
    public void setV2(Punto v2) { this.v2 = v2; }

    public Punto getV3() { return v3; }
    public void setV3(Punto v3) { this.v3 = v3; }

    // Calcular perímetro
    public double getPerimetro() {
        double lado1 = v1.getDistancia(v2);
        double lado2 = v2.getDistancia(v3);
        double lado3 = v3.getDistancia(v1);
        return lado1 + lado2 + lado3;
    }

    // Determinar tipo de triángulo
    public String getTipo() {
        double lado1 = v1.getDistancia(v2);
        double lado2 = v2.getDistancia(v3);
        double lado3 = v3.getDistancia(v1);

        // Redondeamos para evitar errores por decimales
        lado1 = Math.round(lado1 * 1000.0) / 1000.0;
        lado2 = Math.round(lado2 * 1000.0) / 1000.0;
        lado3 = Math.round(lado3 * 1000.0) / 1000.0;

        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilatero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            return "Isoseles";
        } else {
            return "Escaleno";
        }
    }

    @Override
    public String toString() {
        return "Triangulo [V1=" + v1 + ", V2=" + v2 + ", V3=" + v3 + "]";
    }
}
