package mundo;

public class Aplicacion 
{
	public static void main(String[] args) 
	{	
		int[] numeros = {1, 2, 3, 4, 5, 2, 3, 2, 2, 1, 4, 4, 4, 4};
		Recorrido miRecorrido = new Recorrido();
		System.out.println(miRecorrido.numeroMasRepetido(numeros));		
	}

}
