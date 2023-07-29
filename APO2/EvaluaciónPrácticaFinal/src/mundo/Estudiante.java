package mundo;

public class Estudiante extends Persona 
{
    private String carrera;
    private int semestre;

    public String getCarrera() 
    {
        return carrera;
    }

    public void setCarrera(String carrera) 
    {
        this.carrera = carrera;
    }

    public int getSemestre() 
    {
        return semestre;
    }

    public void setSemestre(int semestre) 
    {
        this.semestre = semestre;
    }
}
