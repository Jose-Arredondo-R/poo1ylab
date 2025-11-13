package p110_CuentaBancariaV1;

/**
 * Programa principal que prueba las clases:
 * CuentaBancaria, Cliente y Banco.
 */
public class App {
    public static void main(String[] args) {

        System.out.println("\nProbando clase CuentaBancaria:\n");

        CuentaBancaria cuenta1 = new CuentaBancaria(5000);

        cuenta1.deposita(10000);
        System.out.println("El saldo es " + cuenta1.getSaldo());

        double cretiro = 56;
        boolean retiro = cuenta1.retira(cretiro);
        if (retiro)
            System.out.println("Retiro de " + cretiro + " efectuado con éxito, nuevo saldo " + cuenta1.getSaldo());
        else
            System.out.println("Ni para los cigarros tienes");

        System.out.println("\nProbando clase Cliente");
        Cliente cliente1 = new Cliente("Juan Perez", cuenta1);
        System.out.println("Cliente 1 : " + cliente1);

        Cliente cliente2 = new Cliente("Carlos Castañeda", new CuentaBancaria(1000));
        System.out.println("Cliente 2 : " + cliente2);

        double nvoretiro = 50;
        boolean retiro2 = cliente2.getCuenta().retira(nvoretiro);

        if (retiro2)
            System.out.println("El retiro de " + nvoretiro + " efectuado con éxito, nuevo saldo "
                    + cliente2.getCuenta().getSaldo());
        else
            System.out.println("No money man :( ");

        System.out.println("\nProbando clase Banco");

        Banco mibanco = new Banco("Banco Patito SA de CV", "Arboledas 124");
        mibanco.agregarCliente(cliente1);
        mibanco.agregarCliente(cliente2);

        Cliente cliente3 = new Cliente("Felipe Correa", new CuentaBancaria(2000));
        mibanco.agregarCliente(cliente3);

        mibanco.getClientes().get(0).getCuenta().deposita(1500);
        mibanco.getClientes().get(1).getCuenta().retira(1000);
        mibanco.getClientes().get(2).getCuenta().deposita(12000);

        System.out.println("\nResumen del Banco \n");
        System.out.println(mibanco);

        double totalbanco = 0.0;

        for (Cliente cliente : mibanco.getClientes()) {
            System.out.println(cliente);
            totalbanco += cliente.getCuenta().getSaldo();
        }

        System.out.println("\nTotal de dinero en el Banco : " + totalbanco);
    }
}
