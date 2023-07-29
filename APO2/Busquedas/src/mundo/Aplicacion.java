package mundo;

import java.util.Scanner;

public class Aplicacion 
{
	public static void main(String[] args) 
	{
		Busqueda obj = new Busqueda();
		obj.listar();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEscriba el numero que quiere buscar dentro de la contenedora: ");
		int numeroABuscar = Integer.parseInt(sc.nextLine());
		//System.out.println(obj.busquedaSecuencial(numeroABuscar));
		System.out.println(obj.busquedaBinaria(numeroABuscar));
		sc.close();
	}

}
