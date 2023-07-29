package mundo;

import java.util.ArrayList;
import java.util.Scanner;

public class Romberg 
{
	// ATRIBUTOS
	private String funcion;
	private double a;
	private double b;
	private int nivel;

	// CONSTRUCTOR
	public Romberg(String funcion, double a, double b, int nivel) // nivel > 0 && nivel <= 3
	{
		this.funcion = funcion;
		this.a = a;
		this.b = b;
		this.nivel = nivel;
	}

	public double integracionRomberg()
	{
		double t0_2 = 0.0;
		double t0_4 = 0.0;
		double t0_8 = 0.0;
		double t0_16 = 0.0;
		double t1_2 = 0.0;
		double t1_4 = 0.0;
		double t1_8 = 0.0;
		double t2_2 = 0.0;
		double t2_4 = 0.0;
		double t3_2 = 0.0;
		double respuesta = 0.0;

		int n = (int) Math.pow(2,(nivel+1));
		ArrayList<Double> valoresNivelCero = new ArrayList<Double>();

		while(n != 1)
		{
			Trapecio tp = new Trapecio(funcion, a, b, n);
			double valorIntegral = tp.metodoTrapecio();
			valoresNivelCero.add(valorIntegral);
			System.out.println(valorIntegral);
			n = n/2;
		}
		if(nivel == 3)
		{
			t0_16 = valoresNivelCero.get(0);
			t0_8 = valoresNivelCero.get(1);
			t0_4 = valoresNivelCero.get(2);
			t0_2 = valoresNivelCero.get(3);
			t1_2 = ((4 * t0_4)/3) - (t0_2/3);
			System.out.println("t1_2 " + t1_2);
			t1_4 = ((4 * t0_8)/3) - (t0_4/3);
			System.out.println("t1_4 " + t1_4);
			t1_8 = ((4 * t0_16)/3) - (t0_8/3);
			System.out.println("t1_8 " + t1_8);
			t2_2 = ((16 * t1_4)/15) - (t1_2/15);
			System.out.println("t2_2 " + t2_2);
			t2_4 = ((16 * t1_8)/15) - (t1_4/15);
			System.out.println("t2_4 " + t2_4);
			t3_2 = ((64 * t2_4)/63) - (t2_2/63);
			System.out.println("t3_2 " + t3_2);
			respuesta = t3_2;
		}
		else if(nivel == 2)
		{
			t0_8 = valoresNivelCero.get(0);
			t0_4 = valoresNivelCero.get(1);
			t0_2 = valoresNivelCero.get(2);
			//t0_16 = valoresNivelCero.get(3);
			t1_2 = (4/3 * t0_4) - (1/3 * t0_2);
			t1_4 = (4/3 * t0_8) - (1/3 * t0_4);
			//t1_8 = (4/3 * t0_16) - (1/3 * t0_8);
			t2_2 = (16/15 * t1_4) - (1/15 * t1_2);
			//t2_4 = (16/15 * t1_8) - (1/15 * t1_4);
			//t3_2 = (64/63 * t2_4) - (1/63 * t2_2);
			respuesta = t2_2;
		}
		else if(nivel == 1)
		{
			t0_4 = valoresNivelCero.get(0);
			t0_2 = valoresNivelCero.get(1);
			//t0_8 = valoresNivelCero.get(2);
			//t0_16 = valoresNivelCero.get(3);
			t1_2 = (4/3 * t0_4) - (1/3 * t0_2);
			//t1_4 = (4/3 * t0_8) - (1/3 * t0_4);
			//t1_8 = (4/3 * t0_16) - (1/3 * t0_8);
			//t2_2 = (16/15 * t1_4) - (1/15 * t1_2);
			//t2_4 = (16/15 * t1_8) - (1/15 * t1_4);
			//t3_2 = (64/63 * t2_4) - (1/63 * t2_2);
			respuesta = t1_2;
		}
		else
		{
			System.out.println("El numero de niveles debe estar entre 1 y 3");
		}
		return respuesta;
	}

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);

		//-----------------------
		// EVALUAR FUNCION
		//-----------------------
		//		System.out.println("Escriba la función a evaluar : ");
		//		String funcion = sc.nextLine();
		//		System.out.println("Por favor escriba un valor de (x) para evaluar la funcion: ");
		//		double x = Double.parseDouble(sc.nextLine());
		//		Evaluador oe = new Evaluador(funcion, x);
		//		oe.evaluar();
		//		System.out.println("El resultado de la evaluacion es: " + oe.getResultado() + " " + oe.getError());

		//-----------------------
		// METODOS DEL TRAPECIO
		//-----------------------
		//		System.out.println("Escriba la función a evaluar : ");
		//		String funcion2 = sc.nextLine();
		//				
		//		System.out.println("Escriba el limite inferior : ");
		//		double a = Double.parseDouble(sc.nextLine());
		//				
		//		System.out.println("Escriba el limite superior : ");
		//		double b = Double.parseDouble(sc.nextLine());
		//				
		//		System.out.println("Escriba el numero de divisiones (n) : ");
		//		int n = Integer.parseInt(sc.nextLine());
		//		Trapecio tp = new Trapecio(funcion2, a, b, n);
		//		System.out.println("La integral por el método del trapecio es: " + tp.metodoTrapecio());

		//-----------------------
		// METODOS DE SIMPSON
		//-----------------------
		//		System.out.println("Escriba la función a evaluar : ");
		//		String funcion3 = sc.nextLine();
		//				
		//		System.out.println("Escriba el limite inferior : ");
		//		double a = Double.parseDouble(sc.nextLine());
		//				
		//		System.out.println("Escriba el limite superior : ");
		//		double b = Double.parseDouble(sc.nextLine());
		//				
		//		System.out.println("Escriba el numero de divisiones (n) : ");
		//		int n = Integer.parseInt(sc.nextLine());
		//		Simpson sim = new Simpson(funcion3, a, b, n);
		//		System.out.println("La integral por el método del trapecio es: " + sim.metodoSimpson());

		//-----------------------
		// METODOS INTEGRAL DE ROMBERG
		//-----------------------
		System.out.println("Escriba la función a evaluar : ");
		String funcion4 = sc.nextLine();

		System.out.println("Escriba el limite inferior : ");
		double a = Double.parseDouble(sc.nextLine());

		System.out.println("Escriba el limite superior : ");
		double b = Double.parseDouble(sc.nextLine());

		System.out.println("Escriba el numero de niveles que quiere alcanzar : ");
		int n = Integer.parseInt(sc.nextLine());
		Romberg rom = new Romberg(funcion4, a, b, n);
		System.out.println("La integral por el método del Romberg es: " + rom.integracionRomberg());
		sc.close();
	}
}
