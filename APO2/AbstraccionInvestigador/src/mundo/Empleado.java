package mundo;

//Clase Empleado que hereda de Persona
public abstract class Empleado extends Persona 
{
	private double salario;

	public Empleado(String nombre, int edad, double salario) 
	{
		super(nombre, edad);
		this.salario = salario;
	}

	public double getSalario() 
	{
		return salario;
	}

	public void setSalario(double salario) 
	{
		this.salario = salario;
	}

	@Override
	public String toString() 
	{
		return super.toString() + ", Salario: " + salario;
	}

}
