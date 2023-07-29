package interfaz;

/**
 * Celso Javier Rodriguez Pizza
 */

import java.awt.GridLayout;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mundo.Calculadora;

public class InterfazCalculadora extends JFrame
{
	private static final long serialVersionUID = 1L;

	// ATRIBUTOS
	private PanelDatos panelDatos;
	private PanelOperaciones panelOperaciones;
	private PanelResultados panelResultados;
	private Calculadora calculadora;

	public InterfazCalculadora() 
	{
		// DISEÑO
		setTitle("Calculadora Celso");
		setSize(600, 600);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));

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
		calculadora = new Calculadora( Prom, 0 );
		try{
			double resultado = calculadora.promedio( );
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
		calculadora = new Calculadora( Prom, Vv );
		try{
			double resultado = calculadora.medidaMasLejana();
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
		calculadora = new Calculadora(Vv, M);
		//JOptionPane.showMessageDialog(null, "" + Vv + " " + M);
		double resultado = calculadora.opeEa();
		DecimalFormat df = new DecimalFormat("#.##");
		panelResultados.setTxtResultado(df.format(resultado));
	}

	public void metodoEr()
	{
		double Vv = Double.parseDouble( panelDatos.getVv() );
		double M = Double.parseDouble( panelDatos.getM() );
		calculadora = new Calculadora( Vv, M );	
		double resultado;
		try 
		{
			resultado = calculadora.opeEr();
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
		calculadora = new Calculadora( Vv, M );	
		double resultado;
		try 
		{
			resultado = calculadora.opeEe();
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
		calculadora = new Calculadora( Vv, M );	
		double resultado;
		try 
		{
			resultado = calculadora.opeE();
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
		calculadora = new Calculadora( Mp, Ml );	
		double resultado;
		try 
		{
			resultado = calculadora.opeEp();
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
		calculadora = new Calculadora( Mp, Ml );	
		double resultado;
		try 
		{
			resultado = calculadora.opeP();
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


/*
public double promedioDeLasMedidas(double[] medidas)throws Exception
{
   if(medidas.length ! = 0)
   {
       double promedio = 0.0;
       double suma = 0.0;
       for(int i = 0; i < medidas.length; i++)
       {
           suma = suma + medidas[i];
       }
       promedio = suma / medidas.length;
       return promedio;
   }
   else 
   {
       throw new Exception ("No se encuentran medidas")
   }
}



public double medidaMasLejana()
{
     double mML = 0.0;
     double diferencia = 0.0;
     for (int i = 0; i < medidas.length; i++)
     {
         if(Math.abs(valorVerdadero - medidas[i]) > diferencia)
         {
              diferencia = Math.abs(valorVerdadero - medidas[i]);
              mML = medidas[i];
         }
     }
     return mML;
}

 */

