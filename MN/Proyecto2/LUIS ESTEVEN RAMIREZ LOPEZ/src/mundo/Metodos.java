package mundo;

import java.util.Scanner;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class Metodos
{
	
	private DJep djep;
	private Node nodoFuncion;
	private Node nodoDerivada;

	
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
				System.out.println("Iteracion: " + contador + " - Raiz: " + xRActual);
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

	// METODO PARA EL CALCULO DE RAICES POR FALSA POSICION O REGLA FALSA

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
				System.out.println("Iteracion: " + contador + " - Raiz: " + xRActual);
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

	
	// METODO PARA EL CALCULO DE RAICES POR PUNTO FIJO
	
	public double puntoFijo(String funcionGx, double x0) throws Exception
	{
		try
		{
			double Fxi = evaluar(funcionGx, x0);
			double error = Math.abs((Fxi-x0)/Fxi)*100;
			while(error>0.00001)
			{
				double fxiAnt=Fxi;
				
				Fxi = evaluar(funcionGx, fxiAnt);
				error = Math.abs((Fxi-fxiAnt)/Fxi)*100;
				
			}
			return Fxi;
		}
		catch(Exception e)
		{
			throw new Exception("Error en la funcion");
		}
	}
	
	
	
	// METODO PARA EL CALCULO DE RAICES POR NEWTON
	
	public double newton(String funcion, double xi) throws Exception
	{
		double respuesta = 0.0;
		double fxi = evaluar(funcion, xi);
		String dfx = derivar(funcion);
		double dfxi = evaluar(funcion, xi);
		double xSig = xi - (fxi/dfxi);
		double ea = 1;

		if((fxi < 0 && dfxi > 0) || (fxi > 0 && dfxi < 0))
		{
			while (ea > 0.0000001)
			{
				respuesta = xSig;
				fxi = evaluar(funcion, xi);
				dfxi = evaluar(dfx, xi);
				xSig = xi - (fxi/dfxi);
				ea = Math.abs(xi - xSig) / xSig;
			}
			respuesta = xSig;
		}
		else
		{
			throw new Exception("Hay un error");
		}
		return respuesta;
	}

	private String derivar(String funcion) 
	{
		try 
		{
			// agrega funciones estandares cos(x), sin(x)
			djep.addStandardFunctions();

			// agrega constantes estandares, pi, e, etc
			djep.addStandardConstants();

			// por si existe algun numero complejo
			djep.addComplex();

			// permite variables no declarables
			djep.setAllowUndeclared(true);

			// permite asignaciones
			djep.setAllowAssignment(true);

			// regla de multiplicacion o para sustraccion y sumas
			djep.setImplicitMul(true);

			// regla de multiplicacion o para sustraccion y sumas
			djep.addStandardDiffRules();

			// coloca el nodo con una funcion preestablecida
			nodoFuncion = djep.parse(funcion);

			// deriva la funcion con respecto a x
			Node diff = djep.differentiate(nodoFuncion, "x");

			// Simplificamos la funcion con respecto a x
			nodoDerivada = djep.simplify(diff);

			// Convertimos el valor simplificado en un String
			funcion = djep.toString(nodoDerivada);

		} 
		catch (ParseException e) 
		{
			funcion = "NaN";
			System.out.println("Error: " + e.getErrorInfo());
		}
		return funcion;
	}
	
	
	
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		Metodos cr = new Metodos();
		double raiz1 = 0.0;
		double raiz2 = 0.0;
		System.out.println("Ingrese la funcion: ");
		String funcion = sc.nextLine();		

		String volver = "s";
		while(volver.equals("s"))
		{
			System.out.println("========== Menu ==========");
			System.out.println("1. Calculo de raices mediante funcion cuadratica.");
			System.out.println("2. Calculo de raices por el metodo de la Biseccion.");
			System.out.println("3. Calculo de raices por metodo de la Falsa Posicion.");
			System.out.println("\n\nIngrese el número de la opcion deseada...");
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
				System.out.println("\nLa funcion es: " + funcion);
				System.out.println("\nlas raices son: " + 
						"\nRaiz 1: " + raiz1 +
						"\nRaiz 2: " + raiz2);
				System.out.println("\nIngrese el limite inferior...");
				double xa = Double.parseDouble(sc.nextLine());
				System.out.println("\nIngrese el limite superior...");
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
				System.out.println("\nLa funcion es: " + funcion);
				System.out.println("\nlas raices son: " + 
						"\nRaiz 1: " + raiz1 +
						"\nRaiz 2: " + raiz2);
				System.out.println("\nIngrese el limite inferior...");
				double xa = Double.parseDouble(sc.nextLine());
				System.out.println("\nIngrese el limite superior...");
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
				System.out.println("Opcion no valida.");
				break;
			}
			}
			System.out.println("\n\nSi desea volver al menu principal... escriba (s)."
					+ "\nde lo contrario escriba cualquier otra letra. ");
			volver = sc.nextLine();
		}
		sc.close();
	}

}
