package p146_Fifa;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Utileria {

    public static void grabarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(datos);
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Jugador> abrirDatos(String archivo)
            throws IOException, ClassNotFoundException {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Jugador>) ois.readObject();
        }
    }

    public static ArrayList<Jugador> inicializarEjemplo() {
        ArrayList<Jugador> lista = new ArrayList<>();
        Calendar c = Calendar.getInstance();

        c.set(1987, Calendar.JUNE, 24);
        lista.add(new Jugador("Lionel Messi", "Argentina", 67, c.getTime(),
                "Delantero", "Izquierdo", 90));

        c.set(1985, Calendar.FEBRUARY, 5);
        lista.add(new Jugador("Cristiano Ronaldo", "Portugal", 83, c.getTime(),
                "Delantero", "Derecho", 86));

        c.set(1991, Calendar.JUNE, 28);
        lista.add(new Jugador("Kevin De Bruyne", "Bélgica", 70, c.getTime(),
                "Mediocentro", "Derecho", 91));

        c.set(1992, Calendar.OCTOBER, 2);
        lista.add(new Jugador("Alisson Becker", "Brasil", 91, c.getTime(),
                "Portero", "Derecho", 89));

        return lista;
    }
}
