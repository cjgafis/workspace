package mundo;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Curso curso2 = new Curso();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do
		{
			System.out.println("\n================ MENU ==============" +
					"\n1. Listar estudiantes." +
					"\n2. Agregar estudiante." +
					"\n3. Actualizar estudiante." +
					"\n4. Eliminar estudiante." +
					"\n5. Salir." +
					"\n======================================");

			System.out.println("Ingrese el numero de la opcion deseada.");
			opcion = Integer.parseInt(sc.nextLine());

			switch(opcion)
			{
			case 1:
			{
				// Listar estudiantes
				System.out.println("Estudiantes:");
				for (Estudiante estudiante : curso2.listarEstudiantes()) 
				{
					System.out.println(estudiante.getCodigo() + ": " + estudiante.getNombre() + " " + estudiante.getApellido());
				}
				break;
			}
			case 2:
			{
				// Agregar estudiante
				System.out.println("Ingrese el codigo del estudiante: ");
				int codigo = Integer.parseInt(sc.nextLine());
				System.out.println("Ingrese el nombre del estudiante: ");
				String nombre = sc.nextLine();
				System.out.println("Ingrese el apellido del estudiante: ");
				String apellido = sc.nextLine();
				Estudiante nuevoEstudiante = new Estudiante(codigo, nombre, apellido);
				if (curso2.agregarEstudiante(nuevoEstudiante)) 
				{
					System.out.println("Estudiante agregado correctamente.");
				} 
				else 
				{
					System.out.println("Error al agregar estudiante.");
				}
				break;
			}
			case 3:
			{
				// Actualizar estudiante
				System.out.println("Ingrese el codigo del estudiante: ");
				int codigo = Integer.parseInt(sc.nextLine());
				System.out.println("Ingrese el nombre del estudiante: ");
				String nombre = sc.nextLine();
				System.out.println("Ingrese el apellido del estudiante: ");
				String apellido = sc.nextLine();
				Estudiante estudianteActualizado = new Estudiante(codigo, nombre, apellido);
				if (curso2.actualizarEstudiante(estudianteActualizado)) 
				{
					System.out.println("Estudiante actualizado correctamente.");
				} 
				else 
				{
					System.out.println("Error al actualizar estudiante.");
				}
				break;
			}
			case 4:
			{
				// Eliminar estudiante
				System.out.println("Ingrese el codigo del estudiante: ");
				int codigoEstudiante = Integer.parseInt(sc.nextLine());
				if (curso2.eliminarEstudiante(codigoEstudiante)) 
				{
					System.out.println("Estudiante eliminado correctamente.");
				} 
				else 
				{
					System.out.println("Error al eliminar estudiante.");
				}
				break;
			}
			case 5:
			{
				System.out.println("Saliendo...");
				break;
			}
			default:
			{
				System.out.println("Opcion invalida.");
				break;
			}
			}
		}
		while(opcion != 5);
		sc.close();
	}
}
