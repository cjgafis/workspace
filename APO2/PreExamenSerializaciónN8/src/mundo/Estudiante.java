package mundo;

import java.io.Serializable;

public class Estudiante implements Serializable 
{
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;
	private int id;

	public Estudiante(String nombre, String apellido, int id) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public String getApellido() 
	{
		return apellido;
	}

	public int getId() 
	{
		return id;
	}

	@Override
	public String toString() 
	{
		return "Estudiante{" +
				"nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				", id=" + id +
				'}';
	}
}