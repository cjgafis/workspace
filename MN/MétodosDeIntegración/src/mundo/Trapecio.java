package mundo;

import java.util.Scanner;

public class Trapecio 
{
	// ATRIBUTOS
	private String funcion;
	private double a;
	private double b;
	private int n;
	
	// CONSTRUCTOR
	public Trapecio(String funcion, double a, double b, int n) // n >= 1
	{
		this.funcion = funcion;
		this.a = a;
		this.b = b;
		this.n = n;
	}
	
	// METODO DEL TRAPECIO
	public double metodoTrapecio()
	{
		Evaluador e1 = new Evaluador(funcion, a);
		e1.evaluar();
		double fEvalA = e1.getResultado();
		
		Evaluador e2 = new Evaluador(funcion, b);
		e2.evaluar();
		double fEvalB = e2.getResultado();
		
		double integral = 0.0;
		double delta = (b - a)/n;
		
		if(n == 1)
		{
			integral = (b-a)*((fEvalA + fEvalB) / 2);
		}
		else if(n > 1)
		{
			double [] trapecios = new double [n+1];
			double suma1 = 0.0;
			double suma2 = 0.0;
			double inicio = a;
			
			for(int i = 0; i < trapecios.length; i++)
			{			
				Evaluador e = new Evaluador(funcion, inicio);
				e.evaluar();
				trapecios[i] = e.getResultado();
				inicio += delta;
			}
			
			for(int i = 0; i < trapecios.length; i++)
			{
				if(i == 0 || i == (trapecios.length - 1))
				{
					suma1 = suma1 + trapecios[i];
				}
				else
				{
					suma2 = suma2 + trapecios[i];
				}
			}
			integral = (delta/2)*((suma1)+2*(suma2));
		}
		else
		{
			System.out.println(" el valor de n no es correcto. n >= 1");
		}
		return integral;
	}
	
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
//		System.out.println("Escriba la función a evaluar : ");
//		String funcion = sc.nextLine();
//		System.out.println("Por favor escriba un valor de (x) para evaluar la funcion: ");
//		double x = Double.parseDouble(sc.nextLine());
//		Evaluador oe = new Evaluador(funcion, x);
//		oe.evaluar();
//		System.out.println("El resultado de la evaluacion es: " + oe.getResultado() + " " + oe.getError());
		
		//-----------------------
		// METODOS DE TRAPECIO
		//-----------------------
		System.out.println("Escriba la función a evaluar : ");
		String funcion2 = sc.nextLine();
		
		System.out.println("Escriba el limite inferior : ");
		double a = Double.parseDouble(sc.nextLine());
		
		System.out.println("Escriba el limite superior : ");
		double b = Double.parseDouble(sc.nextLine());
		
		System.out.println("Escriba el numero de divisiones (n) : ");
		int n = Integer.parseInt(sc.nextLine());
		Trapecio tp = new Trapecio(funcion2, a, b, n);
		System.out.println("La integral por el método del trapecio es: " + tp.metodoTrapecio());
		
		sc.close();
	}

}
