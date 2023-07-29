package mundo;

import java.util.Scanner;

public class NotaFinal 
{
	// CONSTANTES
	/**
	 * Porcentaje primer corte
	 */
	public final static double PPC = 3.33;
	/**
	 * Porcentaje segundo corte
	 */
	public final static double PSC = 3.33;
	/**
	 * Porcentaje tercer corte
	 */
	public final static double PTC = 3.34;
	
	// ATRIBUTOS
	/**
	 * nota examen teorico nivel 1 y nivel 2.
	 */
	private double nETN1N2;
	/**
	 * nota examen practico nivel 1 y nivel 2.
	 */
	private double nEPN1N2;
	/**
	 * nota examen teorico nivel 3.
	 */
	private double nETN3;
	/**
	 * nota examen practico nivel 3.
	 */
	private double nEPN3;
	/**
	 * nota examen teorico nivel 4 y nivel 5.
	 */
	private double nETN4N5;
	/**
	 * nota examen practico nivel 4 y nivel 5.
	 */
	private double nEPN4N5;
	
	// CONSTRUCTOR
	/**
	 * Permite crear un objeto de la clase NotaFinal con las notas del estudiante. 
	 * @param nETN1N2, nota examen teorico nivel 1 y nivel 2.
	 * @param nEPN1N2, nota examen practico nivel 1 y nivel 2.
	 * @param nETN3, nota examen teorico nivel 3.
	 * @param nEPN3, nota examen practico nivel 3.
	 * @param nETN4N5, nota examen teorico nivel 4 y nivel 5.
	 * @param nEPN4N5, nota examen practico nivel 4 y nivel 5.
	 */
	public NotaFinal(double nETN1N2, double nEPN1N2, double nETN3, 
			double nEPN3, double nETN4N5, double nEPN4N5) 
	{
		this.nETN1N2 = nETN1N2;
		this.nEPN1N2 = nEPN1N2;
		this.nETN3 = nETN3;
		this.nEPN3 = nEPN3;
		this.nETN4N5 = nETN4N5;
		this.nEPN4N5 = nEPN4N5;
	}

	// METODOS GET Y SET
	/**
	 * @return the nETN1N2
	 */
	public double getnETN1N2() 
	{
		return nETN1N2;
	}

	/**
	 * @param nETN1N2 the nETN1N2 to set
	 */
	public void setnETN1N2(double nETN1N2) 
	{
		this.nETN1N2 = nETN1N2;
	}

	/**
	 * @return the nEPN1N2
	 */
	public double getnEPN1N2() 
	{
		return nEPN1N2;
	}

	/**
	 * @param nEPN1N2 the nEPN1N2 to set
	 */
	public void setnEPN1N2(double nEPN1N2) 
	{
		this.nEPN1N2 = nEPN1N2;
	}

	/**
	 * @return the nETN3
	 */
	public double getnETN3() 
	{
		return nETN3;
	}

	/**
	 * @param nETN3 the nETN3 to set
	 */
	public void setnETN3(double nETN3) 
	{
		this.nETN3 = nETN3;
	}

	/**
	 * @return the nEPN3
	 */
	public double getnEPN3() 
	{
		return nEPN3;
	}

	/**
	 * @param nEPN3 the nEPN3 to set
	 */
	public void setnEPN3(double nEPN3) 
	{
		this.nEPN3 = nEPN3;
	}

	/**
	 * @return the nETN4N5
	 */
	public double getnETN4N5() 
	{
		return nETN4N5;
	}

	/**
	 * @param nETN4N5 the nETN4N5 to set
	 */
	public void setnETN4N5(double nETN4N5) 
	{
		this.nETN4N5 = nETN4N5;
	}

	/**
	 * @return the nEPN4N5
	 */
	public double getnEPN4N5() 
	{
		return nEPN4N5;
	}

	/**
	 * @param nEPN4N5 the nEPN4N5 to set
	 */
	public void setnEPN4N5(double nEPN4N5) 
	{
		this.nEPN4N5 = nEPN4N5;
	}

	// METODOS 
	/**
	 * Permite calcular la nota final del estudiante. 
	 * @return notaFinal, La nota final del estudiante. 
	 */
	public double calcularNotaFinal()
	{
		double finalPrimerCorte = ((nETN1N2 + nEPN1N2)/2) * PPC;
		double finalSegundaCorte = ((nETN3 + nEPN3)/2) * PSC;
		double finalTercerCorte = ((nETN4N5 + nEPN4N5)/2) * PTC;
		double notaFinal = (finalPrimerCorte + finalSegundaCorte + finalTercerCorte)/10;
		return notaFinal;
	}
	
	/**
	 * Metodo principal. 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor ingrese la nETN1N2 : ");
		double nETN1N2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Por favor ingrese la nEPN1N2 : ");
		double nEPN1N2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Por favor ingrese la nETN3 : ");
		double nETN3 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Por favor ingrese la nEPN3 : ");
		double nEPN3 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Por favor ingrese la nETN4N5 : ");
		double nETN4N5 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Por favor ingrese la nEPN4N5 : ");
		double nEPN4N5 = Double.parseDouble(sc.nextLine());
		
		NotaFinal miNotaAPO1 = new NotaFinal(nETN1N2, nEPN1N2, nETN3, nEPN3, nETN4N5, nEPN4N5);
		
		System.out.println("La nota final de APO1 es: " + miNotaAPO1.calcularNotaFinal());

		sc.close();
	}

}
