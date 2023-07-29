package Interfaz;
/**
 * By: Vanesa Zamora - 2520202030
 */

import java.awt.GridLayout;
import javax.swing.JFrame;



public class InterfazCalculoRaiz extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Atributos
	private PanelCuadratica panelCuadratica;
	private PanelBiseccion panelBiseccion;
	private PanelMetodosAbiertos panelMetodosAbiertos;
	
	//Metodo constructor
	
	public InterfazCalculoRaiz()
	{
		//Diseño
		setTitle("Calculo de raices - Vanesa Zamora");
		setSize(500,500);
		setVisible(true);
		setResizable(true);

		// para el gridlayout primero es filas y luego columnas
		setLayout(new GridLayout(3,1));

		
		// CREAN LOS OBJETOS
		
		panelCuadratica = new PanelCuadratica();
		panelBiseccion = new PanelBiseccion();
		panelMetodosAbiertos = new PanelMetodosAbiertos();
		
		
		//Se adicionan los objetos
		add(panelCuadratica);
		add(panelBiseccion);
		add(panelMetodosAbiertos);
	}
	
	public static void main(String[] args) 
	{
		InterfazCalculoRaiz ventanaPrincipal = new InterfazCalculoRaiz();
		ventanaPrincipal.setVisible(true);

	}

}
