package interfaz;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import javax.swing.JFrame;


import mundo.CalculoRaiz;


public class InterfazCalculoRaiz extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ATRIBUTOS - DECLARAR
	private PanelCuadratica panelCuadratica;
	private PanelCerrados panelCerrados;
	private PanelAbiertos panelAbiertos;
	

	
	// METODO CONSTRUCTOR
	public InterfazCalculoRaiz()
	{
		// DISEÑO
		setTitle("Calculo de Raices - Jhon Fredy Rodriguez - 2320201043");
		setSize(600, 600);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));
		
		// CREAN LOS OBJETOS
		panelCuadratica = new PanelCuadratica(this);
		panelCerrados = new PanelCerrados(this);
		panelAbiertos = new PanelAbiertos(this);
			
		// SE ADICIONAR LOS OBJETOS AL DISEÑO DE LA VENTANA
		add(panelCuadratica);
		add(panelCerrados);
		add(panelAbiertos);
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
	
	public String metodoBiseccion() throws Exception {
		DecimalFormat formatDecimal = new DecimalFormat("#.#######");
		double xi = panelCerrados.getLimS();
		double xf = panelCerrados.getLimI();
		String funcion = panelCerrados.getfuncion();
		CalculoRaiz calculoRaiz = new CalculoRaiz();
		double respuestaBiseccion = calculoRaiz.biseccion(xi, xf, funcion);
		return formatDecimal.format(respuestaBiseccion);
	}
	
	public String metodoFalsaPosicion() throws Exception {
		DecimalFormat formatDecimal = new DecimalFormat("#.#######");
		double xi = panelCerrados.getLimS();
		double xf = panelCerrados.getLimI();
		String funcion = panelCerrados.getfuncion();
		CalculoRaiz calculoRaiz = new CalculoRaiz();
		double respuestaFalsaposicion = calculoRaiz.falsaPosicion(xi, xf, funcion);
		return formatDecimal.format(respuestaFalsaposicion);
	}
		
	public String metodoPuntoFijo() throws Exception {
		DecimalFormat formatDecimal = new DecimalFormat("#.#######");
		double xi = panelAbiertos.getValue();
		String funcion = panelAbiertos.getfuncion();
		CalculoRaiz calculoRaiz = new CalculoRaiz();
		double respuestaPuntoFijo = calculoRaiz.PuntoFijo(xi, funcion);
		return formatDecimal.format(respuestaPuntoFijo);
	}
	
	public String metodoNewtonRaphson() throws Exception {
		DecimalFormat formatDecimal = new DecimalFormat("#.#######");
		double xi = panelAbiertos.getValue();
		String funcion = panelAbiertos.getfuncion();
		String pderivada = panelAbiertos.getpdervada();
		CalculoRaiz calculoRaiz = new CalculoRaiz();
		double respuestaNewtonRaphson = calculoRaiz.NewtonRaphson(xi, funcion, pderivada);
		return formatDecimal.format(respuestaNewtonRaphson);
	}

	
	public static void main(String[] args) 
	{
		InterfazCalculoRaiz ventanaPrincipal = new InterfazCalculoRaiz();
		ventanaPrincipal.setVisible(true);
	}

}
