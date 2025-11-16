package p145_ControlEstudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Utileria {

    public static void grabarDatos(String archivo, ArrayList<Estudiante> datos) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(archivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(datos);
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Estudiante> leerDatos(String archivo) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(archivo);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (ArrayList<Estudiante>) ois.readObject();
        }
    }

    public static ArrayList<Estudiante> inicializar() {
        ArrayList<Estudiante> lista = new ArrayList<>();
        Calendar c = Calendar.getInstance();

        c.set(2002, Calendar.JUNE, 12); // 12 Jun 2002
        lista.add(new Estudiante("Ana Gómez", 21, 58.5f, "ana.gomez@mail.com", c.getTime(), "Femenino", 8.7f));

        c.set(1998, Calendar.MARCH, 5);
        lista.add(new Estudiante("Carlos Ramírez", 25, 72.0f, "c.ramirez@mail.com", c.getTime(), "Masculino", 7.5f));

        c.set(2000, Calendar.DECEMBER, 20);
        lista.add(new Estudiante("Lucía Peña", 22, 60.2f, "lucia.p@mail.com", c.getTime(), "Femenino", 9.1f));

        c.set(1995, Calendar.APRIL, 2);
        lista.add(new Estudiante("José Martínez", 28, 80.3f, "jmart@mail.com", c.getTime(), "Masculino", 6.8f));

        c.set(2003, Calendar.AUGUST, 30);
        lista.add(new Estudiante("Mariana Torres", 20, 54.0f, "mariana@mail.com", c.getTime(), "Femenino", 8.0f));

        return lista;
    }
}
