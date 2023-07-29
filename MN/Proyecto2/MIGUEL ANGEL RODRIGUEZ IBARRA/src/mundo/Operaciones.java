package mundo;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;



public class Operaciones 
{
	//ATRIBUTOS

	private String funcionE;
	private double valorX;
	private double resultado;        
	private String error;   
	private JEP jep;



	private String funcion;
	private DJep djep;
	private Node nodoFuncion;
	private Node nodoDerivada;


	public void setFuncion(String funcionE) 
	{
		this.funcionE = funcionE;
	}

	public void setValorX(double valorX) 
	{
		this.valorX = valorX;
	}

	public double getResultadoFuncion() 
	{
		return resultado;
	}

	public String getError()
	{
		return error;
	}

	public void evaluar() 
	{   	
		jep.addStandardFunctions();
		jep.addStandardConstants();
		jep.addVariable("x", valorX);
		jep.parseExpression(funcionE);
		resultado = jep.getValue(); 
		error = (jep.hasError())? "Existe un error.":"No hay error.";    
	}






	public double raizUno(double a, double b, double c) 
	{
		return (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a);
	}


	public double raizDos(double a, double b, double c) 
	{
		return (-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a);
	}

	public double evaluar(String funcion, double valorX) throws Exception
	{
		double resultado = 0.0;
		JEP jep = new JEP();
		jep.addStandardFunctions();
		jep.addStandardConstants();
		jep.addVariable("x", valorX);
		jep.parseExpression(funcion);
		resultado = jep.getValue();

		if(! jep.hasError())
		{
			return resultado;
		}
		else 
		{
			throw new Exception("Hay Error.");
		}

	}


	public double biseccion(double lIf, double lSur, String funcion)throws Exception
	{
		double lIfEvaluarEnLaF = evaluar(funcion, lIf);
		double lSurEvaluarEnLaF = evaluar(funcion, lSur);

		//-----------------------------------------
		double xRActual = (lIf + lSur)/2;
		//---------------------------------------
		double xRActualEvaluandoEnLaF = evaluar(funcion, xRActual);
		double xRAnterior = 1;
		double errorAproximado = 1;
		double respuesta = 0.0;

		if(((lIfEvaluarEnLaF)>0)&&((lSurEvaluarEnLaF)<0)||((lIfEvaluarEnLaF)<0)&&((lSurEvaluarEnLaF)>0))
		{
			while (xRActualEvaluandoEnLaF !=0 && errorAproximado >0.0000001)
			{
				xRActual = (lIf + lSur)/2;
				errorAproximado = Math.abs((xRActual - xRAnterior)/ xRActual)*100;
				xRActualEvaluandoEnLaF = evaluar(funcion,xRActual);
				if((lIfEvaluarEnLaF * xRActualEvaluandoEnLaF)< 0)
				{
					lSur = xRActual;
				}
				else if ((lIfEvaluarEnLaF * xRActualEvaluandoEnLaF )>0)
				{
					lIf = xRActual;
				}

				else if ((lIfEvaluarEnLaF * xRActualEvaluandoEnLaF )== 0)
				{
					respuesta = xRActual;
				}
				xRAnterior = xRActual;
				lIfEvaluarEnLaF = evaluar(funcion, lIf);
			}
			respuesta = xRActual;
		}
		else
		{
			throw new Exception ("El Rango Ingresado No Es Valido");
		}

		return respuesta;	

	}


	public double falsaPocisicion(double lIn, double lSup, String funcion) throws Exception
	{
		double lInEvaluandoEnLaF = evaluar(funcion, lIn);
		double lSupEvaluandoEnLaF = evaluar(funcion,lSup);
		//------------------------------------------------------------------------------------------------------------
		double xRActual =(lIn*lSupEvaluandoEnLaF - lSup * lInEvaluandoEnLaF)/(lSupEvaluandoEnLaF - lInEvaluandoEnLaF );
		//------------------------------------------------------------------------------------------------------------
		double xRActualEvaluandoEnLaF = evaluar(funcion,xRActual);
		double xRAnterior = 1;
		double errorAproximado = 1;
		double respuesta = 0.0;

		if(((lInEvaluandoEnLaF)>0)&&((lSupEvaluandoEnLaF)<0)||((lInEvaluandoEnLaF)<0)&&((lSupEvaluandoEnLaF)>0))
		{
			while(xRActualEvaluandoEnLaF !=0&& errorAproximado>0.000001)
			{
				xRActual =(lIn*lSupEvaluandoEnLaF - lSup * lInEvaluandoEnLaF)/(lSupEvaluandoEnLaF - lInEvaluandoEnLaF );
				errorAproximado = Math.abs((xRActual - xRAnterior )/xRActual)*100;
				xRActualEvaluandoEnLaF = evaluar(funcion,xRActual);

				if((lInEvaluandoEnLaF * xRActualEvaluandoEnLaF )<0)
				{
					lSup = xRActual;
				}

				else if((lInEvaluandoEnLaF * xRActualEvaluandoEnLaF )>0)
				{
					lIn = xRActual;
				}
				else if((lInEvaluandoEnLaF * xRActualEvaluandoEnLaF )==0)
				{
					respuesta = xRActual;
				}
				xRAnterior = xRActual;
				lInEvaluandoEnLaF = evaluar(funcion,lIn);
			}
			respuesta = xRActual;
		}
		else 
		{
			throw new Exception("El Rango Ingresado No Es Valido.");
		}
		return respuesta;
	}


	public void setFuncionADerivar(String funcion) 
	{
		this.funcion = funcion;
	}

	public String getFuncionDerivada() 
	{
		return funcion;
	}

	public void derivar() 
	{
		try 
		{

			djep.addStandardFunctions();

			djep.addStandardConstants();

			djep.addComplex();

			djep.setAllowUndeclared(true);

			djep.setAllowAssignment(true);

			djep.setImplicitMul(true);

			djep.addStandardDiffRules();

			nodoFuncion = djep.parse(funcion);

			Node diff = djep.differentiate(nodoFuncion, "x");

			nodoDerivada = djep.simplify(diff);
			funcion = djep.toString(nodoDerivada);

		} 
		catch (ParseException e) 
		{
			funcion = "NaN";
			System.out.println("Error: " + e.getErrorInfo());
		}
	}

	public double puntoFijo(String gx)
	{
		return -1;
	}

	public double NewtonRaphson(double lIn, double lSup, String funcion) throws Exception
	{
		return lSup;


	}



}