public class p083_InicializaNombresEdades {
    public static void main(String[] args) {
        String[] nombres = { "Juan", "pedro", "Luis", "jose", "mateo", "maria " };
        int[] edades = { 22, 25, 44, 28, 50, 16 };

        System.out.println("Longitud de nombres " + nombres.length);
        System.out.println("longfitud de edades " + edades.length);

        System.out.println("todos los nombres: ");
        for (String nombre : nombres)
            System.out.print(nombre + " ");

        System.out.println("todas las edades: ");
        for (int edad : edades)
            System.out.print(edad + " ");
        System.out.println("cada nombre con su edad espectiva ");
        for (int i = 0; i < nombres.length; i++)
            System.out.println(nombres[i] + " - " + edades[i]);

    }
}
