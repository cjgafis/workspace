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

	// Método para calcular una raiz Por Punto Fijo

	public double puntoFijo (String funcionGx, double x0) throws Exception 
	{
		try 
		{
			double Fxi = evaluar(funcionGx, x0);
			double error = Math.abs((Fxi-x0)/Fxi) * 100;
			//javax.swing.JOptionPane.showMessageDialog(null, "calculando");
			while (error > 0.000001)
			{
				double fxiAnt = Fxi;
				Fxi = evaluar(funcionGx, fxiAnt);
				error = Math.abs((Fxi - fxiAnt)/Fxi) * 100;
			}

			return Fxi;
		}
		catch(Exception e)
		{
			throw new Exception("Error en la Función");
		}
	}
	// Derivar 
	
	private DJep djep;
	private Node nodoFuncion;
	private Node nodoDerivada;
	
	public String derivar(String funcion) 
	{
		try 
		{
			// Agrega funciones estandares cos(x), sin(x)
			djep.addStandardFunctions();

			// Agrega constantes estandares, pi, e, etc
			djep.addStandardConstants();

			// Por si existe algun numero complejo
			djep.addComplex();

			// Permite variables no declarables
			djep.setAllowUndeclared(true);

			// Permite asignaciones
			djep.setAllowAssignment(true);

			// Regla de multiplicacion o para sustraccion y sumas
			djep.setImplicitMul(true);

			// Regla de multiplicacion o para sustraccion y sumas
			djep.addStandardDiffRules();

			// Coloca el nodo con una funcion preestablecida
			nodoFuncion = djep.parse(funcion);

			// Deriva la funcion con respecto a x
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
	
	
	// Método para calcular una raiz por NewtonRaphson
	
	String funcion;
	double xi;
	double xs;
	
	public double newtonRaphson(String funcion,double xi) throws Exception
	{
		
		double respuesta = 0.0;
		double fxi = evaluar(funcion, xi);
		double fxs = evaluar(funcion, xs);
		double xr = (xs + xi) / 2;
		double fxr = evaluar(funcion, xr);
		String dfx = derivar(funcion);
		double dfxr = evaluar(dfx, xr);
		double xrLaOtra = xr - (fxr/dfxr);
		double ea = 1;

		if((fxi < 0 && fxs > 0) || (fxi > 0 && fxs < 0))
		{
			while (ea > 0.0000001)
			{
				xr = xrLaOtra;
				fxr = evaluar(funcion, xr);
				dfxr = evaluar(dfx, xr);
				xrLaOtra = xr - (fxr/dfxr);
				ea = Math.abs(xr - xrLaOtra) / xrLaOtra;
			}
			respuesta = xr;
		}
		else
		{
			throw new Exception("Los limites de la funcion son invalidos");
		}
		return respuesta;
	}
}

