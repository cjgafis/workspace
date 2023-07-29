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
	
	// ATRIBUTOS
	private JLabel labNumero1, labNumero2, labNumero3, labNumero4, labNumero5;
	private JTextField txtVv, txtM, txtMp, txtMl, txtMed;

	public PanelDatos() 
	{
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Datos");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(5, 2));
		
		// CREAR LOS OBJETOS
		labNumero1 = new JLabel("Vv");   // labNumero1
		txtVv = new JTextField();
		labNumero2 = new JLabel("M");
		txtM = new JTextField();
		labNumero3 = new JLabel("Mp");
		txtMp = new JTextField();
		labNumero4 = new JLabel("Ml");
		txtMl = new JTextField();
		labNumero5 = new JLabel("Medidas separado por coma");
		txtMed = new JTextField();
		
		// AGREGAR LOS OBJETOS AL PANEL
		add(labNumero1);
		add(txtVv);
		add(labNumero2);
		add(txtM);
		add(labNumero3);
		add(txtMp);
		add(labNumero4);
		add(txtMl);
		add(labNumero5);
		add(txtMed);
	}

	public String getVv()
	{
		return txtVv.getText();
	}
	
	public String getM()
	{
		return txtM.getText();
	}

	public String getMp()
	{
		return txtMp.getText();
	}
	
	public String getMl()
	{
		return txtMl.getText();
	}
	
	public String getMedidas()
	{
		return txtMed.getText();
	}
	
	public void limpiar()
	{
		txtVv.setText("");
		txtM.setText("");
	}

}
