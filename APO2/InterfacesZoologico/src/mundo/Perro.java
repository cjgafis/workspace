package mundo;

/**
 * La clase Perro representa un perro en el mundo de los animales.
 * Esta clase hereda de la clase abstracta Carnivoro, y por lo tanto,
 * también implementa la interfaz Animal.
 */
public class Perro extends Carnivoro 
{
    /**
     * Constructor de la clase Perro.
     *
     * @param nombre El nombre del perro.
     */
    public Perro(String nombre) 
    {
        super(nombre);
    }

    /**
     * Implementación del método hacerSonido() de la interfaz Animal.
     * Imprime el sonido que hace el perro en la consola.
     */
    @Override
    public void hacerSonido() 
    {
        System.out.println(getNombre() + " hace: Guau!");
    }

    /**
     * Implementación del método alimentarse() de la clase Carnivoro.
     * Imprime en la consola que el perro se alimenta de concentrado para perros.
     */
    @Override
    public void alimentarse() 
    {
        super.alimentarse();
        System.out.println(getNombre() + " se alimenta de concentrado para perros.");
    }
}

