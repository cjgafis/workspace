package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelTercerCorte extends JPanel
{
	private static final long serialVersionUID = 1L;

	// ATRIBUTOS
	private JLabel labNotaTeorica;
	private JTextField txtNotaTeorica;
	private JLabel labPorcentaje1;
	private JTextField txtPorcentaje1;
	private JLabel labNotaPractica;
	private JTextField txtNotaPractica;
	private JLabel labPorcentaje2;
	private JTextField txtPorcentaje2;

	public PanelTercerCorte()
	{
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Tercer corte");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(2, 4));

		// CREAMOS
		labNotaTeorica = new JLabel("Nota teorica");
		txtNotaTeorica = new JTextField();
		labPorcentaje1 = new JLabel("Porcentaje");
		txtPorcentaje1 = new JTextField();
		labNotaPractica = new JLabel("Nota practica");	
		txtNotaPractica = new JTextField();
		labPorcentaje2 = new JLabel("Porcentaje");
		txtPorcentaje2 = new JTextField();

		// AGREGAR
		add(labNotaTeorica);
		add(txtNotaTeorica);
		add(labPorcentaje1);
		add(txtPorcentaje1);
		add(labNotaPractica);
		add(txtNotaPractica);
		add(labPorcentaje2);
		add(txtPorcentaje2);
	}
	
	public String getNotaTeorica()
	{
		return txtNotaTeorica.getText();
	}
	
	public String getPorcentaje1()
	{
		return txtPorcentaje1.getText();
	}
	
	public String getNotaPractica()
	{
		return txtNotaPractica.getText();
	}
	
	public String getPorcentaje2()
	{
		return txtPorcentaje2.getText();
	}
	
	public void limpiar()
	{
		txtNotaTeorica.setText("");
		txtPorcentaje1.setText("");
		txtNotaPractica.setText("");
		txtPorcentaje2.setText("");
	}

	/**
	 * @return the txtNotaTeorica
	 */
	public JTextField getTxtNotaTeorica() 
	{
		return txtNotaTeorica;
	}

	/**
	 * @param txtNotaTeorica the txtNotaTeorica to set
	 */
	public void setTxtNotaTeorica(JTextField txtNotaTeorica) 
	{
		this.txtNotaTeorica = txtNotaTeorica;
	}

	/**
	 * @return the txtPorcentaje1
	 */
	public JTextField getTxtPorcentaje1() 
	{
		return txtPorcentaje1;
	}

	/**
	 * @param txtPorcentaje1 the txtPorcentaje1 to set
	 */
	public void setTxtPorcentaje1(JTextField txtPorcentaje1) 
	{
		this.txtPorcentaje1 = txtPorcentaje1;
	}

	/**
	 * @return the txtNotaPractica
	 */
	public JTextField getTxtNotaPractica() 
	{
		return txtNotaPractica;
	}

	/**
	 * @param txtNotaPractica the txtNotaPractica to set
	 */
	public void setTxtNotaPractica(JTextField txtNotaPractica) 
	{
		this.txtNotaPractica = txtNotaPractica;
	}

	/**
	 * @return the txtPorcentaje2
	 */
	public JTextField getTxtPorcentaje2() 
	{
		return txtPorcentaje2;
	}

	/**
	 * @param txtPorcentaje2 the txtPorcentaje2 to set
	 */
	public void setTxtPorcentaje2(JTextField txtPorcentaje2) {
		this.txtPorcentaje2 = txtPorcentaje2;
	}
}
