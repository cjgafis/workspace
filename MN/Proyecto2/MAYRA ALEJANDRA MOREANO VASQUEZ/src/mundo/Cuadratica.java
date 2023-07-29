package mundo;

import java.util.Scanner;

/*
 * inv:
 * 4*a*c < b*b
 */

public class Cuadratica {
	private double a;
	private double b;
	private double c;
	
	public Cuadratica(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		verificarInvariante();
	}

	public double raiz1() {
		double resultado = ((b*-1) + Math.sqrt((b*b)-(4*a*c))) / (2*a);
		return resultado;
	}
	
	public double raiz2() {
		double resultado = ((b*-1) - Math.sqrt((b*b)-(4*a*c))) / (2*a);
		return resultado;
	}
	
	public boolean primeraValidacion (double variable) {
		if ((""+variable).equals(null)&&(""+variable).equals(" ")) {
			return false;
		}
		return true;
	}
	
	public boolean segundaValidacion () {
		double primero = 4*a*c;
		double segundo = b*b;
		if (primero < segundo) {
			return false;
		} else {
			return true;
		}
	}
	private void verificarInvariante () {
		assert primeraValidacion(a):"Debe ingresar un valor de a.";
		assert primeraValidacion(b):"Debe ingresar un valor de b.";
		assert primeraValidacion(c):"Debe ingresar un valor de c.";
		assert segundaValidacion():"\nPara no obtener números reales se debe cumplir que b^2 > 4*a*c.";
	}

	@Override
	public String toString() {
		return "Cuadratica [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Ingrese el valor de a: ");
		double a = entrada.nextDouble();
		System.out.print("Ingrese el valor de b: ");
		double b = entrada.nextDouble();
		System.out.print("Ingrese el valor de c: ");
		double c = entrada.nextDouble();
		Cuadratica objeto = new Cuadratica (a, b, c);
		System.out.println("Las raices son: " + objeto.raiz1() + " y " + objeto.raiz2());
		entrada.close();
	}

}
