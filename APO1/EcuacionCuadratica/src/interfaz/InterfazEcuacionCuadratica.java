package interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import mundo.EcuacionCuadratica;

public class InterfazEcuacionCuadratica extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private PanelUnico panelUnico;
	
	// CONSTRUCTOR
	public InterfazEcuacionCuadratica()
	{
		// DISEÑO
		setTitle("Evaluacion practica N5 - su nombre");
		setSize(300, 250);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		// CREAR
		panelUnico = new PanelUnico(this);
		
		// AGREGAR
		add(panelUnico, BorderLayout.CENTER);
				
	}
	
	// METODOS GEMELOS
	public void calcularRaiz1()
	{
		double a = Double.parseDouble(panelUnico.getTxtA());
		double b = Double.parseDouble(panelUnico.getTxtB());
		double c = Double.parseDouble(panelUnico.getTxtC());
		EcuacionCuadratica ec = new EcuacionCuadratica(a, b, c);
		double resultado = ec.calcularRaiz1();
		panelUnico.setTxtRaiz1(resultado);
	}
	
	public void calcularRaiz2()
	{
		double a = Double.parseDouble(panelUnico.getTxtA());
		double b = Double.parseDouble(panelUnico.getTxtB());
		double c = Double.parseDouble(panelUnico.getTxtC());
		EcuacionCuadratica ec = new EcuacionCuadratica(a, b, c);
		double resultado = ec.calcularRaiz2();
		panelUnico.setTxtRaiz2(resultado);
	}
	
	public void limpiar()
	{
		panelUnico.limpiar();
	}

	public static void main(String[] args) 
	{
		InterfazEcuacionCuadratica ventana = new InterfazEcuacionCuadratica();
		ventana.setVisible(true);

	}

}
