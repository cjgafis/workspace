package mundo;

//Clase Profesor que hereda de Empleado
public class Profesor extends Empleado 
{
	private String materia;

	public Profesor(String nombre, int edad, double salario, String materia) 
	{
		super(nombre, edad, salario);
		this.materia = materia;
	}

	public String getMateria() 
	{
		return materia;
	}

	public void setMateria(String materia) 
	{
		this.materia = materia;
	}

	@Override
	public String toString() 
	{
		return super.toString() + ", Materia: " + materia;
	}

	@Override
	public String describirTrabajo() 
	{
		return "Soy profesor y oriento clases en la Universidad de Ibagué.";
	}
}
