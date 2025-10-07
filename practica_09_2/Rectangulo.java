package practica_09_2;

public class Rectangulo {
    // Atributos privados
    private float Largo;
    private float Ancho;

    public Rectangulo() {
    }

    public Rectangulo(float largo, float ancho) {
        this.Largo = largo;
        this.Ancho = ancho;
    }

    public float getLargo() {
        return Largo;
    }

    public void setLargo(float largo) {
        this.Largo = largo;
    }

    public float getAncho() {
        return Ancho;
    }

    public void setAncho(float ancho) {
        this.Ancho = ancho;
    }


    public float getArea() {
        return Largo * Ancho;
    }

   
    public float getPerimetro() {
        return 2 * (Largo + Ancho);
    }
    @Override
    public String toString() {
        return "Rectangulo [Largo=" + Largo + ", Ancho=" + Ancho + "]";
    }
}
