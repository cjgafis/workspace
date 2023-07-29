package mundo;

public class Curso 
{	
	// CONSTANTE
	public static final int TAMANIO = 5;
	
	// ATRIBUTOS
	private String nombre;
	private Estudiante[] estudiantes;

	// METODO CONTRUCTOR
	public Curso()
	{
		this.nombre = "APO1";
		estudiantes = new Estudiante[TAMANIO];
		estudiantes[0] = new Estudiante("Felipe", "2220221045", 5.0, 18);
		estudiantes[1] = new Estudiante("Juan", "2220221063", 3.1, 18);
		estudiantes[2] = new Estudiante("Camilo", "2220221025", 4.2, 18);
		estudiantes[3] = new Estudiante("Daniel", "2520221017", 2.0, 18);
		estudiantes[4] = new Estudiante("Gileny", "2220221010", 3.0, 20);
	}

	// METODOS calcularPromedioCurso()
	public double calcularPromedioCurso()
	{
		return 0.0;
	}

	// METODOS calcularPromedioCurso()
	public double calcularPromedioEdadCurso()
	{
		double suma = 0.0;
		double promedio = 0.0;
		for(int i = 0; i < estudiantes.length; i++)
		{
			suma = suma + estudiantes[i].getEdad();
		}	
		promedio = suma / TAMANIO;
		return promedio;
	}

	

}