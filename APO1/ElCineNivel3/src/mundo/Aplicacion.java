package mundo;

import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacion 
{
	public static void main(String[] args) 
	{
		Cinema cinema = new Cinema();
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do 
		{
			System.out.println("Bienvenido al sistema de reservas de cine");
			System.out.println("1. Agregar película");
			System.out.println("2. Listar películas");
			System.out.println("3. Buscar película por título");
			System.out.println("4. Modificar información de una película");
			System.out.println("5. Eliminar película");
			System.out.println("6. Agregar sala");
			System.out.println("7. Listar salas");
			System.out.println("8. Buscar sala por ID");
			System.out.println("9. Modificar configuración de una sala");
			System.out.println("10. Eliminar sala");
			System.out.println("11. Agregar cliente");
			System.out.println("12. Listar clientes");
			System.out.println("13. Buscar cliente por nombre");
			System.out.println("14. Modificar información de un cliente");
			System.out.println("15. Eliminar cliente");
			System.out.println("16. Crear reserva");
			System.out.println("17. Listar reservas");
			System.out.println("18. Buscar reserva por ID o nombre de cliente");
			System.out.println("19. Modificar reserva");
			System.out.println("20. Cancelar reserva");
			System.out.println("21. Mostrar asientos disponibles en una sala para una película específica");
			System.out.println("22. Mostrar películas con asientos disponibles en una sala específica");
			System.out.println("23. Mostrar total de asientos disponibles y reservados en una sala");
			System.out.println("24. Generar informe de ventas por película");
			System.out.println("25. Generar informe de ventas por sala");
			System.out.println("0. Salir");
			System.out.print("Ingrese la opción deseada: ");

			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				// Agregar película
				break;
			case 2:
				// Listar películas
				break;
			case 3:
				// Buscar película por título
				break;
			case 4:
				// Modificar información de una película
				break;
			case 5:
				// Eliminar película
				break;
			case 6:
				// Agregar sala
				break;
			case 7:
				// Listar salas
				break;
			case 8:
				// Buscar sala por ID
				break;
			case 9:
				// Modificar configuración de una sala
				break;
			case 10:
				// Eliminar sala
				break;
			case 11:
				// Agregar cliente
				break;
			case 12:
				// Listar clientes
				break;
			case 13:
				// Buscar cliente por nombre
				break;
			case 14:
				// Modificar información de un cliente
				break;
			case 15:
				// Eliminar cliente
				break;
			case 16:
				// Crear reserva
				break;
			case 17:
				// Listar reservas
				break;
			case 18:
				// Buscar reserva por ID o nombre de cliente
				break;
			case 19:
				// Modificar reserva
				break;
			case 20:
				// Cancelar reserva
				break;
			case 21:
				// Mostrar asientos disponibles en una sala para una película específica
				break;
			case 22:
				// Mostrar películas con asientos disponibles en una sala específica
				break;
			case 23:
				// Mostrar total de asientos disponibles y reservados en una sala
				break;
			case 24:
				// Generar informe de ventas por película
				break;
			case 25:
				// Generar informe de ventas por sala
				break;
			case 26:
				// Generar informe de ventas por cliente
				break;
			case 0:
				System.out.println("Gracias por utilizar el sistema de reservas de cine.");
				break;
			default:
				System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
				break;
			}

		} while (opcion != 0);

		scanner.close();
	}
}
