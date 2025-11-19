package p113_SegundoExamenParcial;

public abstract class Vehiculo {

    protected String Marca;
    protected String Modelo;
    protected int Capacidad;
    protected double CostoBase;
    protected double CostoTotal;

    public Vehiculo(String marca, String modelo, int capacidad, double costoBase) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Capacidad = capacidad;
        this.CostoBase = costoBase;
    }

    public abstract double getBonoConductor();

    @Override
    public String toString() {
        return String.format("Vehiculo [Marca=%s, Modelo=%s, Capacidad=%d, CostoBase=%.2f]",
                Marca, Modelo, Capacidad, CostoBase);
    }
}
