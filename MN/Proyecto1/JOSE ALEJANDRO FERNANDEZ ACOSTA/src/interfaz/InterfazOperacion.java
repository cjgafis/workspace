package interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class InterfazOperacion extends JFrame
{
	private PanelBotones panelBotones;
	private PanelDatos panelDatos;
	private PanelLimpiar panelLimpiar;

	public InterfazOperacion()
	{
		setTitle("Calculadora Tipo de Errores");
		setSize(360,310);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout(3, 1));

		panelBotones = new PanelBotones();
		add(panelBotones, BorderLayout.CENTER);

		panelDatos = new PanelDatos();
		add(panelDatos, BorderLayout.NORTH);

		panelLimpiar = new PanelLimpiar();
		add(panelLimpiar, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args)
	{
		InterfazOperacion miHP = new InterfazOperacion();
		miHP.setVisible(true);
	}
}


