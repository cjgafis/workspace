package interfaz;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mundo.Calculadora;

public class InterfazCalculadora extends JFrame
{
	// ATRIBUTOS
	private PanelDatos panelDatos;
	private PanelOperaciones panelOperaciones;
	private PanelResultados panelResultados;


	// METODO CONSTRUCTOR
	public InterfazCalculadora()
	{
		// DISEÑO
		setTitle("La calculadora - Celso");
		setSize(300, 300);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));

		// INSTANCIAR - CREAR LOS OBJETOS (paneles)
		panelDatos = new PanelDatos();
		panelOperaciones = new PanelOperaciones(this);
		panelResultados = new PanelResultados(this);

		// AGREGAR A LA VENTANA
		add(panelDatos);
		add(panelOperaciones);
		add(panelResultados);

	}

	public void sumar()
	{
		// capturar el valor 1 (getTxtNumero1)
		double numero1 = Double.parseDouble(panelDatos.getTxtNumero1());

		// capturar el valor 2 (getTxtNumero2)
		double numero2 = Double.parseDouble(panelDatos.getTxtNumero2());

		// instanciamos la calculadora
		Calculadora hp = new Calculadora(numero1, numero2);

		// llamamos al método original 
		// que hace el trabajo sucio y nos retorna la respuesta
		double resultado = hp.sumar();

		// Ponemos la respuesta en el panel resultados (setTxtResultado)
		panelResultados.setTxtResultado(resultado);
	}

	public void restar()
	{
		// capturar el valor 1 (getTxtNumero1)
		double numero1 = Double.parseDouble(panelDatos.getTxtNumero1());

		// capturar el valor 2 (getTxtNumero2)
		double numero2 = Double.parseDouble(panelDatos.getTxtNumero2());

		// instanciamos la calculadora
		Calculadora hp = new Calculadora(numero1, numero2);

		// llamamos al método original 
		// que hace el trabajo sucio y nos retorna la respuesta
		double resultado = hp.restar();

		// Ponemos la respuesta en el panel resultados (setTxtResultado)
		panelResultados.setTxtResultado(resultado);
	}

	public void multiplicar()
	{
		// capturar el valor 1 (getTxtNumero1)
		double numero1 = Double.parseDouble(panelDatos.getTxtNumero1());

		// capturar el valor 2 (getTxtNumero2)
		double numero2 = Double.parseDouble(panelDatos.getTxtNumero2());

		// instanciamos la calculadora
		Calculadora hp = new Calculadora(numero1, numero2);

		// llamamos al método original 
		// que hace el trabajo sucio y nos retorna la respuesta
		double resultado = hp.multiplicar();

		// Ponemos la respuesta en el panel resultados (setTxtResultado)
		panelResultados.setTxtResultado(resultado);
	}

	public void dividir()
	{
		// capturar el valor 1 (getTxtNumero1)
		double numero1 = Double.parseDouble(panelDatos.getTxtNumero1());

		// capturar el valor 2 (getTxtNumero2)
		double numero2 = Double.parseDouble(panelDatos.getTxtNumero2());

		// instanciamos la calculadora
		Calculadora hp = new Calculadora(numero1, numero2);

		// llamamos al método original 
		// que hace el trabajo sucio y nos retorna la respuesta
		double resultado;
		try 
		{
			resultado = hp.dividir();
			// Ponemos la respuesta en el panel resultados (setTxtResultado)
			panelResultados.setTxtResultado(resultado);
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
		InterfazCalculadora principal = new InterfazCalculadora();
		principal.setVisible(true);

	}

}
