package mundo;

/**
 * La clase abstracta Herbivoro representa a los animales herbívoros en el mundo.
 * Hereda de la clase abstracta Mamifero e implementa el método específico
 * de alimentación para herbívoros.
 */
public abstract class Herbivoro extends Mamifero 
{
    /**
     * Constructor de la clase Herbivoro que recibe un nombre y llama al
     * constructor de la superclase Mamifero.
     *
     * @param nombre El nombre del animal herbívoro.
     */
    public Herbivoro(String nombre) 
    {
        super(nombre);
    }

    /**
     * Método para que el animal herbívoro se alimente de plantas.
     * Este método es una implementación del método abstracto alimentarse()
     * definido en la clase abstracta Mamifero.
     */
    @Override
    public void alimentarse() 
    {
        super.alimentarse();
        System.out.println(getNombre() + " se alimenta de plantas.");
    }
}


