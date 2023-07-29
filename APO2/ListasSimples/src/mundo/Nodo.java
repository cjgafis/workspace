package mundo;

public class Nodo 
{
	// ATRIBUTOS
	private Nodo siguiente;
	private Libro libro;
		
	// METODO CONSTRUCTOR
	public Nodo(Libro libro) 
	{
		siguiente = null;
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
}
