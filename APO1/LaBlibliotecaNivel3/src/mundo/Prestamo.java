package mundo;

import java.time.LocalDate;

public class Prestamo 
{
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo, 
    		LocalDate fechaDevolucion) 
    {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() 
    {
        return libro;
    }

    public void setLibro(Libro libro) 
    {
        this.libro = libro;
    }

    public Usuario getUsuario() 
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
    }

    public LocalDate getFechaPrestamo() 
    {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) 
    {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() 
    {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) 
    {
        this.fechaDevolucion = fechaDevolucion;
    }

	@Override
	public String toString() 
	{
		return "Prestamo [libro=" + libro + ", usuario=" + usuario + ", fechaPrestamo=" + fechaPrestamo
				+ ", fechaDevolucion=" + fechaDevolucion + "]";
	}
    
}

