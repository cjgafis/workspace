package mundo;

import java.util.ArrayList;

public class Usuario 
{
    private String nombre;
    private String apellido;
    private String identificacion;
    private String correo;
    private ArrayList<Prestamo> prestamosActivos;

    public Usuario(String nombre, String apellido, String identificacion, String correo) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.correo = correo;
        this.prestamosActivos = new ArrayList<Prestamo>();
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getApellido() 
    {
        return apellido;
    }

    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }

    public String getIdentificacion() 
    {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) 
    {
        this.identificacion = identificacion;
    }

    public String getCorreo() 
    {
        return correo;
    }

    public void setCorreo(String correo) 
    {
        this.correo = correo;
    }

    public ArrayList<Prestamo> getPrestamosActivos() 
    {
        return prestamosActivos;
    }

    public void agregarPrestamo(Prestamo prestamo) 
    {
        prestamosActivos.add(prestamo);
    }

    public void eliminarPrestamo(Prestamo prestamo) 
    {
        prestamosActivos.remove(prestamo);
    }

	@Override
	public String toString() 
	{
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion
				+ ", correo=" + correo + ", prestamosActivos=" + prestamosActivos + "]";
	}
    
}

