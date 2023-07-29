package mundo;

public class Calculadora 
{
	// ATRIBUTOS
	private double numero1;
	private double numero2;

	/**
	 * Metodo que construye los objetos de la clase Calculadora
	 * @param num1, es el numero1 ingresado por el usuario
	 * @param num2, es el numero2 ingresado por el usuario
	 */
	public Calculadora(double num1, double num2) 
	{
		numero1 = num1;
		numero2 = num2;
	}

	/**
	 * Retorna el valor que tiene el atributo numero1
	 * @return numero1
	 */
	public double getNumero1()
	{
		return numero1;
	}

	/**
	 * Retorna el valor que tiene el atributo numero2
	 * @return numero2
	 */
	public double getNumero2()
	{
		return numero2;
	}

	/**
	 * Cambia el valor del atributo numero1 por el valor 
	 * ingresado por parametro
	 * @param num1, es el nuevo valor ingresado por el usuario
	 */
	public void setNumero1(double num1)
	{
		numero1 = num1;
	}

	/**
	 * Cambia el valor del atributo numero2 por el valor 
	 * ingresado por parametro
	 * @param num2, es el nuevo valor ingresado por el usuario
	 */
	public void setNumero2(double num2)
	{
		numero2 = num2;
	}

	public double sumar()
	{
		double resultado = numero1 + numero2;
		return resultado;
	}

	public double restar()
	{
		double resultado = numero1 - numero2;
		return resultado;
	}

	public double multiplicar()
	{
		double resultado = numero1 * numero2;
		return resultado;
	}

	public double dividir()throws Exception
	{
		if(numero2 != 0)
		{
			double resultado = numero1 / numero2;
			return resultado;
		}
		else
		{
			throw new Exception("La división por cero no existe");
		}
	}
}
