package Interfaz;

/**
 * Desarrollado por:
 * Vanesa Alexandra Zamora Martinez - 2520202030
 * 
 * Metodos Numericos
 */

import java.awt.GridLayout;

import javax.swing.JFrame;

public class InterfazTeoriaDelError extends JFrame

{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelErrores panelErrores;

	// En el constructor se crean los objetos
	public InterfazTeoriaDelError()
	{
		setTitle("Teoria del error de Vanesa");
		setSize(400,400);
		setVisible(true);
		setResizable(false);
		// para el gridlayout primero es filas y luego columnas
		setLayout(new GridLayout(1,1));

		//Creo el panel

		panelErrores = new PanelErrores();

		// Añado el panel
		add(panelErrores);
	}

	// Se crea la interfaz, la visibilidad
	public static void main(String[] args) 
	{
		InterfazTeoriaDelError interfazVanesa = new InterfazTeoriaDelError();
		interfazVanesa.setVisible(true);
	}

}
