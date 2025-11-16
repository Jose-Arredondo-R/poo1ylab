package p145_ControlEstudiante;

import java.io.Serializable;
import java.util.Date;

public class Estudiante implements Serializable {
    private String nombre;
    private int edad;
    private float peso;
    private String correo;
    private Date fechaNacimiento;
    private String sexo; // "Masculino" / "Femenino"
    private float promedio;

    public Estudiante() {}

    public Estudiante(String nombre, int edad, float peso, String correo, Date fechaNacimiento, String sexo, float promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.promedio = promedio;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public float getPeso() { return peso; }
    public void setPeso(float peso) { this.peso = peso; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public float getPromedio() { return promedio; }
    public void setPromedio(float promedio) { this.promedio = promedio; }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre +
                ", edad=" + edad +
                ", peso=" + peso +
                ", correo=" + correo +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sexo=" + sexo +
                ", promedio=" + promedio + "]";
    }
}
