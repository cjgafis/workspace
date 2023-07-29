package mundo;

public class Coche 
{
    private String marca;
    private String modelo;
    private String matricula;
    private Propietario propietario;

    public Coche(String marca, String modelo, String matricula, Propietario propietario) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.propietario = propietario;
    }

    public String getMarca() 
    {
        return marca;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }

    public String getMatricula() 
    {
        return matricula;
    }

    public void setMatricula(String matricula) 
    {
        this.matricula = matricula;
    }

	public Propietario getPropietario() 
	{
		return propietario;
	}

	public void setPropietario(Propietario propietario) 
	{
		this.propietario = propietario;
	}

	@Override
	public String toString() 
	{
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", propietario="
				+ propietario + "]";
	}

}

