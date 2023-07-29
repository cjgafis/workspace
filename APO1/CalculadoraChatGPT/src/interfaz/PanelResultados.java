package interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelResultados extends JPanel {

    private JLabel lblResultado;
    private JTextField txtResultado;
    private JButton btnLimpiar;

    public PanelResultados() {
        setLayout(new GridLayout(1, 3));

        lblResultado = new JLabel("Resultado:");
        txtResultado = new JTextField();
        btnLimpiar = new JButton("Limpiar");

        txtResultado.setEditable(false);

        add(lblResultado);
        add(txtResultado);
        add(btnLimpiar);
    }

    public void mostrarResultado(String resultado) {
        txtResultado.setText(resultado);
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void limpiarResultado() {
        txtResultado.setText("");
    }
}

