package Forma;

public class Circulo extends Forma {
    private double radio;

    // Constructor vacío
    public Circulo() {
        super();
        this.radio = 0.0;
    }

    // Constructor con parámetros
    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo [" + super.toString() + ", Radio=" + radio + "]";
    }
}
