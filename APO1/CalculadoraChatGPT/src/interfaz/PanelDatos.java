package interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelDatos extends JPanel {

    private JLabel lblNumero1;
    private JLabel lblNumero2;
    private JTextField txtNumero1;
    private JTextField txtNumero2;

    public PanelDatos() {
        setLayout(new GridLayout(2, 2));

        lblNumero1 = new JLabel("Número 1:");
        lblNumero2 = new JLabel("Número 2:");
        txtNumero1 = new JTextField();
        txtNumero2 = new JTextField();

        add(lblNumero1);
        add(txtNumero1);
        add(lblNumero2);
        add(txtNumero2);
    }

    public double getNumero1() {
        return Double.parseDouble(txtNumero1.getText());
    }

    public double getNumero2() {
        return Double.parseDouble(txtNumero2.getText());
    }

    public void limpiarCampos() {
        txtNumero1.setText("");
        txtNumero2.setText("");
    }
}

