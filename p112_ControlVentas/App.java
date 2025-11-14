package p112_ControlVentas;

public class App {
    public static void main(String[] args) {

        Tienda tienda = new Tienda("Av. Luis Moya 345", "Carlos Castaneda");

        Cliente c1 = new Cliente("Felipe Calderon", "Las Lomas 123", "calde@msn.com");
        Cliente c2 = new Cliente("Enrique Peña", "5 de Mayo 321", "quique@gmail.com");
        Cliente c3 = new Cliente("Andres Lopez", "Palacio Nacional 321", "peje@yahoo.com");
        Cliente c4 = new Cliente("Xochitl Gelatinas", "Danone 123", "xochitl@precidencia.gob.mx");

        tienda.addCliente(c1);
        tienda.addCliente(c2);
        tienda.addCliente(c3);
        tienda.addCliente(c4);

        // --- Reporte 1 sin ventas ---
        System.out.println("Reporte de clientes sin ventas : " + tienda.toString());
        for (Cliente cli : tienda.getClientes()) {
            System.out.println(">> " + cli.toString());
        }

        // --- Agregar ventas ---
        c1.addVenta(new VentaContado("Martillo", 10, 60.50, 10, "Sacabrocados"));
        c1.addVenta(new VentaCredito("Pala", 2, 1170.55, 3, 10));

        c2.addVenta(new VentaCredito("Clavo", 2.5, 160.34, 2, 20));
        c2.addVenta(new VentaCredito("Cinta de Aislar", 5, 71.34, 6, 20));
        c2.addVenta(new VentaContado("Pinzas", 10, 650.33, 20, "Taladro"));

        c3.addVenta(new VentaContado("Thiner", 50, 65, 10, "Aerosol"));

        // --- Reporte final ---
        System.out.println("\nReporte de ventas de los clientes : " + tienda.toString());

        for (Cliente cli : tienda.getClientes()) {
            System.out.println(">> " + cli.toString());
            for (Venta v : cli.getVentas()) {
                System.out.println(v.toString());
            }
        }
    }
}
