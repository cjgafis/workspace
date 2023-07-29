package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS

	private JButton btnLimpiar;
	private InterfazTeoriaError interfazCalculadora;
	
	public PanelResultados (InterfazTeoriaError interfazCalculadora) {
		
		this.interfazCalculadora = interfazCalculadora;
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Otras opciones");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(1,2));
		//setBackground(Color.GREEN);

		// CREACIÓN DE OBJETOS
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setOpaque(false);
		btnLimpiar.setBackground(Color.PINK);
		
		// ADICIONAR OBJETOS
		add(btnLimpiar);
		
		// ADICIONAR ACTIONLISTENER
		btnLimpiar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLimpiar) {
			interfazCalculadora.limpiar();
		}
		
	}
	
}
