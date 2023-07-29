package mundo;

import java.io.Serializable;

public class Estudiante implements Serializable
{
	private static final long serialVersionUID = 1L;
	// ATRIBUTOS
	private String nombre;
	private String apellido;
	private int id;
	
	// METODO CONTRUCTOR
	public Estudiante(String nombre, String apellido, int id) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}

	// GET & SET
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getApellido() 
	{
		return apellido;
	}

	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	// TOSTRING
	@Override
	public String toString() 
	{
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + "]";
	}
}
