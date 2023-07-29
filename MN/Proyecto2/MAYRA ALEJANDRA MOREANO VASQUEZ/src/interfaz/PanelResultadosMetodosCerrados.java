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

public class PanelResultadosMetodosCerrados extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	// ATRIBUTOS

	private JButton btnBiseccion;
	private JTextField txtBiseccion;

	private JButton btnFalsaPosicion;
	private JTextField txtFalsaPosicion;

	private JButton btnLimpiarResultados;
	private JButton btnLimpiarTodoPanel;

	private InterfazPrincipal interfazPrincipal;

	public PanelResultadosMetodosCerrados (InterfazPrincipal interfazPrincipal) {

		this.interfazPrincipal = interfazPrincipal;

		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Calcule la raíz:");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(3,2));

		// CREACIÓN DE OBJETOS

		btnBiseccion = new JButton("Mediante el método de la bisección");
		txtBiseccion = new JTextField("");
		txtBiseccion.setEditable(false);

		btnFalsaPosicion = new JButton("Mediante el método de la falsa posición");
		txtFalsaPosicion = new JTextField("");
		txtFalsaPosicion.setEditable(false);

		btnLimpiarResultados = new JButton("Limpiar resultados");
		btnLimpiarTodoPanel = new JButton("Limpiar all");

		// ADICIONAR OBJETOS
		add(btnBiseccion);
		add(txtBiseccion);
		add(btnFalsaPosicion);
		add(txtFalsaPosicion);
		add(btnLimpiarResultados);
		add(btnLimpiarTodoPanel);

		// ADICIONAR ACTIONLISTENER
		btnBiseccion.addActionListener(this);
		btnFalsaPosicion.addActionListener(this);
		btnLimpiarResultados.addActionListener(this);
		btnLimpiarTodoPanel.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBiseccion) {
			interfazPrincipal.calcularRaizMedianteBiseccion();
		} else if (e.getSource() == btnFalsaPosicion) {
			interfazPrincipal.calcularRaizMedianteFalsaPosicion();
		} else if (e.getSource() == btnLimpiarResultados) {
			interfazPrincipal.limpiarResultadosCerrados();
		} else if (e.getSource() == btnLimpiarTodoPanel) {
			interfazPrincipal.limpiarTodoPanelCerrados();
		}

	}

	public void setTxtBiseccion(String txtBiseccion) {
		this.txtBiseccion.setText(txtBiseccion);
	}

	public void setTxtFalsaPosicion(String txtFalsaPosicion) {
		this.txtFalsaPosicion.setText(txtFalsaPosicion);
	}

}
