package practica_09_3;

public class Articulo {
    private String id;
    private String desc;
    private int cant;
    private double precioUnit;

    public Articulo(String id, String desc, int cant, double precioUnit) {
        this.id = id;
        this.desc = desc;
        this.cant = cant;
        this.precioUnit = precioUnit;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDesc() { return desc; }
    public void setDesc(String desc) { this.desc = desc; }

    public int getCant() { return cant; }
    public void setCant(int cant) { this.cant = cant; }

    public double getPrecioUnit() { return precioUnit; }
    public void setPrecioUnit(double precioUnit) { this.precioUnit = precioUnit; }

    // Calcular total del artículo
    public double getTotal() {
        return cant * precioUnit;
    }

    @Override
    public String toString() {
        return "Articulo [Id=" + id + ", Desc=" + desc + ", Cant=" + cant + ", PrecioUnit=" + precioUnit + "]";
    }
}

