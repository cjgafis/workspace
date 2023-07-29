package mundo;

import java.util.Scanner;

public class Ordenamiento 
{
	// ATRIBUTOS
	private int[]arr;

	// CONSTRUTOR
	public Ordenamiento(int n)
	{
		arr = new int[n];
	}

	// METODO GET
	/**
	 * @return the arr
	 */
	public int[] getArr() 
	{
		return arr;
	}

	// OTROS METODOS
	public void agregarValores()
	{
		System.out.println("\nagregarValores(n)");
		Scanner sc = new Scanner(System.in);
		int n = arr.length;
		int numeroIngresado;

		if(n > 0)
		{
			for(int i = 0; i < arr.length; i++)
			{
				System.out.println("\nIngrese el numero " + (i+1) + ": ");
				numeroIngresado = Integer.parseInt(sc.nextLine());
				arr[i] = numeroIngresado;
			}

			System.out.println("Los valores ingresados fueron: ");

			for(int i = 0; i < arr.length; i++)
			{
				System.out.print(arr[i] + " - ");				
			}
		}
		else
		{
			System.out.println("La cantidad debe ser mayor a cero.");
		}

		sc.close();
	}

	public void bubbleSort() 
	{
		System.out.println("\nbubbleSort()");
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) 
		{
			for (int j = 0; j < n - i - 1; j++) 
			{
				if (arr[j] > arr[j + 1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public void selectionSort() 
	{
		System.out.println("\nselectionSort()");
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) 
		{
			int minIndex = i;
			for (int j = i + 1; j < n; j++) 
			{
				if (arr[j] < arr[minIndex]) 
				{
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public void mostrarOrden()
	{
		System.out.println("\nmostrarOrden()");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " - ");				
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de numeros que quiere ordenar: ");
		int n = Integer.parseInt(sc.nextLine());
		Ordenamiento bu = new Ordenamiento(n);
		bu.agregarValores();
		//bu.bubbleSort();
		bu.selectionSort();
		bu.mostrarOrden();
		sc.close();
	}

}
