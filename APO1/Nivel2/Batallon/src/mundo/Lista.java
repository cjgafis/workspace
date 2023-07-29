package mundo;

/**
 * La clase Lista representa una lista doblemente enlazada de militares.
 */
public class Lista 
{
	private Nodo cabeza;
	private Nodo cola;

	/**
	 * Constructor de la clase Lista.
	 * Inicializa una lista vacía.
	 */
	public Lista() 
	{
		cabeza = null;
		cola = null;
	}

	/**
	 * Verifica si la lista está vacía.
	 *
	 * @return true si la lista está vacía, false de lo contrario.
	 */
	public boolean estaVacia() 
	{
		return cabeza == null;
	}

	/**
	 * Imprime en consola la lista de militares.
	 * Si la lista está vacía, muestra un mensaje indicándolo.
	 */
	public void listarMilitares() 
	{
		if (estaVacia()) 
		{
			System.out.println("La lista de militares está vacía.");
			return;
		}

		Nodo nodoActual = cabeza;

		while (nodoActual != null) 
		{
			Militar militar = nodoActual.getMilitar();
			System.out.println(militar);
			nodoActual = nodoActual.getSiguiente();
		}
	}

	/**
	 * Agrega un militar al principio de la lista.
	 *
	 * @param militar El militar a agregar.
	 */
	public void agregarAlPrincipio(Militar militar) 
	{
		Nodo nuevoNodo = new Nodo(militar);
		if (estaVacia()) 
		{
			cabeza = nuevoNodo;
			cola = nuevoNodo;
		} 
		else 
		{
			nuevoNodo.setSiguiente(cabeza);
			cabeza.setAnterior(nuevoNodo);
			cabeza = nuevoNodo;
		}
	}

	/**
	 * Agrega un militar al final de la lista.
	 *
	 * @param militar El militar a agregar.
	 */
	public void agregarAlFinal(Militar militar) 
	{
		Nodo nuevoNodo = new Nodo(militar);
		if (estaVacia()) 
		{
			cabeza = nuevoNodo;
			cola = nuevoNodo;
		} 
		else 
		{
			cola.setSiguiente(nuevoNodo);
			nuevoNodo.setAnterior(cola);
			cola = nuevoNodo;
		}
	}

	/**
	 * Agrega un militar en la posición especificada de la lista.
	 * Si la posición es inválida, muestra un mensaje de error.
	 *
	 * @param posicion La posición en la que se agregará el militar.
	 * @param militar  El militar a agregar.
	 */
	public void agregarEnPosicion(int posicion, Militar militar) 
	{
		if (posicion < 0 || posicion > obtenerTamanio()) 
		{
			System.out.println("Posición inválida. No se puede agregar el militar en la posición especificada.");
			return;
		}

		if (posicion == 0) 
		{
			agregarAlPrincipio(militar);
		} 
		else if (posicion == obtenerTamanio()) 
		{
			agregarAlFinal(militar);
		} 
		else 
		{
			Nodo nuevoNodo = new Nodo(militar);
			Nodo nodoActual = obtenerNodoEnPosicion(posicion);
			Nodo nodoAnterior = nodoActual.getAnterior();

			nuevoNodo.setSiguiente(nodoActual);
			nuevoNodo.setAnterior(nodoAnterior);
			nodoAnterior.setSiguiente(nuevoNodo);
			nodoActual.setAnterior(nuevoNodo);
		}
	}

	/**
	 * Modifica el militar en la posición especificada de la lista.
	 * Si la posición es inválida, muestra un mensaje de error.
	 *
	 * @param posicion     La posición del militar a modificar.
	 * @param nuevoMilitar El nuevo militar que reemplazará al existente.
	 */
	public void modificarEnPosicion(int posicion, Militar nuevoMilitar) 
	{
		if (posicion < 0 || posicion >= obtenerTamanio()) 
		{
			System.out.println("Posición inválida. No se puede modificar el militar en la posición especificada.");
			return;
		}

		Nodo nodoActual = obtenerNodoEnPosicion(posicion);
		nodoActual.setMilitar(nuevoMilitar);
	}

	/**
	 * Elimina el militar al principio de la lista.
	 * Si la lista está vacía, muestra un mensaje de error.
	 */
	public void eliminarAlPrincipio() 
	{
		if (estaVacia()) 
		{
			System.out.println("La lista está vacía. No se puede eliminar ningún militar.");
			return;
		}

		if (cabeza == cola) 
		{
			// Solo hay un elemento en la lista
			cabeza = null;
			cola = null;
		} 
		else 
		{
			Nodo siguienteNodo = cabeza.getSiguiente();
			siguienteNodo.setAnterior(null);
			cabeza = siguienteNodo;
		}
	}

	/**
	 * Elimina el militar al final de la lista.
	 * Si la lista está vacía, muestra un mensaje de error.
	 */
	public void eliminarAlFinal() 
	{
		if (estaVacia()) 
		{
			System.out.println("La lista está vacía. No se puede eliminar ningún militar.");
			return;
		}

		if (cabeza == cola) 
		{
			// Solo hay un elemento en la lista
			cabeza = null;
			cola = null;
		} 
		else 
		{
			Nodo anteriorNodo = cola.getAnterior();
			anteriorNodo.setSiguiente(null);
			cola = anteriorNodo;
		}
	}

	/**
	 * Elimina el militar en la posición especificada de la lista.
	 * Si la posición es inválida, muestra un mensaje de error.
	 *
	 * @param posicion La posición del militar a eliminar.
	 */
	public void eliminarEnPosicion(int posicion) 
	{
		if (posicion < 0 || posicion >= obtenerTamanio()) 
		{
			System.out.println("Posición inválida. No se puede eliminar el militar en la posición especificada.");
			return;
		}

		if (posicion == 0) 
		{
			eliminarAlPrincipio();
		} 
		else if (posicion == obtenerTamanio() - 1) 
		{
			eliminarAlFinal();
		} 
		else 
		{
			Nodo nodoActual = obtenerNodoEnPosicion(posicion);
			Nodo nodoAnterior = nodoActual.getAnterior();
			Nodo nodoSiguiente = nodoActual.getSiguiente();

			nodoAnterior.setSiguiente(nodoSiguiente);
			nodoSiguiente.setAnterior(nodoAnterior);
		}
	}

	/**
	 * Obtiene el tamaño actual de la lista.
	 *
	 * @return El tamaño actual de la lista.
	 */
	public int obtenerTamanio() 
	{
		int tamanio = 0;
		Nodo nodoActual = cabeza;

		while (nodoActual != null) 
		{
			tamanio++;
			nodoActual = nodoActual.getSiguiente();
		}

		return tamanio;
	}

	/**
	 * Obtiene el militar en la posición especificada de la lista.
	 * Si la posición es inválida, muestra un mensaje de error y devuelve null.
	 *
	 * @param posicion La posición del militar a obtener.
	 * @return El militar en la posición especificada, o null si la posición es inválida.
	 */
	public Militar obtenerMilitarEnPosicion(int posicion) 
	{
		if (posicion < 0 || posicion >= obtenerTamanio()) 
		{
			System.out.println("Posición inválida. No se puede obtener el militar en la posición especificada.");
			return null;
		}

		Nodo nodoActual = obtenerNodoEnPosicion(posicion);
		return nodoActual.getMilitar();
	}

	/**
	 * Obtiene el nodo en la posición especificada de la lista.
	 *
	 * @param posicion La posición del nodo a obtener.
	 * @return El nodo en la posición especificada.
	 */
	private Nodo obtenerNodoEnPosicion(int posicion) 
	{
		Nodo nodoActual = cabeza;
		int contador = 0;

		while (contador < posicion) 
		{
			nodoActual = nodoActual.getSiguiente();
			contador++;
		}

		return nodoActual;
	}

	/**
	 * Busca un militar por su número de cédula en la lista.
	 *
	 * @param cedula El número de cédula del militar a buscar.
	 * @return El militar con la cédula especificada, o null si no se encuentra.
	 */
	public Militar buscarMilitarPorCedula(int cedula) 
	{
		Nodo nodoActual = cabeza;

		while (nodoActual != null) 
		{
			Militar soldado = nodoActual.getMilitar();
			if (soldado.getCedula() == cedula) 
			{
				return soldado;
			}
			nodoActual = nodoActual.getSiguiente();
		}

		return null; // No se encontró ningún soldado con la cedula especificada
	}

	/**
	 * Elimina un militar de la lista por su número de cédula.
	 *
	 * @param cedula El número de cédula del militar a eliminar.
	 */
	public void eliminarMilitarPorCedula(int cedula) 
	{
		Nodo nodoActual = cabeza;

		while (nodoActual != null) 
		{
			Militar soldado = nodoActual.getMilitar();
			if (soldado.getCedula() == cedula) 
			{
				Nodo nodoAnterior = nodoActual.getAnterior();
				Nodo nodoSiguiente = nodoActual.getSiguiente();

				if (nodoAnterior == null) 
				{
					// Se elimina el soldado al principio de la lista
					cabeza = nodoSiguiente;
				} 
				else 
				{
					nodoAnterior.setSiguiente(nodoSiguiente);
				}

				if (nodoSiguiente == null) 
				{
					// Se elimina el soldado al final de la lista
					cola = nodoAnterior;
				} 
				else 
				{
					nodoSiguiente.setAnterior(nodoAnterior);
				}

				System.out.println("Militar eliminado con éxito.");
				return;
			}

			nodoActual = nodoActual.getSiguiente();
		}

		System.out.println("No existe un militar con la cedula " + cedula);
	}
}



