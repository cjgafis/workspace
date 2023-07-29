package mundo;

/**
 * Esta clase represnta una calculadora la cual suma, resta, multiplica y divide 
 * dos numeros ingresados por el usuario. 
 * @author CJ
 *
 */
public class Calculadora 
{
	// ATRIBUTOS
	/**
	 * Representa un primer numero de tipo real.
	 */
	private double numero1;
	/**
	 * Representa un segundo numero de tipo real.
	 */
	private double numero2;

	// CONSTRUCTOR
	/**
	 * Permite instanciar objetos de la clase Calculadora.
	 * @param numero1 - es un numero real. 
	 * @param numero2 - es un numero real.
	 */
	public Calculadora(double numero1, double numero2) 
	{
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	/**
	 * @return the numero1
	 */
	public double getNumero1() 
	{
		return numero1;
	}

	/**
	 * @param numero1 the numero1 to set
	 */
	public void setNumero1(double numero1) 
	{
		this.numero1 = numero1;
	}

	/**
	 * @return the numero2
	 */
	public double getNumero2() 
	{
		return numero2;
	}

	/**
	 * @param numero2 the numero2 to set
	 */
	public void setNumero2(double numero2) 
	{
		this.numero2 = numero2;
	}
	/**
	 * Permite sumar dos numeros. 
	 * post: Se sumaron los dos numeros.
	 * @return el resultado de la suma de los dos numeros.
	 */
	public double sumar()
	{
		double respuesta = 0.0;
		respuesta = numero1 + numero2;
		return respuesta;
	}
	/**
	 * Permite restar dos numeros. 
	 * post: Se restaron los dos numeros.
	 * @return el resultado de la resta de los dos numeros.
	 */
	public double restar()
	{
		double respuesta = 0.0;
		respuesta = numero1 - numero2;
		return respuesta;
	}
	/**
	 * Permite multiplicar dos numeros. 
	 * post: Se multiplicaron los dos numeros.
	 * @return el resultado de la multiplicacion de los dos numeros.
	 */
	public double multiplicar()
	{
		double respuesta = 0.0;
		respuesta = numero1 * numero2;
		return respuesta;
	}
	/**
	 * Permite dividir dos numeros.
	 * post: Se dividieron los dos numeros. 
	 * @return el resultado de la division de los dos numeros.
	 * @throws lanza excepcion si el segundo numero es cero. 
	 */
	public double dividir()throws Exception
	{
		if(numero2 == 0)
		{
			throw new Exception("El segundo numero no puede ser cero.");
		}
		else
		{
			double respuesta = 0.0;
			respuesta = numero1 / numero2;
			return respuesta;
		}
	}
}
