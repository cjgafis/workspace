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
	private JLabel labNumero1; 
	private JLabel labNumero2; 
	private JLabel labNumero3;
	private JLabel labNumero4; 
	private JLabel labNumero5;
	
	private JTextField txtVV; 
	private JTextField txtM; 
	private JTextField txtMp; 
	private JTextField txtMl; 
	private JTextField txtMed;

	public PanelDatos() 
	{
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("DATOS");
		setBorder(borde);
		borde.setTitleColor(Color.GREEN);
		setLayout(new GridLayout(5, 2));
		
		
		labNumero1 = new JLabel("VV");   
		txtVV = new JTextField();
		
		labNumero2 = new JLabel("M");
		txtM = new JTextField();
		
		labNumero3 = new JLabel("MP");
		txtMp = new JTextField();
		
		labNumero4 = new JLabel("Ml");
		txtMl = new JTextField();
		
		labNumero5 = new JLabel("Medidas separadas por coma");
		txtMed = new JTextField();
		
		// AGREGAR LOS OBJETOS AL PANEL
		
		add(labNumero1);
		add(txtVV);
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
		return txtVV.getText();
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
		txtVV.setText("");
		txtM.setText("");
	}

}

