package interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	// 1. DECLARAR LOS ATRIBUTOS
	private JLabel labNumero1;
	private JTextField txtNUmero1;
	private JLabel labNumero2;
	private JTextField txtNUmero2;
	
	public PanelDatos()
	{
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Datos");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(2,2));
		
		// 2. INSTANCIAR LOS ATRIBUTOS
		labNumero1 = new JLabel("NUmero 1: ");
		txtNUmero1 = new JTextField();
		labNumero2 = new JLabel("NUmero 2: ");
		txtNUmero2 = new JTextField();
		
		// 3. AGREGAR AL LAYOUT
		add(labNumero1);
		add(txtNUmero1);
		add(labNumero2);
		add(txtNUmero2);		
	}
	
	public String getTxtNumero1()
	{
		return txtNUmero1.getText();
	}
	
	public String getTxtNumero2()
	{
		return txtNUmero2.getText();
	}
	
	public void limpiar()
	{
		txtNUmero1.setText("");
		txtNUmero2.setText("");
	}

}
