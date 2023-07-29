package mundo;

import java.time.LocalDate;

public class Soldado 
{
	// ATRIBUTOS
	private String nombre;
	private String apellido;
	private String identificacion;
	private LocalDate fechaNacimiento;
	private LocalDate fechaIngreso;
	private double altura;
	private double peso;
	
	// METODO CONSTRUCTOR
	/**
	 * @param nombre
	 * @param apellido
	 * @param identificacion
	 * @param fechaNacimiento
	 * @param fechaIngreso
	 * @param altura
	 * @param peso
	 */
	public Soldado(String nombre, String apellido, String identificacion, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaIngreso = fechaIngreso;
		this.altura = altura;
		this.peso = peso;
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
	/**
	 * @return the apellido
	 */
	public String getApellido() 
	{
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}
	/**
	 * @return the identificacion
	 */
	public String getIdentificacion() 
	{
		return identificacion;
	}
	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(String identificacion) 
	{
		this.identificacion = identificacion;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() 
	{
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) 
	{
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the fechaIngreso
	 */
	public LocalDate getFechaIngreso() 
	{
		return fechaIngreso;
	}
	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(LocalDate fechaIngreso) 
	{
		this.fechaIngreso = fechaIngreso;
	}
	/**
	 * @return the altura
	 */
	public double getAltura() 
	{
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) 
	{
		this.altura = altura;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() 
	{
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) 
	{
		this.peso = peso;
	}
	@Override
	public String toString() 
	{
		return "Soldado [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion
				+ ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}

}
