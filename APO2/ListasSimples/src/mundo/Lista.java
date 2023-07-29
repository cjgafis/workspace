package mundo;

/**
 * 
 * @author CelsoJavier
 *  Fuente: https://youtu.be/TjlPQPRfWFk?list=PLTd5ehIj0goMTSK7RRAPBF4wP-Nj5DRvT
 */

public class Lista 
{
	// ATRIBUTOS
	private Nodo inicio;
	private int tamanio;
	
	// METODO CONSTRUCTOR
	public Lista()
	{
		inicio = null;
		tamanio = 0;
	}

	public void insertarAlPrincipio(Libro libro)
	{
		Nodo nuevoNodo = new Nodo(libro);
		nuevoNodo.setSiguiente(inicio);
		inicio = nuevoNodo;
		tamanio++;
	}

	public void insertarAlFinal(Libro libro)
	{
		Nodo nuevoNodo = new Nodo(libro);
		Nodo puntero = null;
		if(inicio == null)
		{
			inicio = nuevoNodo;
			tamanio++;
		}
		else
		{
			puntero = inicio;
			while(puntero.getSiguiente() != null)
			{
				puntero = puntero.getSiguiente();
			}
			puntero.setSiguiente(nuevoNodo);	
			tamanio++;
		}
	}

	public void insertarDespues(int n, Libro libro)
	{
		Nodo nuevoNodo = new Nodo(libro);
		Nodo puntero = null;
		if(inicio == null)
		{
			inicio = nuevoNodo;
			tamanio++;
		}
		else
		{
			puntero = inicio;
			int contador = 0;
			while(contador < n && puntero.getSiguiente() != null)
			{
				puntero = puntero.getSiguiente();
				contador++;
			}
			nuevoNodo.setSiguiente(puntero.getSiguiente());
			puntero.setSiguiente(nuevoNodo);	
			tamanio++;
		}		
	}

	public Libro obtener(int n)
	{
		Nodo puntero = null;
		if(inicio == null)
		{
			return null;
		}
		else
		{
			puntero = inicio;
			int contador = 0;			
			while(contador < n && puntero.getSiguiente() != null)
			{
				puntero = puntero.getSiguiente(); 
				contador++;
			}
			if(contador != n)
			{
				return null;
			}
			else
			{
				return puntero.getLibro();
			}		
		}
	}

	public int darTamanio()
	{
		return tamanio;
	}

	public boolean estaVacia()
	{
		boolean respuesta = false;
		if(inicio == null)
		{
			respuesta = true;
		}
		return respuesta;
	}

	public void eliminarElprimero()
	{
		if(inicio == null)
		{
			System.out.println("No hay libros para eliminar.");
		}
		else
		{
			Nodo puntero = inicio;
			inicio = inicio.getSiguiente();
			puntero.setSiguiente(null);
			tamanio--;
		}	
	}

	public void eliminarElUltimo()
	{
		if(inicio != null)
		{
			if(inicio.getSiguiente() == null)
			{
				inicio = null;
				tamanio--;
			}
			else
			{
				Nodo puntero = inicio;
				while(puntero.getSiguiente().getSiguiente() != null)
				{
					puntero = puntero.getSiguiente();
				}
				puntero.setSiguiente(null);
				tamanio--;
			}
		}
		else
		{
			System.out.println("No hay libros para eliminar.");
		}
	}

	public void eliminarEnPosicion(int n)
	{
		Nodo primero = null;
		Nodo puntero = null;
		if(inicio != null)
		{
			if(n == 0)
			{
				primero = inicio;
				inicio = inicio.getSiguiente();
				primero.setSiguiente(null);
				tamanio--;
			}
			else if(n < tamanio)
			{
				puntero = inicio;
				int contador = 0;
				while(contador < (n-1))
				{
					puntero = puntero.getSiguiente();
					contador++;
				}
				Nodo temp = puntero.getSiguiente();
				puntero.setSiguiente(temp.getSiguiente());
				temp.setSiguiente(null);
				tamanio--;
			}
		}
		else
		{
			System.out.println("No hay libros para eliminar.");
		}

	}

	public void verLibros()
	{
		Nodo puntero = null;
		if(inicio == null)
		{
			System.out.println("No hay libros en la lista.");
		}
		else
		{
			puntero = inicio;
			while(puntero != null)
			{
				System.out.println(puntero.getLibro());
				puntero = puntero.getSiguiente();
			}
		}
	}
	
	public double calcularPromedioPrecioLibros() 
	{
		double promedio = 0.0;
		if(inicio == null)
		{
			System.out.println("No hay libros en la lista.");
			return promedio;
		}
		else
		{
			double suma = 0.0;
			int contador = 0;
			Nodo puntero = inicio;
			
			while(puntero != null)
			{
				suma = suma  + puntero.getLibro().getPrecio();
				contador++;
				puntero = puntero.getSiguiente();
			}
			promedio = suma / contador;
		}
		return promedio;
	}

}
