package mundo;

/**
 * La clase Nodo representa un nodo en una lista doblemente enlazada.
 */
public class Nodo 
{
    private Militar militar;
    private Nodo siguiente;
    private Nodo anterior;

    /**
     * Constructor de la clase Nodo.
     *
     * @param militar El militar que se almacenará en el nodo.
     */
    public Nodo(Militar militar) 
    {
        this.militar = militar;
        this.siguiente = null;
        this.anterior = null;
    }

    /**
     * Obtiene el militar almacenado en el nodo.
     *
     * @return El militar almacenado en el nodo.
     */
    public Militar getMilitar() 
    {
        return militar;
    }

    /**
     * Establece el militar que se almacenará en el nodo.
     *
     * @param militar El militar a almacenar en el nodo.
     */
    public void setMilitar(Militar militar) 
    {
        this.militar = militar;
    }

    /**
     * Obtiene el siguiente nodo en la lista.
     *
     * @return El siguiente nodo en la lista.
     */
    public Nodo getSiguiente() 
    {
        return siguiente;
    }

    /**
     * Establece el siguiente nodo en la lista.
     *
     * @param siguiente El siguiente nodo a establecer.
     */
    public void setSiguiente(Nodo siguiente) 
    {
        this.siguiente = siguiente;
    }

    /**
     * Obtiene el nodo anterior en la lista.
     *
     * @return El nodo anterior en la lista.
     */
    public Nodo getAnterior() 
    {
        return anterior;
    }

    /**
     * Establece el nodo anterior en la lista.
     *
     * @param anterior El nodo anterior a establecer.
     */
    public void setAnterior(Nodo anterior) 
    {
        this.anterior = anterior;
    }
}
