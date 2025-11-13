package p110_CuentaBancariaV1;

import java.util.ArrayList;

/**
 * Clase Banco
 * Contiene una lista de clientes, nombre y domicilio.
 */
public class Banco {
    private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;

    // Constructor sin parámetros
    public Banco() {
        Clientes = new ArrayList<>();
    }

    // Constructor con parámetros
    public Banco(String nombre, String domicilio) {
        this();
        Nombre = nombre;
        Domicilio = domicilio;
    }

    public void agregarCliente(Cliente cliente) {
        Clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    @Override
    public String toString() {
        return "Banco [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Clientes=" + Clientes.size() + "]";
    }
}
