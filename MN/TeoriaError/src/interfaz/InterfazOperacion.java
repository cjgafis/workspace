package interfaz;
import java.awt.BorderLayout;
/**
 * Celso Javier Rodriguez Pizza
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mundo.Operacion;

public class InterfazOperacion extends JFrame
{	
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private PanelDatos panelDatos;
	private PanelOperaciones panelOperaciones;

	public InterfazOperacion() 
	{
		// DISEÑO
		setTitle("Teoria del error - Celso");
		setSize(800, 300);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		// CREAR LOS OBJETOS
		panelDatos = new PanelDatos();
		add(panelDatos, BorderLayout.CENTER);
		
		panelOperaciones = new PanelOperaciones(this);
		add(panelOperaciones, BorderLayout.SOUTH);
		
	}
	
	public void promedioDeLasMedidas()
	{
		if(!panelDatos.getTxtMedidas().isEmpty())
		{
			String medidas = panelDatos.getTxtMedidas(); 
			String[] medidas2 = medidas.split(";");
			double[] medidas3 = new double[medidas2.length];
			for(int i = 0; i < medidas2.length; i++)
			{
				medidas3[i] = Double.parseDouble(medidas2[i]);
			}
			Operacion op = new Operacion(medidas3);
			try 
			{
				double promedio = op.promedioDeLasMedidas(medidas3);
				panelDatos.setTxtMP(promedio);
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this, "No hay argumentos de entrada");
		}
	}
	
	public void medidaMasLejana()
	{
		if(!panelDatos.getTxtVV().isEmpty() && !panelDatos.getTxtMedidas().isEmpty())
		{
			double vV = Double.parseDouble(panelDatos.getTxtVV());
			String medidas = panelDatos.getTxtMedidas(); 
			String[] medidas2 = medidas.split(";");
			double[] medidas3 = new double[medidas2.length];
			for(int i = 0; i < medidas2.length; i++)
			{
				medidas3[i] = Double.parseDouble(medidas2[i]);
			}
			Operacion op = new Operacion(vV, medidas3);
			try 
			{
				double mML = op.medidaMasLejana();
				panelDatos.setTxtML(mML);
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this, "No hay argumentos de entrada");
		}
	}
	
	public void errorAbsoluto()
	{
		if(!panelDatos.getTxtVV().isEmpty() && !panelDatos.getTxtMedidas().isEmpty())
		{
			double vV = Double.parseDouble(panelDatos.getTxtVV());
			String medidas = panelDatos.getTxtMedidas(); 
			String[] medidas2 = medidas.split(";");
			double[] medidas3 = new double[medidas2.length];
			for(int i = 0; i < medidas2.length; i++)
			{
				medidas3[i] = Double.parseDouble(medidas2[i]);
			}
			Operacion op = new Operacion(vV, medidas3);
			try 
			{
				double eA = op.errorAbsoluto();
				panelDatos.setTxtEA(eA);
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this, "No hay argumentos de entrada");
		}
	}
	
	public void errorRelativo()
	{
		if(!panelDatos.getTxtVV().isEmpty() && !panelDatos.getTxtMedidas().isEmpty())
		{
			double vV = Double.parseDouble(panelDatos.getTxtVV());
			String medidas = panelDatos.getTxtMedidas(); 
			String[] medidas2 = medidas.split(";");
			double[] medidas3 = new double[medidas2.length];
			for(int i = 0; i < medidas2.length; i++)
			{
				medidas3[i] = Double.parseDouble(medidas2[i]);
			}
			Operacion op = new Operacion(vV, medidas3);
			try 
			{
				double eR = op.errorRelativo();
				panelDatos.setTxtER(eR);
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this, "No hay argumentos de entrada");
		}
	}
	
	public void porcentajeErrorExactitud()
	{
		if(!panelDatos.getTxtVV().isEmpty() && !panelDatos.getTxtMedidas().isEmpty())
		{
			double vV = Double.parseDouble(panelDatos.getTxtVV());
			String medidas = panelDatos.getTxtMedidas(); 
			String[] medidas2 = medidas.split(";");
			double[] medidas3 = new double[medidas2.length];
			for(int i = 0; i < medidas2.length; i++)
			{
				medidas3[i] = Double.parseDouble(medidas2[i]);
			}
			Operacion op = new Operacion(vV, medidas3);
			try 
			{
				double pEE = op.porcentajeErrorExactitud();
				panelDatos.setTxtPEE(pEE);
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this, "No hay argumentos de entrada");
		}
	}
	
	public void porcentajeExactitud()
	{
		if(!panelDatos.getTxtVV().isEmpty() && !panelDatos.getTxtMedidas().isEmpty())
		{
			double vV = Double.parseDouble(panelDatos.getTxtVV());
			String medidas = panelDatos.getTxtMedidas(); 
			String[] medidas2 = medidas.split(";");
			double[] medidas3 = new double[medidas2.length];
			for(int i = 0; i < medidas2.length; i++)
			{
				medidas3[i] = Double.parseDouble(medidas2[i]);
			}
			Operacion op = new Operacion(vV, medidas3);
			try 
			{
				double pE = op.porcentajeExactitud();
				panelDatos.setTxtPE(pE);
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this, "No hay argumentos de entrada");
		}
	}
	
	public void porcentajeErrorPrecision()
	{
		if(!panelDatos.getTxtVV().isEmpty() && !panelDatos.getTxtMedidas().isEmpty())
		{
			if(!panelDatos.getTxtVV().isEmpty() && !panelDatos.getTxtMedidas().isEmpty())
			{
				double vV = Double.parseDouble(panelDatos.getTxtVV());
				String medidas = panelDatos.getTxtMedidas(); 
				String[] medidas2 = medidas.split(";");
				double[] medidas3 = new double[medidas2.length];
				for(int i = 0; i < medidas2.length; i++)
				{
					medidas3[i] = Double.parseDouble(medidas2[i]);
				}
				Operacion op = new Operacion(vV, medidas3);
				try 
				{
					double pEP = op.porcentajeErrorPrecision();
					panelDatos.setTxtPEP(pEP);
				} 
				catch (Exception e) 
				{
					JOptionPane.showMessageDialog(this, e.getMessage());
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this, "No hay argumentos de entrada");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this, "No hay argumentos de entrada");
		}
	}
	
	public void porcentajePrecision()
	{
		if(!panelDatos.getTxtVV().isEmpty() && !panelDatos.getTxtMedidas().isEmpty())
		{
			if(!panelDatos.getTxtVV().isEmpty() && !panelDatos.getTxtMedidas().isEmpty())
			{
				double vV = Double.parseDouble(panelDatos.getTxtVV());
				String medidas = panelDatos.getTxtMedidas(); 
				String[] medidas2 = medidas.split(";");
				double[] medidas3 = new double[medidas2.length];
				for(int i = 0; i < medidas2.length; i++)
				{
					medidas3[i] = Double.parseDouble(medidas2[i]);
				}
				Operacion op = new Operacion(vV, medidas3);
				try 
				{
					double pP = op.porcentajePrecision();
					panelDatos.setTxtPP(pP);
				} 
				catch (Exception e) 
				{
					JOptionPane.showMessageDialog(this, e.getMessage());
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this, "No hay argumentos de entrada");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this, "No hay argumentos de entrada");
		}
	}
	
	public void limpiar()
	{
		panelDatos.limpiar();
	}

	public static void main(String[] args) 
	{
		InterfazOperacion miApp = new InterfazOperacion();
		miApp.setVisible(true);

	}

}
