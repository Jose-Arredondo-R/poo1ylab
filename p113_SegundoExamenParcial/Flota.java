package p113_SegundoExamenParcial;

public class Flota {

    private String Nombre;
    private String Ciudad;
    private Vehiculo[] Vehiculos;
    private int contador;

    public Flota(String nombre, String ciudad) {
        this.Nombre = nombre;
        this.Ciudad = ciudad;
        this.Vehiculos = new Vehiculo[50]; // capacidad arbitraria para ejemplo
        this.contador = 0;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (contador < Vehiculos.length) {
            Vehiculos[contador++] = vehiculo;
        }
    }

    public double getTotalBono() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += Vehiculos[i].getBonoConductor();
        }
        return total;
    }

    public double getTotalCosto() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += Vehiculos[i].CostoTotal;
        }
        return total;
    }

    public int getNumCamiones() {
        int c = 0;
        for (int i = 0; i < contador; i++) {
            if (Vehiculos[i] instanceof CamionCarga) c++;
        }
        return c;
    }

    public int getNumAutobuses() {
        int c = 0;
        for (int i = 0; i < contador; i++) {
            if (Vehiculos[i] instanceof AutobusPasajeros) c++;
        }
        return c;
    }

    public void reporte() {
        System.out.println(">> Reporte Detallado de la Flota <<");
        for (int i = 0; i < contador; i++) {
            System.out.println(Vehiculos[i].toString());
        }
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format(
                "Flota [Nombre=%s, Ciudad=%s, Vehiculos=%d, BonoTotal=%.1f, CostoTotal=%.1f, Camiones=%d, Autobuses=%d]",
                Nombre, Ciudad, contador, getTotalBono(), getTotalCosto(),
                getNumCamiones(), getNumAutobuses()
        );
    }
}
