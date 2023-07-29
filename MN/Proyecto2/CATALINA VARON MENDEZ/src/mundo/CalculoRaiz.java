// https://www.laneros.com/temas/ayuda-correguir-programa-en-java-sacar-la-derivada-de-una-funcion-utilizando-libreria-jep.145575/
// https://codigosdeabner.blogspot.com/2017/03/evaluar-funciones-en-java.html

package mundo;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class CalculoRaiz 

{
	//Variable que almacena las funciones a derivar
	private String funcionFx;
	// DJep es la clase encargada de la derivacion en su escencia
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

	//METODOS ABIERTOS
	public double puntoFijo(String funcionGx, double xi) throws Exception {
		try {
			double Fxi = evaluar(funcionGx, xi);
			double error = Math.abs((Fxi-xi)/Fxi)*100;

			while(error> 0.00001) {
				double fxiAnt = Fxi;
				Fxi = evaluar(funcionGx,fxiAnt);
				error = Math.abs((Fxi - fxiAnt)/Fxi)*100;

			}
			return Fxi;
		}
		catch(Exception e) {
			throw new Exception("Error en la funcion");
		}


	}

	//DERIVADA
	//???
	public void calculoRaiz (String funcion) 
	{
		System.out.println("Inicializo djep");
		this.funcionFx = funcion;
		djep = new DJep();
	}
	

	public void setFuncionADerivar(String funcion) 
	{
		this.funcionFx = funcion;
	}

	public String getFuncionDerivada() 
	{
		return funcionFx;
	}

	// METODO PARA EVALUAR UN VALOR EN UNA FUNCION
	public double evaluar(String funcion, double valorX ) throws Exception
	{   
		double resultado = 0.0;
		JEP jep = new JEP();
		jep.addStandardFunctions();
		jep.addStandardConstants();
		jep.addVariable( "x", valorX );
		jep.parseExpression( funcion );
		resultado = jep.getValue(); 

		if( jep.hasError() ){
			throw new Exception("Hay error al evaluar.");
		}
		else
		{
			return resultado;
		}      
	}

	//METODOS DERIVAR FUNCION
	public String derivar( String funcion ) 
	{
		System.out.println("Inicializo djep");
		djep = new DJep();
		
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
			// djep.addStandardDiffRules();

			// coloca el nodo con una funcion preestablecida
			nodoFuncion = djep.parse(funcion);

			// deriva la funcion con respecto a x
			Node diff = djep.differentiate(nodoFuncion, "x");

			// Simplificamos la funcion con respecto a x
			nodoDerivada = djep.simplify(diff);

			// Convertimos el valor simplificado en un String
			funcion = djep.toString(nodoDerivada);

		} 
		catch (ParseException e){
			funcion = "NaN";
			System.out.println("Error: " + e.getErrorInfo());
		}
		return funcion;
	}

	//Newton
	public double newtonRaphson(String funcionFx, double xi )throws Exception
	{
		try 
		{
			// calculoRaiz(funcionFx);
			
			System.out.println("1. funcion: " + funcionFx + " " + xi );
			double fxi = evaluar( funcionFx, xi );
			String derivada = derivar( funcionFx );
			System.out.println("2. derivada: " + derivada );
			double dfxi = evaluar(derivada, xi);

			double error = 100;
			while( error > 0.0000001 ){
				double ant = xi;
				xi = xi - (fxi/dfxi) ;
				fxi = evaluar(funcionFx, xi);
				dfxi = evaluar(derivada, xi);
				error = Math.abs((xi-ant)/xi)*100;
			}
			return xi;
		}
		catch (Exception e) {
			System.out.println("Error al derivar" );			
			throw new Exception ("Error al derivar ");
		}
	}

}
