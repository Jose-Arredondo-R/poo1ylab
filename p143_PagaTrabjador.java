import javax.swing.*;
import java.awt.*;

public class p143_PagaTrabjador extends JFrame {

    JTextField txtHoras, txtPaga, txtImpuesto;
    JLabel lblBruta, lblImp, lblNeta;

    public p143_PagaTrabjador() {

        setTitle("Calcular Paga de Trabajador");
        setSize(380, 320);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.anchor = GridBagConstraints.WEST;

        // ---- FILA 1 ----
        c.gridx = 0; c.gridy = 0;
        add(new JLabel("Horas Trabajadas:"), c);
        c.gridx = 1;
        txtHoras = new JTextField(10);
        add(txtHoras, c);

        // ---- FILA 2 ----
        c.gridx = 0; c.gridy = 1;
        add(new JLabel("Paga por Hora:"), c);
        c.gridx = 1;
        txtPaga = new JTextField(10);
        add(txtPaga, c);

        // ---- FILA 3 ----
        c.gridx = 0; c.gridy = 2;
        add(new JLabel("Tasa de Impuestos (%):"), c);
        c.gridx = 1;
        txtImpuesto = new JTextField(10);
        add(txtImpuesto, c);

        // ---- RESULTADOS ----
        c.gridx = 0; c.gridy = 3;
        add(new JLabel("Paga Bruta:"), c);
        c.gridx = 1;
        lblBruta = new JLabel("0.00");
        add(lblBruta, c);

        c.gridx = 0; c.gridy = 4;
        add(new JLabel("Impuesto:"), c);
        c.gridx = 1;
        lblImp = new JLabel("0.00");
        add(lblImp, c);

        c.gridx = 0; c.gridy = 5;
        add(new JLabel("Paga Neta:"), c);
        c.gridx = 1;
        lblNeta = new JLabel("0.00");
        add(lblNeta, c);

        // ---- BOTONES ----
        JPanel panelBotones = new JPanel();
        JButton btnCalcular = new JButton("Calcular");
        JButton btnSalir = new JButton("Salir");
        panelBotones.add(btnCalcular);
        panelBotones.add(btnSalir);

        c.gridx = 0; c.gridy = 6; c.gridwidth = 2;
        c.anchor = GridBagConstraints.CENTER;
        add(panelBotones, c);

        // Acción del botón Calcular
        btnCalcular.addActionListener(e -> {
            try {
                double horas = Double.parseDouble(txtHoras.getText());
                double paga = Double.parseDouble(txtPaga.getText());
                double tasa = Double.parseDouble(txtImpuesto.getText());

                double bruta = horas * paga;
                double impuesto = bruta * tasa;
                double neta = bruta - impuesto;

                lblBruta.setText(String.format("%.2f", bruta));
                lblImp.setText(String.format("%.2f", impuesto));
                lblNeta.setText(String.format("%.2f", neta));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: ingresa valores numéricos.");
            }
        });

        btnSalir.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        new p143_PagaTrabjador();
    }
}
