package mundo;

public class Aplicacion 
{
	public static void main(String[] args) 
	{
		Gato gato = new Gato("Tom");
		int opcion = 0;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		while (opcion != 6) 
		{
			System.out.println("Menú:");
			System.out.println("1. Obtener nombre del gato");
			System.out.println("2. Cambiar nombre del gato");
			System.out.println("3. Obtener tipo de animal");
			System.out.println("4. Hacer que el gato maúlle");
			System.out.println("5. Crear un nuevo gato");
			System.out.println("6. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) 
			{
			case 1:
				System.out.println("Nombre del gato: " + gato.getNombre());
				break;
			case 2:
				System.out.print("Ingrese el nuevo nombre del gato: ");
				String nuevoNombre = scanner.next();
				gato.setNombre(nuevoNombre);
				System.out.println("Nombre del gato actualizado a: " + gato.getNombre());
				break;
			case 3:
				System.out.println("Tipo de animal: " + gato.obtenerTipoAnimal());
				break;
			case 4:
				System.out.println(gato.maullar());
				break;
			case 5:
				System.out.print("Ingrese el nombre del nuevo gato: ");
				String nombreNuevoGato = scanner.next();
				gato = new Gato(nombreNuevoGato);
				System.out.println("Nuevo gato creado con el nombre: " + gato.getNombre());
				break;
			case 6:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción inválida, por favor seleccione una opción del menú.");
			}
			System.out.println();
		}
		scanner.close();
	}
}
