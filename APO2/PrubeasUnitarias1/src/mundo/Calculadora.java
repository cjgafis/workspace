package mundo;

import java.util.Scanner;

public class Calculadora 
{
	// ATRIBUTOS
	private double num1;
	private double num2;
	
	// METODO CONSTRUCTOR
	/**
	 * @param num1
	 * @param num2
	 */
	public Calculadora(double num1, double num2) 
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// METODOS ARITMETICOS
	/**
	 * 
	 * @return
	 */
	public double sumar()
	{
		return num1 + num2;
	}
	
	/**
	 * 
	 * @return
	 */
	public double restar()
	{
		return num1 - num2;
	}
	
	/**
	 * 
	 * @return
	 */
	public double multiplicar()
	{
		return num1 * num2;
	}
	
	/**
	 * 
	 * @return
	 * @throws ArithmeticException
	 */
	public double dividir()throws ArithmeticException
	{
		if(num2 != 0)
		{
		return num1 / num2;
		}
		else
		{
			throw new ArithmeticException("La división por cero no es valida.");
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Instanciamos la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que ingrese el primer numero
		System.out.println("Por favor ingrese el primer numero: ");
		// Lo capturamos y lo guardamos en una variable
		double num1 = Double.parseDouble(sc.nextLine());
		// Pedimos al usuario que ingrese el segundo numero
		System.out.println("Por favor ingrese el primer numero: ");
		// Lo capturamos y lo guardamos en una variable
		double num2 = Double.parseDouble(sc.nextLine());
		// Ya teniendo los dos numeros instanciamos la clase Calculadora
		Calculadora casio = new Calculadora(num1, num2);
		// Llamamos a los métodos y mostramos los resultados por consola
		System.out.println("El resultado de la suma es: " + casio.sumar());
		System.out.println("El resultado de la resta es: " + casio.restar());
		System.out.println("El resultado de la multiplicacion es: " + casio.multiplicar());
		System.out.println("El resultado de la division es: " + casio.dividir());
		sc.close();
	}
}
