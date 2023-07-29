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
		s2 = new Soldado(234, "Carlos", "Ramirez", 20, 1.69, 5);
		s3 = new Soldado(345, "Pablo", "Acero", 17, 1.73, 5);
		s4 = new Soldado(456, "Pedro", "Perez", 23, 1.80, 16);
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
	public Soldado soldadoMenosAntiguo()
	{

		if(s1.getAntiguedadAnos() < s2.getAntiguedadAnos() && s1.getAntiguedadAnos() < s3.getAntiguedadAnos() && s1.getAntiguedadAnos() < s4.getAntiguedadAnos())
		{
			return s1;
		}
		else if(s2.getAntiguedadAnos() < s1.getAntiguedadAnos() && s2.getAntiguedadAnos() < s3.getAntiguedadAnos() && s2.getAntiguedadAnos() < s4.getAntiguedadAnos())
		{
			return s2;
		}
		else if(s3.getAntiguedadAnos() < s1.getAntiguedadAnos() && s3.getAntiguedadAnos() < s2.getAntiguedadAnos() && s3.getAntiguedadAnos() < s4.getAntiguedadAnos())
		{
			return s3;
		}
		else 
		{
			return s4;
		}
	}



	// TODO PUNTO 4: Cree un metodo llamado masAntiguosQue( int anos ), el cual retorna un String (cadena),
	// con los apellidos de todos los soldados que tengan una antiguedad mayor a los anos entrados como parametro. 
	// Escriba su codigo debajo de los to do. Nunca arriba. 
	public String masAntiguoQue(int antiguedadAnos)
	{ String masAntiguo=  null ;

	switch(antiguedadAnos) 
	{
	case 1:
		if(s1.getAntiguedadAnos()>3)

		{
			masAntiguo=s1.getApellido();
		}
		break;
	case 2:
		if(s2.getAntiguedadAnos()>3)

		{
			masAntiguo=s2.getApellido();
		}
		break;
	case 3:
		if(s3.getAntiguedadAnos()>3)

		{
			masAntiguo=s3.getApellido();
		}
		break;
	case 4:
		if(s4.getAntiguedadAnos()>3)

		{
			masAntiguo=s4.getApellido();
		}
		break;




	}
	return masAntiguo;
	}




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
		System.out.println("Respuestas: ");
		System.out.println("El soldado menos antiguo es: " + baser10.soldadoMenosAntiguo(  ));
		System.out.println("Por favor ingrese el numero de anos: ");
		int anos = sc.nextInt();
		System.out.println("Los apellidos del soldados mas antiguos es: " + baser10.masAntiguoQue( anos ));

		sc.close();
	}
}
