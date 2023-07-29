package mundo;

public class Estudiante 
{
	// ATRIBUTOS
	/**
	 * Representa el codigo que identifica al estudiante y es de tipo cadena. 
	 */
	private String codigo;
	/**
	 * Representa el nombre del estudiante y es de tipo cadena. 
	 */
	private String nombre;
	/**
	 * Representa el apellido del estudiante y es de tipo cadena. 
	 */
	private String apellido;
	/**
	 * Representa la estatura del estudiante dada en metros y es de tipo real.
	 */
	private double estatura;
	/**
	 * Representa la edad del estudiante y es de tipo entero.
	 */
	private int edad;
	/**
	 * foraneo representa si el estudiante proviene de otro pais.
	 */
	private boolean foraneo;

	// METODO CONSTRUCTOR

	/**
	 * @param codigo
	 * @param nombre
	 * @param apellido
	 * @param estatura
	 * @param edad
	 * @param foraneo
	 */
	public Estudiante(String codigo, String nombre, String apellido, double estatura, 
			int edad, boolean foraneo) 
	{
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estatura = estatura;
		this.edad = edad;
		this.foraneo = foraneo;
	}

	// METODO GET - SET

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
	 * @return the foraneo
	 */
	public boolean getForaneo() 
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
