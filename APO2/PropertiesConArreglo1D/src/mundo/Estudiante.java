package mundo;

public class Estudiante 
{
	// ATRIBUTOS
	private String nombre;
	private String codigo;
	private int edad;
	private double estatura;
		
	// METODO CONSTRUCTOR
	public Estudiante(String nombre, String codigo, int edad, double estatura) 
	{
		this.nombre = nombre;
		this.codigo = codigo;
		this.edad = edad;
		this.estatura = estatura;
	}

	// METODOS GET Y SET
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getCodigo() 
	{
		return codigo;
	}

	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
	}

	public int getEdad() 
	{
		return edad;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}

	public double getEstatura() 
	{
		return estatura;
	}

	public void setEstatura(double estatura) 
	{
		this.estatura = estatura;
	}

	// METODO TOSTRING
	@Override
	public String toString() 
	{
		return "Estudiante \nNombre = " + nombre + "\nCodigo = " + codigo + "\nEdad = " + edad + "\nEstatura = " + estatura
				+ "\n";
	}
}
