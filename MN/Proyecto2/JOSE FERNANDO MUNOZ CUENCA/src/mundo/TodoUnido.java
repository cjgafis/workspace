package mundo;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;



public class TodoUnido 
{
	//ATRIBUTOS
	
	private String funcionE;
	private double valorX;
    private double resultado;        
    private String error;   
    private JEP jep;
	
	
	//Variable que almacena las funciones a derivar
    private String funcion;
    // DJep es la clase encargada de la derivacion en su escencia
    private DJep djep;
    private Node nodoFuncion;
    private Node nodoDerivada;
    
	//METODO Evaluar

	public void setFuncion(String funcionE) // cambiar la función
    {
        this.funcionE = funcionE;
    }
    
    public void setValorX(double valorX) // cambiar el valor de X
    {
        this.valorX = valorX;
    }
    
    public double getResultadoFuncion() // obtener el resultado de la función
    {
        return resultado;
    }
    
    public String getError() // obtener el error
    {
        return error;
    }
       
    public void evaluar() // evaluar la función con un valor dado a (x)
    {   	
    	jep.addStandardFunctions();
        jep.addStandardConstants();
        jep.addVariable("x", valorX);
        jep.parseExpression(funcionE);
        resultado = jep.getValue(); 
        error = (jep.hasError())? "Existe un error.":"No hay error.";    
    }



 
	// METODO DE LA CUADRATICA 

	public double raizUno(double a, double b, double c) 
	{
		return (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a);
	}


	public double raizDos(double a, double b, double c) 
	{
		return (-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a);
	}


	//METODO PARA CALCULAR ERROR UNA MEDIDA


	public double errorAbsolutoM11(double valorVer1, double medida1)
	{
		return Math.abs(valorVer1- medida1);
	}


	public double errorRelativoM11(double errorAbsolutoM11, double valorVer1)
	{
		return errorAbsolutoM11 / valorVer1;
	}


	public double errorExactitudM11(double errorRelativoM11)
	{
		return errorRelativoM11*10;
	}


	public double exactitudM11(double errorExactitudM11)
	{
		return 100-errorExactitudM11;
	}


	//METDOD PARA CALCULAR INFINITAS MEDIDAS

	public double promedioInf(double [] medida )
	{
		double suma = 0.0;
		double promedio = 0.0;
		for(int i = 0; i < medida.length; i++)
		{
			suma = suma + medida[i];
		}
		promedio = suma / medida.length;

		return promedio;
	}



	public double errorAbsolutoInf(double [] medida )
	{
		double suma = 0.0;
		double promedio = 0.0;
		
		// Clculo del promedio
		for(int i = 0; i < medida.length; i++)
		{
			suma = suma + medida[i];
		}
		promedio = suma / medida.length;
		
		//Calculo de error de Absoluto 
		
		double suma1 = 0.0;
		for(int i = 0; i< medida.length; i++)
		{
			suma1 = suma1 +(Math.abs(medida[i]-promedio));
		}

		return suma1/medida.length;
	}



	public double errorRelativoInf(double errorAbsoluto, double promedio)
	{
		return errorAbsoluto/promedio;
	}


	public double errorPrecisionInf(double [] medida)
	{
		double suma = 0.0;
		double promedio = 0.0;
				
		// Clculo del promedio
		for(int i = 0; i < medida.length; i++)
		{
			suma = suma + medida[i];
		}
		promedio = suma / medida.length;
		
		// Calculo del error de Precision
		
		double MedidaMasLejana = 0.0;
		double diferencia = 0.0;
		double mayorDiferencia = 0.0;
		for(int i =0; i<medida.length; i++)
		{
			diferencia = Math.abs(promedio-medida[i]);

			if(diferencia > mayorDiferencia)
			{
				mayorDiferencia = diferencia;
				MedidaMasLejana = medida[i];

			}
		}
		return (Math.abs(promedio - MedidaMasLejana)/promedio)*100;
	}



	public double precisionInf(double errorPrecision)
	{
		return 100 - errorPrecision;
	}


	public double errorExactitudInf(double errorRelativoInf)
	{
		return errorRelativoInf*10;
	}


	public double exactitudInf(double errorExactitudInf)
	{
		return 100-errorExactitudInf;

	}




	//METODO PARA EVALUAR UNA FUNCION

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
	
	



	//METODO PARA CALCULAR RAICES BISECCION

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


	
	//METODO DE LA FALSA POCISION 
	
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
	
	
	
	//METODO PUNTO FIJO 
	
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
	            //djep = new DJep();
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
	    }
	    
public double puntoFijo(String gx)
{
	return -1;
}

}