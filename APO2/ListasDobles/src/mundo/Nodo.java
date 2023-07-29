package mundo;

public class Nodo 
{
	// ATRIBUTOS
	private Nodo siguiente;
	private Nodo anterior;
	private Libro libro;
		
	// METODO CONSTRUCTOR
	public Nodo(Libro libro) 
	{
		siguiente = null;
		anterior = null;
		this.libro = libro;	
	}

	public Libro getLibro() 
	{
		return libro;
	}

	public void setLibro(Libro libro) 
	{
		this.libro = libro;
	}

	public Nodo getSiguiente() 
	{
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) 
	{
		this.siguiente = siguiente;
	}

	public Nodo getAnterior() 
	{
		return anterior;
	}

	public void setAnterior(Nodo anterior) 
	{
		this.anterior = anterior;
	}

}
