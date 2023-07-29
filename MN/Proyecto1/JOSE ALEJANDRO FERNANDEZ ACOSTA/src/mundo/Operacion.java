package mundo;

import java.util.Scanner;

/**
 * @author CJ - 23 agosto de 2022
 *
 */
public class Operacion 
{
	// METODOS PARA EL ERROR ABSOLUTO

	// MENU OPCION 1
	/**
	 * Permite calcular el error absoluto con una sola medida. 
	 * @param valorVerdadero, valor que asumimos como verdadero.
	 * @param medidaExperimental, medida que mide el usuario con un patron.
	 * @return ea, error absoluto.
	 */
	public double errorAbsolutoUnaMedida(double valorVerdadero, double medidaExperimental)
	{
		double ea = Math.abs(valorVerdadero - medidaExperimental);
		return ea;
	}

	// MENU OPCION 2
	/**
	 * Permite calcular el error absoluto con varias medidas.
	 * @param valorVerdadero, valor que asumimos como verdadero.
	 * @param medidas, arreglo con varias medidas experimentales. 
	 * @return ea, error absoluto.
	 */
	public double errorAbsolutoVariasMedidas(double valorVerdadero, double[ ] medidas)
	{
		// Calculamos el promedio de las medidas ingresadas.
		double suma = 0.0;
		double promedio = 0.0;
		for(int i= 0; i < medidas.length; i++)
		{
			suma = suma + medidas[i];
		}
		promedio = suma / medidas.length;

		// Ya con el promedio podemos calcular el error absoluto para varias medidas. 
		double suma2 = 0.0;
		for(int i= 0; i < medidas.length; i++)
		{
			suma2 = suma2 + Math.abs(medidas[i] - promedio);
		}
		double ea = suma2/medidas.length;
		return ea;
	}

	// METODOS PARA EL ERROR RELATIVO

	// MENU OPCION 3
	/**
	 * Permite calcular el error relativo con una sola medida. 
	 * @param errorAbsoluto, resultado de una medición menos un valor verdadero del mensurando.
	 * @param valorVerdadero, valor que asumimos como verdadero.
	 * @return er, error relativo.
	 */
	public double errorRelativoUnaMedida(double errorAbsoluto, double valorVerdadero)
	{
		double er = errorAbsoluto / valorVerdadero;
		return er;
	}

	// MENU OPCION 4
	/**
	 * Permite calcular el error relativo con una sola medida. 
	 * @param valorVerdadero, valor que asumimos como verdadero.
	 * @param medidaExperimental, medida que mide el usuario con un patron.
	 * @return er, error relativo.
	 */
	public double errorRelativoUnaMedida2(double valorVerdadero, double medidaExperimental)
	{
		double er = Math.abs(valorVerdadero / medidaExperimental) / valorVerdadero;
		return er;
	}

	// MENU OPCION 5
	/**
	 * Permite calcular el error relativo con varias medidas. 
	 * @param errorAbsoluto, resultado de una medición menos un valor verdadero del mensurando.
	 * @param promedio, promedio de las medidas. 
	 * @return er, error relativo.
	 */
	public double errorRelativoVariasMedidas(double errorAbsoluto, double promedio)
	{
		double er = errorAbsoluto / promedio;
		return er;
	}

	// MENU OPCION 6
	/**
	 * Permite calcular el error relativo con varias medidas.
	 * @param errorAbsoluto, resultado de una medición menos un valor verdadero del mensurando.
	 * @param medidas, arreglo con varias medidas experimentales.  
	 * @return er, error relativo.
	 */
	public double errorRelativoVariasMedidas2(double errorAbsoluto, double[] medidas)
	{
		double suma = 0.0;
		double promedio = 0.0;
		for(int i= 0; i < medidas.length; i++)
		{
			suma = suma + medidas[i];
		}
		promedio = suma / medidas.length;

		double er = errorAbsoluto / promedio;
		return er;		
	}

	// METODOS PARA LA EXACTITUD

	// MENU OPCION 7
	/**
	 * Permite calcular el porcentaje de error de exactitud.
	 * @param errorRelativo, relación entre el error de medida y un valor verdadero del mensurando.
	 * @return pEE, porcentaje de error de exactitud. 
	 */
	public double porcentajeErrorExactitud(double errorRelativo)
	{
		double pEE = errorRelativo * 100;
		return pEE;
	}

	// MENU OPCION 8
	/**
	 * Permite calcular el porcentaje de error de exactitud.
	 * @param errorAbsoluto, resultado de una medición menos un valor verdadero del mensurando.
	 * @param valorVerdadero, valor que asumimos como verdadero.
	 * @return pEE, porcentaje de error de exactitud. 
	 */
	public double porcentajeErrorExactitud2(double errorAbsoluto, double valorVerdadero)
	{
		double pEE = (errorAbsoluto / valorVerdadero) * 100;
		return pEE;
	}

	// MENU OPCION 9
	/**
	 * Permite calcular el porcentaje de error de exactitud.
	 * @param valorVerdadero, valor que asumimos como verdadero.
	 * @param medidaExperimental, medida que mide el usuario con un patron.
	 * @return
	 */
	public double porcentajeErrorExactitud3(double valorVerdadero, double medidaExperimental)
	{
		double pEE = ( Math.abs(valorVerdadero / medidaExperimental) / valorVerdadero ) * 100;
		return pEE;
	}

	// MENU OPCION 10
	/**
	 * Permite calcular el porcentaje de exactitud.
	 * @param porcentajeErrorExactitud, porcentaje de error de exactitud.
	 * @return pE, porcentaje de exactitud.
	 */
	public double porcentajeExactitud(double porcentajeErrorExactitud)
	{
		double pE = 100 - porcentajeErrorExactitud;
		return pE;
	}

	// METODOS PARA LA PRECISION

	// MENU OPCION 11
	/**
	 * Permite calcular el porcentaje de error de precision.
	 * @param medidaPromedio, promedio de las medidas.
	 * @param medidaMasLejana, se refiere a la medida mas lejana de las demas.
	 * @return pEP, porcentaje error de precision.
	 */
	public double porcentajeErrorPrecision(double medidaPromedio, double medidaMasLejana)
	{
		double pEP = ( Math.abs(medidaPromedio - medidaMasLejana) / medidaPromedio ) * 100;
		return pEP;
	}

	// MENU OPCION 12
	/**
	 * Permite calcular el porcentaje de precision.
	 * @param porcentajeErrorPrecision, porcentaje de error de precision.
	 * @return pP, porcentaje de precision.
	 */
	public double porcentajePrecision(double porcentajeErrorPrecision)
	{
		double pP = 100 - porcentajeErrorPrecision;
		return pP;
	}
}
