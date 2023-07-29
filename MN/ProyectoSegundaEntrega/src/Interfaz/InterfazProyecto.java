package Interfaz;

import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Mundo.Metodos;

public class InterfazProyecto extends JFrame
{
	private static final long serialVersionUID = 1L;

	// ATRIBUTOS
	private PanelCuadratica panelCuadratica;
	private PanelError panelError;
	private PanelMetodos panelMetodos;
	private Metodos todo;

	public InterfazProyecto()
	{
		//DISE�O
		setTitle("Proyecto");
		setSize(450,630);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		//INSTANCIAR
		panelCuadratica = new PanelCuadratica(this);
		panelError = new PanelError(this);
		panelMetodos = new PanelMetodos(this);

		//ADICIONAR
		add(panelCuadratica, BorderLayout.NORTH);
		add(panelError, BorderLayout.CENTER);
		add(panelMetodos, BorderLayout.SOUTH);
	}

	//METODOS ECUACION
	public void ecuacion()
	{
		double a = panelCuadratica.getA();
		double b = panelCuadratica.getB();
		double c = panelCuadratica.getC();
		todo = new Metodos(a,b,c);
		double respuesta1 = todo.raiz1();
		double respuesta2 = todo.raiz2();
		DecimalFormat df = new DecimalFormat("#.######");
		panelCuadratica.setRaiz1(df.format(respuesta1));
		panelCuadratica.setRaiz2(df.format(respuesta2));
	}

	//METODOS  EVALUAR ECUACION
	public void evaluarEcuacion()
	{
		//Los usamos con metodos abiertos
	}

	//METODOS  EVALUAR ECUACION
	public void derivarEcuacion()
	{
		//Los usamos con metodos abiertos
	}

	//METODOS ERRORES
	public void errorAbsoluto()
	{
		String lasMedidas = panelError.getMedidas();
		ArrayList<String> medidas = new ArrayList<String>(Arrays.asList(lasMedidas.split(",")));
		todo = new Metodos(medidas);
		double resultado = todo.errorAbsoluto();
		DecimalFormat df = new DecimalFormat("#.######");
		panelError.setResultadoVarias(df.format(resultado));
	}
	public void errorAbsoluto1Medida()
	{
		double medida = panelError.getMedida();
		double valorVerdadero = panelError.getVv();
		todo = new Metodos(medida, valorVerdadero);
		double resultado = todo.errorAbsoluto1Medida();
		DecimalFormat df = new DecimalFormat("#.######");
		panelError.setResultado(df.format(resultado));
	}
	public void errorRelativo()
	{
		String lasMedidas = panelError.getMedidas();
		ArrayList<String> medidas = new ArrayList<String>(Arrays.asList(lasMedidas.split(",")));
		todo = new Metodos(medidas);
		double resultado = todo.errorRelativo();
		DecimalFormat df = new DecimalFormat("#.######");
		panelError.setResultadoVarias(df.format(resultado));
	}
	public void errorRelativo1Medida()
	{
		double medida = panelError.getMedida();
		double valorVerdadero = panelError.getVv();
		todo = new Metodos(medida, valorVerdadero);
		double resultado = todo.errorRelativo1Medida();
		DecimalFormat df = new DecimalFormat("#.######");
		panelError.setResultado(df.format(resultado));
	}
	public void porcentajeErrorExactitud()
	{
		String lasMedidas = panelError.getMedidas();
		ArrayList<String> medidas = new ArrayList<String>(Arrays.asList(lasMedidas.split(",")));
		todo = new Metodos(medidas);
		double resultado = todo.porcentajeErrorExactitud();
		DecimalFormat df = new DecimalFormat("#.######");
		panelError.setResultadoVarias(df.format(resultado));
	}
	public void porcentajeErrorExactitud1Medida()
	{
		double medida = panelError.getMedida();
		double valorVerdadero = panelError.getVv();
		todo = new Metodos(medida, valorVerdadero);
		double resultado = todo.porcentajeErrorExactitud1Medida();
		DecimalFormat df = new DecimalFormat("#.######");
		panelError.setResultado(df.format(resultado));
	}
	public void porcentajeErrorPresicion()
	{
		String lasMedidas = panelError.getMedidas();
		ArrayList<String> medidas = new ArrayList<String>(Arrays.asList(lasMedidas.split(",")));
		todo = new Metodos(medidas);
		double resultado = todo.porcentajeErrorPresicion();
		DecimalFormat df = new DecimalFormat("#.######");
		panelError.setResultadoVarias(df.format(resultado));
	}
	public void Exactitud()
	{
		String lasMedidas = panelError.getMedidas();
		ArrayList<String> medidas = new ArrayList<String>(Arrays.asList(lasMedidas.split(",")));
		todo = new Metodos(medidas);
		double resultado = todo.exactitud();
		DecimalFormat df = new DecimalFormat("#.######");
		panelError.setResultadoVarias(df.format(resultado));
	}
	public void Exactitud1Medida()
	{
		double medida = panelError.getMedida();
		double valorVerdadero = panelError.getVv();
		todo = new Metodos(medida, valorVerdadero);
		double resultado = todo.exactitud1Medida();
		DecimalFormat df = new DecimalFormat("#.######");
		panelError.setResultado(df.format(resultado));
	}
	public void Presicion()
	{
		String lasMedidas = panelError.getMedidas();
		ArrayList<String> medidas = new ArrayList<String>(Arrays.asList(lasMedidas.split(",")));
		todo = new Metodos(medidas);
		double resultado = todo.presicion(); 
		DecimalFormat df = new DecimalFormat("#.######");
		panelError.setResultadoVarias(df.format(resultado));
	}

	//METODOS CERRADOS
	public void biseccion()
	{
		double a = panelCuadratica.getA();
		double b = panelCuadratica.getB();
		double c = panelCuadratica.getC();
		double xi = panelMetodos.getXi();
		double xs = panelMetodos.getXs();
		double resultado = 0.0;
		todo = new Metodos(a, b, c, xi, xs);
		DecimalFormat df = new DecimalFormat("#.######");
		try 
		{
			resultado = todo.biseccion();
			panelMetodos.setBiseccion(df.format(resultado));
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
		}
	}
	public void falsaPosicion()
	{
		double a = panelCuadratica.getA();
		double b = panelCuadratica.getB();
		double c = panelCuadratica.getC();
		double xi = panelMetodos.getXi();
		double xs = panelMetodos.getXs();
		double resultado = 0.0;
		todo = new Metodos(a, b, c, xi, xs);
		DecimalFormat df = new DecimalFormat("#.######");
		try 
		{
			resultado = todo.falsaPosicion();
			panelMetodos.setFPosicion(df.format(resultado));
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
		}
	}
	//METODOS ABIERTOS
	public void derivar()
	{
		String funcion = panelMetodos.getFuncion();
		todo = new Metodos(funcion);
		panelMetodos.setDerivada(todo.derivar(funcion));
	}
	public void puntoFijo()
	{
		double xi = panelMetodos.getXiMA();
		double xs = panelMetodos.getXsMA();
		String funcion = panelMetodos.getFuncion();
		todo = new Metodos(funcion, xi, xs);
		DecimalFormat df = new DecimalFormat("#.######");
		try 
		{
			double respuesta = todo.puntoFijo();
			panelMetodos.setPuntoFijo(df.format(respuesta));
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
		}
	}
	public void NR()
	{
		double xi = panelMetodos.getXiMA();
		double xs = panelMetodos.getXsMA();
		String funcion = panelMetodos.getFuncion();
		todo = new Metodos(funcion, xi, xs);
		DecimalFormat df = new DecimalFormat("#.######");
		try 
		{
			double respuesta = todo.newtonRaphson();
			panelMetodos.setPuntoFijo(df.format(respuesta));
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
		}

	}
	public void secante()
	{
		
	}
	//OTROS METODOS
	public void limpiar()
	{
		panelCuadratica.limpiar();
		panelError.Limpiar();
		panelMetodos.limpiar();
	}

	public static void main(String[] args) 
	{
		InterfazProyecto interfaz = new InterfazProyecto();
		interfaz.setVisible(true);

	}

}
