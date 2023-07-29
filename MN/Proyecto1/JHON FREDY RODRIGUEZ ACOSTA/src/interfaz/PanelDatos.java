package interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel
{
	private static final long serialVersionUID = 1L;

	private JLabel lblDatos;
	private JTextField txtDatos;
	
	public PanelDatos()
	{
		TitledBorder borde = BorderFactory.createTitledBorder("Datos");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(1, 1));
		
		lblDatos = new JLabel("Datos (Separelos por , ):");
		txtDatos = new JTextField();

		add(lblDatos);
		add(txtDatos);			
	}
	
	public String getDatos()
	{
		return txtDatos.getText();
	}
	
	public void limpiar()
	{
		txtDatos.setText("");
	}

}
