package mundo;

import java.time.LocalDate;
import java.time.Period;

public class Empleado 
{
	private String nombre;
	private String apellido;
	private String numeroIdentificacion;
	private LocalDate fechaNacimiento;
	private LocalDate fechaIngreso;
	private int numeroHorasSemana;
	private double valorHora;

	public Empleado(String nombre, String apellido, String numeroIdentificacion, LocalDate fechaNacimiento, 
			LocalDate fechaIngreso, int numeroHorasSemana, double valorHora) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroIdentificacion = numeroIdentificacion;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaIngreso = fechaIngreso;
		this.numeroHorasSemana = numeroHorasSemana;
		this.valorHora = valorHora;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getApellido() 
	{
		return apellido;
	}

	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}

	public String getNumeroIdentificacion() 
	{
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) 
	{
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public LocalDate getFechaNacimiento() 
	{
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) 
	{
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDate getFechaIngreso() 
	{
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) 
	{
		this.fechaIngreso = fechaIngreso;
	}

	public int getNumeroHorasSemana() 
	{
		return numeroHorasSemana;
	}

	public void setNumeroHorasSemana(int numeroHorasSemana) 
	{
		this.numeroHorasSemana = numeroHorasSemana;
	}

	public double getValorHora() 
	{
		return valorHora;
	}

	public void setValorHora(double valorHora) 
	{
		this.valorHora = valorHora;
	}

	@Override
	public String toString() 
	{
		return "Empleado{" +
				"nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				", numeroIdentificacion='" + numeroIdentificacion + '\'' +
				", fechaNacimiento=" + fechaNacimiento +
				", fechaIngreso=" + fechaIngreso +
				", numeroHorasSemana=" + numeroHorasSemana +
				", valorHora=" + valorHora +
				'}';
	}
	
	public String calcularEdad()
	{
	    LocalDate fechaActual = LocalDate.now();
	    Period edad = Period.between(fechaNacimiento, fechaActual);
	    return "Edad actual: " + edad.getYears() + " años, " + edad.getMonths() + " meses y " + edad.getDays() + " días";
	}
	
	public int calcularEdadEnAnios()
	{
	    LocalDate fechaActual = LocalDate.now();
	    Period edad = Period.between(fechaNacimiento, fechaActual);
	    return edad.getYears();
	}
	
	public int calcularEdadEnMeses()
	{
	    LocalDate fechaActual = LocalDate.now();
	    Period edad = Period.between(fechaNacimiento, fechaActual);	    
	    return edad.getYears() * 12 + edad.getMonths();
	}
	
	public String calcularAntiguedad()
	{
		LocalDate fechaActual = LocalDate.now();
	    Period antiguedad = Period.between(fechaIngreso, fechaActual);
	    return "Antiguedad actual: " + antiguedad.getYears() + " años, " + antiguedad.getMonths() + " meses y " + antiguedad.getDays() + " días";
	}
	
	public int calcularAntiguedadEnAnios()
	{
		LocalDate fechaActual = LocalDate.now();
	    Period edad = Period.between(fechaIngreso, fechaActual);
	    return edad.getYears();
	}
	
	public int calcularAntiguedadEnMeses()
	{
		LocalDate fechaActual = LocalDate.now();
	    Period edad = Period.between(fechaIngreso, fechaActual);	    
	    return edad.getYears() * 12 + edad.getMonths();
	}
	
	public double calcularSalario()
	{
		return (numeroHorasSemana * valorHora) * 4;
	}
}


