package mundo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion 
{

	public static void main(String[] args) 
	{
		Biblioteca biblioteca = new Biblioteca();
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do 
		{
			System.out.println("\n--- Menú Biblioteca ---");
			System.out.println("1. Agregar libro");
			System.out.println("2. Agregar usuario");
			System.out.println("3. Buscar libro");
			System.out.println("4. Consultar disponibilidad de un libro");
			System.out.println("5. Realizar préstamo");
			System.out.println("6. Devolver libro");
			System.out.println("7. Listar libros disponibles");
			System.out.println("8. Listar usuarios registrados");
			System.out.println("9. Listar préstamos activos");
			System.out.println("10. Listar prestamos activos de un usuario");
			System.out.println("0. Salir");
			System.out.print("Ingrese el número de una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) 
			{
			case 1:
			{
				// Agregar libro
				scanner.nextLine(); // Consume el salto de línea que queda en el buffer del scanner
				System.out.print("Ingrese el título del libro: ");
				String titulo = scanner.nextLine();
				System.out.print("Ingrese el autor del libro: ");
				String autor = scanner.nextLine();
				System.out.print("Ingrese el ISBN del libro: ");
				String isbn = scanner.nextLine();
				System.out.print("Ingrese la categoría del libro: ");
				String categoria = scanner.nextLine();

				Libro nuevoLibro = new Libro(titulo, autor, isbn, categoria);
				biblioteca.agregarLibro(nuevoLibro);
				System.out.println("Libro agregado exitosamente.");
				break;
			}
			case 2:
			{
				// Agregar usuario
				scanner.nextLine(); // Consume el salto de línea que queda en el buffer del scanner
				System.out.print("Ingrese el nombre del usuario: ");
				String nombre = scanner.nextLine();
				System.out.print("Ingrese el apellido del usuario: ");
				String apellido = scanner.nextLine();
				System.out.print("Ingrese el identificación del usuario: ");
				String identificacion = scanner.nextLine();
				System.out.print("Ingrese el correo del usuario: ");
				String correo = scanner.nextLine();

				Usuario nuevoUsuario = new Usuario(nombre, apellido, identificacion, correo);
				biblioteca.agregarUsuario(nuevoUsuario);
				System.out.println("Usuario registrado exitosamente.");
				break;
			}
			case 3:
			{
				// Buscar libro
				scanner.nextLine(); // Consume el salto de línea que queda en el buffer del scanner
				System.out.print("Ingrese el título, autor o categoría del libro que desea buscar: ");
				String parametro = scanner.nextLine();

				ArrayList<Libro> resultados = biblioteca.buscarLibro(parametro);

				if (resultados.isEmpty()) 
				{
					System.out.println("No se encontraron libros con ese criterio de búsqueda.");
				} 
				else 
				{
					System.out.println("\nResultados de la búsqueda:");
					for (Libro libro : resultados) 
					{
						System.out.println("Título: " + libro.getTitulo() + " | Autor: " + libro.getAutor() + " | Categoría: " + libro.getCategoria());
					}
				}
				break;
			}
			case 4:
			{
				// Consultar disponibilidad de un libro
				scanner.nextLine(); // Consume el salto de línea que queda en el buffer del scanner
				System.out.print("Ingrese el título del libro que desea consultar: ");
				String tituloConsulta = scanner.nextLine();

				ArrayList<Libro> librosEncontrados = biblioteca.buscarLibro(tituloConsulta);

				if (librosEncontrados.isEmpty()) 
				{
					System.out.println("No se encontró un libro con ese título.");
				} 
				else 
				{
					Libro libroAConsultar = librosEncontrados.get(0); // Tomamos el primer libro encontrado con el título ingresado
					boolean disponibilidad = biblioteca.consultarDisponibilidad(libroAConsultar);
					if (disponibilidad) 
					{
						System.out.println("El libro '" + libroAConsultar.getTitulo() + "' está disponible.");
					} 
					else 
					{
						System.out.println("El libro '" + libroAConsultar.getTitulo() + "' no está disponible.");
					}
				}
				break;
			}
			case 5:
			{
				// Realizar préstamo
				scanner.nextLine(); // Consume el salto de línea que queda en el buffer del scanner
				System.out.print("Ingrese la identificación del usuario que desea realizar el préstamo: ");
				String identificacionUsuario = scanner.nextLine();

				Usuario usuarioPrestamo = null;
				for (Usuario usuario : biblioteca.listarUsuariosRegistrados()) 
				{
					if (usuario.getIdentificacion().equals(identificacionUsuario)) 
					{
						usuarioPrestamo = usuario;
						break;
					}
				}

				if (usuarioPrestamo == null) 
				{
					System.out.println("Usuario no registrado.");
				} 
				else 
				{
					System.out.print("Ingrese el título del libro que desea prestar: ");
					String tituloPrestamo = scanner.nextLine();
					ArrayList<Libro> librosEncontrados = biblioteca.buscarLibro(tituloPrestamo);

					if (librosEncontrados.isEmpty()) 
					{
						System.out.println("No se encontró un libro con ese título.");
					} 
					else 
					{
						Libro libroAPrestar = librosEncontrados.get(0); // Tomamos el primer libro encontrado con el título ingresado
						if (biblioteca.consultarDisponibilidad(libroAPrestar)) 
						{
							System.out.print("Ingrese la fecha del préstamo en formato yyyy-mm-dd: ");
							LocalDate fechaPrestamo = LocalDate.parse(scanner.nextLine());
							System.out.print("Ingrese la fecha de devolución en formato yyyy-mm-dd: ");
							LocalDate fechaDevolucion = LocalDate.parse(scanner.nextLine());

							biblioteca.realizarPrestamo(usuarioPrestamo, libroAPrestar, fechaPrestamo, fechaDevolucion);
							System.out.println("Préstamo realizado exitosamente.");
						} 
						else 
						{
							System.out.println("El libro no está disponible.");
						}
					}
				}
				break;
			}
			case 6:
			{
				// Devolver libro
				scanner.nextLine(); // Consume el salto de línea que queda en el buffer del scanner
				System.out.print("Ingrese el DNI del usuario que desea devolver el libro: ");
				String identificacionUsuarioDevolucion = scanner.nextLine();

				Usuario usuarioDevolucion = null;
				for (Usuario usuario : biblioteca.listarUsuariosRegistrados()) 
				{
					if (usuario.getIdentificacion().equals(identificacionUsuarioDevolucion)) 
					{
						usuarioDevolucion = usuario;
						break;
					}
				}

				if (usuarioDevolucion == null) 
				{
					System.out.println("Usuario no registrado.");
				} 
				else 
				{
					System.out.print("Ingrese el título del libro que desea devolver: ");
					String tituloDevolucion = scanner.nextLine();
					ArrayList<Libro> librosEncontrados = biblioteca.buscarLibro(tituloDevolucion);

					if (librosEncontrados.isEmpty()) 
					{
						System.out.println("No se encontró un libro con ese título.");
					} 
					else 
					{
						Libro libroADevolver = librosEncontrados.get(0); // Tomamos el primer libro encontrado con el título ingresado
						Prestamo prestamoADevolver = null;
						for (Prestamo prestamo : biblioteca.listarPrestamosActivos()) 
						{
							if (prestamo.getUsuario().equals(usuarioDevolucion) && prestamo.getLibro().equals(libroADevolver)) 
							{
								prestamoADevolver = prestamo;
								break;
							}
						}
						if (prestamoADevolver == null) 
						{
							System.out.println("No se encontró un préstamo activo de ese libro para el usuario.");
						} 
						else 
						{
							System.out.print("Ingrese la fecha de devolución real en formato yyyy-mm-dd: ");
							LocalDate fechaDevolucionReal = LocalDate.parse(scanner.nextLine());

							biblioteca.devolverLibro(prestamoADevolver);
							System.out.println("Libro devuelto exitosamente en la fecha: " + fechaDevolucionReal );
						}
					}
				}
				break;
			}
			case 7:
			{
				// Listar libros disponibles
			    ArrayList<Libro> librosDisponibles = biblioteca.listarLibrosDisponibles();

			    if (librosDisponibles.isEmpty()) 
			    {
			        System.out.println("No hay libros disponibles en este momento.");
			    } 
			    else 
			    {
			        System.out.println("\nLibros disponibles:");
			        for (Libro libro : librosDisponibles) 
			        {
			            String libroInfo = libro.getTitulo() + " (" + libro.getAutor() + ") - Categoría: " + libro.getCategoria();
			            System.out.println(libroInfo);
			        }
			    }
				break;
			}
			case 8:
			{
				// Listar usuarios registrados
				ArrayList<Usuario> usuariosRegistrados = biblioteca.listarUsuariosRegistrados();

				if (usuariosRegistrados.isEmpty()) 
				{
					System.out.println("No hay usuarios registrados en este momento.");
				} 
				else 
				{
					System.out.println("\nUsuarios registrados:");
					for (Usuario usuario : usuariosRegistrados) 
					{
						String usuarioInfo = usuario.getNombre() + " " + usuario.getApellido() + " (Identificación: " + usuario.getIdentificacion() + ")";
						System.out.println(usuarioInfo);
					}
				}
				break;
			}
			case 9:
			{
				// Listar préstamos activos
				ArrayList<Prestamo> prestamosActivos = biblioteca.listarPrestamosActivos();

				if (prestamosActivos.isEmpty()) 
				{
					System.out.println("No hay préstamos activos en este momento.");
				} 
				else 
				{
					System.out.println("\nPréstamos activos:");
					for (Prestamo prestamo : prestamosActivos) 
					{
						String usuarioInfo = prestamo.getUsuario().getNombre() + " " + prestamo.getUsuario().getApellido() + " (Identificación: " + prestamo.getUsuario().getIdentificacion() + ")";
						String libroInfo = prestamo.getLibro().getTitulo() + " (" + prestamo.getLibro().getAutor() + ")";
						String fechaPrestamo = prestamo.getFechaPrestamo().toString();
						String fechaDevolucion = prestamo.getFechaDevolucion().toString();

						System.out.println("\nUsuario: " + usuarioInfo);
						System.out.println("Libro: " + libroInfo);
						System.out.println("Fecha de préstamo: " + fechaPrestamo);
						System.out.println("Fecha de devolución: " + fechaDevolucion);
					}
				}
				break;
			}
			case 10:
			{
				// Listar historial de préstamos de un usuario
				scanner.nextLine(); // Consume el salto de línea que queda en el buffer del scanner
				System.out.print("Ingrese la identificación del usuario cuyo historial de préstamos desea ver: ");
				String dniUsuarioHistorial = scanner.nextLine();

				Usuario usuarioHistorial = null;
				for (Usuario usuario : biblioteca.listarUsuariosRegistrados()) 
				{
					if (usuario.getIdentificacion().equals(dniUsuarioHistorial)) 
					{
						usuarioHistorial = usuario;
						break;
					}
				}

				if (usuarioHistorial == null) 
				{
					System.out.println("Usuario no registrado.");
				} 
				else 
				{
					ArrayList<Prestamo> historialPrestamos = biblioteca.listarHistorialPrestamosUsuario(usuarioHistorial);

					if (historialPrestamos.isEmpty()) 
					{
						System.out.println("El usuario no tiene préstamos en su historial.");
					} 
					else 
					{
						System.out.println("\nHistorial de préstamos del usuario:");
						for (Prestamo prestamo : historialPrestamos) 
						{
							String libroInfo = prestamo.getLibro().getTitulo() + " (" + prestamo.getLibro().getAutor() + ")";
							String fechaPrestamo = prestamo.getFechaPrestamo().toString();
							String fechaDevolucion = prestamo.getFechaDevolucion().toString();

							System.out.println("Libro: " + libroInfo);
							System.out.println("Fecha de préstamo: " + fechaPrestamo);
							System.out.println("Fecha de devolución: " + fechaDevolucion);
						}
					}
				}
				break;
			}
			case 0:
			{
				System.out.println("Saliendo...");
				break;
			}
			default:
			{
				System.out.println("Opción inválida, por favor intente nuevamente.");
			}

			}
		} 
		while (opcion != 0);

		scanner.close();
	}
}
