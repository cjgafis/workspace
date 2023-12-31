package mundo;

public class Estudiante 
{
    private int codigo;
    private String nombre;
    private String apellido;

    public Estudiante(int codigo, String nombre, String apellido) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y setters
    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
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
}

