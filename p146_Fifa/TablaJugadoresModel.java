package p146_Fifa;

import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.List;

public class TablaJugadoresModel extends DefaultTableModel {
    private static final String[] COLS = { "Nombre", "Nacionalidad", "Peso (kg)", "F. Nacimiento", "Posición", "Pie",
            "Rating" };
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public TablaJugadoresModel() {
        super(COLS, 0);
    }

    public void setLista(List<Jugador> lista) {
        setRowCount(0);
        if (lista == null)
            return;
        for (Jugador j : lista) {
            addRow(new Object[] {
                    j.getNombre(),
                    j.getNacionalidad(),
                    String.format("%.1f", j.getPeso()),
                    j.getFechaNacimiento() == null ? "" : sdf.format(j.getFechaNacimiento()),
                    j.getPosicion(),
                    j.getPie(),
                    j.getRating()
            });
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}