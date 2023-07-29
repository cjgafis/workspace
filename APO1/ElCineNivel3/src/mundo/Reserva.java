package mundo;

public class Reserva 
{
    private static int contadorID = 0;
    private int id;
    private Cliente cliente;
    private Pelicula pelicula;
    private Sala sala;
    private int fila;
    private int asiento;

    public Reserva(Cliente cliente, Pelicula pelicula, Sala sala, int fila, int asiento) 
    {
        this.id = ++contadorID;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.sala = sala;
        this.fila = fila;
        this.asiento = asiento;        
    }

	public static int getContadorID() 
	{
		return contadorID;
	}

	public static void setContadorID(int contadorID) 
	{
		Reserva.contadorID = contadorID;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public Cliente getCliente() 
	{
		return cliente;
	}

	public void setCliente(Cliente cliente) 
	{
		this.cliente = cliente;
	}

	public Pelicula getPelicula() 
	{
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) 
	{
		this.pelicula = pelicula;
	}

	public Sala getSala() 
	{
		return sala;
	}

	public void setSala(Sala sala) 
	{
		this.sala = sala;
	}

	public int getFila() 
	{
		return fila;
	}

	public void setFila(int fila) 
	{
		this.fila = fila;
	}

	public int getAsiento() 
	{
		return asiento;
	}

	public void setAsiento(int asiento) 
	{
		this.asiento = asiento;
	}

	@Override
	public String toString() 
	{
		return "Reserva [id=" + id + ", cliente=" + cliente + ", pelicula=" + pelicula + ", sala=" + sala
				+ ", fila=" + fila + ", asiento=" + asiento + "]";
	}

}
