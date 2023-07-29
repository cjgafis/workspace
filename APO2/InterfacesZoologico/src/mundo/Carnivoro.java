package mundo;

/**
 * La clase Carnivoro es una subclase abstracta de Mamifero que representa
 * animales que se alimentan principalmente de carne. Esta clase extiende la
 * clase Mamifero y proporciona una implementación para el método alimentarse()
 * específico para animales carnívoros.
 */
public abstract class Carnivoro extends Mamifero 
{
    
    /**
     * Constructor de la clase Carnivoro que toma un nombre como argumento.
     * Se utiliza para inicializar el nombre del animal carnívoro a través del
     * constructor de la clase Mamifero.
     *
     * @param nombre Nombre del animal carnívoro.
     */
    public Carnivoro(String nombre) 
    {
        super(nombre);
    }
    
    /**
     * Implementación del método alimentarse() para animales carnívoros.
     * Muestra un mensaje que indica que el animal se alimenta de carne.
     * Llama al método alimentarse() de la clase Mamifero antes de mostrar
     * el mensaje específico para carnívoros.
     */
    @Override
    public void alimentarse() 
    {
        super.alimentarse();
        System.out.println(getNombre() + " se alimenta de carne.");
    }
}

