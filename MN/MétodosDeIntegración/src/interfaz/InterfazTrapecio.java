package interfaz;

import java.awt.GridLayout;

import javax.swing.JFrame;

import mundo.Romberg;
import mundo.Simpson;
import mundo.Trapecio;

public class InterfazTrapecio extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTO
	private PanelIntegrales panelIntegrales;
	
	// CONSTRUCTOR
	public InterfazTrapecio()
	{
		// DISEÑO
		setTitle("Métodos de integración");
		setSize(350, 250);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 1));
		
		// INSTANCIAR
		panelIntegrales = new PanelIntegrales(this);
		
		// AGREGAR
		add(panelIntegrales);
	}
	
	public void metodoTrapecio()
	{
		String funcion = panelIntegrales.getTxtFuncion();
		double a = Double.parseDouble(panelIntegrales.getTxtA());
		double b = Double.parseDouble(panelIntegrales.getTxtB());
		int n = Integer.parseInt(panelIntegrales.getTxtN());
		Trapecio tp = new Trapecio(funcion, a, b, n);
		double resultado = tp.metodoTrapecio();
		panelIntegrales.setTxtIntegral(resultado);
		
	}
	
	public void metodoSimpson()
	{
		String funcion = panelIntegrales.getTxtFuncion();
		double a = Double.parseDouble(panelIntegrales.getTxtA());
		double b = Double.parseDouble(panelIntegrales.getTxtB());
		int n = Integer.parseInt(panelIntegrales.getTxtN());
		Simpson sim = new Simpson(funcion, a, b, n);
		double resultado = sim.metodoSimpson();
		panelIntegrales.setTxtIntegral(resultado);
		
	}
	
	public void metodoRomberg()
	{
		String funcion = panelIntegrales.getTxtFuncion();
		double a = Double.parseDouble(panelIntegrales.getTxtA());
		double b = Double.parseDouble(panelIntegrales.getTxtB());
		int nivel = Integer.parseInt(panelIntegrales.getTxtNivel());
		Romberg rom = new Romberg(funcion, a, b, nivel);
		double resultado = rom.integracionRomberg();
		panelIntegrales.setTxtIntegral(resultado);
	}
	
	public void limpiar()
	{
		panelIntegrales.limpiar();
	}

	public static void main(String[] args) 
	{
		InterfazTrapecio trapecio = new InterfazTrapecio();
		trapecio.setVisible(true);

	}

}
