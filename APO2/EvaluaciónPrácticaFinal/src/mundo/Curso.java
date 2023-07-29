package mundo;

public abstract class Curso implements Calificable 
{
    private String nombre;
    private String codigo;
    private String horario;

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(String codigo) 
    {
        this.codigo = codigo;
    }

    public String getHorario() 
    {
        return horario;
    }

    public void setHorario(String horario) 
    {
        this.horario = horario;
    }

    public abstract void calificar();
}
