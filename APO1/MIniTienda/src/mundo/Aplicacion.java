package mundo;

import java.util.Scanner;

public class Aplicacion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Tienda d1 = new Tienda();
		String continuar = "s";
		while(continuar.equalsIgnoreCase("s"))
		{
			System.out.println("================ MENU ===============" +
					"\n1. Listar productos" +
					"\n2. Buscar producto por codigo" +
					"\n3. Buscar producto por nombre" +
					"\n4. Vender producto" +
					"\n5. Surtir tienda - Compra de producto" +
					"\n6. Mostrasr dinero en caja" +
					"\n7. Total de productos vendidos" +
					"\n8. Producto mas vendido" +
					"\n9. Productos menos vendido" +
					"\n=====================================");
			
			System.out.println("\nIngrese el numero de la opcion del menu...");
			int opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) 
			{
			case 1:
			{
				System.out.println("1. Listar productos");
				d1.listarProductos();

				break;
			}
			case 2:
			{
				System.out.println("2. Buscar producto por codigo");
				System.out.println("Ingrese el codigo del producto a buscar: ");
				String codigo = sc.nextLine();
				System.out.println(d1.buscarProductoPorCodigo(codigo));
				
				break;
			}
			case 3:
			{
				System.out.println("3. Buscar producto por nombre");
				System.out.println("Ingrese el nombre del producto a buscar: ");
				String nombre = sc.nextLine();
				System.out.println(d1.buscarProductoPorNombre(nombre)); 
				
				break;
			}
			case 4:
			{
				System.out.println("4. Vender producto por codigo");
				System.out.println("Ingrese el codigo del producto a vender: ");
				String codigo = sc.nextLine();
				System.out.println("Ingrese la cantidad: ");
				int cantidad = Integer.parseInt(sc.nextLine());
				d1.vender(codigo, cantidad);
				
				break;
			}
			case 5:
			{
				System.out.println("5. Surtir tienda - Compra de producto");
				System.out.println("Ingrese el codigo del producto a surtir: ");
				String codigo = sc.nextLine();
				System.out.println("Ingrese la cantidad: ");
				int cantidad = Integer.parseInt(sc.nextLine());
				d1.surtir(codigo, cantidad);
				
				break;
			}
			case 6:
			{
				System.out.println("Dinero en caja");
				System.out.println("El dinero en caja es: " + d1.getDineroEnCaja());

				break;
			}
			case 7:
			{
				System.out.println("7. Total de productos vendidos");
				System.out.println(d1.totalProductosVendidos() + " unidades.");

				break;
			}
			case 8:
			{
				System.out.println("8. Producto mas vendido");
				System.out.println(d1.productoMasVendido());

				break;
			}
			case 9:
			{
				System.out.println("9. Producto menos vendido");
				System.out.println(d1.productoMenosVendido());

				break;
			}
			default:
			{
				System.out.println("Opción no valida.");

				break;
			}
			}
			System.out.println("\nSi desea continuar escriba (s) de lo "
					+ "contrario escriba otra letra...");
			continuar = sc.nextLine();
		}
		sc.close();
	}
	
}
