package p112_ControlVentas;

import java.util.ArrayList;

public class Tienda {

    private String propietario;
    private String domicilio;
    private ArrayList<Cliente> clientes;

    public Tienda(String propietario, String domicilio) {
        this.propietario = propietario;
        this.domicilio = domicilio;
        this.clientes = new ArrayList<>();
    }

    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public double getTotal() {
        double suma = 0;
        for (Cliente c : clientes) {
            suma += c.getTotal();
        }
        return suma;
    }

    @Override
    public String toString() {
        return "Tienda [Propietario= " + propietario + ", Domicilio= " + domicilio 
                + ", Clientes= " + clientes.size() + ", Total = " 
                + String.format("%.2f", getTotal()) + "]";
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
