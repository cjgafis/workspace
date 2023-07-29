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


public class PanelBiseccion extends JPanel implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Atributos
	CalculoRaiz mundo;
	PanelCuadratica cuadratica;
	
	private JLabel funcion;
	private JLabel valorXa;
	private JLabel valorXb;
	private JLabel raiz;
	
	private JTextField txtFuncion;
	private JTextField txtValorXa;
	private JTextField txtValorXb;
	private JTextField txtRaiz;
	
	private JButton butBiseccion;
	private JButton butFalsaPosicion;
	private JButton butLimpiar;
	private JLabel vacio;
	
	public final static String accionBiseccion = "Biseccion";
	public final static String accionFalsaPosicion = "Falsa Posicion";
	public final static String accionLimpiar = "Limpiar";
	public final static String accionLimpiarAll = "Limpiar All";
	
	public PanelBiseccion()
	{
		mundo = new CalculoRaiz();
		cuadratica = new PanelCuadratica();
		
		TitledBorder Biseccion = BorderFactory.createTitledBorder("Metodos cerrados");
		setBorder(Biseccion);
		setLayout(new GridLayout(6,2));
		
		//Creamos objetos
		funcion = new JLabel ("Funcion");
		valorXa = new JLabel ("Limite Superior");
		valorXb = new JLabel ("Limite Inferior");
		raiz = new JLabel("Raiz");
		
		txtFuncion = new JTextField();
		txtValorXa = new JTextField();
		txtValorXb = new JTextField();
		txtRaiz = new JTextField();
		txtRaiz.setEditable(false);
		
		butBiseccion = new JButton("Biseccion");
		butBiseccion.addActionListener(this);
		butBiseccion.setActionCommand(accionBiseccion);
		
		butFalsaPosicion = new JButton("Falsa Posicion");
		butFalsaPosicion.addActionListener(this);
		butFalsaPosicion.setActionCommand(accionFalsaPosicion);
		
		butLimpiar = new JButton("Limpiar");
		butLimpiar.addActionListener(this);
		butLimpiar.setActionCommand(accionLimpiar);
		
		vacio = new JLabel("");
		
		//Añadimos
		add(funcion);
		add(txtFuncion);
		
		add(valorXa);
		add(txtValorXa);
		
		add(valorXb);
		add(txtValorXb);
		
		add(raiz);
		add(txtRaiz);
		
		add(butBiseccion);
		add(butFalsaPosicion);
		add(vacio);
		add(butLimpiar);
	}
	
	//UNION MUNDO
	
	public void Biseccion() throws Exception
	{
		String laFuncion = txtFuncion.getText();
		double elLimiteSuperior = Double.parseDouble(txtValorXa.getText());
     	double elLimiteInfeior = Double.parseDouble(txtValorXb.getText());
		
     	double biseccion = mundo.biseccion(elLimiteSuperior, elLimiteInfeior, laFuncion);
     	
     	txtRaiz.setText(biseccion + "");
	}
	
	public void FalsaPosicion() throws Exception
	{
		String laFuncion = txtFuncion.getText();
		double elLimiteSuperior = Double.parseDouble(txtValorXa.getText());
     	double elLimiteInfeior = Double.parseDouble(txtValorXb.getText());
     	
     	double falsaPosicion = mundo.falsaPosicion(elLimiteSuperior, elLimiteInfeior, laFuncion);
     	txtRaiz.setText(falsaPosicion + "");
	}
	
	//Metodos botones
	
	public void limpiar()
	{
		txtFuncion.setText("");
		txtRaiz.setText("");
		txtValorXa.setText("");
		txtValorXb.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent pEvento) 
	{
		String comando = pEvento.getActionCommand();
		
		if(comando.equals(accionBiseccion))
		{
			try {
				Biseccion();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		else if(comando.equals(accionFalsaPosicion))
		{
			try {
				FalsaPosicion();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(comando.equals(accionLimpiar))
		{
			limpiar();
		}

	}
	
}
