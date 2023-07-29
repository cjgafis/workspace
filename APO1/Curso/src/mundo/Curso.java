package mundo;

public class Curso 
{
	// DECLARE ATRIBUTOS
	private Estudiante e1;
	private Estudiante e2;
	private Estudiante e3;
	
	// METODO CONTRUCTOR
	public Curso()
	{
		e1 = new Estudiante("111","Pepito","Perez",18,1.70,false);
		e2 = new Estudiante("222","Fulanito","Ramirez",19,1.65,false);
		e3 = new Estudiante("333","Carlos","Gutierrez",20,1.73,false);
	}
	
	public double promedioEdad()
	{
		double promedio =(e1.getEdad() + e2.getEdad() + e3.getEdad()) / 3;
		return promedio;
	}
	
	public double promedioEstatura()
	{
		double promedio =(e1.getEstatura() + e2.getEstatura() + e3.getEstatura()) / 3;
		return promedio;
	}

	public static void main(String[] args) 
	{
		// Creamos el objeto de la clase donde estan los métodos que voy a llamar. 
		
		// Los métodos que voy a llamar pertenecen a la clase Curso, por lo cual, crearé un objeto
		// de la clase curso.
		
		Curso miCurso = new Curso();
		
		// Ahora quiero visualizar el resultado qkue me da cada método.
		
		System.out.println("El promedio de edades de los estudiantes del curso es: " + miCurso.promedioEdad());
		System.out.println("El promedio de estaturas de los estudiantes del curso es: " + miCurso.promedioEstatura());
		

	}

}
