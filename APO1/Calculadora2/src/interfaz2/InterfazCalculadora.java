package interfaz2;
/**
 * Celso Javier Rodriguez Pizza
 */
import java.awt.GridLayout;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mundo.Calculadora;

public class InterfazCalculadora extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private PanelDatos panelDatos;
	private PanelOperaciones panelOperaciones;
	private PanelResultados panelResultados;
	private Calculadora calculadora;

	public InterfazCalculadora() 
	{
		// DISEÑO
		setTitle("Calculadora Celso");
		setSize(250, 300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));
		
		// CREAR LOS OBJETOS
		panelDatos = new PanelDatos();
		add(panelDatos);
		
		panelOperaciones = new PanelOperaciones(this);
		add(panelOperaciones);
		
		panelResultados = new PanelResultados(this);
		add(panelResultados);
	}
	
	public void sumar()
	{
		double num1 = Double.parseDouble(panelDatos.getTxtNumero1());
		double num2 = Double.parseDouble(panelDatos.getTxtNumero2());
		calculadora = new Calculadora(num1, num2);	
		double resultado = calculadora.sumar();
		DecimalFormat df = new DecimalFormat("#.##");
		panelResultados.setTxtResultado(df.format(resultado));
	}
	
	public void restar()
	{
		double num1 = Double.parseDouble(panelDatos.getTxtNumero1());
		double num2 = Double.parseDouble(panelDatos.getTxtNumero2());
		calculadora = new Calculadora(num1, num2);	
		double resultado = calculadora.restar();
		DecimalFormat df = new DecimalFormat("#.##");
		panelResultados.setTxtResultado(df.format(resultado));
	}
	
	public void multiplicar()
	{
		double num1 = Double.parseDouble(panelDatos.getTxtNumero1());
		double num2 = Double.parseDouble(panelDatos.getTxtNumero2());
		calculadora = new Calculadora(num1, num2);	
		double resultado = calculadora.multiplicar();
		DecimalFormat df = new DecimalFormat("#.##");
		panelResultados.setTxtResultado(df.format(resultado));
	}
	
	public void dividir()
	{
		double num1 = Double.parseDouble(panelDatos.getTxtNumero1());
		double num2 = Double.parseDouble(panelDatos.getTxtNumero2());
		calculadora = new Calculadora(num1, num2);	
		double resultado;
		try 
		{
			resultado = calculadora.dividir();
			DecimalFormat df = new DecimalFormat("#.##");
			panelResultados.setTxtResultado(df.format(resultado));
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
		
	}
	
	public void limpiar()
	{
		panelDatos.limpiar();
		panelResultados.limpiar();
	}
	

	public static void main(String[] args) 
	{
		InterfazCalculadora miHP = new InterfazCalculadora();
		miHP.setVisible(true);

	}

}
