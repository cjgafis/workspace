package Mundo;

import java.util.ArrayList;
import java.util.Collections;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class Metodos 
{
	// ATRIBUTOS ECUACION CUADRATICA
	private double a;
	private double b;
	private double c;

	// ATRIBUTOS EVALUAR FUNCION
	private String funcion;
	private double resultado;        
	private String error;   
	private JEP jep;

	// ATRIBUTOS DERIVAR FUNCION
	private DJep djep;
	private Node nodoFuncion;
	private Node nodoDerivada;

	// ATRIBUTOS TEORIA DEL ERROR
	private ArrayList<String> todasLasMedidas= new ArrayList<String>();
	private ArrayList<Double> absList= new ArrayList<Double>();
	private double medida;
	private double valorVerdadero;

	// ATRIBUTOS METODOS CERRADOS
	private double xi;
	private double xs;

	// CONSTRUCTOR ECUACION CUADRATICA
	public Metodos(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// CONSTRUCTOR DERIVAR FUNCION
	public Metodos(String funcion) 
	{
		this.funcion = funcion;
		djep = new DJep();
	}

	// CONSTRUCTOR METODOS ABIERTOS - FUNCION
	public Metodos(String funcion,  double xi, double xs) 
	{
		this.funcion = funcion;
		this.xi = xi;
		this.xs = xs;
	}

	// CONSTRUCTOR TEORIA DEL ERROR
	public Metodos(double medida, double valorVerdadero)
	{
		this.medida = medida;
		this.valorVerdadero = valorVerdadero;
	}

	public Metodos(ArrayList<String> todasLasMedidas)
	{
		this.todasLasMedidas = todasLasMedidas;
	}

	// CONSTRUCTOR METODOS CERRADOS
	public Metodos(double a, double b, double c, double xi, double xs)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.xi = xi;
		this.xs = xs;
	}

	// METODOS GET - SET
	public double getA() 
	{
		return a;
	}

	public void setA(double a) 
	{
		this.a = a;
	}

	public double getB() 
	{
		return b;
	}

	public void setB(double b) 
	{
		this.b = b;
	}

	public double getC() 
	{
		return c;
	}

	public void setC(double c) 
	{
		this.c = c;
	}

	public void setFuncion(String funcion) // cambiar la función
	{
		this.funcion = funcion;
	}

	public double getResultadoFuncion() // obtener el resultado de la función
	{
		return resultado;
	}

	public String getError() // obtener el error
	{
		return error;
	}

	public void setFuncionADerivar(String funcion) 
	{
		this.funcion = funcion;
	}

	public String getFuncionDerivada() 
	{
		return funcion;
	}

	public ArrayList<String> getTodasLasMedidas()
	{
		return todasLasMedidas;
	}

	public void setMedidas(ArrayList<String> todasLasMedidas)
	{
		this.todasLasMedidas = todasLasMedidas;
	}

	public double getmedida()
	{
		return medida;
	}

	public void setmedida(double medida)
	{
		this.medida = medida;
	}

	public double getValorVerdadero()
	{
		return valorVerdadero;
	}

	public void setValorVerdadero(double valorVerdadero)
	{
		this.valorVerdadero = valorVerdadero;
	}

	public double getXi()
	{
		return xi;
	}

	public void setXi(double xi)
	{
		this.xi = xi;
	}

	public double getXs()
	{
		return xs;
	}

	public void setXs(double xs)
	{
		this.xs = xs;
	}

	// METODOS ECUACION CUADRATICA
	public double raiz1()
	{
		double respuesta = 0.0;
		double raiz = 0.0;
		raiz = Math.sqrt((b * b) - (4 * a * c));
		respuesta = (-b + raiz) / (2 * a);
		return respuesta;
	}

	public double raiz2()
	{
		double respuesta = 0.0;
		double raiz = 0.0;
		raiz = Math.sqrt((b * b) - (4 * a * c));
		respuesta = (-b - raiz) / (2 * a);
		return respuesta;
	}

	//METODOS EVALUAR FUNCION
	public double evaluar(String funcion, double valorX) throws Exception
	{
		double resultado = 0.0;
		//this.funcion = funcion;
		jep.addStandardFunctions();
		jep.addStandardConstants();
		jep.addVariable("x", valorX);
		jep.parseExpression(funcion);
		resultado = jep.getValue(); 
		if (!jep.hasError())
		{
			return resultado;
		}
		else
		{
			throw new Exception("Hay error");
		}    
	}
	
	//METODOS DERIVAR FUNCION
	public String derivar(String funcion) 
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
	
	//METODOS ERRORES
	public double errorAbsoluto()
	{
		double sumatoria = 0.0;
		double medidaPromedio = 0.0;
		double abs = 0.0;
		for(int i = 0; i < todasLasMedidas.size(); i++)
		{
			sumatoria = sumatoria + Double.parseDouble(todasLasMedidas.get(i));
			medidaPromedio = sumatoria / todasLasMedidas.size();
		}
		for(int i = 0; i < todasLasMedidas.size(); i++)
		{
			abs = abs + Math.abs(Double.parseDouble(todasLasMedidas.get(i)) - medidaPromedio);
		}
		return abs / todasLasMedidas.size();
	}
	
	public double errorAbsoluto1Medida()
	{
		return Math.abs(valorVerdadero - medida);
	}
	
	public double errorRelativo()
	{
		double sumatoria = 0.0;
		double medidaPromedio = 0.0;
		for(int i = 0; i < todasLasMedidas.size(); i++)
		{
			sumatoria = sumatoria + Double.parseDouble(todasLasMedidas.get(i));
		}
		medidaPromedio = sumatoria / todasLasMedidas.size();

		return errorAbsoluto() / medidaPromedio;
	}
	
	public double errorRelativo1Medida()
	{
		return errorAbsoluto1Medida() / valorVerdadero;
	}
	
	public double porcentajeErrorExactitud()
	{
		return errorRelativo() * 100;
	}
	
	public double porcentajeErrorExactitud1Medida()
	{
		return errorRelativo1Medida() * 100;
	}
	
	public double porcentajeErrorPresicion()
	{
		double resultado = 0.0;
		double medidaPromedio = 0.0;
		double sumatoria = 0.0;
		for(int i = 0; i < todasLasMedidas.size(); i++)
		{
			sumatoria = sumatoria + Double.parseDouble(todasLasMedidas.get(i));
		}
		medidaPromedio = sumatoria / todasLasMedidas.size();
		resultado =  ((Math.abs(medidaPromedio - maxNum()) / medidaPromedio) * 100);
		return resultado;
	}
	
	public double maxNum()
	{
		double max = 0.0;
		double medidaPromedio = 0.0;
		double sumatoria = 0.0;
		for (int i = 0; i < todasLasMedidas.size(); i++)
		{
			sumatoria = sumatoria + Double.parseDouble(todasLasMedidas.get(i));
		}
		medidaPromedio = sumatoria / todasLasMedidas.size();
		for (int i = 0; i < todasLasMedidas.size(); i++)
		{
			absList.add(Math.abs(Double.parseDouble(todasLasMedidas.get(i)) - medidaPromedio));
		}
		max = Collections.max(absList);
		return max + medidaPromedio;
	}
	
	public double exactitud()
	{
		return 100 - porcentajeErrorExactitud();
	}
	
	public double exactitud1Medida()
	{
		return 100 - porcentajeErrorExactitud1Medida();
	}
	
	public double presicion()
	{
		return 100 - porcentajeErrorPresicion();
	}

	//METODOS CERRADOS
	public double biseccion() throws Exception
	{
		double respuesta = 0.0;
		double xr = (xi + xs) / 2;
		double xrDelPasado = 0.0;
		double ea = 1;
		double fxi = (a * Math.pow(xi, 2)) + (b * xi) + c;
		double fxs = (a * Math.pow(xs, 2)) + (b * xs) + c;
		double fxr = (a * Math.pow(xr, 2)) + (b * xr) + c;

		if ((fxi * fxs < 0) && (fxi * fxs != 0))
		{
			while (fxr != 0 && ea > 0.000001)
			{
				xr = (xi + xs) / 2;
				ea = Math.abs((xr - xrDelPasado) / xr) * 100;
				fxr = (a * Math.pow(xr, 2)) + (b * xr) + c;

				if (fxi * fxr < 0)
				{
					xs = xr;
				}
				else if (fxi * fxr > 0)
				{
					xi = xr;
				}
				else if (fxi * fxr == 0)
				{
					respuesta = xr;
				}
				xrDelPasado = xr;
				fxi = (a * Math.pow(xi, 2)) + (b * xi) + c;
			}
			respuesta = xr;
		}
		else if (fxi == 0)
		{
			respuesta = xi;
		}
		else if (fxs == 0)
		{
			respuesta = xs;
		}
		else
		{
			throw new Exception ("Los limites son incorrectos");
		}
		return respuesta;
	}
	
	public double falsaPosicion() throws Exception
	{
		double respuesta = 0.0;
		double fxi = (a * Math.pow(xi, 2)) + (b * xi) + c;
		double fxs = (a * Math.pow(xs, 2)) + (b * xs) + c;
		double xr = ((xi * fxs) - (xs * fxi)) / (fxs - fxi);
		double xrPast = 0.0;
		double ea = 1;
		double fxr = (a * Math.pow(xr, 2)) + (b * xr) + c;

		if (((fxi < 0 && fxs > 0) || (fxi > 0 && fxs < 0)) && fxi * fxs != 0)
		{
			while (fxr != 0 && ea > 0.000001)
			{
				xr = ((xi * fxs) - (xs * fxi)) / (fxs - fxi);
				fxr = (a * Math.pow(xr, 2)) + (b * xr) + c;
				ea = Math.abs((xr - xrPast) / xr) * 100;

				if (fxi * fxr < 0)
				{
					xs = xr;
				}
				else if (fxi * fxr > 0)
				{
					xi = xr;
				}
				else if (fxi * fxr == 0)
				{
					respuesta = xr;
				}
				xrPast = xr;
				fxi = (a * Math.pow(xi, 2)) + (b * xi) + c;
				fxs = (a * Math.pow(xs, 2)) + (b * xs) + c;
			}
			respuesta = xr;
		}
		else if (fxi == 0)
		{
			respuesta = xi;
		}
		else if (fxs == 0)
		{
			respuesta = xs;
		}
		else
		{
			throw new Exception("Los limites son incorrectos");
		}
		return respuesta;
	}	

	//METODOS ABIERTOS
	public double puntoFijo() throws Exception
	{
		double respuesta = 0.0;
		String funcion = this.funcion;
		double xr = (xi + xs) / 2;
		double fxr = evaluar(funcion, xr);
		String dfx = derivar(funcion);
		double dfxr = evaluar(dfx, xr);
		double ea = 1;

		if (dfxr <= 1 && dfxr >= -1)
		{
			while (ea > 0.0000001)
			{
				fxr = evaluar(funcion, xr);
				ea = Math.abs(fxr - xr);
				xr = fxr;
				System.out.println(xr);
				System.out.println(fxr);
			}
			respuesta = fxr;
		}
		else
		{
			throw new Exception("El despeje de la funcion es invalido");
		}
		return respuesta;

	}
	
	public static void main(String[] args) 
	{
		String funcion = "(-x+6)^1/3";
		double xi = 1;
		double xs = 2;
		Metodos todo;
		todo = new Metodos(funcion, xi, xs);
		try 
		{
			System.out.println("el resultado:  "  +todo.puntoFijo());
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public double newtonRaphson() throws Exception
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
