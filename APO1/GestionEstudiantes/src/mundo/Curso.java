package mundo;

import java.io.Serializable;
import java.util.ArrayList;

public class Curso implements Serializable 
{
    private static final long serialVersionUID = 1L;
	private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Curso(String nombre) 
    {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<Estudiante>();
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getEstudiantes() 
    {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) 
    {
        estudiantes.add(estudiante);
    }

    @Override
    public String toString() 
    {
        return "Curso{" + "nombre='" + nombre + '\'' + ", estudiantes=" + estudiantes + '}';
    }
}

