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
	// ATRIBUTOS
	private JLabel labNumero1;
	private JTextField txtNumero1;
	private JLabel labNumero2;
	private JTextField txtNumero2;

	public PanelDatos() 
	{
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Datos");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(2,2));
		
		// INSTANCIAR
		labNumero1 = new JLabel("NUmero 1");
		txtNumero1 = new JTextField();
		labNumero2 = new JLabel("NUmero 2");
		txtNumero2 = new JTextField();
		
		// AGREGAR AL PANEL
		add(labNumero1);
		add(txtNumero1);
		add(labNumero2);
		add(txtNumero2);
	
	}
	
	public String getTxtNumero1()
	{
		return txtNumero1.getText();
	}
	
	public String getTxtNumero2()
	{
		return txtNumero2.getText();
	}
	
	public void limpiar()
	{
		txtNumero1.setText("");
		txtNumero2.setText("");
	}

}
