package p114_Animal;

public class Gato implements Animal {
    private String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo en la caja.");
    }

    public void sonido() {
        System.out.println(nombre + " dice: Miau!");
    }

    @Override
    public String toString() {
        return "Gato: " + nombre;
    }
    
}
