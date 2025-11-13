// p138_ArchivoMaterias.java
import java.io.*;
import java.util.*;

public class p138_ArchivoMaterias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreArchivo = "materias.txt";
        List<String> materias = new ArrayList<>();

        System.out.println("Introduce una lista de materias (escribe 'fin' para terminar):");
        while (true) {
            System.out.print("Materia: ");
            String materia = sc.nextLine();
            if (materia.equalsIgnoreCase("fin")) break;
            materias.add(materia);
        }

        // Escritura del archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String materia : materias) {
                writer.write(materia);
                writer.newLine();
            }
            System.out.println("\n✅ Materias guardadas correctamente en '" + nombreArchivo + "'.");
        } catch (IOException e) {
            System.out.println("⚠️ Error al escribir el archivo: " + e.getMessage());
        }

        // Lectura del archivo
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("\n📂 Materias almacenadas:");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error al leer el archivo: " + e.getMessage());
        }

        sc.close();
    }
}
