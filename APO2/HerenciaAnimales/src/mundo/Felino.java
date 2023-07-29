package mundo;

public class Felino extends Mamifero
{
	public Felino(String nombre) 
	{
		super(nombre);
	}
	
	@Override
	public String obtenerTipoAnimal()
	{
		return "Felino";
	}
}
