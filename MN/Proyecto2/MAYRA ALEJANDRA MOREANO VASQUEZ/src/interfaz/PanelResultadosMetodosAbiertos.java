package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultadosMetodosAbiertos extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	// ATRIBUTOS

	private JButton btnPuntoFijo;
	private JTextField txtPuntoFijo;

	private JButton btnNewton;
	private JTextField txtNewton;

	private JButton btnLimpiarResultados;
	private JButton btnLimpiarTodoPanel;

	private InterfazPrincipal interfazPrincipal;

	public PanelResultadosMetodosAbiertos (InterfazPrincipal interfazPrincipal) {

		this.interfazPrincipal = interfazPrincipal;

		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Calcule la raíz:");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(3,2));

		// CREACIÓN DE OBJETOS

		btnPuntoFijo = new JButton("Mediante el método de punto fijo");
		txtPuntoFijo = new JTextField("");
		txtPuntoFijo.setEditable(false);

		btnNewton = new JButton("Mediante el método de Newton - Raphson");
		txtNewton = new JTextField("");
		txtNewton.setEditable(false);

		btnLimpiarResultados = new JButton("Limpiar resultados");
		btnLimpiarTodoPanel = new JButton("Limpiar all");

		// ADICIONAR OBJETOS
		add(btnPuntoFijo);
		add(txtPuntoFijo);
		add(btnNewton);
		add(txtNewton);
		add(btnLimpiarResultados);
		add(btnLimpiarTodoPanel);

		// ADICIONAR ACTIONLISTENER
		btnPuntoFijo.addActionListener(this);
		btnNewton.addActionListener(this);
		btnLimpiarResultados.addActionListener(this);
		btnLimpiarTodoPanel.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPuntoFijo) {
			interfazPrincipal.calcularRaizMediantePuntoFijo();
		} else if (e.getSource() == btnNewton) {
			interfazPrincipal.calcularRaizMedianteNewton();
		} else if (e.getSource() == btnLimpiarResultados) {
			interfazPrincipal.limpiarResultadosAbiertos();
		} else if (e.getSource() == btnLimpiarTodoPanel) {
			interfazPrincipal.limpiarTodoPanelAbiertos();
		} 
	}

	public void setTxtPuntoFijo(String txtPuntoFijo) {
		this.txtPuntoFijo.setText(txtPuntoFijo);
	}

	public void setTxtNewton(String txtNewton) {
		this.txtNewton.setText(txtNewton);
	}

}
