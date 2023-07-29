package mundo;

/**
 * By: Vanesa Zamora - 2520202030
 */

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculoRaiz 
{

	private String funcion = "";
	private double resultado = 0.0;

	private JEP jep;

	//Atributos para derivar
	private DJep djep;
	private Node nodoFuncion;
	private Node nodoDerivada;
	private String error = "";
	

	
	public double getResultadoFuncion(){
        return this.resultado;
    }

	//CUADRATICA//

	/**
	 * Retorna el resultado de la formula cuadratica para el valor positivo
	 * @param guarda el valor de la primera variable (a)
	 * @param guarda el valor de la segunda variable (b)
	 * @param guarda el valor de la tercera variable (c)
	 * @return el valor de la raiz positiva
	 */
	public double formulaCuadraticaPositiva(double a, double b, double c)	{
		double raiz = Math.sqrt(b*b - 4*a*c);

		if(a == 0 || !(raiz>=0)) 
		{
			return 0; 
		}
		else 
		{
			return (-b + Math.sqrt(b*b - 4*a*c))/(2*a);	
		}
	}

	/**
	 * Retorna el resultado de la formula cuadratica para el valor negativo
	 * @param guarda el valor de la primera variable (a)
	 * @param guarda el valor de la segunda variable (b)
	 * @param guarda el valor de la tercera variable (c)
	 * @return el valor de la raiz negativa
	 */
	public double formulaCuadraticaNegativo(double a, double b, double c)	{
		double raiz = Math.sqrt(b*b - 4*a*c);

		if(a==0 || !(raiz>=0) ) {
			return 0; 
		}
		else {
			return (-b - raiz)/(2*a);	
		}
	}
	
	// METODO PARA EVALUAR UN VALOR EN UNA FUNCION
	public double evaluar(String funcion, double valorX) throws Exception
	{   
		double resultado = 0.0;
		jep = new JEP();
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

	//METODOS DERIVAR FUNCION
	public void setFuncionADerivar(String funcion) {
		this.funcion = funcion;
	}

	public String getFuncionDerivada() {
		return this.funcion;
	}

	public String Derivar(String funcion) {

		try {

            djep = new DJep();
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
            nodoFuncion = this.djep.parse(this.funcion);

            // deriva la funcion con respecto a x
            Node diff = this.djep.differentiate(nodoFuncion, "x");

            // Simplificamos la funcion con respecto a x
            nodoDerivada = this.djep.simplify(diff);

            // Convertimos el valor simplificado en un String
            funcion = this.djep.toString(this.nodoDerivada);

        } catch (ParseException e) {
            funcion = "NaN";
            System.out.println("Error: " + e.getErrorInfo());
        }
		return funcion;

	}

	// METODOS ABIERTOS //
	
	//	public double newtonRaphson(String funcionFx, double Xi) throws Exception
	//	{
	//		JOptionPane.showMessageDialog(null, "Error al calcular :(", "Auch" , JOptionPane.ERROR_MESSAGE);
	//
	//		try 
	//		{
	//			double fxi = evaluar(funcionFx, Xi);
	//
	//			String derivada = derivar(funcionFx);
	//			double dfxi = evaluar(derivada, Xi);
	//
	//			double error = 100;
	//
	//			while(error>0.0000001)
	//			{
	//				double ant = Xi;
	//				Xi = Xi - (fxi/dfxi);
	//
	//				fxi = evaluar(funcionFx,Xi);
	//				dfxi = evaluar(derivada, Xi);
	//
	//				error = Math.abs((Xi-ant)/Xi)*100;
	//			}
	//			return Xi;
	//		}
	//		catch(Exception e)
	//		{
	//			throw new Exception ("Error al derivar la funcion");
	//		}
	//
	//	}
	
	// Newton Rapshon //
		public double newtonRaphson(String funcionFX, String derivada, double xi) throws Exception 
		{
			xi = 0;
			double fxi = evaluar(funcionFX, xi);
			double dfxi = evaluar(derivada, xi);
			double errorA = 100;
			
			while (errorA > 0.0000001)
			{
				fxi = evaluar(funcionFX,resultado);
				dfxi = evaluar(derivada,resultado);
				double xiAnterior = xi;
				resultado = xi-(fxi/dfxi);
				xi = resultado;

				errorA = Math.abs(resultado-xiAnterior/resultado)*100;
			}
			return resultado;
		}
	
	// Punto Fijo //

	public double puntoFijo(String funcionGx, double x0) throws Exception
	{
		try
		{
			double fxi = evaluar(funcionGx, x0);
			double error = Math.abs((fxi-x0)/fxi)*100;

			while (error > 0.000001)
			{
				
				double fxiAnt = fxi;

				fxi = evaluar(funcionGx, fxiAnt);
				error = Math.abs((fxi-fxiAnt)/fxi)*100;
				
			}
			return fxi;
		}
		catch(Exception e)
		{
			throw new Exception ("Error en la funcion :(");
		}
	}
	
	/**
	 * 
	 * @param args
	 */
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
						"\nRaiz 1: " + cr.formulaCuadraticaPositiva(a, b, c) +
						"\nRaiz 2: " + cr.formulaCuadraticaNegativo(a, b, c));
				raiz1 = cr.formulaCuadraticaPositiva(a, b, c);
				raiz2 = cr.formulaCuadraticaNegativo(a, b, c);
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
