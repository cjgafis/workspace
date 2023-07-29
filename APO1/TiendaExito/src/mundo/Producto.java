package mundo;
/**
 * Representa un producto de la tienda con caracteristicas como su nombre, 
 * su codigp, su marca, su valor sin impuestos, si es grabado o no, y la cantidad disponible para
 * la venta. 
 * @author CJ
 *
 */
public class Producto 
{
	// CONSTANTES
	/**
	 * Representa el valor del impuesto IVA impuesto por gobierno.
	 */
	public final static double IVA = 0.19;

	// ATRIBUTOS
	/**
	 * Representa el nombre del producto. 
	 */
	private String nombre;
	/**
	 * Representa el codigo unico del producto en la tienda. 
	 */
	private String codigo;
	/**
	 * Hace referencia al fabricante del producto.
	 */
	private String marca;
	/**
	 * Representa el valor del producto sin agregarle impuestos.
	 */
	private double valorBruto; // Sin IVA
	/**
	 * Representa si el producto esta grabado con un impuesto o no. 
	 */
	private boolean tieneIVA;
	/**
	 * Representa la cantidad disponible en bodega para su venta. 
	 */
	private int cantidadBodega;
	
	// METODO CONSTRUCTOR
	
	/**
	 * Permite crear instancias (objetos) de la clase Producto.
	 * @param nombre - nombre del producto.
	 * @param codigo - codigo unico del producto en la tienda.
	 * @param marca - hace referencia al fabricante del producto.
	 * @param valorBruto - valor sin impuestos del producto
	 * @param tieneIVA - si el producto tiene o no tiene IVA
	 * @param cantidadBodega - canridad del producto disponible en bodega para la venta
	 */
	public Producto(String nombre, String codigo, String marca, double valorBruto, boolean tieneIVA,
			int cantidadBodega) 
	{
		this.nombre = nombre;
		this.codigo = codigo;
		this.marca = marca;
		this.valorBruto = valorBruto;
		this.tieneIVA = tieneIVA;
		this.cantidadBodega = cantidadBodega;
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
	 * @return the valorBruto
	 */
	public double getValorBruto() 
	{
		return valorBruto;
	}

	/**
	 * @param valorBruto the valorBruto to set
	 */
	public void setValorBruto(double valorBruto) 
	{
		this.valorBruto = valorBruto;
	}

	/**
	 * @return the tieneIVA
	 */
	public boolean getTieneIVA() 
	{
		return tieneIVA;
	}

	/**
	 * @param tieneIVA the tieneIVA to set
	 */
	public void setTieneIVA(boolean tieneIVA) 
	{
		this.tieneIVA = tieneIVA;
	}

	/**
	 * @return the cantidadBodega
	 */
	public int getCantidadBodega() 
	{
		return cantidadBodega;
	}

	/**
	 * @param cantidadBodega the cantidadBodega to set
	 */
	public void setCantidadBodega(int cantidadBodega) 
	{
		this.cantidadBodega = cantidadBodega;
	}
	
	/**
	 * 
	 * @return
	 */
	public double darPrecioFinal()
	{
		double precio = 0.0;
		
		if (tieneIVA)
		{
			precio = valorBruto + (valorBruto * IVA);
		}
		else
		{
			precio = valorBruto;
		}
		return precio;
	}
	
	public void vender(int cantidad)
	{
		this.cantidadBodega = this.cantidadBodega - cantidad;
	}
	
	public void comprar(int cantidad)
	{
		this.cantidadBodega = this.cantidadBodega + cantidad;
	}
	

	// TOSTRING
	/**
	 * Muestra el estado del objeto de tipo producto. 
	 */
	@Override
	public String toString() 
	{
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", marca=" + marca + ", valorBruto=" + valorBruto
				+ ", tieneIVA=" + tieneIVA + ", cantidadBodega=" + cantidadBodega + "]";
	}	
}
