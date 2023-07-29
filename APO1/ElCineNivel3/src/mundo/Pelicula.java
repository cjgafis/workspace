package mundo;

public class Pelicula 
{
    private String titulo;
    private String clasificacion;
    private int duracion;

    public Pelicula(String titulo, String clasificacion, int duracion) 
    {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
    }

	public String getTitulo() 
	{
		return titulo;
	}

	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}

	public String getClasificacion() 
	{
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) 
	{
		this.clasificacion = clasificacion;
	}

	public int getDuracion() 
	{
		return duracion;
	}

	public void setDuracion(int duracion) 
	{
		this.duracion = duracion;
	}

	@Override
	public String toString() 
	{
		return "Pelicula [titulo=" + titulo + ", clasificacion=" + clasificacion + ", duracion=" + duracion + "]";
	}

}
