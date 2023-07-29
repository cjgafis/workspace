package interfaz;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mundo.CalculoRaiz;

public class InterfazCalculoRaiz extends JFrame
{
	// ATRIBUTOS - DECLARAR
	private PanelCuadratica panelCuadratica;
	private PanelCerrados panelCerrados;
	private PanelAbiertos panelFalsaPosicion;
	
	// METODO CONSTRUCTOR
	public InterfazCalculoRaiz()
	{
		// DISEÑO
		setTitle("Calculo de Raices - Celso");
		setSize(500, 500);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));
		
		// CREAN LOS OBJETOS
		panelCuadratica = new PanelCuadratica(this);
		panelCerrados = new PanelCerrados(this);
		panelFalsaPosicion = new PanelAbiertos();
			
		// SE ADICIONAR LOS OBJETOS AL DISEÑO DE LA VENTANA
		add(panelCuadratica);
		add(panelCerrados);
		add(panelFalsaPosicion);
	}
	
	public void raiz1()
	{
		double valorA = Double.parseDouble(panelCuadratica.getTxtValorA());
		double valorB = Double.parseDouble(panelCuadratica.getTxtValorB());
		double valorC = Double.parseDouble(panelCuadratica.getTxtValorC());
		CalculoRaiz calculoRaiz = new CalculoRaiz();
		double raiz1 = calculoRaiz.raiz1(valorA, valorB, valorC);
		panelCuadratica.setTxtRaiz1(raiz1);

	}
	
	public void raiz2()
	{
		double valorA = Double.parseDouble(panelCuadratica.getTxtValorA());
		double valorB = Double.parseDouble(panelCuadratica.getTxtValorB());
		double valorC = Double.parseDouble(panelCuadratica.getTxtValorC());
		CalculoRaiz calculoRaiz = new CalculoRaiz();
		double raiz2 = calculoRaiz.raiz2(valorA, valorB, valorC);
		panelCuadratica.setTxtRaiz2(raiz2);
	}
	
	public void biseccion()
	{
		String funcion = panelCerrados.getTxtFuncion();
		double limiteInferior = Double.parseDouble(panelCerrados.getTxtLimiteInferior());
		double limiteSuperior = Double.parseDouble(panelCerrados.getTxtLimiteSuperior());
		CalculoRaiz calculoRaiz = new CalculoRaiz();
		try 
		{
			double raiz = calculoRaiz.biseccion(limiteInferior, limiteSuperior, funcion);
			panelCerrados.setTxtRaiz(raiz);
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}
	
	public void falsaPosicion()
	{
		String funcion = panelCerrados.getTxtFuncion();
		double limiteInferior = Double.parseDouble(panelCerrados.getTxtLimiteInferior());
		double limiteSuperior = Double.parseDouble(panelCerrados.getTxtLimiteSuperior());
		CalculoRaiz calculoRaiz = new CalculoRaiz();
		try 
		{
			double raiz = calculoRaiz.falsaPosicion(limiteInferior, limiteSuperior, funcion);
			panelCerrados.setTxtRaiz(raiz);
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}
	
	public void limpiarCuadratica()
	{
		panelCuadratica.limpiar();
	}
	
	public void limpiarCerrados()
	{
		panelCerrados.limpiar();
	}
	
	public static void main(String[] args) 
	{
		InterfazCalculoRaiz ventanaPrincipal = new InterfazCalculoRaiz();
		ventanaPrincipal.setVisible(true);
	}

}
