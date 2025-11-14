package p112_ControlVentas;

public class VentaContado extends Venta {

    private double descuento; // porcentaje
    private String regalo;

    public VentaContado(String articulo, double cantidad, double precio, double descuento, String regalo) {
        super(articulo, cantidad, precio);
        this.descuento = descuento;
        this.regalo = regalo;
    }

    @Override
    public double getTotalVenta() {
        return total - (total * descuento / 100);
    }

    @Override
    public String toString() {
        return "VentaContado [" + super.toString() + ", Descuento= " 
                + String.format("%.2f", descuento) + "%, Regalo= " + regalo 
                + ", Total= " + String.format("%.2f", getTotalVenta()) + "]";
    }
}
