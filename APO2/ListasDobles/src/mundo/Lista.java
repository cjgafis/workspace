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
	
	// CONSTRUCTOR
	public Lista()
	{
		inicio = null;
		tamanio = 0;
	}

	public void insertarAlPrincipio(Libro libro)
	{
		Nodo nuevoNodo = new Nodo(libro);
		if(inicio == null)
		{
			inicio = nuevoNodo;
			tamanio++;
		}
		else
		{
			inicio.setAnterior(nuevoNodo);
			nuevoNodo.setSiguiente(inicio);
			inicio = nuevoNodo;
			tamanio++;
		}
	}

	public void insertarAlFinal(Libro libro)
	{
		Nodo nuevoNodo = new Nodo(libro);
		
		if(inicio == null)
		{
			inicio = nuevoNodo;
			tamanio++;
		}
		else
		{
			Nodo puntero = inicio;
			while(puntero.getSiguiente() != null)
			{
				puntero = puntero.getSiguiente();
			}
			puntero.setSiguiente(nuevoNodo);	
			nuevoNodo.setAnterior(puntero);
			tamanio++;
		}
	}

	public void insertarDespues(int n, Libro libro)
	{
		Nodo nuevoNodo = new Nodo(libro);
	
		if(inicio == null)
		{
			inicio = nuevoNodo;
			tamanio++;
		}
		else
		{
			Nodo puntero = inicio;
			int contador = 0;
			while(contador < n && puntero.getSiguiente() != null)
			{
				puntero = puntero.getSiguiente();
				contador++;
			}

			if (puntero.getSiguiente()== null)
			{
				insertarAlFinal(libro);
			}
			else		
			{
				puntero.getSiguiente().setAnterior(nuevoNodo);
				nuevoNodo.setSiguiente(puntero.getSiguiente());
				nuevoNodo.setAnterior(puntero);
				puntero.setSiguiente(nuevoNodo);	
				tamanio++;
			}
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
		if(inicio != null)
		{
			Nodo puntero = inicio;
			inicio = inicio.getSiguiente();  
		
			if(inicio != null)
			{
				inicio.setAnterior(null);
				puntero.setSiguiente(null);
				tamanio--;
			}	
			else
			{
				tamanio--;
			}
		}
		else
		{
			System.out.println("No hay nada para eliminar (La lista esta vacia)");
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
			//	while(puntero.getSiguiente() != null) // Con esta instrucción me ubico en el nodo anterior al que voy a eliminar
				while(puntero.getSiguiente().getSiguiente() != null) // Con esta instrucción me ubico en el nodo posterior al que voy a eliminar
				{
					puntero = puntero.getSiguiente();
				}
				puntero.getSiguiente().setAnterior(null);
				puntero.setSiguiente(null);
			
			//  Si cambia el while use las dos intrucciones siguientes y comente las dos instrucciones anteriores a esta linea. 
			//	puntero.getAnterior().setSiguiente(null);
			//	puntero.setAnterior(null);
				tamanio--;
			}
		}
		else
		{
			System.out.println("No hay nada para eliminar (La lista esta vacia)");
		}
	}

	public void eliminarEnPosicion(int n)
	{
		Nodo puntero = null;
		if(inicio != null)
		{
			if(n == 0)
			{
			//	eliminarElprimero();
				puntero = inicio;
				inicio = inicio.getSiguiente();  
			
				if(inicio != null)
				{
					inicio.setAnterior(null);
					puntero.setSiguiente(null);
					tamanio--;
				}	
				else
				{
					tamanio--;
				}
			}
			else if(n == (tamanio - 1))
			{
			//	eliminarElUltimo();
				puntero = inicio;
				while(puntero.getSiguiente() != null)
				{
					puntero = puntero.getSiguiente();
				}
				puntero.getAnterior().setSiguiente(null);
				puntero.setAnterior(null);
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
				temp.getSiguiente().setAnterior(puntero);
				puntero.setSiguiente(temp.getSiguiente());
				temp.setSiguiente(null);
				temp.setAnterior(null);
				tamanio--;
			}		
		}
		else
		{
			System.out.println("No hay nada para eliminar (La lista esta vacia)");
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

}
