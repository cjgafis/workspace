package interfaz;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mundo.Metodos;

public class InterfazMetodos extends JFrame
{
	// ATRIBUTOS - DECLARAR
	private PanelCuadratica panelCuadratica;
	private PanelCerrados panelCerrados;
	private PanelAbiertos panelAbiertos;
	
	// METODO CONSTRUCTOR
	public InterfazMetodos()
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
		panelAbiertos = new PanelAbiertos(this);
			
		// SE ADICIONAR LOS OBJETOS AL DISEÃ‘O DE LA VENTANA
		add(panelCuadratica);
		add(panelCerrados);
		add(panelAbiertos);
	}
	
	public void raiz1()
	{
		double valorA = Double.parseDouble(panelCuadratica.getTxtValorA());
		double valorB = Double.parseDouble(panelCuadratica.getTxtValorB());
		double valorC = Double.parseDouble(panelCuadratica.getTxtValorC());
		Metodos calculoRaiz = new Metodos();
		double raiz1 = calculoRaiz.raiz1(valorA, valorB, valorC);
		panelCuadratica.setTxtRaiz1(raiz1);

	}
	
	public void raiz2()
	{
		double valorA = Double.parseDouble(panelCuadratica.getTxtValorA());
		double valorB = Double.parseDouble(panelCuadratica.getTxtValorB());
		double valorC = Double.parseDouble(panelCuadratica.getTxtValorC());
		Metodos calculoRaiz = new Metodos();
		double raiz2 = calculoRaiz.raiz2(valorA, valorB, valorC);
		panelCuadratica.setTxtRaiz2(raiz2);
	}
	
	public void biseccion()
	{
		String funcion = panelCerrados.getTxtFuncion();
		double limiteInferior = Double.parseDouble(panelCerrados.getTxtLimiteInferior());
		double limiteSuperior = Double.parseDouble(panelCerrados.getTxtLimiteSuperior());
		Metodos calculoRaiz = new Metodos();
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
		Metodos calculoRaiz = new Metodos();
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
	public void limpiarAbiertos()
	{
		panelAbiertos.limpiar();
	}
	
	public static void main(String[] args) 
	{
		InterfazMetodos ventanaPrincipal = new InterfazMetodos();
		ventanaPrincipal.setVisible(true);
	}

}
