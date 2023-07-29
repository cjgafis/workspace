package mundo;

import java.util.ArrayList;

public class Recorrido 
{
	// ATRIBUTOS
	private double[] notas1;
	private ArrayList<Double> notas2;

	// CONSTRUCTOR
	public Recorrido()
	{
		notas1 = new double[12];
		notas2 = new ArrayList<>();

		// Añadiendo notas al arreglo
		notas1[0] = 0.0;
		notas1[1] = 1.6;
		notas1[2] = 4.3;
		notas1[3] = 2.0;
		notas1[4] = 2.0;
		notas1[5] = 2.0;
		notas1[6] = 0.8;
		notas1[7] = 1.6;
		notas1[8] = 4.5;
		notas1[9] = 4.0;
		notas1[10] = 4.0;
		notas1[11] = 2.0;

		// Añadiendo notas al vector o ArrayList
		notas2.add(0.0);
		notas2.add(1.6);
		notas2.add(4.3);
		notas2.add(2.0);
		notas2.add(2.0);
		notas2.add(2.0);
		notas2.add(0.8);
		notas2.add(1.6);
		notas2.add(4.5);
		notas2.add(4.0);
		notas2.add(4.0);
		notas2.add(2.0);


	}

	// RECORRIDOS PARA LOS ARREGLOS
	// RECORRIDO TOTAL
	public double calcularPromedio()
	{
		double suma = 0.0;
		double promedio = 0.0;

		for(int i = 0; i < notas1.length; i++)
		{
			suma = suma + notas1[i];
		}
		promedio = suma / notas1.length;
		return promedio;
	}

	// RECORRIDO PARCIAL
	public boolean algunaNotaEsCinco()
	{
		boolean respuesta = false;

		for(int i = 0; i < notas1.length && respuesta == false; i++)
		{
			if(notas1[i] == 5.0)
			{
				respuesta = true;
			}
		}
		return respuesta;
	}

	// RECORRIDO DOBLE
	public double notaMasRepetida() 
	{
		int maxRepeticiones = 0;
		double notaMasRepetida = notas1[0];

		for (int i = 0; i < notas1.length; i++) 
		{
			double notaActual = notas1[i];
			int repeticiones = 0;

			for (int j = 0; j < notas1.length; j++) 
			{
				if (notaActual == notas1[j]) 
				{
					repeticiones++;
				}
			}

			if (repeticiones > maxRepeticiones) 
			{
				maxRepeticiones = repeticiones;
				notaMasRepetida = notaActual;
			}
		}

		return notaMasRepetida;
	}

	// RECORRIDOS PARA LOS VECTORES (ARRAYLIST)
	// RECORRIDO TOTAL
	public double calcularPromedio2()
	{
		double suma = 0.0;
		double promedio = 0.0;

		for(int i = 0; i < notas2.size(); i++)
		{
			suma = suma + notas2.get(i);
		}
		promedio = suma / notas2.size();
		return promedio;
	}

	// RECORRIDO PARCIAL
	public boolean algunaNotaEsCinco2()
	{
		boolean respuesta = false;

		for(int i = 0; i < notas2.size() && respuesta == false; i++)
		{
			if(notas2.get(i) == 5.0)
			{
				respuesta = true;
			}
		}
		return respuesta;
	}

	// RECORRIDO DOBLE
	public double notaMasRepetida2() 
	{
		int maxRepeticiones = 0;
		double notaMasRepetida = notas2.get(0);

		for (int i = 0; i < notas2.size(); i++) 
		{
			double notaActual = notas2.get(i);
			int repeticiones = 0;

			for (int j = 0; j < notas2.size(); j++) 
			{
				if (notaActual == notas2.get(j)) 
				{
					repeticiones++;
				}
			}

			if (repeticiones > maxRepeticiones) 
			{
				maxRepeticiones = repeticiones;
				notaMasRepetida = notaActual;
			}
		}

		return notaMasRepetida;
	}

	public static void main(String[] args) 
	{
		Recorrido re = new Recorrido();
		
		System.out.println("Recorrido total con arreglos. El promedio de las notas es: " + re.calcularPromedio());
		System.out.println("Recorrido total con vectores. El promedio de las notas es: " + re.calcularPromedio2());
		System.out.println("Recorrido parcial con arreglos. Hay alguna nota de 5.0? : " + re.algunaNotaEsCinco());
		System.out.println("Recorrido parcial con vectores. Hay alguna nota de 5.0? : " + re.algunaNotaEsCinco2());
		System.out.println("Recorrido doble con arreglos. La nota mas repetida es : " + re.notaMasRepetida());
		System.out.println("Recorrido doble con vectores. La nota mas repetida es : " + re.notaMasRepetida());
	}

}
