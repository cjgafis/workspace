package mundo;

public class Nodo 
{
    private Persona persona;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Persona persona) 
    {
        this.persona = persona;
        this.siguiente = null;
        this.anterior = null;
    }

	public Persona getPersona() 
	{
		return persona;
	}

	public void setPersona(Persona persona) 
	{
		this.persona = persona;
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
