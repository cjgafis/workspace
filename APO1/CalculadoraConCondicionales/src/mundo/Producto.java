package mundo;

public class Producto 
{
	// CONSTANTES
	/**
	 * Constante que representa el IVA para algunos productos
	 */
	public final static double IVA = 0.19;
	
	// ATRIBUTOS
	/**
	 * Representa el nombre del producto
	 */
	private String nombre;
	/**
	 * Representa el codigo unico que identifica un producto
	 */
	private String codigo;
	/**
	 * Representa la medida del producto, ya sea litro, gramos, etc.
	 */
	private String medida;
	/**
	 * Representa el valor de cada producto sin IVA
	 */
	private double precioBase;
	/**
	 * Representa la cantidad del producto que hay en bodega para la venta
	 */
	private int stock;
	/**
	 * Indica si el producto esta grabado con el impuesto del IVA
	 */
	private boolean grabado;
	/**
	 * Representa la cantidad de unidades vendidas de un producto
	 */
	private int unidadesVendidas;
	
	// METODO CONSTRUCTOR
	/**
	 * Metodo para instanciar sobjetos de la clase Producto.
	 * @param nombre - Representa el nombre del producto
	 * @param codigo - Representa el codigo unico que identifica un producto
	 * @param medida - Representa la medida del producto, ya sea litro, gramos, etc.
	 * @param precioBase - Representa el valor de cada producto sin IVA
	 * @param stock - Representa la cantidad del producto que hay en bodega para la venta
	 * @param grabado - Indica si el producto esta grabado con el impuesto del IVA
	 * @param unidadesVendidas - Representa la cantidad de unidades vendidas de un producto
	 */
	public Producto(String nombre, String codigo, String medida, double precioBase, 
			int stock, boolean grabado, int unidadesVendidas) 
	{
		this.nombre = nombre;
		this.codigo = codigo;
		this.medida = medida;
		this.precioBase = precioBase;
		this.stock = stock;
		this.grabado = grabado;
		this.unidadesVendidas = unidadesVendidas;
	}

	// METODOS GET Y SET
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
	 * @return the codigo
	 */
	public String getCodigo() 
	{
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
	}

	/**
	 * @return the medida
	 */
	public String getMedida() 
	{
		return medida;
	}

	/**
	 * @param medida the medida to set
	 */
	public void setMedida(String medida) 
	{
		this.medida = medida;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() 
	{
		return precioBase;
	}

	/**
	 * @param precioBase the precioBase to set
	 */
	public void setPrecioBase(double precioBase) 
	{
		this.precioBase = precioBase;
	}

	/**
	 * @return the stock
	 */
	public int getStock() 
	{
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) 
	{
		this.stock = stock;
	}

	/**
	 * @return the grabado
	 */
	public boolean isGrabado() 
	{
		return grabado;
	}

	/**
	 * @param grabado the grabado to set
	 */
	public void setGrabado(boolean grabado) 
	{
		this.grabado = grabado;
	}

	/**
	 * @return the unidadesVendidas
	 */
	public int getUnidadesVendidas() 
	{
		return unidadesVendidas;
	}

	/**
	 * @param unidadesVendidas the unidadesVendidas to set
	 */
	public void setUnidadesVendidas(int unidadesVendidas) 
	{
		this.unidadesVendidas = unidadesVendidas;
	}

	/**
	 * @return the iva
	 */
	public static double getIva() 
	{
		return IVA;
	}

	// METODO TOSTRING
	@Override
	public String toString() 
	{
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", medida=" + medida + ", precioBase=" + precioBase
				+ ", stock=" + stock + ", grabado=" + grabado + ", unidadesVendidas=" + unidadesVendidas + "]";
	}
	
	// OTROS METODOS
	/**
	 * Permite calcular el valor final del producto dependiendo si esta grabado con el impuesto del IVA.
	 * pre:
	 * post: se calculo el precio final del producto
	 * @return el precio final del producto. 
	 */
	public double precioFinal()
	{
		double precioFinal = 0.0;
		if(grabado == true)
		{
			precioFinal = precioBase + (precioBase * IVA);
		}
		else
		{
			precioFinal = precioBase;
		}
		return precioFinal;
	}
	
	/**
	 * Permite restar del stock la cantidad que se vende del producto.
	 * @param cantidad
	 */
	public void vender(int cantidad)
	{
		stock = stock - cantidad;
		unidadesVendidas++;
	}
	
	/**
	 * Permite sumar al stock la cantidad que se compro del producto.
	 * @param cantidad
	 */
	public void surtir(int cantidad)
	{
		stock = stock + cantidad;
	}
	
	
}
