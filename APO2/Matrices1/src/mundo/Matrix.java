package mundo;

public class Matrix 
{
	// ATRIBUTOS
	private int [][] contenedora2D;

	// METODO CONTRUCTOR
	public Matrix()
	{
		contenedora2D = new int [3][3];
		contenedora2D [0][0] = 1;
		contenedora2D [0][1] = 2;
		contenedora2D [0][2] = 3;
		contenedora2D [1][0] = 4;
		contenedora2D [1][1] = 5;
		contenedora2D [1][2] = 6;
		contenedora2D [2][0] = 7;
		contenedora2D [2][1] = 8;
		contenedora2D [2][2] = 9;
	}

	// METODOS
	public void pintarMatrix()
	{
		for(int i = 0; i < contenedora2D.length; i++)
		{
			for(int j = 0; j < contenedora2D[0].length; j++)
			{
				System.out.print(contenedora2D[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}

	public void pintarUnaX()
	{
		for(int i = 0; i < contenedora2D.length; i++)
		{
			for(int j = 0; j < contenedora2D[0].length; j++)
			{
				if(!(contenedora2D[i][j] % 2 == 0))
				{
					System.out.print(contenedora2D[i][j] + " ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			System.out.println();
		}
	}

	public double calcularPromedio()
	{
		double suma = 0.0;

		for(int i = 0; i < contenedora2D.length; i++)
		{
			for(int j = 0; j < contenedora2D[0].length; j++)
			{
				suma = suma + contenedora2D[i][j];
			}
		}
		return suma / (contenedora2D.length * contenedora2D[0].length);
	}



}
