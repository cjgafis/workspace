package mundo;

import java.util.List;
import java.util.Scanner;

public class Aplicacion 
{
	public static void main(String[] args) 
	{
		SistemaGestionEstudiantes sistema = new SistemaGestionEstudiantes();
		sistema.cargarCursos();
		Scanner scanner = new Scanner(System.in);

		while (true) 
		{
			System.out.println("Menú:");
			System.out.println("1. Agregar curso");
			System.out.println("2. Agregar estudiante a un curso");
			System.out.println("3. Buscar estudiantes");
			System.out.println("4. Mostrar estudiantes de un curso");
			System.out.println("5. Calcular promedio de edad de un curso");
			System.out.println("6. Ordenar estudiantes por edad");
			System.out.println("7. Guardar cursos");
			System.out.println("8. Salir");

			System.out.print("Ingrese la opción deseada: ");
			int opcion = scanner.nextInt();
			scanner.nextLine(); // Consumir el salto de línea

			switch (opcion) 
			{
			case 1:
			{
				System.out.print("Ingrese el nombre del curso: ");
				String nombreCurso = scanner.nextLine();
				sistema.agregarCurso(new Curso(nombreCurso));
				break;
			}
			case 2:
			{
				System.out.print("Ingrese el nombre del curso: ");
				String nombreCurso = scanner.nextLine();
				Curso curso = sistema.buscarCurso(nombreCurso);
				if (curso != null) 
				{
					System.out.print("Ingrese el nombre del estudiante: ");
					String nombreEstudiante = scanner.nextLine();
					System.out.print("Ingrese la edad del estudiante: ");
					int edadEstudiante = scanner.nextInt();
					scanner.nextLine(); // Consumir el salto de línea
					curso.agregarEstudiante(new Estudiante(nombreEstudiante, edadEstudiante));
				} 
				else 
				{
					System.out.println("Curso no encontrado.");
				}
				break;
			}
			case 3:
			{
				System.out.print("Ingrese el término de búsqueda: ");
				String terminoBusqueda = scanner.nextLine();
				List<Estudiante> estudiantesEncontrados = sistema.buscarEstudiantes(terminoBusqueda);
				System.out.println("Estudiantes encontrados: " + estudiantesEncontrados);
				break;
			}
			case 4:
			{
				System.out.print("Ingrese el nombre del curso: ");
				String nombreCurso = scanner.nextLine();
				List<Estudiante> estudiantesDeCurso = sistema.estudiantesDeCurso(nombreCurso);
				System.out.println("Estudiantes del curso " + nombreCurso + ": " + estudiantesDeCurso);
				break;
			}
			case 5:
			{
				System.out.print("Ingrese el nombre del curso: ");
				String nombreCurso = scanner.nextLine();
				double promedioEdad = sistema.promedioEdadEstudiantes(nombreCurso);
				System.out.println("Promedio de edad de los estudiantes del curso " + nombreCurso + ": " + promedioEdad);
				break;
			}
			case 6:
			{
				List<Estudiante> estudiantesOrdenados = sistema.ordenarEstudiantesPorEdad();
				System.out.println("Estudiantes ordenados por edad: " + estudiantesOrdenados);
				break;
			}
			case 7:
			{
				sistema.guardarCursos();
				System.out.println("Cursos guardados.");
				break;
			}
			case 8:
			{
				System.out.println("Saliendo...");
				scanner.close();
				return;
			}
			default:
			{
				System.out.println("Opción inválida. Intente nuevamente.");
			}
			}
		}
	}
}


