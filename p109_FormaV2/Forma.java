package p109_FormaV2;

public abstract class Forma {
    // Atributos
    private String color;
    private boolean relleno;

    // Constructores
    public Forma() {
        this.color = "Sin color";
        this.relleno = false;
    }

    public Forma(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    // Métodos abstractos
    public abstract double getArea();
    public abstract double getPerimetro();

    // toString
    @Override
    public String toString() {
        return "Forma [Color=" + color + ", Relleno=" + relleno + "]";
    }
}
