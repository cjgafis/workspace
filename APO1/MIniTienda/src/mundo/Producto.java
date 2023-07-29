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
	 * Indica las unidades que se han vendido de cada producto
	 */
	private int unidadesVendidas;
	
	// METODO CONSTRUCTOR
	/**
	 * @param nombre 
	 * @param codigo
	 * @param medida
	 * @param precioBase
	 * @param stock
	 * @param grabado
	 */
	public Producto(String nombre, String codigo, String medida, 
			double precioBase, int stock, boolean grabado) 
	{
		this.nombre = nombre;
		this.codigo = codigo;
		this.medida = medida;
		this.precioBase = precioBase;
		this.stock = stock;
		this.grabado = grabado;
		this.unidadesVendidas = 0;
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
	 * @return the iva19
	 */
	public static double getIva19() 
	{
		return IVA;
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

	// METODO TOSTRING
	@Override
	public String toString() 
	{
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + 
				", medida=" + medida + ", precioBase=" + precioBase
				+ ", stock=" + stock + ", grabado=" + grabado + "]";
	}

	// OTROS METODOS
	/**
	 * Permite calcular el precio final del producto.
	 * pre: 
	 * post: se calculo el precio final del producto.
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
	 * Permite vender una cantidad de unidades disponibles en stock
	 * pre:
	 * post: se vendio la cantidad de unidades disponible en stock
	 * @param cantidad - es la cantidad que se va a vender
	 */
	public void vender(int cantidad)
	{
		if(cantidad <= stock)
		{
			stock = stock - cantidad;
			unidadesVendidas = unidadesVendidas + cantidad;
		}
	}
	
	/**
	 * Permite surtir la tienda con la cantidad que se compra del producto
	 * pre:
	 * post: se surtio la tienda con la cantidad que se compro del producto
	 * @param cantidad - es la cantidad que se va a comprar
	 */
	public void surtir(int cantidad)
	{
		stock = stock + cantidad;
	}

}
