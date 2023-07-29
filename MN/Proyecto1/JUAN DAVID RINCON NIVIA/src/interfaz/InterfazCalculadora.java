package interfaz;

import java.awt.GridLayout;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mundo.Operacion;

public class InterfazCalculadora extends JFrame
{
	private static final long serialVersionUID = 1L;

	// ATRIBUTOS
	private PanelDatos panelDatos;
	private PanelOperaciones panelOperaciones;
	private PanelResultados panelResultados;
	private Operacion operacion;

	public InterfazCalculadora() 
	{
		// DISEÑO
		setTitle("Teoria error - Juan Rincon");
		setSize(700, 500);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));

		// CREAR LOS OBJETOS
		

		
		panelDatos = new PanelDatos();
		add(panelDatos);
		
		panelOperaciones = new PanelOperaciones(this);
		add(panelOperaciones);
		
		panelResultados = new PanelResultados(this);
		add(panelResultados);
	}

	
	
	public void metodoPromedio()
	{
		String Prom = panelDatos.getMedidas();
		operacion = new Operacion( Prom, 0 );
		try{
			double resultado =operacion.promedio( );
			DecimalFormat df = new DecimalFormat("#.##");
			panelResultados.setTxtResultado(df.format(resultado));
		}catch( Exception e ){
			panelResultados.setTxtResultado("Error en datos");
		}
	}

	
	
	public void metodoMedidaMasLejana()
	{
		String Prom = panelDatos.getMedidas();
		double Vv = Double.parseDouble( panelDatos.getVv() );
		operacion = new Operacion( Prom, Vv );
		try{
			double resultado = operacion.medidaMasLejana();
			DecimalFormat df = new DecimalFormat("#.##");
			panelResultados.setTxtResultado(df.format(resultado));
		}catch( Exception e ){
			panelResultados.setTxtResultado("Error en datos");
		}
	}


	
	
	public void metodoEa()
	{
		double Vv = Double.parseDouble( panelDatos.getVv() );
		double M = Double.parseDouble( panelDatos.getM() );
		operacion = new Operacion(Vv, M);
		
		double resultado = operacion.opeEa();
		DecimalFormat df = new DecimalFormat("#.##");
		panelResultados.setTxtResultado(df.format(resultado));
	}

	public void metodoEr()
	{
		double Vv = Double.parseDouble( panelDatos.getVv() );
		double M = Double.parseDouble( panelDatos.getM() );
		operacion = new Operacion( Vv, M );	
		double resultado;
		try 
		{
			resultado = operacion.opeEr();
			DecimalFormat df = new DecimalFormat("#.##");
			panelResultados.setTxtResultado(df.format(resultado));
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(this, e.getMessage());
		}		
	}

	public void metodoEe()
	{
		double Vv = Double.parseDouble( panelDatos.getVv() );
		double M = Double.parseDouble( panelDatos.getM() );
		operacion = new Operacion( Vv, M );	
		double resultado;
		try 
		{
			resultado = operacion.opeEe();
			DecimalFormat df = new DecimalFormat("#.##");
			panelResultados.setTxtResultado(df.format(resultado));
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(this, e.getMessage());
		}

	}

	public void metodoE()
	{
		double Vv = Double.parseDouble( panelDatos.getVv() );
		
		double M = Double.parseDouble( panelDatos.getM() );
		operacion = new Operacion( Vv, M );	
		double resultado;
		try 
		{
			resultado = operacion.opeE();
			DecimalFormat df = new DecimalFormat("#.##");
			panelResultados.setTxtResultado(df.format(resultado));
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(this, e.getMessage());
		}		
	}

	public void metodoEp()
	{
		double Mp = Double.parseDouble( panelDatos.getMp() );
		double Ml = Double.parseDouble( panelDatos.getMl() );
		operacion = new Operacion( Mp, Ml );	
		double resultado;
		try 
		{
			resultado = operacion.opeEp();
			DecimalFormat df = new DecimalFormat("#.##");
			panelResultados.setTxtResultado(df.format(resultado));
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(this, e.getMessage());
		}		
	}

	public void metodoP()
	{
		double Mp = Double.parseDouble( panelDatos.getMp() );
		double Ml = Double.parseDouble( panelDatos.getMl() );
		operacion = new Operacion( Mp, Ml );	
		double resultado;
		try 
		{
			resultado = operacion.opeP();
			
			DecimalFormat df = new DecimalFormat("#.##");
			panelResultados.setTxtResultado(df.format(resultado));
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(this, e.getMessage());
		}		
	}


	public void limpiar()
	{
		panelDatos.limpiar();
		
		panelResultados.limpiar();
	}


	public static void main(String[] args) 
	{
		InterfazCalculadora miHP = new InterfazCalculadora();
		miHP.setVisible(true);

	}

}



