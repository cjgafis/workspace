package mundo;

import java.util.Scanner;

public class Calculadora 
{
	public double sumar(double num1, double num2)
	{
		double respuesta = 0.0;
		respuesta = num1 + num2;
		return respuesta;
	}

	public double restar(double num1, double num2)
	{
		double respuesta = 0.0;
		respuesta = num1 - num2;
		return respuesta;
	}

	public double multiplicar(double num1, double num2)
	{
		double respuesta = 0.0;
		respuesta = num1 * num2;
		return respuesta;
	}

	public double dividir(double num1, double num2)throws Exception
	{
		double respuesta = 0.0;
		if(num2 != 0)
		{
			respuesta = num1 / num2;
		}
		else
		{
			throw new Exception("La división por cero no existe.");
		}
		return respuesta;
	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Calculadora casio = new Calculadora();
		
		System.out.println("=== Menú ===");
		System.out.println("1. Sumar dos numeros.");
		System.out.println("2. Restar dos numeros.");
		System.out.println("3. Multiplicar dos numeros.");
		System.out.println("4. Dividir dos numeros.");
		
		System.out.println("Ingrese el numero de la opción deseada: ");
		int opcion = sc.nextInt();
		
		switch(opcion)
		{
		case 1:
		{
			System.out.println("1. Sumar dos numeros.");
			System.out.println("Ingrese el primer número: ");
			double num1 = sc.nextDouble();
			System.out.println("Ingrese el segundo número: ");
			double num2 = sc.nextDouble();
			System.out.println("La respuesta es: " + casio.sumar(num1, num2));
			break;
		}
		case 2:
		{
			System.out.println("2. Restar dos numeros.");
			System.out.println("Ingrese el primer número: ");
			double num1 = sc.nextDouble();
			System.out.println("Ingrese el segundo número: ");
			double num2 = sc.nextDouble();
			System.out.println("La respuesta es: " + casio.restar(num1, num2));
			break;
		}
		case 3:
		{
			System.out.println("3. Multiplicar dos numeros.");
			System.out.println("Ingrese el primer número: ");
			double num1 = sc.nextDouble();
			System.out.println("Ingrese el segundo número: ");
			double num2 = sc.nextDouble();
			System.out.println("La respuesta es: " + casio.multiplicar(num1, num2));
			break;
		}
		case 4:
		{
			System.out.println("4. Dividir dos numeros.");
			System.out.println("Ingrese el primer número: ");
			double num1 = sc.nextDouble();
			System.out.println("Ingrese el segundo número: ");
			double num2 = sc.nextDouble();
			try 
			{
				System.out.println("La respuesta es: " + casio.dividir(num1, num2));
			} 
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
			break;
		}
		default:
		{
			System.out.println("Opción invalida.");
			break;
		}
		}

	}

}
