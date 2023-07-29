package interfaz;

import java.util.Scanner;

import mundo.Libro;
import mundo.Lista;

public class Aplicacion 
{
	public static void main(String[] args) 
	{
		Lista miLista = new Lista();
		Scanner sc = new Scanner(System.in);

		String continuar = "s";
		while(continuar.equals("s"))
		{

			System.out.println("Ingrese el numero de una opción:"
					+ "\n1. Insertar un libro al principio de la lista"
					+ "\n2. Insertar un libro al final de la lista "
					+ "\n3. Insertar un libro despues de una posición dada "
					+ "\n4. Obtener el libro de una posición dada de la lista "
					+ "\n5. Dar tamaño de la lista "
					+ "\n6. Preguntar si la lista esta vacia "
					+ "\n7. Eliminar el primer libro de la lista "
					+ "\n8. Eliminar el ultimo libro de la lista "
					+ "\n9. Eliminar un libro dada la posición en la lista "
					+ "\n10. Ver los libros exisentes en la lista ");

			int opcion = sc.nextInt();

			switch (opcion)
			{
			case 1 : 
			{
				System.out.println("Ingrese el titulo del libro: ");
				sc.nextLine();
				String titulo = sc.nextLine();

				System.out.println("Ingrese el autor del libro: ");
				String autor = sc.nextLine();

				System.out.println("Ingrese el ISBN del libro: ");
				String isbn = sc.nextLine();
				
				System.out.println("Ingrese el precio del libro: ");
				double precio = sc.nextDouble();

				Libro libro = new Libro(titulo, autor, isbn, precio);
				miLista.insertarAlPrincipio(libro);

				sc.nextLine();
				break;
			}

			case 2 : 
			{
				System.out.println("Ingrese el titulo del libro: ");
				sc.nextLine();
				String titulo = sc.nextLine();

				System.out.println("Ingrese el autor del libro: ");
				String autor = sc.nextLine();

				System.out.println("Ingrese el ISBN del libro: ");
				String isbn = sc.nextLine();
				
				System.out.println("Ingrese el precio del libro: ");
				double precio = sc.nextDouble();

				Libro libro = new Libro(titulo, autor, isbn, precio);
				miLista.insertarAlFinal(libro);

				sc.nextLine();
				break;
			}

			case 3 : 
			{
				System.out.println("Ingrese el titulo del libro: ");
				sc.nextLine();
				String titulo = sc.nextLine();

				System.out.println("Ingrese el autor del libro: ");
				String autor = sc.nextLine();

				System.out.println("Ingrese el ISBN del libro: ");
				String isbn = sc.nextLine();
				
				System.out.println("Ingrese el precio del libro: ");
				double precio = sc.nextDouble();

				System.out.println("Ingrese la posición: ");
				int posicion = sc.nextInt();
				sc.nextLine();

				Libro libro = new Libro(titulo, autor, isbn, precio);
				miLista.insertarDespues(posicion, libro);

				break;
			}

			case 4 : 
			{
				System.out.println("Ingrese la posición: ");
				int posicion = sc.nextInt();
				System.out.println(miLista.obtener(posicion));

				sc.nextLine();
				break;
			}

			case 5 : 
			{
				System.out.println("El tamaño de la lista es: " + miLista.darTamanio());
				sc.nextLine();
				break;
			}

			case 6 : 
			{
				System.out.println("¿La lista esta vacia? R// " + miLista.estaVacia());
				sc.nextLine();
				break;
			}

			case 7 : 
			{
				miLista.eliminarElprimero();

				sc.nextLine();
				break;
			}

			case 8 : 
			{
				miLista.eliminarElUltimo();

				sc.nextLine();
				break;
			}

			case 9 : 
			{
				System.out.println("Ingrese la posición: ");
				int posicion = sc.nextInt();
				miLista.eliminarEnPosicion(posicion);

				sc.nextLine();
				break;
			}

			case 10 : 
			{
				miLista.verLibros();

				sc.nextLine();
				break;
			}

			default :
			{
				System.out.println("Opción invalida.");
			}
			}

			System.out.println("Escriba S si desea continuar. Otra letra en caso contrario. ");
			continuar = sc.nextLine();
		}
		sc.close();
	}

}
