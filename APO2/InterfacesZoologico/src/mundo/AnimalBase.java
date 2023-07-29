package mundo;

/**
 * Clase abstracta AnimalBase que implementa la interfaz Animal.
 * Esta clase representa la base para todos los animales en el sistema.
 */
public abstract class AnimalBase implements Animal 
{
    
    // Atributo que representa el nombre del animal.
    private String nombre;

    /**
     * Constructor de la clase AnimalBase que toma un nombre como argumento.
     *
     * @param nombre El nombre del animal.
     */
    public AnimalBase(String nombre) 
    {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener el nombre del animal.
     *
     * @return El nombre del animal.
     */
    public String getNombre() 
    {
        return nombre;
    }

    /**
     * Método setter para establecer el nombre del animal.
     *
     * @param nombre El nuevo nombre del animal.
     */
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto AnimalBase.
     * Este método se anota con @Override ya que sobrescribe el método toString() de la clase Object.
     *
     * @return Una cadena que representa al animal, incluyendo su nombre.
     */
    @Override
    public String toString() 
    {
        return "Animal: " + nombre;
    }
}
