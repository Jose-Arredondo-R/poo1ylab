package p146_Fifa;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AppFifa extends JFrame {

    private JTextField txtNombre, txtNacionalidad, txtPeso, txtFecha, txtPosicion, txtPie, txtRating;
    private JTable tabla;
    private DefaultTableModel modeloTabla;

    private ArrayList<Jugador> lista;
    private int indice = 0;
    private boolean modoEdicion = false;

    private JButton bEditar, bNuevo, bGuardar, bCancelar, bAnterior, bSiguiente, bEstadistica;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private String archivoActual = "jugadores.dat";

    public AppFifa() {
        super("Gestión de Jugadores FIFA");

        lista = Utileria.inicializarEjemplo();

        configurarVentana();
        construirMenu();
        construirTabla();
        construirFormulario();
        construirBotones();
        mostrarRegistro();
    }

    private void configurarVentana() {
        setLayout(new BorderLayout(10,10));
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void construirMenu() {
        JMenuBar mb = new JMenuBar();

        JMenu mArchivo = new JMenu("Archivo");

        JMenuItem mAbrir = new JMenuItem("Abrir Archivo");
        mAbrir.addActionListener(e -> abrirArchivo());

        JMenuItem mGrabar = new JMenuItem("Grabar Archivo");
        mGrabar.addActionListener(e -> grabarArchivo());

        mArchivo.add(mAbrir);
        mArchivo.add(mGrabar);
        mb.add(mArchivo);

        JMenu mAyuda = new JMenu("Ayuda");

        JMenuItem mTeclas = new JMenuItem("Teclas de Ayuda");
        mTeclas.addActionListener(e ->
            JOptionPane.showMessageDialog(this,
                    "Ctrl + I = Nuevo Registro\nCtrl + D = Borrar Registro",
                    "Ayuda", JOptionPane.INFORMATION_MESSAGE)
        );

        JMenuItem mAcerca = new JMenuItem("Acerca de");
        mAcerca.addActionListener(e ->
            JOptionPane.showMessageDialog(this,
                    "Gestión de jugadores FIFA\nHecho con Java Swing",
                    "Acerca de", JOptionPane.INFORMATION_MESSAGE)
        );

        mAyuda.add(mTeclas);
        mAyuda.add(mAcerca);

        mb.add(mAyuda);
        setJMenuBar(mb);
    }

    // ==========================================================
    //  TABLA (PARTE SUPERIOR)
    // ==========================================================
    private void construirTabla() {
        String[] columnas = { "Nombre", "Nacionalidad", "Peso (kg)", "F. Nacimiento", "Posición", "Pie", "Rating" };

        modeloTabla = new DefaultTableModel(columnas, 0) {
            public boolean isCellEditable(int row, int col) { return false; }
        };

        tabla = new JTable(modeloTabla);
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane sp = new JScrollPane(tabla);

        add(sp, BorderLayout.CENTER);  // <── CORREGIDO (ANTES estaba en NORTH)

        cargarTabla();

        tabla.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && tabla.getSelectedRow() >= 0) {
                indice = tabla.getSelectedRow();
                mostrarRegistro();
            }
        });
    }

    private void cargarTabla() {
        modeloTabla.setRowCount(0);
        for (Jugador j : lista) {
            modeloTabla.addRow(new Object[] {
                    j.getNombre(),
                    j.getNacionalidad(),
                    j.getPeso(),
                    sdf.format(j.getFechaNacimiento()),
                    j.getPosicion(),
                    j.getPie(),
                    j.getRating()
            });
        }
    }

    // ==========================================================
    //  FORMULARIO
    // ==========================================================
    private void construirFormulario() {
        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createTitledBorder("Datos del Jugador"));

        txtNombre = new JTextField();
        txtNacionalidad = new JTextField();
        txtPeso = new JTextField();
        txtFecha = new JTextField();
        txtPosicion = new JTextField();
        txtPie = new JTextField();
        txtRating = new JTextField();

        panel.add(new JLabel("Nombre:")); panel.add(txtNombre);
        panel.add(new JLabel("Nacionalidad:")); panel.add(txtNacionalidad);
        panel.add(new JLabel("Peso (kg):")); panel.add(txtPeso);
        panel.add(new JLabel("F. Nacimiento (YYYY-MM-DD):")); panel.add(txtFecha);
        panel.add(new JLabel("Posición:")); panel.add(txtPosicion);
        panel.add(new JLabel("Pie Preferido:")); panel.add(txtPie);
        panel.add(new JLabel("Rating (1–99):")); panel.add(txtRating);

        add(panel, BorderLayout.SOUTH);  // <── VA ABAJO (como en la imagen)

        bloquearFormulario();
    }

    private void bloquearFormulario() {
        txtNombre.setEditable(false);
        txtNacionalidad.setEditable(false);
        txtPeso.setEditable(false);
        txtFecha.setEditable(false);
        txtPosicion.setEditable(false);
        txtPie.setEditable(false);
        txtRating.setEditable(false);
        modoEdicion = false;
    }

    private void desbloquearFormulario() {
        txtNombre.setEditable(true);
        txtNacionalidad.setEditable(true);
        txtPeso.setEditable(true);
        txtFecha.setEditable(true);
        txtPosicion.setEditable(true);
        txtPie.setEditable(true);
        txtRating.setEditable(true);
        modoEdicion = true;
    }

    // ==========================================================
    //  BOTONES
    // ==========================================================
    private void construirBotones() {
        JPanel panelBotones = new JPanel(new GridLayout(2, 1));

        JPanel nav = new JPanel(new FlowLayout());
        JButton bPrimero = new JButton("|<");
        bAnterior = new JButton("<");
        bSiguiente = new JButton(">");
        JButton bUltimo = new JButton(">|");

        nav.add(bPrimero);
        nav.add(bAnterior);
        nav.add(bSiguiente);
        nav.add(bUltimo);

        JPanel acciones = new JPanel(new FlowLayout());
        bEditar = new JButton("Editar");
        bNuevo = new JButton("Nuevo");
        bGuardar = new JButton("Guardar");
        bCancelar = new JButton("Cancelar");
        bEstadistica = new JButton("Estadística");

        acciones.add(bEditar);
        acciones.add(bNuevo);
        acciones.add(bGuardar);
        acciones.add(bCancelar);
        acciones.add(bEstadistica);

        panelBotones.add(nav);
        panelBotones.add(acciones);

        add(panelBotones, BorderLayout.NORTH); // <── en la parte superior como en la imagen

        // Eventos navegación
        bPrimero.addActionListener(e -> { indice = 0; mostrarRegistro(); });
        bUltimo.addActionListener(e -> { indice = lista.size() - 1; mostrarRegistro(); });
        bAnterior.addActionListener(e -> { if (indice > 0) indice--; mostrarRegistro(); });
        bSiguiente.addActionListener(e -> { if (indice < lista.size() - 1) indice++; mostrarRegistro(); });

        // Eventos acciones
        bNuevo.addActionListener(e -> {
            limpiar();
            desbloquearFormulario();
        });

        bEditar.addActionListener(e -> desbloquearFormulario());

        bCancelar.addActionListener(e -> {
            bloquearFormulario();
            mostrarRegistro();
        });

        bGuardar.addActionListener(e -> guardar());

        bEstadistica.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Función no implementada.");
        });
    }

    private void mostrarRegistro() {
        if (lista.isEmpty()) {
            limpiar();
            return;
        }

        Jugador j = lista.get(indice);

        txtNombre.setText(j.getNombre());
        txtNacionalidad.setText(j.getNacionalidad());
        txtPeso.setText(String.valueOf(j.getPeso()));
        txtFecha.setText(sdf.format(j.getFechaNacimiento()));
        txtPosicion.setText(j.getPosicion());
        txtPie.setText(j.getPie());
        txtRating.setText(String.valueOf(j.getRating()));

        tabla.setRowSelectionInterval(indice, indice);
    }

    private void limpiar() {
        txtNombre.setText("");
        txtNacionalidad.setText("");
        txtPeso.setText("");
        txtFecha.setText("");
        txtPosicion.setText("");
        txtPie.setText("");
        txtRating.setText("");
        indice = lista.size();
    }

    private void guardar() {
        try {
            Jugador j = new Jugador(
                    txtNombre.getText(),
                    txtNacionalidad.getText(),
                    Float.parseFloat(txtPeso.getText()),
                    sdf.parse(txtFecha.getText()),
                    txtPosicion.getText(),
                    txtPie.getText(),
                    Integer.parseInt(txtRating.getText())
            );

            if (indice >= lista.size())
                lista.add(j);
            else
                lista.set(indice, j);

            cargarTabla();
            JOptionPane.showMessageDialog(this, "Registro guardado correctamente");
            bloquearFormulario();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
        }
    }

    private void abrirArchivo() {
        try {
            lista = Utileria.abrirDatos(archivoActual);
            cargarTabla();
            indice = 0;
            mostrarRegistro();
            JOptionPane.showMessageDialog(this, "Archivo cargado con éxito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se pudo abrir el archivo");
        }
    }

    private void grabarArchivo() {
        try {
            Utileria.grabarDatos(archivoActual, lista);
            JOptionPane.showMessageDialog(this, "Archivo guardado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al grabar archivo");
        }
    }

    public static void main(String[] args) {
        new AppFifa().setVisible(true);
    }
}
