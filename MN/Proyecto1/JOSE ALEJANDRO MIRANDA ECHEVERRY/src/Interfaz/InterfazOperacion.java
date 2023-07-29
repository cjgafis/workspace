package Interfaz;
import java.awt.BorderLayout;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Mundo.Operacion;



public class InterfazOperacion extends JFrame

{
	private PanelBotones panelBotones; 
	private PanelDatos panelDatos;
	private PanelLimpiar panelLimpiar;
	private Operacion operacion;

	public InterfazOperacion() 
	{
		setTitle("Calculos error");
		setSize(350,300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout(3, 1));
		
		panelBotones = new PanelBotones(this);
		add(panelBotones, BorderLayout.CENTER);
		
		panelDatos = new PanelDatos();
		add(panelDatos, BorderLayout.NORTH);
		
		panelLimpiar = new PanelLimpiar();
		add(panelLimpiar, BorderLayout.SOUTH);
	}
		
		
	public void promedioDeLasMedidas()
	{
		double num1 = Double.parseDouble(panelDatos.gettxtNumero1());
	
		
		
	}
		
		public void errorAbsolutoUnaMedida()
		{
			 
			                                             
		}
		
		public void errorAbsolutoVariasMedidas()
		{
			
		}	
		
		public void errorRelativoUnaMedida1()
		{
			
		}	
	    public void errorRelativoUnaMedida2()
		{
			
		}
		public void errorRelativoVariasMedidas()
		{
			
		}
		public void errorRelativoVariasMedidas2()
		{
			
		}
		public void porcentajeErrorExactitud()
		{
			
		}
		public void porcentajeErrorExactitud2()
		{
			
		}
		
		public void porcentajeErrorExactitud3()
		{
			
		}
		
		public void porcentajeErrorPrecision()
		{
			
		}
		public void porcentajePrecision()
		{
			
		}

public static void main(String[] args)
{
	InterfazOperacion operacion = new InterfazOperacion();
	operacion.setVisible(true);
}}

		