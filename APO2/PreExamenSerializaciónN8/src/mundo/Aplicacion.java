package mundo;

import java.util.Scanner;

public class Aplicacion 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Curso curso = new Curso();
		int opcion;

		do 
		{
			System.out.println("\nMenú:");
			System.out.println("1. Listar estudiantes");
			System.out.println("2. Buscar estudiante");
			System.out.println("3. Agregar estudiante");
			System.out.println("4. Cambiar estudiante");
			System.out.println("5. Eliminar estudiante");
			System.out.println("0. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextInt();
			scanner.nextLine(); // Consumir el salto de línea

			switch (opcion) 
			{
			case 1:
				curso.listarEstudiantes();
				break;
			case 2:
				System.out.print("Ingrese el ID del estudiante a buscar: ");
				int idBuscar = scanner.nextInt();
				Estudiante estudianteEncontrado = curso.buscarEstudiante(idBuscar);
				System.out.println(estudianteEncontrado != null ? estudianteEncontrado : "Estudiante no encontrado");
				break;
			case 3:
				System.out.print("Ingrese el nombre del estudiante: ");
				String nombre = scanner.nextLine();
				System.out.print("Ingrese el apellido del estudiante: ");
				String apellido = scanner.nextLine();
				System.out.print("Ingrese el ID del estudiante: ");
				int id = scanner.nextInt();
				Estudiante estudiante = new Estudiante(nombre, apellido, id);
				curso.agregarEstudiante(estudiante);
				break;
			case 4:
				System.out.print("Ingrese el ID del estudiante a cambiar: ");
				int idCambiar = scanner.nextInt();
				scanner.nextLine(); // Consumir el salto de línea
				System.out.print("Ingrese el nuevo nombre del estudiante: ");
				String nuevoNombre = scanner.nextLine();
				System.out.print("Ingrese el nuevo apellido del estudiante: ");
				String nuevoApellido = scanner.nextLine();
				System.out.print("Ingrese el nuevo ID del estudiante: ");
				int nuevoId = scanner.nextInt();
				Estudiante nuevoEstudiante = new Estudiante(nuevoNombre, nuevoApellido, nuevoId);
				curso.cambiarEstudiante(idCambiar, nuevoEstudiante);
				break;
			case 5:
				System.out.print("Ingrese el ID del estudiante a eliminar: ");
				int idEliminar = scanner.nextInt();
				curso.eliminarEstudiante(idEliminar);
				break;
			case 0:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Por favor, intente de nuevo.");
			}
		} while (opcion != 0);

		scanner.close();
	}
}
