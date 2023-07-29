package mundo;

public class Gato extends Felino
{
	public Gato(String nombre) 
	{
		super(nombre);
	}
	
	@Override
	public String obtenerTipoAnimal()
	{
		return "Gato";
	}
	
	public String maullar()
	{
		return "¡Miau!";
	}
}
