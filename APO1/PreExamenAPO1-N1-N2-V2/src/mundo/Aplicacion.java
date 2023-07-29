package mundo;

import java.util.Scanner;

public class Aplicacion 
{
	public static void main(String[] args) 
	{
		Concesionario miConcesionario = new Concesionario();
		
		miConcesionario.listarVehiculos();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el numero de serie del vehiculo a buscar: ");
		String numeroSerie = teclado.nextLine();
		System.out.println(miConcesionario.buscarVehiculoPorNumeroSerie(numeroSerie));
		
		System.out.println("Ingrese la posición del primer vehiculo en el vector: ");
		int index1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Ingrese la posición del segundo vehiculo en el vector: ");
		int index2 = Integer.parseInt(teclado.nextLine());
		
		miConcesionario.intercambiar(index1, index2);
		miConcesionario.listarVehiculos();
		
		System.out.println("Ingrese la posición el indice del vehiculo a eliminar: ");
		int index = Integer.parseInt(teclado.nextLine());
		miConcesionario.eliminarVehiculo(index);
		miConcesionario.listarVehiculos();
		
		teclado.close();
	}

}
