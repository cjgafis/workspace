/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Proyecto Cupi2
 * Ejercicio: n3_notasCurso
 * Autor: Pablo Barvo - 09-Sep-2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.notasCurso.mundo;

import javax.swing.JOptionPane;

/**
 * Clase que representa un Curso
 */
public class Curso
{
	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------

	/**
	 * Total de estudiantes en el curso
	 */
	public final static int TOTAL_EST = 12;

	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Notas de los estudiantes
	 */
	private double[ ] notas;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Crea un nuevo curso, inicializando todas las notas en cero
	 */
	public Curso(   )
	{
		notas = new double[TOTAL_EST];

		notas[0] = 2.0;
		notas[1] = 2.5;
		notas[2] = 3.7;
		notas[3] = 4.3;
		notas[4] = 5.0;
		notas[5] = 4.5;
		notas[6] = 2.0;
		notas[7] = 1.6;
		notas[8] = 4.9;
		notas[9] = 2.8;
		notas[10] = 0.0;
		notas[11] = 2.0;

	}

	// -----------------------------------------------------------------
	// Metodos
	// -----------------------------------------------------------------

	/**
	 * Este metodo permite obtener el arreglo de notas. 
	 * @return retorna las notas del curso. 
	 */
	public double[] getNotas() 
	{
		return notas;
	}

	/**
	 * Calcula el promedio del curso
	 * @return Promedio de todas las notas del curso. promedio >= 0
	 */
	public double promedio( )
	{
		double suma = 0;

		for( int indice = 0; indice < TOTAL_EST; indice++ )
		{
			suma += notas[ indice ];
		}
		return suma / TOTAL_EST;
	}

	/**
	 * Devuelve el numero de estudiantes que tienen la nota mayor al promedio
	 * @return Numero de estudiantes que tienen la nota mayor al promedio. numero >= 0
	 */
	public int cuantosEncimaPromedio( )
	{
		// Saca el promedio utilizando el metodo promedio()
		double promedio = promedio( );

		// Calcula el numero notas mayores
		int vanEncima = 0;
		for( int indice = 0; indice < TOTAL_EST; indice++ )
		{
			if( notas[ indice ] > promedio )
			{
				vanEncima++;
			}
		}
		return vanEncima;
	}

	/**
	 * Devuelve la nota de un estudiante del curso
	 * @param numEstudiante Numero del estudiante : 1 <= estudiante <= 12
	 * @return Nota del estudiante numEstudiante
	 */
	public double darNota( int numEstudiante )
	{
		return notas[ numEstudiante - 1 ];
	}

	/**
	 * Cambia la nota de un estudiante en el curso
	 * @param numEstudiante Numero del estudiante : 1 <= estudiante <= 12
	 * @param nota Nota del estudiante 0 <= nota <= 5
	 */
	public void cambiarNota( int numEstudiante, double nota )
	{
		notas[ numEstudiante - 1 ] = nota;
	}

	/**
	 * Busca la nota mas repetida dentro del arreglo. 
	 * pre: la lista de notas debe estar creada  && != null.
	 * post: Se busco y retorno la nota mas repetida. 
	 * @return retorna la nota que mas veces se repite dentro del arreglo. Retorna -1 sino hay notas repetidas.
	 */
	public double notaMasRepetida()
	{
		double notaMasRepetida = -1;
		int mayorVecesRepetida = 0;

		for(int i = 0; i < notas.length; i++)
		{
			int contador = 0;
			for(int j = 0; j < notas.length; j++)
			{
				if(notas[i] == notas[j])
				{
					contador ++;
				}
			}			 
			if (contador > mayorVecesRepetida )
			{
				notaMasRepetida = notas[i];
				mayorVecesRepetida = contador;
			}		 
		}
		return notaMasRepetida;
	}

	/**
	 * Este metodo permite hacer un incremento a la nota final de cada estudiante del curso,
	 * (relizando curva) segun el dato pasado por parametro. 
	 * pre: la lista de notas debe estar creada && != null
	 * post: se realizo el aumento a todos los estudiantes a los cuales se les podia incrementar. 
	 * A los que se pasaba de 5, les quedo en 5. 
	 * @param aumento, es el aumento en el que se incrementa cada nota. 
	 */
	public void aplicarCurva(double aumento)
	{
		for(int i = 0; i < notas.length; i++)
		{
			if(  (notas[i] + aumento) <= 5.0  )
			{
				notas[i] = notas[i] + aumento;
			}
			else
			{
				notas[i] = 5.0;
			}
		}
	}

	// TODO: Punto 1: Complete el cuerpo del metodo rangoConMasNotas ( ), segun las siguientes indicaciones. 
	// El metodo debe retornar en cual rango hay mas notas en el curso: 
	// Rango 1 - de 0.0 a 1.99, 
	// Rango 2 - de 2.0 a 3.49, 
	// Rango 3 - de 3.5 a 5.0.

	/**
	 * Este metodo calcula en cual rango se encuentra el mayor numero de notas de todos los estudiantes del curso. 
	 * pre: la lista debe estar creada. La lista no puede ser null.
	 * post: se calculo el rango que mayor numero de notas tiene. 
	 * @return el rango con mayor numero de notas. Retorna -1 en caso de no encontrar ninguno.
	 */
	public int rangoConMasNotas ( ) 
	{
		return -1; // el retorno es provisional.
	}

	// TODO: Punto 2: Calcular el número minimo de notas del curso necesarias 
	// para que la suma supere el valor ingresado por el usuario, recorriendolas desde la posición 0 en adelante. 
	// Si al sumar todas las notas no se llega a ese valor, el metodo debe retornar -1.

	/**
	 * Este metodo suma las notas en orden hasta alcanzar un valor dado por parametro. 
	 * pre: la lista debe estar creada. La lista no puede ser null.
	 * post: se sumaron las notas con el fin de lograr alcanzar el valor ingresado por parametro.
	 * @param numero, numero es el numero ingresado por el usuario. numero > 0.
	 * @return el numero de notas que se sumaron hasta alcanzar el valor ingresado por parametro. 
	 * Se retorna -1 en caso de no alcanzar a llegar al numero ingresado por parametro. 
	 */
	public int sumadasDanElNumero (double numero ) 
	{
		return -1; // el retorno es provisional.
	}

	// -----------------------------------------------------------------
	// Puntos de Extension
	// -----------------------------------------------------------------


	// TODO: Punto 3: Modifique el cuerpo del metodo1( ) para que muestre al usuario
	// la respuesta que retorna el metodo realizado en el punto 1. 

	/**
	 * Metodo para la extension 1
	 * @return Respuesta 1
	 */
	public String metodo1( )
	{
		return "";
	}

	// TODO: Punto 4: Modifique el cuerpo del metodo2( ) para que muestre al usuario
	// la respuesta que retorna el metodo realizado en el punto 2. 

	/**
	 * Metodo para la extension 2
	 * @return Respuesta 2
	 */
	public String metodo2( )
	{
		return ""; 
	}
}