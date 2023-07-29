package mundo;

import java.time.LocalDate;

public class Cliente 
{
	private String nombre;
	private String apellido;
	private String identificacion;
	private LocalDate fechaNaciemiento;
	private String correo;

	public Cliente(String nombre, String apellido, String identificacion, 
			LocalDate fechaNaciemiento, String correo) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
		this.fechaNaciemiento = fechaNaciemiento;
		this.correo = correo;
	}

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

	public String getIdentificacion() 
	{
		return identificacion;
	}

	public void setIdentificacion(String identificacion) 
	{
		this.identificacion = identificacion;
	}

	public LocalDate getFechaNaciemiento() 
	{
		return fechaNaciemiento;
	}

	public void setFechaNaciemiento(LocalDate fechaNaciemiento) 
	{
		this.fechaNaciemiento = fechaNaciemiento;
	}

	public String getCorreo() 
	{
		return correo;
	}

	public void setCorreo(String correo) 
	{
		this.correo = correo;
	}

	@Override
	public String toString() 
	{
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion
				+ ", fechaNaciemiento=" + fechaNaciemiento + ", correo=" + correo + "]";
	}
	
}
