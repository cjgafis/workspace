package mundo;

/**
 * Representa una tienda de barrio. La cual tiene un arreglo de productos y maneja su dinero.
 * @author CJ
 *
 */
public class Tienda 
{
	// CONSTANTES 
	/**
	 * Representa el tamanio del arreglo de productos. 
	 */
	public final static int TAMANIO = 10;

	// ATRIBUTOS
	/**
	 * Hace referencia a la contenedora que guarda los objetos de tipo producto. 
	 */
	private Producto[] productos;
	/**
	 * Representa la caja de la tienda. 
	 */
	private double dineroEnCaja;

	// METODO CONSTRUCTOR
	/**
	 * Permite crear instancias de tipo Tienda. 
	 * El dinero en caja se inicializa en cero. 
	 */
	public Tienda()
	{
		productos = new Producto[TAMANIO];
		dineroEnCaja = 0;
		productos[0] = new Producto("Leche bolsa", "111", "Alqueria", 3000, false, 30);
		productos[1] = new Producto("Pan unidad", "222", "Bimbo", 5000, false, 20);
		productos[2] = new Producto("Queso libra", "333", "Alpina", 4600, false, 10);
		productos[3] = new Producto("Huevo unidad", "444", "AAA", 400, false, 300);
		productos[4] = new Producto("Cafe libra", "555", "Colcafe", 2200, true, 15);
		productos[5] = new Producto("Azucar libra", "666", "Incauca", 3700, false, 18);
		productos[6] = new Producto("Salchicha x 6", "777", "Zenu", 5500, true, 7);
		productos[7] = new Producto("Manzana unidad", "888", "Olimpica", 2000, true, 12);
		productos[8] = new Producto("Tostada bolsa", "999", "Bimbo", 2600, false, 10);
		productos[9] = new Producto("Bizcocho bolsa", "123", "Bimbo", 1800, true, 10);
	}

	/**
	 * @return the productos
	 */
	public Producto[] getProductos() 
	{
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(Producto[] productos) 
	{
		this.productos = productos;
	}

	/**
	 * @return the dineroEnCaja
	 */
	public double getDineroEnCaja() 
	{
		return dineroEnCaja;
	}

	/**
	 * @param dineroEnCaja the dineroEnCaja to set
	 */
	public void setDineroEnCaja(double dineroEnCaja) 
	{
		this.dineroEnCaja = dineroEnCaja;
	}

	/**
	 * Permite buscar un producto mediante su codigo en el arreglo de productos. 
	 * pre: la lista productos debe existir. Puede estar vacia. 
	 * post: se busco un producto mediante su codigo. 
	 * @param codigo - codigo unico del producto en la tienda.
	 * @return el producto si fue encontrado. null en caso contrario. 
	 */
	public Producto buscarProducto(String codigo)
	{
		Producto productoBuscado = null;
		boolean encontrado = false;

		for(int i = 0; i < productos.length && encontrado == false; i++)
		{
			if(productos[i].getCodigo().equalsIgnoreCase(codigo))
			{
				productoBuscado = productos[i];
				encontrado = true;
			}
		}
		return productoBuscado;
	}

	/**
	 * Permite vender cierta cantidad de un producto de la tienda meddiante su codigo. 
	 * pre: la lista productos debe existir. Puede estar vacia. 
	 * post: se vendio cierta cantidad de un producto de la tienda meddiante su codigo.
	 * @param codigo - codigo unico del producto en la tienda
	 * @param cantidad - cantidad de producto que se desea vender
	 */
	public void vender(String codigo, int cantidad)
	{
		Producto producto = buscarProducto(codigo);
		if(producto != null)
		{
			if(producto.getCantidadBodega() >= cantidad)
			{
				dineroEnCaja = cantidad * producto.darPrecioFinal();
				producto.vender(cantidad);
				System.out.println("Se vendio " + cantidad + " de " + producto);
			}
			else
			{
				dineroEnCaja = producto.getCantidadBodega() * producto.darPrecioFinal();
				producto.vender(producto.getCantidadBodega());
				System.out.println("Se vendio " + producto.getCantidadBodega() + " de " + producto);
			}
		}
		else
		{
			System.out.println("El producto no esta registrado.");
		}

	}

	// ASUMIREMOS QUE EL VALOR DE COMPRA ES 20% MENOS PARA CADA PRODUCTO. 

	public void surtir(String codigo, int cantidad)
	{
		double valorDeCompra = 0.0;
		double totalAPagar = 0.0;
		Producto producto = buscarProducto(codigo);
		if(producto != null)
		{
			valorDeCompra = producto.getValorBruto() - (producto.getValorBruto() * 0.20);
			totalAPagar = valorDeCompra * cantidad;
			if(totalAPagar <= dineroEnCaja)
			{
				producto.comprar(cantidad);
				System.out.println("Se compraron " + cantidad + " unidades de " + producto.getNombre() + 
						" por un valor de " + totalAPagar);
			}
			else
			{
				System.out.println("No hay dinero suficiente en caja.");
			}
		}
		else
		{
			System.out.println("El producto no esta registrado.");
		}
	}

	public void mostrarProductos()
	{
		for(Producto producto : productos)
		{
			System.out.println(producto);
		}
	}
	
}
