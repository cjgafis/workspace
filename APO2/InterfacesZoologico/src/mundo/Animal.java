package mundo;

/**
 * La interfaz Animal representa el comportamiento básico que todos los animales
 * en el mundo deberían tener. Esta interfaz se utiliza para asegurar que todas
 * las clases que implementen esta interfaz tengan una implementación consistente
 * de estos métodos comunes.
 */
public interface Animal 
{

    /**
     * Este método define el comportamiento que un animal debe tener al hacer un
     * sonido. La implementación de este método debe describir el sonido que hace
     * el animal.
     */
    public void hacerSonido();

    /**
     * Este método define el comportamiento que un animal debe tener al alimentarse.
     * La implementación de este método debe describir cómo se alimenta el animal
     * en función de su dieta (carnívora, herbívora, omnívora, etc.).
     */
    public void alimentarse();
}


