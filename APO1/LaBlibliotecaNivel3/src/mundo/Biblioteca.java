package mundo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca 
{
	private ArrayList<Libro> libros;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Prestamo> prestamos;

	public Biblioteca() 
	{
		libros = new ArrayList<>();
		usuarios = new ArrayList<>();
		prestamos = new ArrayList<>();
	}

	public void agregarLibro(Libro libro) 
	{
		libros.add(libro);
	}

	public void agregarUsuario(Usuario usuario) 
	{
		usuarios.add(usuario);
	}

	public ArrayList<Libro> buscarLibro(String parametro) 
	{
		ArrayList<Libro> resultados = new ArrayList<>();
		for (Libro libro : libros) 
		{
			if (libro.getTitulo().equalsIgnoreCase(parametro) || 
					libro.getAutor().equalsIgnoreCase(parametro) || 
					libro.getCategoria().equalsIgnoreCase(parametro)) 
			{
				resultados.add(libro);
			}
		}
		return resultados;
	}

	public boolean consultarDisponibilidad(Libro libro) 
	{
		return libro.isEstado();
	}

	public void realizarPrestamo(Usuario usuario, Libro libro, 
			LocalDate fechaPrestamo, LocalDate fechaDevolucion) 
	{
		if (consultarDisponibilidad(libro)) 
		{
			Prestamo prestamo = new Prestamo(libro, usuario, fechaPrestamo, fechaDevolucion);
			prestamos.add(prestamo);
			usuario.agregarPrestamo(prestamo);
			libro.setEstado(false);
		} 
		else 
		{
			System.out.println("El libro no está disponible.");
		}
	}

	public void devolverLibro(Prestamo prestamo) 
	{
		prestamo.getLibro().setEstado(true);
		prestamo.getUsuario().eliminarPrestamo(prestamo);
		prestamos.remove(prestamo);
	}

	public ArrayList<Libro> listarLibrosDisponibles() 
	{
		ArrayList<Libro> librosDisponibles = new ArrayList<Libro>();
		for (Libro libro : libros) 
		{
			if (libro.isEstado()) 
			{
				librosDisponibles.add(libro);
			}
		}
		return librosDisponibles;
	}

	public ArrayList<Usuario> listarUsuariosRegistrados() 
	{
		return usuarios;
	}

	public ArrayList<Prestamo> listarPrestamosActivos() 
	{
		return prestamos;
	}

	public ArrayList<Prestamo> listarHistorialPrestamosUsuario(Usuario usuario) 
	{
		ArrayList<Prestamo> historialPrestamos = new ArrayList<Prestamo>();
		for (Prestamo prestamo : prestamos) 
		{
			if (prestamo.getUsuario().equals(usuario)) 
			{
				historialPrestamos.add(prestamo);
			}
		}
		return historialPrestamos;
	}


}
