import javax.swing.*;
import java.awt.*;

public class p144_Temperaturas extends JFrame {

    JTextField txtF, txtC;
    JRadioButton rbC, rbF;

    public p144_Temperaturas() {

        setTitle("Convertir Temperaturas");
        setSize(380, 270);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(6, 6, 6, 6);
        c.anchor = GridBagConstraints.WEST;

        // Fahrenheit
        c.gridx = 0; c.gridy = 0;
        add(new JLabel("Fahrenheit:"), c);
        c.gridx = 1;
        txtF = new JTextField(10);
        add(txtF, c);

        // Centígrados
        c.gridx = 0; c.gridy = 1;
        add(new JLabel("Centígrados:"), c);
        c.gridx = 1;
        txtC = new JTextField(10);
        add(txtC, c);

        // Radio Buttons
        rbC = new JRadioButton("Calcular Centígrados");
        rbF = new JRadioButton("Calcular Fahrenheit");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbC);
        grupo.add(rbF);
        rbC.setSelected(true);

        JPanel panelOpciones = new JPanel();
        panelOpciones.add(rbC);
        panelOpciones.add(rbF);

        c.gridx = 0; c.gridy = 2; c.gridwidth = 2;
        add(panelOpciones, c);

        // Botones
        JPanel panelBotones = new JPanel();
        JButton btnCalcular = new JButton("Calcular");
        JButton btnSalir = new JButton("Salir");
        panelBotones.add(btnCalcular);
        panelBotones.add(btnSalir);

        c.gridy = 3;
        add(panelBotones, c);

        // Acción
        btnCalcular.addActionListener(e -> {
            try {
                if (rbC.isSelected()) {
                    double f = Double.parseDouble(txtF.getText());
                    double celsius = (f - 32) * 5 / 9;
                    txtC.setText(String.format("%.2f", celsius));
                } else {
                    double ctemp = Double.parseDouble(txtC.getText());
                    double ftemp = (ctemp * 9 / 5) + 32;
                    txtF.setText(String.format("%.2f", ftemp));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: ingresa valores numéricos.");
            }
        });

        btnSalir.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        new p144_Temperaturas();
    }
}
