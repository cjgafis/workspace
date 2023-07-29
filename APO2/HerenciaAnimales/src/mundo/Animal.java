package mundo;

public class Animal 
{
	/**
	 * Representa el nombre del animal.
	 */
	private String nombre;

	/**
	 * @param nombre
	 */
	public Animal(String nombre) 
	{
		super();
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() 
	{
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	@Override
	public String toString() 
	{
		return "Animal [nombre=" + nombre + "]";
	}
	
	/**
	 * Devuelve la cadena "Animal"
	 * @return
	 */
	public String obtenerTipoAnimal()
	{
		return "Animal";
	}	
}
