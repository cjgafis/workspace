package mundo;

import java.util.Scanner;

public class Aplicacion 
{
	public static void main(String[] args) 
	{
		Tienda d1 = new Tienda();
		Scanner sc = new Scanner(System.in);
		String continuar = "si";
		while(continuar.equalsIgnoreCase("si"))
		{

			System.out.println("========== MENÚ ==========" +
					"\n1. Vender productos..." +
					"\n2. Surtir tienda..." +
					"\n3. Ver inventario..." +
					"\n4. Salir..." +
					"\n\nPor favor ingrese el numero de la opción deseada: ");
			int opcion = Integer.parseInt(sc.nextLine());

			switch(opcion)
			{
			case 1:
			{
				System.out.println("Vender productos...");
				System.out.println("Por favor ingrese el codigo del producto a vender: ");
				String codigo = sc.nextLine();
				System.out.println("Por favor ingrese la cantidad a vender: ");
				int cantidad = Integer.parseInt(sc.nextLine());
				d1.vender(codigo, cantidad);
				break;
			}
			case 2:
			{
				System.out.println("Surtir tienda...");
				System.out.println("Por favor ingrese el codigo del producto a surtir: ");
				String codigo = sc.nextLine();
				System.out.println("Por favor ingrese la cantidad a surtir: ");
				int cantidad = Integer.parseInt(sc.nextLine());
				d1.surtir(codigo, cantidad);
				break;
			}
			case 3:
			{
				System.out.println("Ver inventario...");
				d1.mostrarProductos();
				break;
			}
			case 4:
			{
				System.out.println("Para volver al menú escriba \"si\" para salir escriba \"no\". ");
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
