package p108_Vehiculo;

public class Camioneta extends Vehiculo {
    // Atributos
    private double capacidad;
    private int ejes;

    // Constructores
    public Camioneta() {
        super();
        this.capacidad = 0.0;
        this.ejes = 0;
    }

    public Camioneta(String serie, String marca, int año, double precio, double capacidad, int ejes) {
        super(serie, marca, año, precio);
        this.capacidad = capacidad;
        this.ejes = ejes;
    }

    // Getters y Setters
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    // toString
    @Override
    public String toString() {
        return "Camioneta [" + super.toString() + ", Capacidad=" + capacidad + ", Ejes=" + ejes + "]";
    }
}
