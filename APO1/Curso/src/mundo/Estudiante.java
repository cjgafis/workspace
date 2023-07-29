package mundo;

public class Estudiante 
{
	// DECLARAR LOS ATRIBUTOS
	private String codigo;
	private String nombre;
	private String apellido;
	private int edad;
	private double estatura;
	private boolean foraneo;
	
	// METODO CONSTRUCTOR
	/**
	 * @param codigo
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param estatura
	 * @param foraneo
	 */
	public Estudiante(String codigo, String nombre, String apellido, 
			int edad, double estatura, boolean foraneo) 
	{
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estatura = estatura;
		this.foraneo = foraneo;
	}
	
	// METODOS GET - SET (DAR - CAMBIAR)

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
	 * @return the edad
	 */
	public int getEdad() 
	{
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) 
	{
		this.edad = edad;
	}

	/**
	 * @return the estatura
	 */
	public double getEstatura() 
	{
		return estatura;
	}

	/**
	 * @param estatura the estatura to set
	 */
	public void setEstatura(double estatura) 
	{
		this.estatura = estatura;
	}

	/**
	 * @return the foraneo
	 */
	public boolean isForaneo() 
	{
		return foraneo;
	}

	/**
	 * @param foraneo the foraneo to set
	 */
	public void setForaneo(boolean foraneo) 
	{
		this.foraneo = foraneo;
	}
	
}
