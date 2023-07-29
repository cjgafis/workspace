package mundo;


public class Soldado
{
	// ATRIBUTOS
	private int cedula;
	private String nombre;
	private String apellido;
	private int edad;
	private double estatura;

	// TODO PUNTO 1A: Cree un atributo  de tipo entero que maneje la antiguedad del soldado.  
	// Llamelo antiguedadAnos.
	// Escriba su codigo debajo de los to do. Nunca arriba. 
	private int antiguedadAnos;


	// TODO PUNTO 1B: Modifique el metodo constructor para recibir por parametro el nuevo valor para
	// el nuevo atributo. 
	// Escriba su codigo debajo de los to do. Nunca arriba. 
	// CONTRUCTOR
	public Soldado(int cedulaP, String nombreP, String apellidoP, int edadP, double estaturaP, int antiguedadAnosP)
	{
		cedula = cedulaP;
		nombre = nombreP;
		apellido = apellidoP; 
		edad = edadP;
		estatura = estaturaP; 
		antiguedadAnos = antiguedadAnosP;

	}
	// GETTER - SETTER
	// TODO PUNTO 1C: Cree los metodos get y set para el nuevo atributo. 
	// Escriba su codigo debajo de los to do. Nunca arriba. 

	public int getCedula() 
	{
		return cedula;
	}
	public void setCedula(int cedula) 
	{
		this.cedula = cedula;
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
	public int getAntiguedadAnos() 
	{
		return antiguedadAnos;
	}
	public void setAntiguedadAnos(int antiguedadAnos) 
	{
		this.antiguedadAnos = antiguedadAnos;
	}

	// METODO TOSTRING
	// TODO PUNTO 1D: Genere automaticamente el metodo toString con todos los campos (atributos).
	// Escriba su codigo debajo de los to do. Nunca arriba.
	@Override
	public String toString() 
	{
		return "Soldado [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", estatura=" + estatura + ", antiguedadAnos=" + antiguedadAnos + ", getCedula()=" + getCedula()
				+ ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad()
				+ ", getEstatura()=" + getEstatura() + ", getAntiguedadAnos()=" + getAntiguedadAnos() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}

