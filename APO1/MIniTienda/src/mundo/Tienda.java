package mundo;

public class Tienda 
{
	// ATRIBUTOS
	private Producto p1;
	private Producto p2;
	private Producto p3;
	private Producto p4;
	private double dineroEnCaja;

	// METODO CONSTRUCTOR
	public Tienda()
	{
		p1 = new Producto("Leche Alqueria", "934651", "Litro", 5500.0, 45, false);
		p2 = new Producto("Huevo Oro", "231485", "Unidad", 1200.0, 2000, false);
		p3 = new Producto("Pan Bimbo", "102938", "Familiar", 7000.0, 25, true);
		p4 = new Producto("Queso Alpina", "837456", "500 grs", 6500.0,10, true);
		dineroEnCaja = 0;
	}

	// METODOS GET Y SET
	/**
	 * @return the p1
	 */
	public Producto getP1() 
	{
		return p1;
	}

	/**
	 * @param p1 the p1 to set
	 */
	public void setP1(Producto p1) 
	{
		this.p1 = p1;
	}

	/**
	 * @return the p2
	 */
	public Producto getP2() 
	{
		return p2;
	}

	/**
	 * @param p2 the p2 to set
	 */
	public void setP2(Producto p2) 
	{
		this.p2 = p2;
	}

	/**
	 * @return the p3
	 */
	public Producto getP3() 
	{
		return p3;
	}

	/**
	 * @param p3 the p3 to set
	 */
	public void setP3(Producto p3) 
	{
		this.p3 = p3;
	}

	/**
	 * @return the p4
	 */
	public Producto getP4() 
	{
		return p4;
	}

	/**
	 * @param p4 the p4 to set
	 */
	public void setP4(Producto p4) 
	{
		this.p4 = p4;
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

	// METODO TOSTRING
	@Override
	public String toString() 
	{
		return "Tienda [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + ", dineroEnCaja=" + dineroEnCaja + "]";
	}

	// OTROS METODOS
	/**
	 * Permite listar los productos de la tienda por consola.
	 */
	public void listarProductos()
	{
		System.out.println(p1 + "\n" + p2 + "\n" + p3 + "\n" + p4);
	}

	/**
	 * Permite buscar un producto dado el codigo.
	 * @param codigo - identificador unico de un producto
	 * @return el producto buscado mediante el codigo o null en caso de no encontrarlo
	 */
	public Producto buscarProductoPorCodigo(String codigo)
	{
		Producto productoBuscado = null;

		if(p1.getCodigo().equalsIgnoreCase(codigo))
		{
			productoBuscado = p1;
		}
		else if(p2.getCodigo().equalsIgnoreCase(codigo))
		{
			productoBuscado = p2;
		}
		else if(p3.getCodigo().equalsIgnoreCase(codigo))
		{
			productoBuscado = p3;
		}
		else if(p4.getCodigo().equalsIgnoreCase(codigo))
		{
			productoBuscado = p4;
		}

		return productoBuscado;
	}

	/**
	 * 
	 */
	public Producto buscarProductoPorNombre(String nombre)
	{
		//TODO
		Producto productoBuscado = null;

		if(p1.getNombre().equalsIgnoreCase(nombre))
		{
			productoBuscado = p1;
		}
		else if(p2.getNombre().equalsIgnoreCase(nombre))
		{
			productoBuscado = p2;
		}
		else if(p3.getNombre().equalsIgnoreCase(nombre))
		{
			productoBuscado = p3;
		}
		else if(p4.getNombre().equalsIgnoreCase(nombre))
		{
			productoBuscado = p4;
		}

		return productoBuscado;
	}

	/**
	 * Permite vender una cantidad de un producto dado su codigo.
	 * @param codigo - identificador unico de un producto
	 * @param cantidad - cantidad que se va a vender de un producto
	 */
	public void vender(String codigo, int cantidad)
	{
		Producto productoBuscado = buscarProductoPorCodigo(codigo);

		if(productoBuscado != null && productoBuscado.getStock() >= cantidad)
		{
			productoBuscado.vender(cantidad);
			dineroEnCaja = dineroEnCaja + (productoBuscado.precioFinal() * cantidad);
			System.out.println("Se vendio el producto");
		}
		else
		{
			System.out.println("No hay stock suficiente para realizar la venta o el codigo no es valido.");
		}
	}

	/**
	 * 
	 * @param nombre
	 * @param cantidad
	 */
	public void vender2(String nombre, int cantidad)
	{
		//TODO
		Producto productoBuscado = buscarProductoPorCodigo(nombre);

		if(productoBuscado != null && productoBuscado.getStock() >= cantidad)
		{
			productoBuscado.vender(cantidad);
			dineroEnCaja = dineroEnCaja + (productoBuscado.precioFinal() * cantidad);
			System.out.println("Se vendio el producto");
		}
		else
		{
			System.out.println("No hay stock suficiente para realizar la venta o el codigo no es valido.");
		}
	}

	/**
	 * Permite surtir la tienda con la cantidad comprada de un producto
	 * @param codigo - identificador unico de un producto
	 * @param cantidad - cantidad que se va a comprar de un producto
	 */
	public void surtir(String codigo, int cantidad)
	{
		Producto productoBuscado = buscarProductoPorCodigo(codigo);

		if(productoBuscado != null &&
				((productoBuscado.getPrecioBase() - (productoBuscado.getPrecioBase() * 0.20)) * cantidad) <= dineroEnCaja)
		{
			productoBuscado.surtir(cantidad);
			dineroEnCaja = dineroEnCaja - ((productoBuscado.getPrecioBase() - (productoBuscado.getPrecioBase() * 0.20)) * cantidad);
			System.out.println("Se surtio la tienda con el producto");
		}
		else
		{
			System.out.println("No hay dinero suficiente para surtir o el producto no existe.");
		}
	}

	/**
	 * 
	 * @param codigo
	 * @param cantidad
	 */
	public void surti2(String nombre, int cantidad)
	{
		//TODO
		Producto productoBuscado = buscarProductoPorCodigo(nombre);

		if(productoBuscado != null &&
				((productoBuscado.getPrecioBase() - (productoBuscado.getPrecioBase() * 0.20)) * cantidad) <= dineroEnCaja)
		{
			productoBuscado.surtir(cantidad);
			dineroEnCaja = dineroEnCaja - ((productoBuscado.getPrecioBase() - (productoBuscado.getPrecioBase() * 0.20)) * cantidad);
			System.out.println("Se surtio la tienda con el producto");
		}
		else
		{
			System.out.println("No hay dinero suficiente para surtir o el producto no existe.");
		}
	}

	/**
	 * Muestra el total de unidades vendidas de cada producto en la tienda
	 * pre:
	 * post: se mostro el total de unidades vendidas de cada producto en la tienda
	 * @return el total de productos vendidos. 
	 */
	public int totalProductosVendidos()
	{
		int totalProductosVendidos = 0;
		totalProductosVendidos = p1.getUnidadesVendidas() + p2.getUnidadesVendidas() + p3.getUnidadesVendidas() + p4.getUnidadesVendidas();
		return totalProductosVendidos;
	}

	public Producto productoMasVendido()
	{
		Producto masVendido = null;
		if(p1.getUnidadesVendidas() == 0 && 
				p2.getUnidadesVendidas() == 0 &&
				p3.getUnidadesVendidas() == 0 &&
				p4.getUnidadesVendidas() == 0)
		{
			System.out.println("No hay unidades vendidas de ningun producto. ");
		}
		else
		{
			if(p1.getUnidadesVendidas() >= p2.getUnidadesVendidas() && 
					p1.getUnidadesVendidas() >= p3.getUnidadesVendidas() && 
					p1.getUnidadesVendidas() >= p4.getUnidadesVendidas())
			{
				masVendido = p1;
			}
			else if(p2.getUnidadesVendidas() >= p1.getUnidadesVendidas() && 
					p2.getUnidadesVendidas() >= p3.getUnidadesVendidas() && 
					p2.getUnidadesVendidas() >= p4.getUnidadesVendidas())
			{
				masVendido = p2;
			}
			else if(p3.getUnidadesVendidas() >= p1.getUnidadesVendidas() && 
					p3.getUnidadesVendidas() >= p2.getUnidadesVendidas() && 
					p3.getUnidadesVendidas() >= p4.getUnidadesVendidas())
			{
				masVendido = p3;
			}
			else if(p4.getUnidadesVendidas() >= p1.getUnidadesVendidas() && 
					p4.getUnidadesVendidas() >= p2.getUnidadesVendidas() && 
					p4.getUnidadesVendidas() >= p3.getUnidadesVendidas())
			{
				masVendido = p4;
			}
		}
		return masVendido;
	}

	public Producto productoMenosVendido()
	{
		Producto menosVendido = null;

		if(p1.getUnidadesVendidas() == 0 && 
				p2.getUnidadesVendidas() == 0 &&
				p3.getUnidadesVendidas() == 0 &&
				p4.getUnidadesVendidas() == 0)
		{
			System.out.println("No hay unidades vendidas de ningun producto. ");
		}
		else
		{
			if(p1.getUnidadesVendidas() <= p2.getUnidadesVendidas() && 
					p1.getUnidadesVendidas() <= p3.getUnidadesVendidas() && 
					p1.getUnidadesVendidas() <= p4.getUnidadesVendidas())
			{
				menosVendido = p1;
			}
			else if(p2.getUnidadesVendidas() <= p1.getUnidadesVendidas() && 
					p2.getUnidadesVendidas() <= p3.getUnidadesVendidas() && 
					p2.getUnidadesVendidas() <= p4.getUnidadesVendidas())
			{
				menosVendido = p2;
			}
			else if(p3.getUnidadesVendidas() <= p1.getUnidadesVendidas() && 
					p3.getUnidadesVendidas() <= p2.getUnidadesVendidas() && 
					p3.getUnidadesVendidas() <= p4.getUnidadesVendidas())
			{
				menosVendido = p3;
			}
			else if(p4.getUnidadesVendidas() <= p1.getUnidadesVendidas() && 
					p4.getUnidadesVendidas() <= p2.getUnidadesVendidas() && 
					p4.getUnidadesVendidas() <= p3.getUnidadesVendidas())
			{
				menosVendido = p4;
			}
		}
		return menosVendido;
	}

}
