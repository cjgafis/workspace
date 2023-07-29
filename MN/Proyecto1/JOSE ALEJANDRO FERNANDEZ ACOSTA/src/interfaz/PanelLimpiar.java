package interfaz;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelLimpiar extends JPanel
{
	private JButton butLimpiar;
	private JTextField textEspacio;
	
	public PanelLimpiar() 
	{
		TitledBorder borde = BorderFactory.createTitledBorder("Limpiar");
		setBorder(borde);
		setLayout(new GridLayout(1, 2));
		
		butLimpiar = new JButton("Limpiar");
		textEspacio = new JTextField("");
		textEspacio.setBackground(null);
		textEspacio.setBorder(null);
		textEspacio.setEditable(false);
		
		add(textEspacio);
		add(butLimpiar);
	}

}
