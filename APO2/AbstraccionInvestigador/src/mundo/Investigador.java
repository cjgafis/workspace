package mundo;

//Clase Investigador que hereda de Empleado
public class Investigador extends Empleado 
{
	private String areaInvestigacion;

	public Investigador(String nombre, int edad, double salario, String areaInvestigacion) 
	{
		super(nombre, edad, salario);
		this.areaInvestigacion = areaInvestigacion;
	}

	public String getAreaInvestigacion() 
	{
		return areaInvestigacion;
	}

	public void setAreaInvestigacion(String areaInvestigacion) 
	{
		this.areaInvestigacion = areaInvestigacion;
	}

	@Override
	public String toString() 
	{
		return super.toString() + ", Area de Investigación: " + areaInvestigacion;
	}

	@Override
	public String describirTrabajo() 
	{
		return "Soy Investigador de la Universidad de Ibagué.";
	}
}
