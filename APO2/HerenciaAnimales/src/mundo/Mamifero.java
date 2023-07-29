package mundo;

public class Mamifero extends Animal
{
	public Mamifero(String nombre) 
	{
		super(nombre);
	}

	@Override
	public String obtenerTipoAnimal()
	{
		return "Mamifero";
	}
}
