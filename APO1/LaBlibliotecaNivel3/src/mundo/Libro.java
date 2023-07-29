package mundo;

public class Libro 
{
	private String titulo;
	private String autor;
	private String isbn;
	private String categoria;
	private boolean estado; // true si está disponible, false si está prestado

	public Libro(String titulo, String autor, String isbn, String categoria) 
	{
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.categoria = categoria;
		this.estado = true;
	}

	public String getTitulo() 
	{
		return titulo;
	}

	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}

	public String getAutor() 
	{
		return autor;
	}

	public void setAutor(String autor) 
	{
		this.autor = autor;
	}

	public String getIsbn() 
	{
		return isbn;
	}

	public void setIsbn(String isbn) 
	{
		this.isbn = isbn;
	}

	public String getCategoria() 
	{
		return categoria;
	}

	public void setCategoria(String categoria) 
	{
		this.categoria = categoria;
	}

	public boolean isEstado() 
	{
		return estado;
	}

	public void setEstado(boolean estado) 
	{
		this.estado = estado;
	}

	@Override
	public String toString() 
	{
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + isbn + ", categoria=" + categoria
				+ ", estado=" + estado + "]";
	}
	
}

