package mundo;

//Clase Aplicación con método main
public class Aplicacion 
{
	public static void main(String[] args) 
	{
		Profesor profesor = new Profesor("Juan", 40, 3000.0, "Matemáticas");
		Investigador investigador = new Investigador("Ana", 35, 3500.0, "Inteligencia Artificial");

		int opcion;
		java.util.Scanner sc = new java.util.Scanner(System.in);

		do 
		{
			System.out.println("Menú de opciones:");
			System.out.println("1. Mostrar información del Profesor");
			System.out.println("2. Mostrar información del Investigador");
			System.out.println("3. Cambiar la materia del Profesor");
			System.out.println("4. Cambiar el área de investigación del Investigador");
			System.out.println("5. Salir");
			System.out.print("\nIngrese la opción deseada: ");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) 
			{
			case 1:
				System.out.println(profesor);
				break;
			case 2:
				System.out.println(investigador);
				break;
			case 3:
				System.out.print("Ingrese la nueva materia del Profesor: ");
				String nuevaMateria = sc.nextLine();
				profesor.setMateria(nuevaMateria);
				System.out.println("Materia del profesor actualizada.");
				break;
			case 4:
				System.out.print("Ingrese la nueva área de investigación del Investigador: ");
				String nuevaArea = sc.nextLine();
				investigador.setAreaInvestigacion(nuevaArea);
				System.out.println("Área de investigación del investigador actualizada.");
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Por favor, ingrese una opción correcta.");
				break;
			}
			System.out.println();
		} 
		while (opcion != 5);
		sc.close();
	}
}



