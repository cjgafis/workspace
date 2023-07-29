package interfaz;

import java.awt.BorderLayout;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mundo.Calculadora;

public class InterfazCalculadora extends JFrame
{
	private static final long serialVersionUID = 1L;

	// DECLARAR ATRIBUTOS
	private PanelDatos panelDatos;
	private PanelOperaciones panelOperaciones;
	private PanelResultados panelResultados;
	private Calculadora calculadora;

	// CONSTRUCTOR
	public InterfazCalculadora()
	{
		// DISEÑO
		setTitle("The Calculator");
		setSize(280, 280);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// INSTANCIAR ATRIBUTOS
		panelDatos = new PanelDatos();
		panelOperaciones = new PanelOperaciones(this);
		panelResultados = new PanelResultados(this);
		calculadora = null;

		// AGREGAR AL LAYOUT
		add(panelDatos, BorderLayout.NORTH);
		add(panelOperaciones, BorderLayout.CENTER);
		add(panelResultados, BorderLayout.SOUTH);		
	}

	public void sumar()
	{
		double numero1 = Double.parseDouble(panelDatos.getTxtNumero1());
		double numero2 = Double.parseDouble(panelDatos.getTxtNumero2());
		calculadora = new Calculadora(numero1, numero2);
		double resultado = calculadora.sumar();
		DecimalFormat df = new DecimalFormat("#.##");
		panelResultados.setTxtResultado(df.format(resultado));

	}

	public void restar()
	{
		double numero1 = Double.parseDouble(panelDatos.getTxtNumero1());
		double numero2 = Double.parseDouble(panelDatos.getTxtNumero2());
		calculadora = new Calculadora(numero1, numero2);
		double resultado = calculadora.restar();
		DecimalFormat df = new DecimalFormat("#.##");
		panelResultados.setTxtResultado(df.format(resultado));
	}

	public void multiplicar()
	{
		double numero1 = Double.parseDouble(panelDatos.getTxtNumero1());
		double numero2 = Double.parseDouble(panelDatos.getTxtNumero2());
		calculadora = new Calculadora(numero1, numero2);
		double resultado = calculadora.multiplicar();
		DecimalFormat df = new DecimalFormat("#.##");
		panelResultados.setTxtResultado(df.format(resultado));
	}

	public void dividir()
	{
		try
		{
			double numero1 = Double.parseDouble(panelDatos.getTxtNumero1());
			double numero2 = Double.parseDouble(panelDatos.getTxtNumero2());
			calculadora = new Calculadora(numero1, numero2);
			double resultado = calculadora.dividir();
			DecimalFormat df = new DecimalFormat("#.##");
			panelResultados.setTxtResultado(df.format(resultado));
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public void limpiar()
	{
		panelDatos.limpiar();
		panelResultados.limpiar();
	}


	public static void main(String[] args) 
	{
		InterfazCalculadora interfazCalculadora = new InterfazCalculadora();
		interfazCalculadora.setVisible(true);
	}

}
