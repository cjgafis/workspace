package mundo;

public class Estudiante 
{
	// ATRIBUTOS
	private String nombre;
	private String codigo;
	private double notaFinal;
	private int edad;

	// METODO CONTRUCTOR
	public Estudiante(String nombre, String codigo, double notaFinal, int edad)
	{
		this.nombre = nombre;
		this.codigo = codigo;
		this.notaFinal = notaFinal;
		this.edad = edad;
	}

	// METODOS GET Y SET para nombre
	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	// METODOS GET Y SET para codigo
	public String getCodigo()
	{
		return codigo;
	}

	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}

	// METODOS GET Y SET para notaFinal
	public double getNotaFinal()
	{
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal)
	{
		this.notaFinal = notaFinal;
	}

	// METODOS GET Y SET para edad
	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	// METODO TOSTRING
	@Override
	public String toString() 
	{
		return "Nombre: " + nombre + " Codigo: " + codigo + 
				" Nota final: " + notaFinal + " Edad: " + edad;
	}

}
