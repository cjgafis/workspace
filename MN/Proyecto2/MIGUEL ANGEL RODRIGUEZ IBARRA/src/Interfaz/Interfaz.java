package Interfaz;
import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mundo.Operaciones;
public class Interfaz extends JFrame
{
	private static final long serialVersionUID = 1L;
	private PanelCuadratica panelCuadratica;
	private PanelMetodoCerrado panelMetodoCerrado;
	private Operaciones operar;
	private interfazAbiertos panelAbiertos;


	public Interfaz()
	{

		setTitle("MIGUEL 2320201054");
		setSize(800,450);
		setResizable(true);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,5));


		panelCuadratica = new PanelCuadratica(this);
		panelMetodoCerrado = new PanelMetodoCerrado(this);
		operar = new Operaciones();
		panelAbiertos = new interfazAbiertos(this);


		add(panelCuadratica);
		add(panelAbiertos);
		add(panelMetodoCerrado);

	}


	public void raizUno() 
	{
		double valorA = Double.parseDouble(panelCuadratica.getTxtValorA());
		double valorB = Double.parseDouble(panelCuadratica.getTxtValorB());
		double valorC = Double.parseDouble(panelCuadratica.getTxtValorC());
		operar = new Operaciones();
		double raizUno = operar.raizUno(valorA, valorB, valorC);
		DecimalFormat df = new DecimalFormat("#.###");
		panelCuadratica.setTxtRaizUno(df.format(raizUno));

	}

	public void raizDos() 
	{
		double valorA = Double.parseDouble(panelCuadratica.getTxtValorA());
		double valorB = Double.parseDouble(panelCuadratica.getTxtValorB());
		double valorC = Double.parseDouble(panelCuadratica.getTxtValorC());
		double raizDos = operar.raizDos(valorA, valorB, valorC);
		DecimalFormat df = new DecimalFormat("#.###");
		panelCuadratica.setTxtRaizDos(df.format(raizDos));
	}




	public void biseccion()
	{
		double lIf = Double.parseDouble(panelMetodoCerrado.getTxtLIf());
		double lSur = Double.parseDouble(panelMetodoCerrado.getTxtLSur());
		String funcion = panelMetodoCerrado.getTxtFuncion();
		try 
		{
			double resultado = operar.biseccion(lIf, lSur, funcion);
			DecimalFormat df = new DecimalFormat("#.####");
			panelMetodoCerrado.setTxtResultadoxr1(df.format(resultado));
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}


	public void falsaPocisicion()
	{
		double lIf = Double.parseDouble(panelMetodoCerrado.getTxtLIf());
		double lSur = Double.parseDouble(panelMetodoCerrado.getTxtLSur());
		String funcion = panelMetodoCerrado.getTxtFuncion();
		try 
		{
			double resultado = operar.falsaPocisicion(lIf, lSur, funcion);
			DecimalFormat df = new DecimalFormat("#.####");
			panelMetodoCerrado.setTxtResultadoxr2(df.format(resultado));

		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}


	public void limpiar()
	{
		panelCuadratica.limpiar();	
	}



	public void limpiarM()
	{
		panelMetodoCerrado.limpiarM();
	}

	public void NewtonRaphson() 
	{

	}


	public static void main(String[] args) 
	{
		Interfaz interfazPz = new Interfaz();
		interfazPz.setVisible(true);

	}


}
