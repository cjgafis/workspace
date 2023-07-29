package mundo;

/**
 * La clase Vaca es una subclase de Herbivoro y representa una vaca en el mundo.
 * Esta clase extiende la clase Herbivoro y proporciona una implementación específica
 * para hacerSonido() y alimentarse().
 */
public class Vaca extends Herbivoro 
{
    /**
     * Constructor de la clase Vaca.
     *
     * @param nombre Nombre de la vaca.
     */
    public Vaca(String nombre) 
    {
        super(nombre);
    }

    /**
     * Implementación del método hacerSonido() para la clase Vaca.
     * Imprime el sonido que hace la vaca junto con su nombre.
     */
    @Override
    public void hacerSonido() 
    {
        System.out.println(getNombre() + " hace: Muuu!");
    }

    /**
     * Implementación del método alimentarse() para la clase Vaca.
     * Imprime la forma en que se alimenta la vaca junto con su nombre.
     * Este método llama al método alimentarse() de la superclase y
     * luego añade información específica de la vaca.
     */
    @Override
    public void alimentarse() 
    {
        super.alimentarse();
        System.out.println(getNombre() + " se alimenta de hierbas.");
    }
}

