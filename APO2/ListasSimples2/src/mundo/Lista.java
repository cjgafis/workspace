package mundo;

public class Lista 
{
	private Nodo inicio;

	public Lista() 
	{
		inicio = null;
	}
	
	//============== METODOS PARA AGREGAR =========================

	// TODO: AGREGAR NUEVO NODO AL INICIO DE LA LISTA.
	public void agregarAlInicio(Estudiante e)
	{

	}
	
	// AGREGAR NUEVO NODO AL FINAL DE LA LISTA
	public void agregarAlFinal(Estudiante e) 
	{
		Nodo nuevoNodo = new Nodo(e);
		if (inicio == null) 
		{
			inicio = nuevoNodo;
		} 
		else 
		{
			Nodo puntero = inicio;
			while (puntero.getSiguiente() != null) 
			{
				puntero = puntero.getSiguiente();
			}
			puntero.setSiguiente(nuevoNodo);
		}
	}

	// TODO: AGREGAR NUEVO NODO A LA LISTA DADA LA POSICIÓN.
	public void agregarDespuesDe(int p, Estudiante e)
	{

	}
	
	//============== METODOS PARA ELIMINAR =========================

	// TODO: ELIMINAR NODO AL INICIO DE LA LISTA.
	public void eliminarAlInicio()
	{

	}

	// TODO: ELIMINAR NODO AL FINAL DE LA LISTA
	public void eliminarAlFinal() 
	{

	}

	// TODO: ELIMINAR NODO DE LA LISTA DADA LA POSICIÓN.
	public void eliminarPosicion(int i, Estudiante e)
	{

	}

	public void imprimirLista() 
	{
		Nodo puntero = inicio;
		while (puntero != null) 
		{
			System.out.println(puntero.getEstudiante());
			puntero = puntero.getSiguiente();
		}
	}
}

