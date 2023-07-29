package mundo;

public class Estudiante 
{
	// ATRIBUTOS
	private String codigo;
	private String nombre;
	private int edad;
	private double estatura;
	
	// METODO CONSTRUCTOR
	/**
	 * @param codigo
	 * @param nombre
	 * @param edad
	 * @param estatura
	 */
	public Estudiante(String codigo, String nombre, int edad, double estatura) 
	{
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	// METODOS GET - SET
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

	// METODO TOSTRING
	@Override
	public String toString() 
	{
		return "Estudiante [codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura
				+ "]";
	}
	
}
