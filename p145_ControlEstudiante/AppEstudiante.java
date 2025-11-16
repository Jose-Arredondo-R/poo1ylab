package p145_ControlEstudiante;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AppEstudiante extends JFrame {

    // Datos
    private ArrayList<Estudiante> lista;
    private int currentIndex = -1;
    private boolean isEditing = false;
    private boolean isNew = false;

    // Componentes GUI
    private JTable table;
    private DefaultTableModel tableModel;

    private JTextField txtNombre;
    private JSpinner spEdad;
    private JSpinner spFecha;
    private JTextField txtPeso;
    private JTextField txtCorreo;
    private JComboBox<String> cbSexo;
    private JTextField txtPromedio;

    private JButton btnEditar, btnNuevo, btnGuardar, btnAnterior, btnSiguiente, btnEstad;

    private JPanel panelDatos;

    public AppEstudiante() {
        setTitle("Aplicación de Gestión de Estudiantes");
        setSize(900, 520);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initMenu();
        initComponents();
        initDataAndState();
    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu mArchivo = new JMenu("Archivo");
        JMenuItem miAbrir = new JMenuItem("Abrir...");
        JMenuItem miGuardar = new JMenuItem("Grabar...");
        JMenuItem miSalir = new JMenuItem("Salir");
        mArchivo.add(miAbrir);
        mArchivo.add(miGuardar);
        mArchivo.addSeparator();
        mArchivo.add(miSalir);

        JMenu mAyuda = new JMenu("Ayuda");
        JMenuItem miAcerca = new JMenuItem("Acerca de...");
        mAyuda.add(miAcerca);

        menuBar.add(mArchivo);
        menuBar.add(mAyuda);
        setJMenuBar(menuBar);

        miAbrir.addActionListener(e -> onAbrir());
        miGuardar.addActionListener(e -> onGuardar());
        miSalir.addActionListener(e -> System.exit(0));
        miAcerca.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "Aplicacion de Gestión de Estudiantes\nVersion: 1.0\nProgramador: Carlos Hector Castaneda Ramirez",
                    "Acerca de", JOptionPane.INFORMATION_MESSAGE);
        });
    }

    private void initComponents() {
        setLayout(new BorderLayout(6,6));

        // Tabla
        String[] cols = {"Nombre", "Edad", "Peso", "Correo", "FechaNacimiento", "Sexo", "Promedio"};
        tableModel = new DefaultTableModel(cols, 0) {
            @Override public boolean isCellEditable(int row, int column) { return false; }
        };
        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp, BorderLayout.CENTER);

        // Panel datos (derecha)
        panelDatos = new JPanel(new GridBagLayout());
        panelDatos.setBorder(BorderFactory.createTitledBorder("Datos del Estudiante"));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(6,6,6,6);
        c.anchor = GridBagConstraints.WEST;

        int y = 0;
        c.gridx = 0; c.gridy = y; panelDatos.add(new JLabel("Nombre:"), c);
        c.gridx = 1; txtNombre = new JTextField(18); panelDatos.add(txtNombre, c);

        y++;
        c.gridx = 0; c.gridy = y; panelDatos.add(new JLabel("Edad:"), c);
        c.gridx = 1; spEdad = new JSpinner(new SpinnerNumberModel(18, 1, 120, 1)); panelDatos.add(spEdad, c);

        y++;
        c.gridx = 0; c.gridy = y; panelDatos.add(new JLabel("Peso (kg):"), c);
        c.gridx = 1; txtPeso = new JTextField(10); panelDatos.add(txtPeso, c);

        y++;
        c.gridx = 0; c.gridy = y; panelDatos.add(new JLabel("Correo:"), c);
        c.gridx = 1; txtCorreo = new JTextField(18); panelDatos.add(txtCorreo, c);

        y++;
        c.gridx = 0; c.gridy = y; panelDatos.add(new JLabel("Fecha Nac.:"), c);
        c.gridx = 1;
        spFecha = new JSpinner(new SpinnerDateModel());
        spFecha.setEditor(new JSpinner.DateEditor(spFecha, "yyyy-MM-dd"));
        panelDatos.add(spFecha, c);

        y++;
        c.gridx = 0; c.gridy = y; panelDatos.add(new JLabel("Sexo:"), c);
        c.gridx = 1; cbSexo = new JComboBox<>(new String[]{"Masculino", "Femenino"}); panelDatos.add(cbSexo, c);

        y++;
        c.gridx = 0; c.gridy = y; panelDatos.add(new JLabel("Promedio:"), c);
        c.gridx = 1; txtPromedio = new JTextField(8); panelDatos.add(txtPromedio, c);

        add(panelDatos, BorderLayout.EAST);

        // Panel botones abajo
        JPanel panelBot = new JPanel(new FlowLayout(FlowLayout.CENTER, 12, 8));
        btnEditar = new JButton("Editar");
        btnNuevo = new JButton("Nuevo");
        btnGuardar = new JButton("Guardar");
        btnAnterior = new JButton("Anterior");
        btnSiguiente = new JButton("Siguiente");
        btnEstad = new JButton("Estadística");

        panelBot.add(btnEditar);
        panelBot.add(btnNuevo);
        panelBot.add(btnGuardar);
        panelBot.add(btnAnterior);
        panelBot.add(btnSiguiente);
        panelBot.add(btnEstad);

        add(panelBot, BorderLayout.SOUTH);

        // Listeners
        table.getSelectionModel().addListSelectionListener(evt -> {
            if (!evt.getValueIsAdjusting()) {
                int sel = table.getSelectedRow();
                if (sel >= 0 && sel < lista.size()) {
                    currentIndex = sel;
                    mostrarRegistro(currentIndex);
                    setEditing(false);
                }
            }
        });

        btnEditar.addActionListener(e -> {
            if (currentIndex >= 0) {
                isEditing = true; isNew = false;
                setEditing(true);
            }
        });

        btnNuevo.addActionListener(e -> {
            isNew = true; isEditing = false;
            limpiarCampos();
            setEditing(true);
        });

        btnGuardar.addActionListener(e -> onGuardarRegistro());

        btnAnterior.addActionListener(e -> {
            if (lista.isEmpty()) return;
            if (currentIndex > 0) currentIndex--;
            else currentIndex = 0;
            table.getSelectionModel().setSelectionInterval(currentIndex, currentIndex);
            mostrarRegistro(currentIndex);
            setEditing(false);
        });

        btnSiguiente.addActionListener(e -> {
            if (lista.isEmpty()) return;
            if (currentIndex < lista.size()-1) currentIndex++;
            else currentIndex = lista.size()-1;
            table.getSelectionModel().setSelectionInterval(currentIndex, currentIndex);
            mostrarRegistro(currentIndex);
            setEditing(false);
        });

        btnEstad.addActionListener(e -> mostrarEstadisticas());
    }

    private void initDataAndState() {
        // inicializar con 5 ejemplos y cargar tabla
        lista = Utileria.inicializar();
        actualizarTabla();
        if (!lista.isEmpty()) {
            currentIndex = 0;
            table.getSelectionModel().setSelectionInterval(0,0);
            mostrarRegistro(0);
        }
        setEditing(false);
    }

    private void actualizarTabla() {
        tableModel.setRowCount(0);
        for (Estudiante e : lista) {
            Object[] row = new Object[]{
                    e.getNombre(),
                    e.getEdad(),
                    String.format("%.2f", e.getPeso()),
                    e.getCorreo(),
                    (e.getFechaNacimiento() == null ? "" : fmtFecha(e.getFechaNacimiento())),
                    e.getSexo(),
                    String.format("%.2f", e.getPromedio())
            };
            tableModel.addRow(row);
        }
    }

    private void mostrarRegistro(int idx) {
        if (idx < 0 || idx >= lista.size()) return;
        Estudiante e = lista.get(idx);
        txtNombre.setText(e.getNombre());
        spEdad.setValue(e.getEdad());
        txtPeso.setText(String.valueOf(e.getPeso()));
        txtCorreo.setText(e.getCorreo());
        spFecha.setValue(e.getFechaNacimiento() == null ? new Date() : e.getFechaNacimiento());
        cbSexo.setSelectedItem(e.getSexo());
        txtPromedio.setText(String.valueOf(e.getPromedio()));
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        spEdad.setValue(18);
        txtPeso.setText("");
        txtCorreo.setText("");
        spFecha.setValue(new Date());
        cbSexo.setSelectedIndex(0);
        txtPromedio.setText("");
    }

    private void setEditing(boolean on) {
        panelDatos.setEnabled(on);
        for (Component comp : panelDatos.getComponents()) comp.setEnabled(on);
        btnGuardar.setEnabled(on);
        btnEditar.setEnabled(!on && currentIndex >= 0);
        btnNuevo.setEnabled(!on);
        btnAnterior.setEnabled(!on && !lista.isEmpty());
        btnSiguiente.setEnabled(!on && !lista.isEmpty());
        btnEstad.setEnabled(!on && !lista.isEmpty());
    }

    private void onGuardar() {
        JFileChooser fc = new JFileChooser();
        int res = fc.showSaveDialog(this);
        if (res == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            try {
                Utileria.grabarDatos(f.getAbsolutePath(), lista);
                JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al guardar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void onAbrir() {
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(this);
        if (res == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            try {
                lista = Utileria.leerDatos(f.getAbsolutePath());
                actualizarTabla();
                if (!lista.isEmpty()) {
                    currentIndex = 0;
                    table.getSelectionModel().setSelectionInterval(0,0);
                    mostrarRegistro(0);
                } else {
                    limpiarCampos();
                    currentIndex = -1;
                }
                setEditing(false);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al leer archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void onGuardarRegistro() {
        try {
            String nombre = txtNombre.getText().trim();
            if (nombre.isEmpty()) { JOptionPane.showMessageDialog(this, "Nombre requerido"); return; }

            int edad = (Integer) spEdad.getValue();
            float peso = Float.parseFloat(txtPeso.getText());
            String correo = txtCorreo.getText().trim();
            Date fecha = (Date) spFecha.getValue();
            String sexo = (String) cbSexo.getSelectedItem();
            float promedio = Float.parseFloat(txtPromedio.getText());

            if (isNew) {
                Estudiante e = new Estudiante(nombre, edad, peso, correo, fecha, sexo, promedio);
                lista.add(e);
                actualizarTabla();
                currentIndex = lista.size()-1;
                table.getSelectionModel().setSelectionInterval(currentIndex, currentIndex);
                isNew = false;
            } else if (isEditing) {
                if (currentIndex >= 0 && currentIndex < lista.size()) {
                    Estudiante e = lista.get(currentIndex);
                    e.setNombre(nombre); e.setEdad(edad); e.setPeso(peso);
                    e.setCorreo(correo); e.setFechaNacimiento(fecha);
                    e.setSexo(sexo); e.setPromedio(promedio);
                    actualizarTabla();
                    table.getSelectionModel().setSelectionInterval(currentIndex, currentIndex);
                }
                isEditing = false;
            }
            setEditing(false);
            JOptionPane.showMessageDialog(this, "Registro guardado.");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: revisa campos numéricos (peso/promedio).", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarEstadisticas() {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos.");
            return;
        }
        int hombres = 0, mujeres = 0;
        double sumaEdades = 0;
        double sumaPromedios = 0;
        Estudiante masJoven = null, masViejo = null;
        Estudiante mejorProm = null, peorProm = null;

        for (Estudiante e : lista) {
            if ("Masculino".equalsIgnoreCase(e.getSexo())) hombres++; else mujeres++;
            sumaEdades += e.getEdad();
            sumaPromedios += e.getPromedio();

            if (masJoven == null || e.getEdad() < masJoven.getEdad()) masJoven = e;
            if (masViejo == null || e.getEdad() > masViejo.getEdad()) masViejo = e;
            if (mejorProm == null || e.getPromedio() > mejorProm.getPromedio()) mejorProm = e;
            if (peorProm == null || e.getPromedio() < peorProm.getPromedio()) peorProm = e;
        }

        double promEdad = sumaEdades / lista.size();
        double promPromedios = sumaPromedios / lista.size();

        StringBuilder sb = new StringBuilder();
        sb.append("Hombres: ").append(hombres).append("\n");
        sb.append("Mujeres: ").append(mujeres).append("\n");
        sb.append(String.format("Promedio de edad: %.2f\n", promEdad));
        sb.append(String.format("Media de promedios: %.2f\n", promPromedios));
        sb.append("El más joven: ").append(masJoven != null ? masJoven.getNombre() + " ("+masJoven.getEdad()+")" : "-").append("\n");
        sb.append("El más viejo: ").append(masViejo != null ? masViejo.getNombre() + " ("+masViejo.getEdad()+")" : "-").append("\n");
        sb.append("Mayor promedio: ").append(mejorProm != null ? mejorProm.getNombre() + " ("+mejorProm.getPromedio()+")" : "-").append("\n");
        sb.append("Menor promedio: ").append(peorProm != null ? peorProm.getNombre() + " ("+peorProm.getPromedio()+")" : "-").append("\n");

        JOptionPane.showMessageDialog(this, sb.toString(), "Estadísticas", JOptionPane.INFORMATION_MESSAGE);
    }

    private String fmtFecha(Date d) {
        return new SimpleDateFormat("yyyy-MM-dd").format(d);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AppEstudiante app = new AppEstudiante();
            app.setVisible(true);
        });
    }
}
