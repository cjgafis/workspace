package Interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

//Importar mundo
import mundo.CalculoRaiz;

public class PanelMetodosAbiertos extends JPanel implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ATRIBUTOS
	CalculoRaiz mundo;
	PanelMetodosAbiertos metodosAbiertos;
	
	private JLabel xi;
	private JLabel funcion;
	private JLabel raiz;
	private JLabel derivada;
	
	private JTextField txtXi;
	private JTextField txtfuncion;
	private JTextField txtRaiz;
	private JTextField txtDerivada;
	
	private JButton butNewtonRaphson;
	private JButton butPuntoFijo;
	private JButton butLimpiar;
	
	private JLabel vacio;
	
	public final static String accionNewtonRaphson = "Newton Raphson";
	public final static String accionPuntoFijo = "Punto Fijo";
	public final static String accionLimpiar = "Limpiar";
	
	
	public PanelMetodosAbiertos()
	{
		mundo = new CalculoRaiz();
		
		TitledBorder mAbiertos = BorderFactory.createTitledBorder("Metodos abiertos");
		setBorder(mAbiertos);
		setLayout(new GridLayout(6,2));
		
		//Crear
		xi = new JLabel("Xi");
		funcion = new JLabel("Funcion");
		raiz = new JLabel("Raiz");
		derivada = new JLabel("Dx si es necesario");
		
		
		txtfuncion = new JTextField();
		txtRaiz = new JTextField();
		txtRaiz.setEditable(false);
		txtXi = new JTextField();
		txtDerivada = new JTextField();
		
		butNewtonRaphson = new JButton("Newton Raphson");
		butNewtonRaphson.addActionListener(this);
		butNewtonRaphson.setActionCommand(accionNewtonRaphson);
		
		butPuntoFijo = new JButton("Punto Fijo");
		butPuntoFijo.addActionListener(this);
		butPuntoFijo.setActionCommand(accionPuntoFijo);
		
		butLimpiar = new JButton("Limpiar");
		butLimpiar.addActionListener(this);
		butLimpiar.setActionCommand(accionLimpiar);
		
		vacio = new JLabel("");
		
		//Añadir
		add(xi);
		add(txtXi);
		add(funcion);
		add(txtfuncion);
		add(derivada);
		add(txtDerivada);
		add(raiz);
		add(txtRaiz);
		add(butNewtonRaphson);
		add(butPuntoFijo);
		add(vacio);
		add(butLimpiar);
		
	}
	
	// Conexion con el mundo //

	public void NewtonRaphson() throws Exception
	{
		double valorXi = Double.parseDouble(txtXi.getText());
		String valorFuncion = txtfuncion.getText();
		String ValorDerivada = txtDerivada.getText();
		
		double mNewtonRaphson = mundo.newtonRaphson(valorFuncion, ValorDerivada, valorXi);
		
		txtRaiz.setText(mNewtonRaphson + "");
	}
	
	
	public void PuntoFijo() throws Exception
	{
		double valorXi = Double.parseDouble(txtXi.getText());
		String valorFuncion = txtfuncion.getText();
		
		double mPuntoFijo = mundo.puntoFijo(valorFuncion, valorXi);
		
		txtRaiz.setText(mPuntoFijo + "");
	}
	
	
	public void limpiar()
	{
		txtXi.setText("");
		txtRaiz.setText("");
		txtfuncion.setText("");
		txtDerivada.setText("");
	}
	
	@Override
	public void actionPerformed(ActionEvent pEvento) 
	{
		String comando = pEvento.getActionCommand();
		if (comando.equals(accionNewtonRaphson))
		{
			try {
				NewtonRaphson();
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		else if (comando.equals(accionPuntoFijo))
		{
			try 
			{
				PuntoFijo();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (comando.equals(accionLimpiar))
		{
			limpiar();
		}
	}

}
