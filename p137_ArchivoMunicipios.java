import java.io.*;

public class p137_ArchivoMunicipios {
    public static void main(String[] args) {
        String nombreArchivo = "deportes.txt";
        String[] deportes = {"Fútbol", "Béisbol", "Ciclismo", "Atletismo", "Natación", "Motociclismo"};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String deporte : deportes) {
                writer.write(deporte);
                writer.newLine();
            }
            System.out.println(" Datos escritos correctamente en el archivo '" + nombreArchivo + "'.");
        } catch (IOException e) {
            System.out.println(" Error al escribir el archivo: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("\n Contenido del archivo:");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println(" Error al leer el archivo: " + e.getMessage());
        }
    }
}
