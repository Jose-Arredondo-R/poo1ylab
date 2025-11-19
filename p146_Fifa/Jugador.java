package p146_Fifa;

import java.io.Serializable;
import java.util.Date;

public class Jugador implements Serializable {

    private String nombre;
    private String nacionalidad;
    private float peso;
    private Date fechaNacimiento;
    private String posicion;
    private String pie;
    private int rating;

    public Jugador() {}

    public Jugador(String nombre, String nacionalidad, float peso, Date fechaNacimiento,
                   String posicion, String pie, int rating) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.posicion = posicion;
        this.pie = pie;
        this.rating = rating;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public float getPeso() { return peso; }
    public void setPeso(float peso) { this.peso = peso; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion; }

    public String getPie() { return pie; }
    public void setPie(String pie) { this.pie = pie; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}
