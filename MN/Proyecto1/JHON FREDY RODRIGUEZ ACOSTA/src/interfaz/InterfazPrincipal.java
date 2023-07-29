package interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.JFrame;

import mundo.TeoriaError;



public class InterfazPrincipal extends JFrame 
{
	private static final long serialVersionUID = 1L;


	private PanelDatos panelDatos;
	private PanelBotones panelBotones;
	private PanelResultados panelResultados;
	private PanelStadisticas panelStadisticas;
	
	private TeoriaError teoriaError;
	
	private double promedio;

	public InterfazPrincipal()
	{
		// 
		setTitle("Teoria del Error creado por: Jhon Fredy Rodríguez - 2320201043");
		setSize(1000, 500);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 1));

		panelDatos = new PanelDatos();
		panelBotones = new PanelBotones(this);
		panelResultados = new PanelResultados(this);
		panelStadisticas = new PanelStadisticas(this);

		
		add(panelDatos);
		add(panelBotones);
		add(panelStadisticas);
		add(panelResultados);
	}
	public int cantDatos() 
	{
		String datos = panelDatos.getDatos();
		String[] collDatos = datos.split(",");
		panelStadisticas.setResultadoCantidad(collDatos.length-1);
		return collDatos.length-1;
	}
	public double total() 
	{
		String datos = panelDatos.getDatos();
		String[] collDatos = datos.split(",");
		double total = 0;
		for (int i = 1; i < collDatos.length; i++) 
		{
			total = total + Double.parseDouble(collDatos[i]);
		}
		panelStadisticas.setResultadoTotal(total);
		return total;
	}
	
	public double promedio()
	{
		String datos = panelDatos.getDatos();
		String[] collDatos = datos.split(",");
		panelStadisticas.setResultadoPromedio(total()/cantDatos());
		return total()/cantDatos();
	}
	
	public double valMax()
	{
		double valMax = 0.0;
		String datos = panelDatos.getDatos();
		String[] collDatos = datos.split(",");
		for (int i = 1; i < collDatos.length; i++) {
			if (Double.parseDouble(collDatos[i]) > valMax) {
				valMax = Double.parseDouble(collDatos[i]);
			}
		}
		panelStadisticas.setResultadoValMax(valMax);
		return valMax;
	}
	
	public double valMin()
	{
		
		String datos = panelDatos.getDatos();
		String[] collDatos = datos.split(",");
		double valMin = Double.parseDouble(collDatos[1]);
		for (int i = 1; i < collDatos.length; i++) {
			if (Double.parseDouble(collDatos[i]) < valMin) {
				valMin = Double.parseDouble(collDatos[i]);
			}
		}
		panelStadisticas.setResultadoValMin(valMin);
		return valMin;
	}
	
	public double errorAbsoluto()
	{
		DecimalFormat df = new DecimalFormat("#.##");
		String datos = panelDatos.getDatos();
		String[] collDatos = datos.split(",");
		double errorAbs = 0.0;

		for (int i = 1; i < collDatos.length; i++) {
			errorAbs = errorAbs + Math.abs(Double.parseDouble(collDatos[i])- promedio());
		}
		panelResultados.setResultado(df.format(errorAbs/cantDatos())+" %");
		return errorAbs/(collDatos.length-1);
	}
	
	public double errorRelativo() 
	{
		double errorRelativo = 0.0;
		DecimalFormat df = new DecimalFormat("#.##");
		String datos = panelDatos.getDatos();
		String[] collDatos = datos.split(",");
		errorRelativo = errorAbsoluto() / Double.parseDouble(collDatos[0]);
		panelResultados.setResultado(df.format(errorRelativo)+" %");
		return errorRelativo;
	}
	
	public double errrorExactitud()
	{
		double errorExactitud = 0.0;
		DecimalFormat df = new DecimalFormat("#.##");
		String datos = panelDatos.getDatos();
		String[] collDatos = datos.split(",");
		
		errorExactitud = (errorAbsoluto() / Double.parseDouble(collDatos[0]));
		panelResultados.setResultado(df.format(errorExactitud)+" %");
		return errorExactitud;
	}
	
	public double exactitud()
	{
		double exactitud = 0.0;
		DecimalFormat df = new DecimalFormat("#.##");
		exactitud = 1 - errrorExactitud();
		panelResultados.setResultado(df.format(exactitud)+" %");
		return exactitud;
	}
	
	public double errorPrecision()
	{
		double errorPrecision = 0.0;
		DecimalFormat df = new DecimalFormat("#.##");
		String datos = panelDatos.getDatos();
		String[] collDatos = datos.split(",");
		errorPrecision = Math.abs((promedio()-valMin())/promedio())*1;
		panelResultados.setResultado(df.format(errorPrecision)+" %");
		return errorPrecision;
	}
	
	public double precision()
	{
		double precision = 0.0;
		DecimalFormat df = new DecimalFormat("#.##");
		precision = 1 - errorPrecision();
		panelResultados.setResultado(df.format(precision)+" %");
		return precision;
	}

	public void limpiar()
	{
		panelDatos.limpiar();
		//panelResultados.limpiar();
	}

	public static void main(String[] args) 
	{
		InterfazPrincipal interfaz = new InterfazPrincipal();
		interfaz.setVisible(true);
	}

}
