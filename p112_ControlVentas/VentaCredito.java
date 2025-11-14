package p112_ControlVentas;

public class VentaCredito extends Venta {

    private double meses;
    private double interes; // porcentaje

    public VentaCredito(String articulo, double cantidad, double precio, double meses, double interes) {
        super(articulo, cantidad, precio);
        this.meses = meses;
        this.interes = interes;
    }

    @Override
    public double getTotalVenta() {
        return total + (meses * (interes / 100) * total);
    }

    @Override
    public String toString() {
        return "VentaCredito [" + super.toString() + ", Meses= " 
                + meses + ", Interes= " + String.format("%.2f", interes) 
                + "%, TotalVenta= " + String.format("%.2f", getTotalVenta()) + "]";
    }
}
