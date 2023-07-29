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

import Mundo.Operacion;


public class PanelErrores extends JPanel implements ActionListener
{
	// Primero declarando las variables
	private JLabel vVerdadero;
	private JLabel medidos;
	private JLabel medidaLejana;
	private JLabel promedio;

	private JTextField txtvVerdadero;
	private JTextField txtmedidos;
	private JTextField txtmedidaLejana;
	private JTextField txtpromedio;

	//BOTONES
	private static final long serialVersionUID = 1L;
	public final static String ErrorAbsoluto = "Error_Absoluto";
	public final static String ErrorRelativo = "Error_Relativo";
	public final static String ErrorExactitud = "Error_Exactitud";
	public final static String Exactitud = "Exactitud";
	public final static String ErrorPrecision = "Error_Precision";
	public final static String Precision = "Precision";
	public final static String Limpiar = "Limpiar";

	private JButton errorAbsolutoVariasMedidas;
	private JButton errorRelativo;
	private JButton porcentajeErrorExactitud;
	private JButton porcentajeExactitud;
	private JButton porcentajeErrorPrecision;
	private JButton porcentajePrecision;
	
	//RESULTADO
	private JLabel solucion;
	private JTextField txtResultado;
	private JButton limpiar;
	private JLabel vacio;

	//MUNDO
	Operacion mundo;

	public PanelErrores() 
	{
		//MUNDO
		mundo = new Operacion();

		TitledBorder Errores = BorderFactory.createTitledBorder("Calculo Errores");
		setBorder(Errores);

		setLayout(new GridLayout(9,2));

		//DATOS
		//Crear los objetos
		vVerdadero = new JLabel("Valor verdadero");
		medidos = new JLabel("Valor de la medida");
		medidaLejana = new JLabel("Valor medida lejana");
		txtvVerdadero = new JTextField();
		txtmedidos = new JTextField();
		txtmedidaLejana = new JTextField();
		promedio = new JLabel("Promedio");
		txtpromedio = new JTextField();

		// Añado los objetos
		add(vVerdadero);
		add(txtvVerdadero);
		
		add(medidos);
		add(txtmedidos);
		
		add(medidaLejana);
		add(txtmedidaLejana);
		
		add(promedio);
		add(txtpromedio);

		//BOTONES
		errorAbsolutoVariasMedidas = new JButton("Ea");
		errorAbsolutoVariasMedidas.setActionCommand(ErrorAbsoluto);
		errorAbsolutoVariasMedidas.addActionListener(this);;

		errorRelativo = new JButton("Er");
		errorRelativo.setActionCommand(ErrorRelativo);
		errorRelativo.addActionListener(this);

		porcentajeErrorExactitud = new JButton("%Ee");
		porcentajeErrorExactitud.setActionCommand(ErrorExactitud);
		porcentajeErrorExactitud.addActionListener(this);

		porcentajeExactitud = new JButton("%E");
		porcentajeExactitud.setActionCommand(Exactitud);
		porcentajeExactitud.addActionListener(this);

		porcentajeErrorPrecision = new JButton("%Ep");
		porcentajeErrorPrecision.setActionCommand(ErrorPrecision);
		porcentajeErrorPrecision.addActionListener(this);

		porcentajePrecision = new JButton("%P");
		porcentajePrecision.setActionCommand(Precision);
		porcentajePrecision.addActionListener(this);

		add(errorAbsolutoVariasMedidas);
		add(errorRelativo);
		
		add(porcentajeErrorExactitud);
		add(porcentajeExactitud);
		
		add(porcentajeErrorPrecision);
		add(porcentajePrecision);
		
		//RESULTADO
		solucion = new JLabel("Resultado");
		txtResultado = new JTextField("");
		txtResultado.setEditable(false);
		
		limpiar = new JButton("Limpiar");
		limpiar.setActionCommand(Limpiar);
		limpiar.addActionListener(this);
		
		vacio = new JLabel ("");
		
		add(solucion);
		add(txtResultado);
		add(vacio);
		add(limpiar);
	}

	
	/**
	 * UNION DEL MUNDO CON LA INTERFAZ
	 */
	
	/**
	 * Calculo del error absoluto
	 */
	public void calcularErrorAbsolutoUnaMedida()	
	{
		double medida = Double.parseDouble(txtmedidos.getText());
		double valorVerdadero = Double.parseDouble(txtvVerdadero.getText());
		
		double errorAbsoluto = mundo.errorAbsolutoUnaMedida(medida, valorVerdadero);
		
		txtResultado.setText(errorAbsoluto+"");
	}
	
	
	public void calcularErrorRelativo()	
	{
		double medida = Double.parseDouble(txtmedidos.getText());
		double valorVerdadero = Double.parseDouble(txtvVerdadero.getText());
		
		double errorRelativo = mundo.errorRelativo(medida, valorVerdadero);
		
		txtResultado.setText(errorRelativo+"");
	}
	
	
	public void calcularErrorExactitud()	
	{
		double medida = Double.parseDouble(txtmedidos.getText());
		double valorVerdadero = Double.parseDouble(txtvVerdadero.getText());
		
		double errorRelativo = mundo.errorRelativo(medida, valorVerdadero);
		
		txtResultado.setText(errorRelativo*100+"");
	}
	
	public void calcularExactitud()	
	{
		double medida = Double.parseDouble(txtmedidos.getText());
		double valorVerdadero = Double.parseDouble(txtvVerdadero.getText());
		
		double errorRelativo = mundo.errorRelativo(medida, valorVerdadero);
		
		txtResultado.setText(100-(errorRelativo*100)+"");
	}
	
	public void calcularErrorPrecision()	
	{
		double medidaPromedio = Double.parseDouble(txtpromedio.getText());
		double medidaLejana = Double.parseDouble(txtmedidaLejana.getText());
		
		double errorRelativo = mundo.errorRelativo(medidaPromedio, medidaLejana);
		
		txtResultado.setText(100-(errorRelativo*100)+"");
	}
	
	
	public void limpiar()	
	{
		txtvVerdadero.setText("");
		txtmedidaLejana.setText("");
		txtmedidos.setText("");
		txtpromedio.setText("");
		txtResultado.setText("");
	}
	
	public void actionPerformed(ActionEvent pEvento) 
	{
		String comando = pEvento.getActionCommand( );
		
		if(comando.equals(ErrorAbsoluto))
		{
			calcularErrorAbsolutoUnaMedida();
		}
		else if(comando.equals(ErrorRelativo))
		{
			calcularErrorRelativo();
		}
		else if(comando.equals(ErrorExactitud))
		{
			calcularErrorExactitud();
		}
		else if(comando.equals(Exactitud))
		{
			calcularExactitud();
		}
		else if(comando.equals(ErrorPrecision))
		{
			
		}
		else if(comando.equals(Precision))
		{
			
		}
		else if(comando.equals(Limpiar))
		{
			limpiar();
		}
	}
}
