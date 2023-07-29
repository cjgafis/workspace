package mundo;

import java.util.Scanner;

public class Curso 
{
	// ATRIBUTOS
	private String nombre;
	private Estudiante[]estudiantes;

	// METODO CONTRUCTOR
	/**
	 * @param nombre
	 */
	public Curso(String nombre) 
	{
		this.nombre = nombre;
		estudiantes = new Estudiante[3];		
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() 
	{
		return nombre;
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	/**
	 * @return the estudiantes
	 */
	public Estudiante[] getEstudiantes() 
	{
		return estudiantes;
	}

	/**
	 * @param estudiantes the estudiantes to set
	 */
	public void setEstudiantes(Estudiante[] estudiantes) 
	{
		this.estudiantes = estudiantes;
	}

	/**
	 * Permite calcular el promedio de notas finales de los estudiantes
	 * de un curso.
	 * pre: El arreglo de estudiantes debe estar inicializado. Puede estar vacio. 
	 * post: Se calculó el promedio de notas finales de los estudiantes.
	 * @return promedio, promedio de notas de los estudiantes. 
	 */
	public double calcularPromedioCurso()
	{
		double suma = 0.0;
		double promedio = 0.0;

		for(int i = 0; i < estudiantes.length; i++)
		{
			suma = suma + estudiantes[i].getNotaFinal();
		}
		promedio = suma / estudiantes.length;
		return promedio;
	}


	// METODO PRINCIPAL
	public static void main(String[] args) 
	{
		Curso c1 = new Curso("APO2");
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		while(contador < 3)
		{
			System.out.println("Por favor ingrese  su codigo: ");
			String codigo = sc.nextLine();

			System.out.println("Por favor ingrese  su nombre: ");
			String nombre = sc.nextLine();

			System.out.println("Por favor ingrese  su nota final: ");
			double notaFinal = Double.parseDouble(sc.nextLine());
			
			System.out.println();

			Estudiante estudiante = new Estudiante(codigo, nombre, notaFinal);
			c1.estudiantes[contador] = estudiante;
			
			contador++;
		}

		sc.close();
		System.out.println(c1.calcularPromedioCurso());

	}



}
