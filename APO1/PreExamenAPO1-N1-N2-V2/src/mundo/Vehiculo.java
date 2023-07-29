package mundo;

public class Vehiculo 
{
	// CONSTANTES
	public enum Motor
	{
		COMBUSTION,
		ELECTRICO,
		HIBRIDO
	}
	
	// ATRIBUTOS
	private String numeroSerie;
	private String marca;
	private int modelo;
	private Motor tipo;
	private double capacidadTanque; // litros
	private int numeroPasajeros;
	private double precioVenta; // dolares
	
	/**
	 * @param numeroSerie
	 * @param marca
	 * @param modelo
	 * @param tipo
	 * @param capacidadTanque
	 * @param numeroPasajeros
	 * @param precioVenta
	 */
	public Vehiculo(String numeroSerie, String marca, int modelo, Motor tipo, double capacidadTanque,
			int numeroPasajeros, double precioVenta) 
	{
		this.numeroSerie = numeroSerie;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.capacidadTanque = capacidadTanque;
		this.numeroPasajeros = numeroPasajeros;
		this.precioVenta = precioVenta;
	}

	/**
	 * @return the numeroSerie
	 */
	public String getNumeroSerie() 
	{
		return numeroSerie;
	}

	/**
	 * @param numeroSerie the numeroSerie to set
	 */
	public void setNumeroSerie(String numeroSerie) 
	{
		this.numeroSerie = numeroSerie;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() 
	{
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) 
	{
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public int getModelo() 
	{
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(int modelo) 
	{
		this.modelo = modelo;
	}

	/**
	 * @return the tipo
	 */
	public Motor getTipo() 
	{
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Motor tipo) 
	{
		this.tipo = tipo;
	}

	/**
	 * @return the capacidadTanque
	 */
	public double getCapacidadTanque() 
	{
		return capacidadTanque;
	}

	/**
	 * @param capacidadTanque the capacidadTanque to set
	 */
	public void setCapacidadTanque(double capacidadTanque) 
	{
		this.capacidadTanque = capacidadTanque;
	}

	/**
	 * @return the numeroPasajeros
	 */
	public int getNumeroPasajeros() 
	{
		return numeroPasajeros;
	}

	/**
	 * @param numeroPasajeros the numeroPasajeros to set
	 */
	public void setNumeroPasajeros(int numeroPasajeros) 
	{
		this.numeroPasajeros = numeroPasajeros;
	}

	/**
	 * @return the precioVenta
	 */
	public double getPrecioVenta() 
	{
		return precioVenta;
	}

	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(double precioVenta) 
	{
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() 
	{
		return "Vehiculo [numeroSerie=" + numeroSerie + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo
				+ ", capacidadTanque=" + capacidadTanque + ", numeroPasajeros=" + numeroPasajeros + ", precioVenta="
				+ precioVenta + "]";
	}
	
}
