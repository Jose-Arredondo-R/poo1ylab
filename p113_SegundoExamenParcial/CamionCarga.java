package p113_SegundoExamenParcial;

public class CamionCarga extends Vehiculo {

    private int Ejes;
    private double Kilometraje;

    public CamionCarga(String marca, String modelo, int capacidad, double costoBase,
                       int ejes, double kilometraje) {

        super(marca, modelo, capacidad, costoBase);

        this.Ejes = ejes;
        this.Kilometraje = kilometraje;

        this.CostoTotal = this.CostoBase + getBonoConductor();
    }

    @Override
    public double getBonoConductor() {
        return (CostoBase * 0.10) + (Ejes * 50) + (Kilometraje * 0.5);
    }

    @Override
    public String toString() {
        return String.format(
            "CamionCarga [%s, Ejes=%d, Kilometraje=%.1f, Bono=%.1f, CostoTotal=%.1f]",
            super.toString(), Ejes, Kilometraje, getBonoConductor(), CostoTotal
        );
    }
}
