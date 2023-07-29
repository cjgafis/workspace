package Mundo;

/**
 * Desarrollado por:
 * Vanesa Alexandra Zamora Martinez - 2520202030
 * 
 * Metodos Numericos
 */


public class Operacion 
{
	/**
	 * Metodo que calcula el error absoluto
	 * @param vVerdadero valor real
	 * @param medido, es el valor que mide el usuario
	 * @return el error absoluto
	 */
	public double errorAbsolutoUnaMedida(double vVerdadero, double medido)
	{
		double errorcito = Math.abs(vVerdadero-medido);
		return errorcito;
	}
	
	/**
	 * Metodo que calcula el error absoluto de varias medida
	 * @param vVerdadero, valor real
	 * @param medidos, es el arreglo que contiene las medidas del usuario
	 * @return el error absoluto de varias medidas
	 */
	public double errorAbsolutoVariasMedidas(double vVerdadero, double[] medidos)
	{
		// Primer paso sacar el valor peomedio de las medidas
		double promedioMedidas = 0.0;
		double sumatoria = 0.0;
		for(int i=0; i<medidos.length; i++)
		{
			sumatoria = sumatoria + medidos[i];	
		}
		promedioMedidas = sumatoria/medidos.length;
		
		// Segundo paso calculo del error absoluto para varias medidas
		double sumatoriaErrorAbsoluto = 0;
		// El for es un ciclo para sumar varias medidas
		for(int i=0; i<medidos.length; i++)
		{
			sumatoriaErrorAbsoluto = sumatoriaErrorAbsoluto + Math.abs(medidos[i]-promedioMedidas);
		}
		double resultado = sumatoriaErrorAbsoluto/medidos.length;
		return resultado;
		
	}

	/**
	 * Metodo que permite calcular el error relativo 
	 * @param vVerdadero, valor real 
	 * @param medidos, es el arreglo que contiene las medidas del usuario
	 * @return el error relativo 
	 */
	public double errorRelativo(double vVerdadero, double medidos)
	{
		
		return Math.abs(vVerdadero - medidos)/vVerdadero;
//		double promedioMedidas = 0.0;
//		double sumatoria = 0.0;
//		for(int i=0; i<medidos.length; i++)
//		{
//			sumatoria = sumatoria + medidos[i];	
//		}
//		promedioMedidas = sumatoria/medidos.length;
//		
//		double sumatoriaErrorAbsoluto = 0;
//		for(int i=0; i<medidos.length; i++)
//		{
//			sumatoriaErrorAbsoluto = sumatoriaErrorAbsoluto + Math.abs(medidos[i]-promedioMedidas);
//		}
//		double resultado = sumatoriaErrorAbsoluto/medidos.length;
//	
//		double errorRelativo = resultado/promedioMedidas;
//		return errorRelativo;
	}
	
	/**
	 * Metodo para calcular el porcentaje de error de exactitud
	 * @param vVerdadero, valor real
	 * @param medidos, es el arreglo que contiene las medidas del usuario
	 * @return el valor del porcentaje de error de exactitud
	 */
	public double porcentajeErrorExactitud(double vVerdadero, double[] medidos )
	{
		double promedioMedidas = 0.0;
		double sumatoria = 0.0;
		for(int i=0; i<medidos.length; i++)
		{
			sumatoria = sumatoria + medidos[i];	
		}
		promedioMedidas = sumatoria/medidos.length;
		
		double sumatoriaErrorAbsoluto = 0;
		for(int i=0; i<medidos.length; i++)
		{
			sumatoriaErrorAbsoluto = sumatoriaErrorAbsoluto + Math.abs(medidos[i]-promedioMedidas);
		}
		double resultado = sumatoriaErrorAbsoluto/medidos.length;
	
		double errorRelativo = resultado/promedioMedidas;
		return errorRelativo*100;
	}
	
	/**
	 * Metodo para calcular el porcentaje de exactitud
	 * @param vVerdadero, valor real
	 * @param medidos, es el arreglo que contiene las medidas del usuario
	 * @return el porcentaje de exactitud
	 */
	public double porcentajeExactitud(double vVerdadero, double[] medidos)
	{
		double promedioMedidas = 0.0;
		double sumatoria = 0.0;
		for(int i=0; i<medidos.length; i++)
		{
			sumatoria = sumatoria + medidos[i];	
		}
		promedioMedidas = sumatoria/medidos.length;
		
		double sumatoriaErrorAbsoluto = 0;
		for(int i=0; i<medidos.length; i++)
		{
			sumatoriaErrorAbsoluto = sumatoriaErrorAbsoluto + Math.abs(medidos[i]-promedioMedidas);
		}
		double resultado = sumatoriaErrorAbsoluto/medidos.length;
	
		// Ya que tengo el error relativo solo ejecuto la ecuación. 
		double errorRelativo = resultado/promedioMedidas;
		return 100-(errorRelativo*100);
	}
	
	/**
	 * Metodo de porcentaje de error de precision
	 * @param medidos, es el arreglo que contiene las medidas del usuario
	 * @param medidaLejana, valor de la medida mas lejana 
	 * @return porcentaje de error de precision
	 */
	public double porcentajeErrorPrecision(double[] medidos, double medidaLejana )
	{
		double promedioMedidas = 0.0;
		double sumatoria = 0.0;
		for(int i=0; i<medidos.length; i++)
		{
			sumatoria = sumatoria + medidos[i];	
		}
		promedioMedidas = sumatoria/medidos.length;
		
		//Con el promedio de medidas calculado puedo reemplazar en la ecuación,
		//ya que medida lejana entra por parametro
		
		double porcentajeErrorPrecision = Math.abs(promedioMedidas-medidaLejana)/promedioMedidas*100;
		return porcentajeErrorPrecision;	
	}
	
	/**
	 * Metodo de porcentaje de precision
	 * @param medidos, 
	 * @param medidaLejana, valor de la medida mas lejana 
	 * @return el porcentaje de precision
	 */
	public double porcentajePrecision(double[] medidos, double medidaLejana)
	{
		double promedioMedidas = 0.0;
		double sumatoria = 0.0;
		for(int i=0; i<medidos.length; i++)
		{
			sumatoria = sumatoria + medidos[i];	
		}
		promedioMedidas = sumatoria/medidos.length;
		
		//Con el promedio de medidas calculado puedo reemplazar en la ecuación,
		//ya que medida lejana entra por parametro
		
		double porcentajeErrorPrecision = Math.abs(promedioMedidas-medidaLejana)/promedioMedidas*100;
		return 100-porcentajeErrorPrecision;	
	}
	
	
}

