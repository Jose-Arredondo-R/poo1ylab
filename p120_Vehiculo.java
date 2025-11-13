// p120_Vehiculo.java

interface Electrico {
    void tipoElectrico();
}

interface Combustion {
    void tipoCombustion();
}

interface Familiar {
    void tipoFamiliar();
}

interface TodoTerreno {
    void tipoTodoTerreno();
}

// -----------------------------

class Maquina {
    protected String nombre;
    protected String propietario;
    protected int pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Maquina [Nombre=" + nombre + ", Propietario=" + propietario + ", Pasajeros=" + pasajeros + "]";
    }

    public void repostar() {
        System.out.println("Repostando ...");
    }

    public void arrancar() {
        System.out.println("Arrancando ...");
    }

    public void frenar() {
        System.out.println("Frenando ...");
    }
}

// -----------------------------

class Automovil extends Maquina {
    protected String tipo;

    public Automovil(String nombre, String propietario, int pasajeros, String tipo) {
        super(nombre, propietario, pasajeros);
        this.tipo = tipo;
    }
}

// -----------------------------

class Sedan extends Automovil implements Electrico, Combustion, Familiar {

    public Sedan(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros, "Sedan");
    }

    @Override
    public void tipoElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico es un " + tipo);
    }

    @Override
    public void tipoCombustion() {
        System.out.println("Es un automóvil de combustion interna es un " + tipo);
    }

    @Override
    public void tipoFamiliar() {
        System.out.println("Es de tipo familiar con carroceria en tres partes es un " + tipo);
        System.out.println("Es de tipo familiar con chasis monocasco es un " + tipo);
    }
}

// -----------------------------

class Suv extends Automovil implements Electrico, Combustion, TodoTerreno {

    public Suv(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros, "Suv");
    }

    @Override
    public void tipoElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico es una " + tipo);
    }

    @Override
    public void tipoCombustion() {
        System.out.println("Es un automóvil de combustion interna es una " + tipo);
    }

    @Override
    public void tipoTodoTerreno() {
        System.out.println("Es un autómovil con tracción 4 x 4 es una " + tipo);
        System.out.println("Es un autómovil con chaisis independiente es una " + tipo);
    }
}

// -----------------------------

public class p120_Vehiculo {
    public static void main(String[] args) {

        Sedan vochito = new Sedan("Vochito", "Maria Diaz", 4);
        System.out.println(vochito.toString());
        vochito.tipoElectrico();
        vochito.tipoCombustion();
        vochito.tipoFamiliar();
        vochito.repostar();
        vochito.arrancar();
        vochito.frenar();

        Suv mamalona = new Suv("La mamalona", "Carlos Castaneda", 6);
        System.out.println(mamalona.toString());
        mamalona.tipoElectrico();
        mamalona.tipoCombustion();
        mamalona.tipoTodoTerreno();
        mamalona.repostar();
        mamalona.arrancar();
        mamalona.frenar();
    }
}
