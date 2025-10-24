package Forma;

public abstract class Forma {
    private String color;
    private boolean relleno;

    // Constructor vacío
    public Forma() {
        this.color = "";
        this.relleno = false;
    }

    // Constructor con parámetros
    public Forma(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    // Getters y Setters
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isRelleno() { return relleno; }
    public void setRelleno(boolean relleno) { this.relleno = relleno; }

    // Métodos abstractos
    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Forma [Color=" + color + ", Relleno=" + relleno + "]";
    }
}
