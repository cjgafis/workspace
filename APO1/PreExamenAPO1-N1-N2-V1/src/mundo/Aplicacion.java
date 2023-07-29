package mundo;

import java.util.Scanner;

public class Aplicacion 
{

	public static void main(String[] args) 
	{
		Empresa miEmpresa = new Empresa("Universidad de Ibague", "123");

		Scanner sc = new Scanner(System.in);

		String continuar = "s";
		while(continuar.equalsIgnoreCase("s"))
		{

			System.out.println("\n\n========== MENÚ ==========" +
					"\n1. Listar empleados" +
					"\n2. Buscar empleado por cedula" +
					"\n3. Empleado mas antiguo" +
					"\n4. Empleado mas nuevo" +
					"\n5. Empleado que mas gana" +
					"\n6. Empleado que menos gana" +
					"\n7. Salir..." +
					"\n=============================" +
					"\n\nPor favor ingrese el numero de la opción deseada: ");
			int opcion = Integer.parseInt(sc.nextLine());

			switch(opcion)
			{
			case 1:
			{
				System.out.println("Listar empleados");
				miEmpresa.listarEmpleados();

				break;
			}
			case 2:
			{
				System.out.println("Buscar empleado por cedula");
				System.out.println("Escriba la cedula del empleado a buscar: ");
				String cedula = sc.nextLine();
				System.out.println(miEmpresa.buscarEmpleadoPorCedula(cedula));
				
				break;
			}
			case 3:
			{
				System.out.println("Empleado mas antiguo");
				System.out.println(miEmpresa.empleadoMasAntiguo());

				break;
			}
			case 4:
			{
				System.out.println("Empleado mas nuevo");
				System.out.println(miEmpresa.empleadoMasNuevo());

				break;
			}
			case 5:
			{
				System.out.println("Empleado que mas gana");
				System.out.println(miEmpresa.empleadoQueMasGana());

				break;
			}
			case 6:
			{
				System.out.println("Empleado que menos gana");
				System.out.println(miEmpresa.empleadoQueMenosGana());

				break;
			}
			case 7:
			{
				System.out.println("Para volver al menú escriba \"s\" para salir escriba \"n\". ");
				continuar = sc.nextLine();

				break;
			}
			default:
			{
				System.out.println("Opción invalida.");

				break;
			}
			}
		}
		sc.close();

	}

}
