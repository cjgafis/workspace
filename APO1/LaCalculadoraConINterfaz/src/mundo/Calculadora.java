package mundo;

import java.util.Scanner;

public class Calculadora 
{
	// ATRIBUTOS	
	/**
	 * atributo de la calculadora. numero1 de tipo real. 
	 */
	private double numero1;
	/**
	 * atributo de la calculadora. numero2 de tipo real. 
	 */
	private double numero2;
	
	// CONSTRUCTOR
	/**
	 * permite crear un objeto de la clase Calculadora.
	 * post:se construyo un objeto de la clase Calculadora.
	 * @param numero1, numero1 es un numero de tipo real.
	 * @param numero2, numero2 es un numero de tipo real. 
	 */
	public Calculadora(double numero1, double numero2) 
	{
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	// METODOS GET Y SET
	/**
	 * permite obtener el valor guardado en el atributo numero 1.
	 * @return the numero1.
	 */
	public double getNumero1() 
	{
		return numero1;
	}

	/**
	 * permite cambiar el valor del atributo por otro ingresado por parametro.
	 * @param numero1, the numero1 to set
	 */
	public void setNumero1(double numero1) 
	{
		this.numero1 = numero1;
	}

	/**
	 * permite obtener el valor guardado en el atributo numero 2.
	 * @return the numero2.
	 */
	public double getNumero2() 
	{
		return numero2;
	}

	/**
	 * permite cambiar el valor del atributo por otro ingresado por parametro.
	 * @param numero2 the numero2 to set
	 */
	public void setNumero2(double numero2) 
	{
		this.numero2 = numero2;
	}
	
	/**
	 * permite sumar dos numeros.
	 * post: se sumaron dos numeros. 
	 * @return suma, el resultado de la suma de los dos numeros. 
	 */
	public double sumar()
	{
		double suma = 0.0;
		suma = numero1 + numero2;
		return suma;
	}
	
	/**
	 * permite restar dos numeros
	 * post: se restaron dos numeros.
	 * @return resta, es el resultado de la resta de los dos numeros. 
	 */
	public double restar()
	{
		double resta = 0.0;
		resta = numero1 - numero2;
		return resta;
	}
	
	/**
	 * permite multiplicar dos numeros.
	 * post: se multiplicaron los dos numeros.
	 * @return multiplicacion, es el resultado de la multiplicacion de los dos numeros.
	 */
	public double multiplicar()
	{
		double multiplicacion = 0.0;
		multiplicacion = numero1 * numero2;
		return multiplicacion; 
	}
	
	/**
	 * permite dividir dos numeros.
	 * pre: numero2 != 0
	 * @return division, es el resultado de la division de los dos numeros.
	 * @throws Exception
	 */
	public double dividir()throws Exception
	{
		if(numero2 != 0)
		{
			double division = 0.0;
			division = numero1 / numero2;
			return division;
		}
		else
		{
			throw new Exception("La division por cero no existe. "
					+ "Cambie el segundo numero por otro diferente de cero.");
		}
	}
	
	public double raizCuadrada(double numero)
	{
		return -1;
	}
	
	public double potencia(double numero1, double numero2)
	{
		return -1;
	}

	/**
	 * Metodo principal de la aplicacion. 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el numero 1: ");
		double numero1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Ingrese el numero 2: ");
		double numero2 = Double.parseDouble(sc.nextLine());
		
		Calculadora casio = new Calculadora(numero1, numero2);
		
		try 
		{
			System.out.println("El resultado de la division es: " + casio.dividir());
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		

	}



}
