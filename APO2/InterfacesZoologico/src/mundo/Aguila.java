package mundo;

/**
 * Esta clase representa un Águila, que es un tipo de Ave.
 * Extiende la clase abstracta Ave e implementa los métodos
 * hacerSonido y alimentarse.
 */
public class Aguila extends Ave 
{

    /**
     * Constructor de la clase Aguila.
     * 
     * @param nombre Nombre del águila.
     */
    public Aguila(String nombre) 
    {
        super(nombre);
    }

    /**
     * Implementación del método hacerSonido específico para la clase Aguila.
     * Muestra un mensaje en la consola con el sonido que hace el águila.
     */
    @Override
    public void hacerSonido() 
    {
        System.out.println(getNombre() + " hace: ¡Cacaa!");
    }

    /**
     * Implementación del método alimentarse específico para la clase Aguila.
     * Llama al método alimentarse de la clase padre (Ave) y luego muestra un mensaje
     * en la consola con la forma en que el águila se alimenta.
     */
    @Override
    public void alimentarse() 
    {
        super.alimentarse();
        System.out.println(getNombre() + " se alimenta de liebres.");
    }
}


