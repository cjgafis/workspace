package mundo;

/**
 * La clase Gato representa un gato en el mundo de los animales.
 * Un Gato es un tipo de Carnivoro, que extiende de la clase Carnivoro.
 */
public class Gato extends Carnivoro 
{

    /**
     * Constructor de la clase Gato.
     *
     * @param nombre El nombre del gato.
     */
    public Gato(String nombre) 
    {
        super(nombre);
    }

    /**
     * Implementación del método hacerSonido() de la interfaz Animal.
     * Muestra el sonido que hace un gato.
     */
    @Override
    public void hacerSonido() 
    {
        System.out.println(getNombre() + " hace: Miau!");
    }

    /**
     * Implementación del método alimentarse() de la clase Carnivoro.
     * Muestra cómo se alimenta un gato.
     */
    @Override
    public void alimentarse() 
    {
        super.alimentarse();
        System.out.println(getNombre() + " se alimenta de concentrado para gatos.");
    }
}

