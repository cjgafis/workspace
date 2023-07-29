package mundo;

import java.util.Scanner;

import org.nfunk.jep.JEP;

public class CalculoRaiz 
{
	// METODOS PARA LA FUNCIÓN CUADRATICA

	public double raiz1(double a, double b, double c)
	{
		return (-b + Math.sqrt((Math.pow(b, 2)-4*a*c))) / (2*a);
	}

	public double raiz2(double a, double b, double c)
	{
		return (-b - Math.sqrt((Math.pow(b, 2)-4*a*c))) / (2*a);
	}

	// METODO PARA EVALUAR UN VALOR EN UNA FUNCION
	public double evaluar(String funcion, double valorX) throws Exception
	{   
		double resultado = 0.0;
		JEP jep = new JEP();
		jep.addStandardFunctions();
		jep.addStandardConstants();
		jep.addVariable("x", valorX);
		jep.parseExpression(funcion);
		resultado = jep.getValue(); 

		if(!jep.hasError())
		{
			return resultado;
		}
		else
		{
			throw new Exception("Hay error.");
		}      
	}

	// METODO PARA EL CALCULO DE RAICES POR BISECCIÓN

	public double biseccion(double lI, double lS, String funcion) throws Exception
	{
		double lIEvaluadoEnLaF = evaluar(funcion, lI);
		double lSEvaluadoEnLaF = evaluar(funcion, lS);
		// ------------------------------
		double xRActual = (lI + lS) / 2;
		// ------------------------------
		double xRActualEvaluadoEnLaF = evaluar(funcion, xRActual);		
		double xRAnterior = 1;
		double errorAproximado = 1;
		double respuesta = 0.0;
		int contador = 0;

		if( ((lIEvaluadoEnLaF) > 0) && ((lSEvaluadoEnLaF) < 0) || 
				((lIEvaluadoEnLaF) < 0) && ((lSEvaluadoEnLaF) > 0))
		{
			while(xRActualEvaluadoEnLaF != 0 && errorAproximado > 0.000001 )
			{				
				xRActual = (lI + lS) / 2;
				contador++;
				System.out.println("Iteración: " + contador + " - Raiz: " + xRActual);
				errorAproximado = Math.abs( (xRActual - xRAnterior) / xRActual ) * 100;
				xRActualEvaluadoEnLaF = evaluar(funcion, xRActual);
				if( (lIEvaluadoEnLaF * xRActualEvaluadoEnLaF) < 0)
				{
					lS = xRActual;
				}
				else if( (lIEvaluadoEnLaF * xRActualEvaluadoEnLaF) > 0)
				{
					lI = xRActual;
				}
				else if( (lIEvaluadoEnLaF * xRActualEvaluadoEnLaF) == 0)
				{
					respuesta = xRActual;
				}
				xRAnterior = xRActual;
				lIEvaluadoEnLaF = evaluar(funcion, lI);
			}
			respuesta = xRActual;
		}
		else
		{
			throw new Exception("El rango ingresado no es valido. ");
		}		
		return respuesta;
	}

	// METODO PARA EL CALCULO DE RAICES POR FALSA POSICIÓN O REGLA FALSA

	public double falsaPosicion(double lI, double lS, String funcion) throws Exception
	{
		double lIEvaluadoEnLaF = evaluar(funcion, lI);
		double lSEvaluadoEnLaF = evaluar(funcion, lS);
		// -------------------------------------------------------------------------------------------------------
		double xRActual = ( lI * lSEvaluadoEnLaF - lS * lIEvaluadoEnLaF ) / ( lSEvaluadoEnLaF - lIEvaluadoEnLaF );
		// -------------------------------------------------------------------------------------------------------
		double xRActualEvaluadoEnLaF = evaluar(funcion, xRActual);
		double xRAnterior = 1;
		double errorAproximado = 1;
		double respuesta = 0.0;
		int contador = 0;

		if( ((lIEvaluadoEnLaF) > 0) && ((lSEvaluadoEnLaF) < 0) || 
				((lIEvaluadoEnLaF) < 0) && ((lSEvaluadoEnLaF) > 0))
		{
			while(xRActualEvaluadoEnLaF != 0 && errorAproximado > 0.000001 )
			{				
				xRActual = ( lI * lSEvaluadoEnLaF - lS * lIEvaluadoEnLaF ) / ( lSEvaluadoEnLaF - lIEvaluadoEnLaF );
				contador++;
				System.out.println("Iteración: " + contador + " - Raiz: " + xRActual);
				errorAproximado = Math.abs( (xRActual - xRAnterior) / xRActual ) * 100;
				xRActualEvaluadoEnLaF = evaluar(funcion, xRActual);
				if( (lIEvaluadoEnLaF * xRActualEvaluadoEnLaF) < 0)
				{
					lS = xRActual;
				}
				else if( (lIEvaluadoEnLaF * xRActualEvaluadoEnLaF) > 0)
				{
					lI = xRActual;
				}
				else if( (lIEvaluadoEnLaF * xRActualEvaluadoEnLaF) == 0)
				{
					respuesta = xRActual;
				}
				xRAnterior = xRActual;
				lIEvaluadoEnLaF = evaluar(funcion, lI);
			}
			respuesta = xRActual;
		}
		else
		{
			throw new Exception("El rango ingresado no es valido. ");
		}	
		return respuesta;
	}

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		CalculoRaiz cr = new CalculoRaiz();
		double raiz1 = 0.0;
		double raiz2 = 0.0;
		System.out.println("Ingrese la función: ");
		String funcion = sc.nextLine();		

		String volver = "s";
		while(volver.equals("s"))
		{
			System.out.println("========== Menú ==========");
			System.out.println("1. Cálculo de raices mediante función cuadrática.");
			System.out.println("2. Cálculo de raices por el método de la Bisección.");
			System.out.println("3. Cálculo de raices por método de la Falsa Posición.");
			System.out.println("\n\nIngrese el número de la opción deseada...");
			int opcion = Integer.parseInt(sc.nextLine());

			switch(opcion)
			{
			case 1:
			{
				System.out.println("\nIngrese el valor de (a)...");
				double a = Double.parseDouble(sc.nextLine());
				System.out.println("\nIngrese el valor de (b)...");
				double b = Double.parseDouble(sc.nextLine());
				System.out.println("\nIngrese el valor de (c)...");
				double c = Double.parseDouble(sc.nextLine());			
				System.out.println("\nlas raices son: " + 
						"\nRaiz 1: " + cr.raiz1(a, b, c) +
						"\nRaiz 2: " + cr.raiz2(a, b, c));
				raiz1 = cr.raiz1(a, b, c);
				raiz2 = cr.raiz2(a, b, c);
				break;
			}
			case 2:
			{
				System.out.println("\nLa función es: " + funcion);
				System.out.println("\nlas raices son: " + 
						"\nRaiz 1: " + raiz1 +
						"\nRaiz 2: " + raiz2);
				System.out.println("\nIngrese el límite inferior...");
				double xa = Double.parseDouble(sc.nextLine());
				System.out.println("\nIngrese el límite superior...");
				double xb = Double.parseDouble(sc.nextLine());
				try 
				{
					System.out.println("\nla raiz es: " + 
							"\nRaiz: " + cr.biseccion(xa, xb, funcion));
				} 
				catch (Exception e) 
				{
					System.out.println(e.getMessage());
				}
				break;
			}
			case 3:
			{
				System.out.println("\nLa función es: " + funcion);
				System.out.println("\nlas raices son: " + 
						"\nRaiz 1: " + raiz1 +
						"\nRaiz 2: " + raiz2);
				System.out.println("\nIngrese el límite inferior...");
				double xa = Double.parseDouble(sc.nextLine());
				System.out.println("\nIngrese el límite superior...");
				double xb = Double.parseDouble(sc.nextLine());
				try 
				{
					System.out.println("las raiz es: " + 
							"\nRaiz: " + cr.falsaPosicion(xa, xb, funcion));
				} catch (Exception e) 
				{
					System.out.println(e.getMessage());
				}
				break;
			}
			default:
			{
				System.out.println("Opción no valida.");
				break;
			}
			}
			System.out.println("\n\nSi desea volver al ménu principal... escriba (s)."
					+ "\nde lo contrario escriba cualquier otra letra. ");
			volver = sc.nextLine();
		}
		sc.close();
	}

}
