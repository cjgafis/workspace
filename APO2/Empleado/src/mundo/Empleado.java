package mundo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Esta clase representa el molde para crear objetos (instancias) de tipo Empleado.
 * 
 * inv:
 * nombre != null
 * !nombre.equals("")
 * !nombre.equals(" ")
 * cedula != null
 * !cedula.equals("")
 * !cedula.equals(" ")
 * salario > 0
 * fechaNacimiento != null
 * fechaIngreso != null
 * 
 * @author CJ
 *
 */
public class Empleado 
{
	// ATRIBUTOS
	private String nombre;
	private String cedula;
	private double salario;
	private LocalDate fechaNacimiento;
	private LocalDate fechaIngreso;

	// METODO CONSTRUCTOR
	/**
	 * @param nombre
	 * @param cedula
	 * @param salario
	 * @param fechaNacimiento
	 * @param fechaIngreso
	 */
	public Empleado(String nombre, String cedula, double salario, 
			LocalDate fechaNacimiento, LocalDate fechaIngreso) 
	{
		this.nombre = nombre;
		this.cedula = cedula;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaIngreso = fechaIngreso;
		
		verificarInvariante();
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
	 * @return the cedula
	 */
	public String getCedula() 
	{
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) 
	{
		this.cedula = cedula;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() 
	{
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) 
	{
		this.salario = salario;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() 
	{
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) 
	{
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the fechaIngreso
	 */
	public LocalDate getFechaIngreso() 
	{
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(LocalDate fechaIngreso) 
	{
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() 
	{
		return "Empleado [nombre=" + nombre + ", cedula=" + cedula + ", "
				+ "salario=" + salario + ", fechaNacimiento="
				+ fechaNacimiento + ", fechaIngreso=" + fechaIngreso + "]";
	}

	// METODO VERIFICAR INVARIANTE
	private void verificarInvariante()
	{
		assert(nombre != null);
		assert(!nombre.equals(""));
		assert(!nombre.equals(" "));
		assert(cedula != null);
		assert(!cedula.equals(""));
		assert(!cedula.equals(" "));
		assert(salario > 0);
		assert(fechaNacimiento != null);
		assert(fechaIngreso != null);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Por favor ingrese la cedula: ");
		String cedula = sc.nextLine();
		
		System.out.println("Por favor ingrese el salario: ");
		double salario = Double.parseDouble(sc.nextLine());
		
		System.out.println("Por favor ingrese la fecha de nacimiento (dd/MM/yyyy) : ");
		String fechaNacimientoUsuario = sc.nextLine();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoUsuario, formato);
		
		System.out.println("Por favor ingrese la fecha de ingreso (dd/MM/yyyy) : ");
		String fechaIngresoUsuario = sc.nextLine();
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaIngreso = LocalDate.parse(fechaIngresoUsuario, formato2);
		
		Empleado e1 = new Empleado(nombre, cedula, salario, fechaNacimiento, fechaIngreso);
		System.out.println(e1);
		sc.close();
	}

}
