package p112_ControlVentas;

public abstract class Venta {
    protected String articulo;
    protected double cantidad;
    protected double precio;
    protected double total;

    public Venta(String articulo, double cantidad, double precio) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = precio * cantidad;
    }

    public double getTotal() {
        return total;
    }

    public abstract double getTotalVenta();

    @Override
    public String toString() {
        return "Venta [Articulo= " + articulo + ", Cantidad= " + cantidad + ", Precio= " + precio + ", Total= " + String.format("%.2f", total) + "]";
    }
}
