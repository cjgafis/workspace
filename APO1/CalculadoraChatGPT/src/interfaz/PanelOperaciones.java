package interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelOperaciones extends JPanel {

    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;

    public PanelOperaciones() {
        setLayout(new GridLayout(1, 4));

        btnSumar = new JButton("Sumar");
        btnRestar = new JButton("Restar");
        btnMultiplicar = new JButton("Multiplicar");
        btnDividir = new JButton("Dividir");

        add(btnSumar);
        add(btnRestar);
        add(btnMultiplicar);
        add(btnDividir);
    }

    public JButton getBtnSumar() {
        return btnSumar;
    }

    public JButton getBtnRestar() {
        return btnRestar;
    }

    public JButton getBtnMultiplicar() {
        return btnMultiplicar;
    }

    public JButton getBtnDividir() {
        return btnDividir;
    }
}

