package mundo;

import javax.swing.JOptionPane;

/**
 * @author CJ - 23 agosto de 2022
 *
 */

public class Operacion 
{
	// ATRIBUTOS
	private double[ ] medidas;
	private double valorVerdadero;

	// METODO CONSTRUCTOR 1
	public Operacion(double valorVerdaderoP, double[ ] medidasP)
	{
		valorVerdadero = valorVerdaderoP;
		medidas = medidasP;
	}
	
	// METODO CONSTRUCTOR 2
	public Operacion(double[ ] medidasP)
	{
		valorVerdadero = 0.0;
		medidas = medidasP;
	}

	// PRODUCTO
	/**
	 * Permite calcular el promedio de las medidas. 
	 * @param medidas, son las mwedidas que ingresa el usuario.
	 * @return promedio, el promedio de las medidas. 
	 */
	public double promedioDeLasMedidas(double[] medidas)throws Exception
	{
		if(medidas.length != 0)
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
			throw new Exception("No hay medidas.");
		}
	}

	// ERROR ABSOLUTO
	/**
	 * Permite calcular el error absoluto con una sola medida. 
	 * @return ea, error absoluto.
	 */
	public double errorAbsoluto()throws Exception
	{
		double ea = 0.0;
		if(medidas.length != 0)
		{
			if(medidas.length == 1)
			{
				ea = Math.abs(valorVerdadero - medidas[0]);
			}
			else if(medidas.length > 1)
			{
				double promedio = promedioDeLasMedidas(medidas); 
				double suma = 0.0;
				for(int i= 0; i < medidas.length; i++)
				{
					suma = suma + Math.abs(medidas[i] - promedio);
				}
				ea = suma/medidas.length;
			}
		}
		else
		{
			throw new Exception("No hay medidas.");
		}
		return ea;
	}

	// ERROR RELATIVO
	/**
	 * Permite calcular el error relativo de la(s) medida(s).
	 * @return er, error relativo.
	 */
	public double errorRelativo()
	{
		double er = 0.0;
		try
		{
			if(medidas.length == 1)
			{
				er = errorAbsoluto() / valorVerdadero;
			}
			else if(medidas.length > 1)
			{
				er = errorAbsoluto() / promedioDeLasMedidas(medidas);
			}
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "No hay medidas.");
		}
		return er;
	}

	// METODOS PARA LA EXACTITUD

	/**
	 * Permite calcular el porcentaje de error de exactitud.
	 * @return pEE, porcentaje de error de exactitud. 
	 */
	public double porcentajeErrorExactitud()
	{
		double pEE = errorRelativo() * 100;
		return pEE;
	}

	/**
	 * Permite calcular el porcentaje de exactitud.
	 * @return pE, porcentaje de exactitud.
	 */
	public double porcentajeExactitud()
	{
		double pE = 100 - porcentajeErrorExactitud();
		return pE;
	}

	// METODOS PARA LA PRECISION

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

	/**
	 * Permite calcular el porcentaje de error de precision.
	 * @return pEP, porcentaje error de precision.
	 */
	public double porcentajeErrorPrecision()
	{
		double pEP = 0.0;;
		try 
		{
			pEP = ( Math.abs(promedioDeLasMedidas(medidas) - medidaMasLejana()) / promedioDeLasMedidas(medidas) ) * 100;
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, "Hay problemas con el promedio.");
		}
		return pEP;
	}

	/**
	 * Permite calcular el porcentaje de precision.
	 * @return pP, porcentaje de precision.
	 */
	public double porcentajePrecision()
	{
		double pP = 100 - porcentajeErrorPrecision();
		return pP;
	}
}
