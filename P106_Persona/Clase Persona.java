package p106_Persona;

/**
 * Clase base Persona.
 * Autor: [Tu nombre]
 * Objetivo: Representar una persona con nombre y dirección.
 * Entradas: Nombre, Dirección.
 * Salidas: Descripción de la persona.
 */
public class Persona {
    protected String Nombre;
    protected String Direccion;

    public Persona() {
    }

    public Persona(String nombre, String direccion) {
        Nombre = nombre;
        Direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", Direccion=" + Direccion;
    }
}
