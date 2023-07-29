package mundo;

public class Busqueda 
{
	// ATRIBUTO
	private int [] arr;

	// CONSTRUCTOR
	public Busqueda()
	{
		arr = new int[9];
		arr[0] = 11;
		arr[1] = 8;
		arr[2] = 2;
		arr[3] = 15;
		arr[4] = 24;
		arr[5] = 16;
		arr[6] = 5;
		arr[7] = 21;
		arr[8] = 10;
	}

	public void listar()
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " - ");
		}
	}

	public void selectionSort() 
	{
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

	public int busquedaSecuencial(int x)
	{
		int posicion = -1;
		boolean centinela = false;

		for(int i = 0; i < arr.length && centinela == false; i++)
		{
			if(arr[i] == x)
			{
				posicion = i; 
				centinela = true;
			}
		}
		return posicion;
	}

	public int busquedaBinaria(int x) 
	{
		selectionSort();
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) 
		{
			int mid = (low + high) / 2;
			if (arr[mid] == x) 
			{
				return mid;
			} 
			else if (arr[mid] < x) 
			{
				low = mid + 1;
			} 
			else 
			{
				high = mid - 1;
			}
		}
		return -1;
	}

}
