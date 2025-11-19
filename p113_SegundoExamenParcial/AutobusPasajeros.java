package p113_SegundoExamenParcial;

public class AutobusPasajeros extends Vehiculo {

    private int Rutas;
    private int PasajerosTransportados;

    public AutobusPasajeros(String marca, String modelo, int capacidad, double costoBase,
                            int rutas, int pasajerosTransportados) {

        super(marca, modelo, capacidad, costoBase);

        this.Rutas = rutas;
        this.PasajerosTransportados = pasajerosTransportados;

        this.CostoTotal = this.CostoBase + getBonoConductor();
    }

    @Override
    public double getBonoConductor() {
        return (CostoBase * 0.15) + (Rutas * 120) + (PasajerosTransportados * 0.1);
    }

    @Override
    public String toString() {
        return String.format(
            "AutobusPasajeros [%s, Rutas=%d, PasajerosTransportados=%d, Bono=%.1f, CostoTotal=%.1f]",
            super.toString(), Rutas, PasajerosTransportados, getBonoConductor(), CostoTotal
        );
    }
}
