package PuntoCirculo;

public class Circulo {
    private Punto centro;
    private double radio;

    // Constructor
    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    // Getters y Setters
    public Punto getCentro() { return centro; }
    public void setCentro(Punto centro) { this.centro = centro; }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    // Métodos para área y circunferencia
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo [Centro=" + centro + ", Radio=" + radio + "]";
    }
}

