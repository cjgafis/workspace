package mundo;

public class Curso 
{
	// CONSTANTES
	public final static int TAMANIO = 6;
	
	// ATRIBUTOS
	private Estudiante[] estudiantes;
	
	// METODO CONSTRUCTOR
	public Curso()
	{
		estudiantes = new Estudiante[TAMANIO];
		estudiantes[0] = new Estudiante("111", "David", 18, 1.78);
		estudiantes[1] = new Estudiante("222", "Maria Paula", 21, 1.55);
		estudiantes[2] = new Estudiante("333", "Edwin", 23, 1.72);
		estudiantes[3] = new Estudiante("444", "Johan", 22, 1.76);
		estudiantes[4] = new Estudiante("555", "Alejandra", 18, 1.56);
		estudiantes[5] = new Estudiante("666", "Laura", 19, 1.65);
	}
	
	public Estudiante masAlto()
	{
		Estudiante masAlto = null;
		double estatura = 0.0;
		
		for(int i = 0; i < estudiantes.length; i++)
		{
			if(estudiantes[i].getEstatura() > estatura)
			{
				estatura = estudiantes[i].getEstatura();
				masAlto = estudiantes[i];
			}
		}
		return masAlto;
	}
	
	public double promedioEdades()
	{
		double promedio = 0.0;
		double suma = 0.0;
		
		for(int i = 0; i < estudiantes.length; i++)
		{
			suma = suma + estudiantes[i].getEdad();
		}
		promedio = suma / TAMANIO;
		return promedio;
	}
	
	

	public static void main(String[] args) 
	{
		Curso apo1 = new Curso();
		System.out.println("El estudiante mas alto es: " + apo1.masAlto());
		System.out.println("El promedio de edades es: " + apo1.promedioEdades());
	}

}
