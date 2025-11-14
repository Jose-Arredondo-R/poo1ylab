package p112_ControlVentas;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String domicilio;
    private String correo;
    private ArrayList<Venta> ventas;

    public Cliente(String nombre, String domicilio, String correo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
        this.ventas = new ArrayList<>();
    }

    public void addVenta(Venta venta) {
        ventas.add(venta);
    }

    public double getTotal() {
        double suma = 0;
        for (Venta v : ventas) {
            suma += v.getTotalVenta();
        }
        return suma;
    }

    @Override
    public String toString() {
        return "Cliente [ Nombre= " + nombre + ", Domicilio= " + domicilio + 
                ", Correo= " + correo + ", Ventas= " + ventas.size() + 
                ", Total= " + String.format("%.2f", getTotal()) + " ]";
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
}
