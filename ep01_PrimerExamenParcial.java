import java.util.Scanner;

public class ep01_PrimerExamenParcial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opc = 'S'; 
        int edad, tipoComprador, sexo;

        // --- Constantes de Precios ---
        final double P_EST = 50.0;
        final double P_ADL = 90.0;
        final double P_SEN = 60.0;

        // --- Contadores ---
        int contEstudiantes = 0;
        int contAdultos = 0;
        int contSenior = 0;
        int contMasculino = 0;
        int contFemenino = 0;
        int contRechazados = 0;
        int sumaEdades = 0; // Para promedio de edad

        // --- Acumuladores de dinero ---
        double recEstudiantes = 0.0;
        double recAdultos = 0.0;
        double recSenior = 0.0;
        double totalRecaudado = 0.0;

        // --- Ciclo de ventas ---
        do {
            System.out.println("\n--- Nueva Venta ---");
            System.out.print("Ingrese la edad del comprador: ");
            edad = sc.nextInt();

            if (edad < 13) {
                System.out.println(" Acceso denegado. Edad no permitida.");
                contRechazados++;
                System.out.print("\n¿Desea registrar otra venta? [S/N]: ");
                opc = sc.next().toUpperCase().charAt(0);
                continue;
            }

            // Si la edad es válida
            System.out.print("Ingrese el tipo de comprador (1: Estudiante, 2: Adulto, 3: Tercera Edad): ");
            tipoComprador = sc.nextInt();

            System.out.print("Ingrese el sexo del comprador (1: Hombre, 2: Mujer): ");
            sexo = sc.nextInt();

            // Mensaje de bienvenida con los datos
            String tipoStr = (tipoComprador == 1) ? "Estudiante" :
                             (tipoComprador == 2) ? "Adulto" : "Tercera Edad";
            String sexoStr = (sexo == 1) ? "Hombre" : "Mujer";

            System.out.println(" Bienvenido al cine. Edad: " + edad + 
                               " | Sexo: " + sexoStr + 
                               " | Tipo: " + tipoStr);

            // Contadores y acumuladores
            sumaEdades += edad;

            switch (tipoComprador) {
                case 1:
                    contEstudiantes++;
                    recEstudiantes += P_EST;
                    totalRecaudado += P_EST;
                    break;
                case 2:
                    contAdultos++;
                    recAdultos += P_ADL;
                    totalRecaudado += P_ADL;
                    break;
                case 3:
                    contSenior++;
                    recSenior += P_SEN;
                    totalRecaudado += P_SEN;
                    break;
                default:
                    System.out.println("Tipo de comprador no válido.");
                    continue;
            }

            if (sexo == 1) contMasculino++;
            else if (sexo == 2) contFemenino++;

            System.out.print("\n¿Desea registrar otra venta? [S/N]: ");
            opc = sc.next().toUpperCase().charAt(0);

        } while (opc == 'S');

        // --- Reporte Final ---
        int totalAsistentes = contEstudiantes + contAdultos + contSenior;
        double promedioEdad = (totalAsistentes > 0) ? (double) sumaEdades / totalAsistentes : 0;

        System.out.println("\n REPORTE FINAL ");
        
        // Estadísticas del público
        System.out.println("\n Estadísticas del Público ");
        System.out.println("Estudiantes: " + contEstudiantes);
        System.out.println("Adultos: " + contAdultos);
        System.out.println("Tercera Edad: " + contSenior);
        System.out.println("Hombres: " + contMasculino);
        System.out.println("Mujeres: " + contFemenino);
        System.out.println("Total asistentes: " + totalAsistentes);
        System.out.printf("Promedio de edad: %.2f\n", promedioEdad);
        System.out.println("Personas rechazadas (<13 años): " + contRechazados);

        // Reporte de ingresos
        System.out.println("\n Reporte de Ingresos ");
        System.out.printf("Recaudado por Estudiantes: $%.2f\n", recEstudiantes);
        System.out.printf("Recaudado por Adultos: $%.2f\n", recAdultos);
        System.out.printf("Recaudado por Tercera Edad: $%.2f\n", recSenior);
        System.out.printf("Total Recaudado: $%.2f\n", totalRecaudado);

        // Rentabilidad
        System.out.println("\n Rentabilidad del Evento  ");
        if (totalRecaudado < 1500) {
            System.out.println("La función generó BAJAS ganancias.");
        } else if (totalRecaudado <= 3500) {
            System.out.println("La función generó ganancias MODERADAS.");
        } else {
            System.out.println("La función generó BUENAS ganancias.");
        }

        // Cierre del programa
        sc.close();
        System.out.println("\nGracias por usar el sistema de venta de boletos. ¡Hasta luego!");
    }
}


/* Preguntas teoricas, contesta con tus propias palabras, aqui mismo:

1. ¿ Qué estructura utilizaste para determinar el tipo de comprador y por que no otra estructura?

    //Utilicé un switch, porque es más claro y facil para manejar varias opciones


    2. ¿ Qué tipo de dato elegiste para las variables que cuentan el tipo de público que asiste a la función y por qué fue la mejor opción?
 
    //Usé el tipo int, porque solo necesito contar valores enteros, sin decimales.


3. ¿ Qué tipo de dato elegiste para las variables que almacenan el dinero recaudado y por qué esa fue la mejor opción?

    //Usé el tipo double, porque el dinero puede tener decimales (por ejemplo 50.5) y se requiere más precisión que un int


    4. Si tuvieras que añadir un nuevo tipo de comprador, 'Socio del Cine', ¿Qué partes exactas de tu código necesitarías modificar?"
    
    //El menú de opciones donde se pide el tipo de comprador.
    //El switch (tipoComprador), agregando un nuevo case para el socio.
    //Declarar un nuevo contador y una nueva variable de dinero recaudado para los socios.
    //El reporte final, para mostrar el total de socios y el dinero recaudado por ellos.
 */