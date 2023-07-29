package mundo;

import java.time.LocalDate;

public class Empresa 
{
	private String nombre;
	private String nit;
	private Empleado e1;
	private Empleado e2;
	private Empleado e3;
	private Empleado e4;
	private Empleado e5;

	public Empresa(String nombre, String nit) 
	{
		this.nombre = nombre;
		this.nit = nit;
		this.e1 = new Empleado("Carlos", "Barrios", "1926401736", LocalDate.of(1972, 9, 12), LocalDate.of(1994, 8, 15), 40, 20200.0);
		this.e2 = new Empleado("Andres", "Enciso", "9364013850", LocalDate.of(1980, 12, 24), LocalDate.of(1999, 3, 15), 45, 25800.0);
		this.e3 = new Empleado("Juan", "Salazar", "5304756713", LocalDate.of(1978, 5, 5), LocalDate.of(1998, 1, 30), 20, 30500.0);
		this.e4 = new Empleado("Pedro", "Rojas", "8112563457", LocalDate.of(1980, 10, 15), LocalDate.of(2001, 6, 15), 30, 26100.0);
		this.e5 = new Empleado("Fernando", "Benito", "1237653458", LocalDate.of(1974, 3, 15), LocalDate.of(1992, 2, 1), 10, 22400.0);
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

	public Empleado getE1() 
	{
		return e1;
	}

	public void setE1(Empleado e1) 
	{
		this.e1 = e1;
	}

	public Empleado getE2() 
	{
		return e2;
	}

	public void setE2(Empleado e2) 
	{
		this.e2 = e2;
	}

	public Empleado getE3() 
	{
		return e3;
	}

	public void setE3(Empleado e3) 
	{
		this.e3 = e3;
	}

	public Empleado getE4() 
	{
		return e4;
	}

	public void setE4(Empleado e4) 
	{
		this.e4 = e4;
	}

	public Empleado getE5() 
	{
		return e5;
	}

	public void setE5(Empleado e5) 
	{
		this.e5 = e5;
	}

	// METODO 1
	public void listarEmpleados()
	{
		System.out.println(e1 + "\n" + e2 + "\n" + e3 + "\n" + e4 + "\n" + e5);
	}

	// METODO 2
	/**
	 * Permite buscar un empleado por su cedula. 
	 * pre:
	 * post: se busco el empleado por su cedula. 
	 * @param cedula - La cedula del empleado a buscar.
	 * @return El empleado buscado o null en caso de no encontrar el empleado por la cedula dada. 
	 */
	public Empleado buscarEmpleadoPorCedula(String cedula)
	{
		Empleado empleadoBuscado = null;

		if(e1.getNumeroIdentificacion().equalsIgnoreCase(cedula))
		{
			empleadoBuscado = e1;
		}
		else if(e2.getNumeroIdentificacion().equalsIgnoreCase(cedula))
		{
			empleadoBuscado = e2;
		}
		else if(e3.getNumeroIdentificacion().equalsIgnoreCase(cedula))
		{
			empleadoBuscado = e3;
		}
		else if(e4.getNumeroIdentificacion().equalsIgnoreCase(cedula))
		{
			empleadoBuscado = e4;
		}
		else if(e5.getNumeroIdentificacion().equalsIgnoreCase(cedula))
		{
			empleadoBuscado = e5;
		}
		return  empleadoBuscado;
	}

	// METODO 3
	public Empleado empleadoMasAntiguo()
	{
		Empleado masAntiguo = null;
		if(e1.calcularAntiguedadEnMeses() >= e2. calcularAntiguedadEnMeses() && 
				e1.calcularAntiguedadEnMeses() >= e3. calcularAntiguedadEnMeses() &&
				e1.calcularAntiguedadEnMeses() >= e4. calcularAntiguedadEnMeses() &&
				e1.calcularAntiguedadEnMeses() >= e5. calcularAntiguedadEnMeses() )
		{
			masAntiguo = e1;
		}
		else if(e2.calcularAntiguedadEnMeses() >= e1. calcularAntiguedadEnMeses() && 
				e2.calcularAntiguedadEnMeses() >= e3. calcularAntiguedadEnMeses() &&
				e2.calcularAntiguedadEnMeses() >= e4. calcularAntiguedadEnMeses() &&
				e2.calcularAntiguedadEnMeses() >= e5. calcularAntiguedadEnMeses() )
		{
			masAntiguo = e2;
		}
		else if(e3.calcularAntiguedadEnMeses() >= e1. calcularAntiguedadEnMeses() && 
				e3.calcularAntiguedadEnMeses() >= e2. calcularAntiguedadEnMeses() &&
				e3.calcularAntiguedadEnMeses() >= e4. calcularAntiguedadEnMeses() &&
				e3.calcularAntiguedadEnMeses() >= e5. calcularAntiguedadEnMeses() )
		{
			masAntiguo = e3;
		}
		else if(e4.calcularAntiguedadEnMeses() >= e1. calcularAntiguedadEnMeses() && 
				e4.calcularAntiguedadEnMeses() >= e2. calcularAntiguedadEnMeses() &&
				e4.calcularAntiguedadEnMeses() >= e3. calcularAntiguedadEnMeses() &&
				e4.calcularAntiguedadEnMeses() >= e5. calcularAntiguedadEnMeses() )
		{
			masAntiguo = e4;
		}
		else if(e5.calcularAntiguedadEnMeses() >= e1. calcularAntiguedadEnMeses() && 
				e5.calcularAntiguedadEnMeses() >= e2. calcularAntiguedadEnMeses() &&
				e5.calcularAntiguedadEnMeses() >= e3. calcularAntiguedadEnMeses() &&
				e5.calcularAntiguedadEnMeses() >= e4. calcularAntiguedadEnMeses() )
		{
			masAntiguo = e5;
		}
		return masAntiguo;
	}

	// METODO 4
	public Empleado empleadoMasNuevo()
	{
		Empleado masNuevo = null;
		if(e1.calcularAntiguedadEnMeses() <= e2. calcularAntiguedadEnMeses() && 
				e1.calcularAntiguedadEnMeses() <= e3. calcularAntiguedadEnMeses() &&
				e1.calcularAntiguedadEnMeses() <= e4. calcularAntiguedadEnMeses() &&
				e1.calcularAntiguedadEnMeses() <= e5. calcularAntiguedadEnMeses() )
		{
			masNuevo = e1;
		}
		else if(e2.calcularAntiguedadEnMeses() <= e1. calcularAntiguedadEnMeses() && 
				e2.calcularAntiguedadEnMeses() <= e3. calcularAntiguedadEnMeses() &&
				e2.calcularAntiguedadEnMeses() <= e4. calcularAntiguedadEnMeses() &&
				e2.calcularAntiguedadEnMeses() <= e5. calcularAntiguedadEnMeses() )
		{
			masNuevo = e2;
		}
		else if(e3.calcularAntiguedadEnMeses() <= e1. calcularAntiguedadEnMeses() && 
				e3.calcularAntiguedadEnMeses() <= e2. calcularAntiguedadEnMeses() &&
				e3.calcularAntiguedadEnMeses() <= e4. calcularAntiguedadEnMeses() &&
				e3.calcularAntiguedadEnMeses() <= e5. calcularAntiguedadEnMeses() )
		{
			masNuevo = e3;
		}
		else if(e4.calcularAntiguedadEnMeses() <= e1. calcularAntiguedadEnMeses() && 
				e4.calcularAntiguedadEnMeses() <= e2. calcularAntiguedadEnMeses() &&
				e4.calcularAntiguedadEnMeses() <= e3. calcularAntiguedadEnMeses() &&
				e4.calcularAntiguedadEnMeses() <= e5. calcularAntiguedadEnMeses() )
		{
			masNuevo = e4;
		}
		else if(e5.calcularAntiguedadEnMeses() <= e1. calcularAntiguedadEnMeses() && 
				e5.calcularAntiguedadEnMeses() <= e2. calcularAntiguedadEnMeses() &&
				e5.calcularAntiguedadEnMeses() <= e3. calcularAntiguedadEnMeses() &&
				e5.calcularAntiguedadEnMeses() <= e4. calcularAntiguedadEnMeses() )
		{
			masNuevo = e5;
		}
		return masNuevo;
	}

	// METODO 5
	public Empleado empleadoQueMasGana()
	{
		Empleado masGana = null;
		if(e1.calcularSalario() >= e2. calcularSalario() && 
				e1.calcularSalario() >= e3. calcularSalario() &&
				e1.calcularSalario() >= e4. calcularSalario() &&
				e1.calcularSalario() >= e5. calcularSalario() )
		{
			masGana = e1;
		}
		else if(e2.calcularSalario() >= e1. calcularSalario() && 
				e2.calcularSalario() >= e3. calcularSalario() &&
				e2.calcularSalario() >= e4. calcularSalario() &&
				e2.calcularSalario() >= e5. calcularSalario() )
		{
			masGana = e2;
		}
		else if(e3.calcularSalario() >= e1. calcularSalario() && 
				e3.calcularSalario() >= e2. calcularSalario() &&
				e3.calcularSalario() >= e4. calcularSalario() &&
				e3.calcularSalario() >= e5. calcularSalario() )
		{
			masGana = e3;
		}
		else if(e4.calcularSalario() >= e1. calcularSalario() && 
				e4.calcularSalario() >= e2. calcularSalario() &&
				e4.calcularSalario() >= e3. calcularSalario() &&
				e4.calcularSalario() >= e5. calcularSalario() )
		{
			masGana = e4;
		}
		else if(e5.calcularSalario() >= e1. calcularSalario() && 
				e5.calcularSalario() >= e2. calcularSalario() &&
				e5.calcularSalario() >= e3. calcularSalario() &&
				e5.calcularSalario() >= e4. calcularSalario() )
		{
			masGana = e5;
		}
		return masGana;
	}

	// METODO 6
	public Empleado empleadoQueMenosGana()
	{
		Empleado menosGana = null;
		if(e1.calcularSalario() <= e2. calcularSalario() && 
				e1.calcularSalario() <= e3. calcularSalario() &&
				e1.calcularSalario() <= e4. calcularSalario() &&
				e1.calcularSalario() <= e5. calcularSalario() )
		{
			menosGana = e1;
		}
		else if(e2.calcularSalario() <= e1. calcularSalario() && 
				e2.calcularSalario() <= e3. calcularSalario() &&
				e2.calcularSalario() <= e4. calcularSalario() &&
				e2.calcularSalario() <= e5. calcularSalario() )
		{
			menosGana = e2;
		}
		else if(e3.calcularSalario() <= e1. calcularSalario() && 
				e3.calcularSalario() <= e2. calcularSalario() &&
				e3.calcularSalario() <= e4. calcularSalario() &&
				e3.calcularSalario() <= e5. calcularSalario() )
		{
			menosGana = e3;
		}
		else if(e4.calcularSalario() <= e1. calcularSalario() && 
				e4.calcularSalario() <= e2. calcularSalario() &&
				e4.calcularSalario() <= e3. calcularSalario() &&
				e4.calcularSalario() <= e5. calcularSalario() )
		{
			menosGana = e4;
		}
		else if(e5.calcularSalario() <= e1. calcularSalario() && 
				e5.calcularSalario() <= e2. calcularSalario() &&
				e5.calcularSalario() <= e3. calcularSalario() &&
				e5.calcularSalario() <= e4. calcularSalario() )
		{
			menosGana = e5;
		}
		return menosGana; 
	}

}
