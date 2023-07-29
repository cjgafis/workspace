package mundo;

public class ListaDoble 
{
    private Nodo inicio;

    public ListaDoble() 
    {
        inicio = null;
    }

    // ============= METODOS PARA AGREGAR ========================
    public void agregarAlInicio(Persona persona) 
    {
        
    }
    
    public void agregarAlFinal(Persona persona) 
    {
        
    }
    
    public void agregarDespuesDe(Persona persona) 
    {
        
    }
    
    // ============= METODOS PARA ELIMINAR ========================
    public void eliminarElPrimero()
    {
    	
    }
    
    public void eliminarElUltimo()
    {
    	
    }
    
    public void eliminarDadaLaPosicion(int pos)
    {
    	
    }

    public void imprimir() 
    {
        Nodo puntero = inicio;
        while (puntero != null) 
        {
            System.out.println(puntero.getPersona());
            puntero = puntero.getSiguiente();
        }
    }
}

