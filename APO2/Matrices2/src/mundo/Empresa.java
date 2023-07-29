package mundo;

import java.time.LocalDate;

public class Empresa 
{
	private String nombre;
	private String nit;
	private Empleado [][] empleados;

	public Empresa(String nombre, String nit) 
	{
		this.nombre = nombre;
		this.nit = nit;
		empleados = new Empleado [3][3];
		empleados[0][0] = new Empleado("Carlos", "Barrios", "1926401736", LocalDate.of(1987, 9, 12), LocalDate.of(1994, 8, 15), 40, 20200.0);
		empleados[0][1] = new Empleado("Carlos", "Barrios", "1926401736", LocalDate.of(1987, 9, 12), LocalDate.of(1994, 8, 15), 40, 20200.0);
		empleados[0][2] = new Empleado("Andres", "Enciso", "9364013850", LocalDate.of(1992, 12, 24), LocalDate.of(1995, 3, 15), 45, 25800.0);
		empleados[1][0] = new Empleado("Juan", "Salazar", "5304756713", LocalDate.of(1978, 5, 5), LocalDate.of(1989, 1, 30), 20, 30500.0);
		empleados[1][1] = new Empleado("Pedro", "Rojas", "8112563457", LocalDate.of(1980, 10, 15), LocalDate.of(1991, 6, 15), 30, 26100.0);
		empleados[1][2] = new Empleado("Fernando", "Benito", "1237653458", LocalDate.of(1974, 3, 15), LocalDate.of(1992, 2, 1), 10, 22400.0);
		empleados[2][0] = new Empleado("Pepito", "Perez", "5302346711", LocalDate.of(1978, 5, 5), LocalDate.of(1989, 1, 30), 20, 30500.0);
		empleados[2][1] = new Empleado("Magdalena", "Pinilla", "4322563567", LocalDate.of(1980, 10, 15), LocalDate.of(1991, 6, 15), 30, 26100.0);
		empleados[2][2] = new Empleado("Sofia", "Loren", "6547652348", LocalDate.of(1974, 3, 15), LocalDate.of(1992, 2, 1), 10, 22400.0);

	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getNit() 
	{
		return nit;
	}

	public void setNit(String nit) 
	{
		this.nit = nit;
	}

	// METODO 1
	public void listarEmpleados()
	{
		for(int i = 0; i < empleados.length; i++)
		{
			for(int j = 0; j < empleados[0].length; j++)
			{
				System.out.print(empleados[i][j].getApellido() + " ");
			}
			System.out.println();
		}
	}

	// METODO 2
	public Empleado buscarEmpleadoPorCedula(String cedula)
	{
		return null; // Este retorno es temporal para que el programa no marque error. 
	}

	// METODO 3
	public Empleado empleadoMasAntiguo()
	{
		return null; // Este retorno es temporal para que el programa no marque error. 
	}

	// METODO 4
	public Empleado empleadoMasNuevo()
	{
		return null; // Este retorno es temporal para que el programa no marque error. 
	}

	// METODO 5
	public Empleado empleadoQueMasGana()
	{
		return null; // Este retorno es temporal para que el programa no marque error. 
	}

	// METODO 6
	public Empleado empleadoQueMenosGana()
	{
		return null; // Este retorno es temporal para que el programa no marque error. 
	}

}
