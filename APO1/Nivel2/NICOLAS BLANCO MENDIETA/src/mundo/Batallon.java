package mundo;

import java.util.Scanner;

public class Batallon 
{
	// ATRIBUTOS
	private Soldado s1;
	private Soldado s2;
	private Soldado s3;
	private Soldado s4;

	// TODO PUNTO 2: Modifique el metodo constructor para que en cada instanciación de los objetos
	// de tipo Soldado, agregue el nuevo atributo que se creo en el  punto 1. 
	// Escriba su codigo debajo de los to do. Nunca arriba. 
	// CONSTRUCTOR
	public Batallon() 
	{
		s1 = new Soldado(123, "Celso", "Rodriguez", 19, 1.65, 5);
		s2 = new Soldado(234, "Carlos", "Ramirez", 20, 1.69, 4);
		s3 = new Soldado(345, "Pablo", "Acero", 17, 1.73, 3);
		s4 = new Soldado(456, "Pedro", "Perez", 23, 1.80, 6);
	}

	public Soldado getS1() 
	{
		return s1;
	}
	public Soldado getS2() 
	{
		return s2;
	}
	public Soldado getS3() 
	{
		return s3;
	}
	public Soldado getS4() 
	{
		return s4;
	}

	// TODO PUNTO 3: Cree el metodo soldadoMenosAntiguo(  ) el cual retorna el soldado (objeto) con 
	// menos anos en el batallon.
	// Escriba su codigo debajo de los to do. Nunca arriba. 
	

   
	
	

	// TODO PUNTO 4: Cree un metodo llamado masAntiguosQue( int anos ), el cual retorna un String (cadena),
	// con los apellidos de todos los soldados que tengan una antiguedad mayor a los anos entrados como parametro. 
	// Escriba su codigo debajo de los to do. Nunca arriba. 


	
	

	// METODO MAIN (PRINCIPAL)
	public static void main(String[] args) 
	{
		// No modifique este metodo. 
		Batallon baser10 = new Batallon();
		System.out.println(baser10.getS1());
		System.out.println(baser10.getS2());
		System.out.println(baser10.getS3());
		System.out.println(baser10.getS4());
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingrese el numero de anos: ");
		int anos = sc.nextInt();
		System.out.println("Respuestas: ");
		System.out.println("El soldado menos antiguo es: " + baser10.soldadoMenosAntiguo(  ));
		System.out.println("Los apellidos de los soldados mas antiguos son: " + baser10.masAntiguosQue( anos ));

		sc.close();
	}
}
