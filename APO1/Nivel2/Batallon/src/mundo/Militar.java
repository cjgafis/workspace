package mundo;

/**
 * La clase Militar representa a un militar individual.
 * Incluye detalles como cédula, nombre, apellido, edad, estatura y antigüedad en años.
 */
public class Militar 
{
	// ATRIBUTOS
	
	/**
	 * Cédula del militar.
	 */
	private int cedula;
	
	/**
	 * Nombre del militar.
	 */
	private String nombre;
	
	/**
	 * Apellido del militar.
	 */
	private String apellido;
	
	/**
	 * Edad del militar.
	 */
	private int edad;
	
	/**
	 * Estatura del militar.
	 */
	private double estatura;
	
	/**
	 * Antigüedad del militar en años.
	 */
	private int antiguedadAnos;

	/**
	 * Constructor para la clase militar.
	 * 
	 * @param cedula Cédula del militar.
	 * @param nombre Nombre del militar.
	 * @param apellido Apellido del militar.
	 * @param edad Edad del militar.
	 * @param estatura Estatura del militar.
	 * @param antiguedadAnos Antigüedad del militar en años.
	 */
	public Militar(int cedula, String nombre, String apellido, int edad, double estatura, int antiguedadAnos) 
	{
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estatura = estatura;
		this.antiguedadAnos = antiguedadAnos;		
	}

	/**
	 * Retorna la cédula del militar.
	 * 
	 * @return Cédula del militar.
	 */
	public int getCedula() 
	{
		return cedula;
	}
	
	/**
	 * Establece la cédula del militar.
	 * 
	 * @param cedula Cédula del militar.
	 */
	public void setCedula(int cedula) 
	{
		this.cedula = cedula;
	}
	
	/**
	 * Retorna el nombre del militar.
	 * 
	 * @return Nombre del militar.
	 */
	public String getNombre() 
	{
		return nombre;
	}
	
	/**
	 * Establece el nombre del militar.
	 * 
	 * @param nombre Nombre del militar.
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	/**
	 * Retorna el apellido del militar.
	 * 
	 * @return Apellido del militar.
	 */
	public String getApellido() 
	{
		return apellido;
	}
	
	/**
	 * Establece el apellido del militar.
	 * 
	 * @param apellido Apellido del militar.
	 */
	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}
	
	/**
	 * Retorna la edad del militar.
	 * 
	 * @return Edad del militar.
	 */
	public int getEdad() 
	{
		return edad;
	}
	
	/**
	 * Establece la edad del militar.
	 * 
	 * @param edad Edad del militar.
	 */
	public void setEdad(int edad) 
	{
		this.edad = edad;
	}
	
	/**
	 * Retorna la estatura del militar.
	 * 
	 * @return Estatura del militar.
	 */
	public double getEstatura() 
	{
		return estatura;
	}
	
	/**
	 * Establece la estatura del militar.
	 * 
	 * @param estatura Estatura del militar.
	 */
	public void setEstatura(double estatura) 
	{
		this.estatura = estatura;
	}

	/**
	 * Retorna la antigüedad en años del militar.
	 * 
	 * @return Antigüedad en años del militar.
	 */
	public int getAntiguedadAnos() 
	{
		return antiguedadAnos;
	}

	/**
	 * Establece la antigüedad en años del militar.
	 * 
	 * @param antiguedadAnos Antigüedad en años del militar.
	 */
	public void setAntiguedadAnos(int antiguedadAnos) 
	{
		this.antiguedadAnos = antiguedadAnos;
	}
	
	/**
	 * Retorna una representación en cadena de caracteres del militar.
	 * 
	 * @return Una cadena de caracteres que representa al militar.
	 */
	@Override
	public String toString() 
	{
		return "Militar [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", estatura=" + estatura + ", antiguedadAnos=" + antiguedadAnos + "]";
	}
}

