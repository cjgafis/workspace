package mundo;

public class Estudiante 
{
	// ATRIBUTOS
	private String codigo;
	private String nombre;
	private double notaFinal;
	
	// METODO CONSTRUCTOR
	/**
	 * @param codigo
	 * @param nombre
	 * @param notaFinal
	 */
	public Estudiante(String codigo, String nombre, double notaFinal) 
	{
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.notaFinal = notaFinal;
	}

	// MEETODOS GET Y SET
	/**
	 * @return the codigo
	 */
	public String getCodigo() 
	{
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
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
	 * @return the notaFinal
	 */
	public double getNotaFinal() 
	{
		return notaFinal;
	}

	/**
	 * @param notaFinal the notaFinal to set
	 */
	public void setNotaFinal(double notaFinal) 
	{
		this.notaFinal = notaFinal;
	}

	// METODO TOSTRING
	@Override
	public String toString() 
	{
		return "Estudiante [codigo=" + codigo + ", nombre=" + nombre + ", notaFinal=" + notaFinal + "]";
	}
	
}
