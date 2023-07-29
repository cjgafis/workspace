package mundo;

/**
 * Clase abstracta Ave que extiende de la clase abstracta AnimalBase.
 * Representa un ave en el mundo de los animales.
 */
public abstract class Ave extends AnimalBase 
{  
    /**
     * Constructor que recibe el nombre del ave.
     *
     * @param nombre El nombre del ave.
     */
    public Ave(String nombre) 
    {
        super(nombre); // Llama al constructor de la clase padre (AnimalBase) con el nombre del ave.
    }
    
    /**
     * Método que simula cómo se alimenta un ave en general.
     * Muestra un mensaje indicando que el ave se alimenta de semillas y lombrices.
     */
    public void alimentarse() 
    {
        System.out.println(getNombre() + " se alimenta de semillas y lombrices.");
    }
}


