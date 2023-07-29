package mundo;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class CalculoRaiz 
{
	//Métodos para la Función Cuadrática

	public double raiz1(double a, double b, double c)
	{
		return (-b + Math.sqrt((Math.pow(b, 2)-4*a*c))) /(2*a);	
	}

	public double raiz2(double a, double b, double c)
	{
		return (-b - Math.sqrt((Math.pow(b, 2)-4*a*c))) /(2*a);	
	}

	//Método para evaluar un valor de una función

	public double evaluar(String funcion, double valorX) throws Exception
	{
		double resultado = 0.0;
		JEP jep = new JEP();
		jep.addStandardFunctions();
		jep.addStandardConstants();
		jep.addVariable("X", valorX);
		jep.parseExpression(funcion);
		resultado = jep.getValue();

		if(!jep.hasError())
		{
			return resultado;
		}
		else
		{
			throw new Exception("Existe un Error");
		}
	}

	//Método para el calculo de Raices por Bisección

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


	//Método para hallar las raices por el método de la Falsa Posición

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

	//Métodos Abiertos 

	// Derivar 

	public String derivar(String funcion)throws Exception
	{
		try
		{
			DJep djep = new DJep();

			djep.addStandardDiffRules();
			djep.addStandardFunctions();
			djep.addStandardConstants();
			djep.addComplex();
			djep.setAllowUndeclared(true);
			djep.setAllowAssignment(true);
			djep.setImplicitMul(true);


			Node nodoFuncion = djep.parse(funcion);

			Node diff = djep.differentiate(nodoFuncion, "x");

			Node nodoDerivada = djep.simplify(diff);

			funcion = djep.toString(nodoDerivada);
		}
		catch(ParseException e)
		{
			funcion = "Hay un error en la funci n ingresada";
			throw new ParseException(funcion + e.getErrorInfo());
		}

		return funcion;
	}

	public double puntoFijo(String funcion, double x0) throws Exception	
	{

		try 
		{
			double Fxi = evaluar(funcion, x0);	
			double error = Math.abs((Fxi-x0)/Fxi)*100;

			while(error>0.000001) 
			{
				double fxiAnt = Fxi;

				Fxi = evaluar(funcion, fxiAnt);				
				error = Math.abs((Fxi - fxiAnt)/Fxi)*100;
			}

			return Fxi;
		}
		catch(Exception e)	
		{
			throw new Exception("Error en la función");
		}
	}

	public double newtonRaphson(String funcion, double xi) throws Exception 
	{
		try 
		{
			double fxi = evaluar(funcion, xi);

			String derivada = derivar(funcion);
			double dfxi = evaluar(derivada, xi);

			double error = 100;

			while(error>0.0000001)	
			{
				double ant = xi;
				xi = xi - (fxi/dfxi);

				fxi = evaluar(funcion, xi);
				dfxi = evaluar(derivada, xi);

				error = Math.abs((xi-ant)/xi)*100;
			}

			return xi;
		}
		catch(Exception e) 
		{
			throw new Exception("Error derivando la funcion");
		}
	}
}

