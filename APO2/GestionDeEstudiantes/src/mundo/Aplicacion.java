package mundo;

import java.util.Scanner;

public class Aplicacion 
{

	public static void main(String[] args) 
	{
		Curso apo2 = new Curso();
		Scanner teclado = new Scanner(System.in);

		String continuar = "s";
		do
		{
			System.out.println("======= MENU ======= ");
			System.out.println("1. Listar");
			System.out.println("2. Buscar por ID");
			System.out.println("3. Agregar ");
			System.out.println("4. Eliminar ");
			System.out.println("0. Salir ");
			System.out.println("==================== ");
			System.out.println();
			System.out.println("Por favor ingrese el numero de la opción deseada... ");
			int opcion = Integer.parseInt(teclado.nextLine());

			switch(opcion)
			{
			case 1:
			{
				apo2.listar();
				break;
			}
			case 2:
			{
				System.out.println("Por favor ingrese el ID del estudiante a buscar:  ");
				int id = Integer.parseInt(teclado.nextLine());
				apo2.buscarPorId(id);
				break;
			}
			case 3:
			{
				System.out.println("Por favor ingrese el nombre del estudiante a agregar:  ");
				String nombre = (teclado.nextLine());
				System.out.println("Por favor ingrese el apellido del estudiante a agregar:  ");
				String apellido = (teclado.nextLine());
				System.out.println("Por favor ingrese el ID del estudiante a buscar:  ");
				int id = Integer.parseInt(teclado.nextLine());
				Estudiante nuevo = new Estudiante(nombre, apellido, id);
				apo2.agregarEstudiante(nuevo);
				break;
			}
			case 4:
			{
				System.out.println("Por favor ingrese el ID del estudiante a eliminar:  ");
				int id = Integer.parseInt(teclado.nextLine());
				apo2.eliminarEstudiante(id);
				break;
			}
			case 0:
			{
				continuar = "n";
				break;
			}
			default:
			{
				System.out.println("Opción invalida. ");
				break;
			}
			}
			System.out.println("\nSi desea continuar escriba (s) de lo contrario escriba otra letra. ");
			continuar = (teclado.nextLine());
		}
		
		while(continuar.equalsIgnoreCase("s"));
		teclado.close();
	}

}
