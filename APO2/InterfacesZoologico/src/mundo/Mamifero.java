package mundo;

/**
 * Clase abstracta Mamifero que hereda de la clase abstracta AnimalBase.
 * Representa un mamífero genérico en el mundo animal.
 */
public abstract class Mamifero extends AnimalBase 
{  
    /**
     * Constructor para la clase Mamifero.
     * 
     * @param nombre Nombre del mamífero como una cadena de caracteres.
     */
    public Mamifero(String nombre) 
    {
        super(nombre);
    }
    
    /**
     * Método que representa la acción de alimentarse de un mamífero.
     * Imprime en la consola que el mamífero se alimenta de leche materna.
     */
    public void alimentarse() 
    {
        System.out.println(getNombre() + " se alimenta de leche materna.");
    }
}


