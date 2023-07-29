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

public class PanelResultadosCuadratica extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	
	private JButton btnRaiz1;
	private JTextField txtRaiz1;
	
	private JButton btnRaiz2;
	private JTextField txtRaiz2;
	
	private JButton btnLimpiarResultados;
	private JButton btnLimpiarTodoPanel;
	
	private InterfazPrincipal interfazPrincipal;
	
	public PanelResultadosCuadratica (InterfazPrincipal interfazPrincipal) {
		
		this.interfazPrincipal = interfazPrincipal;
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Calcular:");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(3,2));
		
		// CREACIÓN DE OBJETOS

		btnRaiz1 = new JButton("Raíz 1");
		txtRaiz1 = new JTextField("");
		txtRaiz1.setEditable(false);
		
		btnRaiz2 = new JButton("Raíz 2");
		txtRaiz2 = new JTextField("");
		txtRaiz2.setEditable(false);
		
		btnLimpiarResultados = new JButton("Limpiar resultados");
		btnLimpiarTodoPanel = new JButton("Limpiar all");
		
		// ADICIONAR OBJETOS
		add(btnRaiz1);
		add(txtRaiz1);
		add(btnRaiz2);
		add(txtRaiz2);
		add(btnLimpiarResultados);
		add(btnLimpiarTodoPanel);
		
		// ADICIONAR ACTIONLISTENER
		btnRaiz1.addActionListener(this);
		btnRaiz2.addActionListener(this);
		btnLimpiarResultados.addActionListener(this);
		btnLimpiarTodoPanel.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRaiz1) {
			interfazPrincipal.calcularRaiz1();
		} else if (e.getSource() == btnRaiz2) {
			interfazPrincipal.calcularRaiz2();
		} else if (e.getSource() == btnLimpiarResultados) {
			interfazPrincipal.limpiarResultadosCuadratica();
		} else if (e.getSource() == btnLimpiarTodoPanel) {
			interfazPrincipal.limpiarTodoPanelCuadratica();
		} 
		
	}

	public void setTxtRaiz1(String txtRaiz1) {
		this.txtRaiz1.setText(txtRaiz1);
	}
	
	public void setTxtRaiz2(String txtRaiz2) {
		this.txtRaiz2.setText(txtRaiz2);
	}
	
}
