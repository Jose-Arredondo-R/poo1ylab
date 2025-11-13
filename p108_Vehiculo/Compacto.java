package p108_Vehiculo;

public class Compacto extends Vehiculo {
    // Atributos
    private int pasajeros;
    private int puertas;

    // Constructores
    public Compacto() {
        super();
        this.pasajeros = 0;
        this.puertas = 0;
    }

    public Compacto(String serie, String marca, int año, double precio, int pasajeros, int puertas) {
        super(serie, marca, año, precio);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
    }

    // Getters y Setters
    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    // toString
    @Override
    public String toString() {
        return "Compacto [" + super.toString() + ", Pasajeros=" + pasajeros + ", Puertas=" + puertas + "]";
    }
}
