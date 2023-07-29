package mundo;

/**
 * Clase que representa un empleado en una empresa.
 * Incluye atributos para almacenar el nombre, la identificación y el salario del empleado,
 * así como métodos para obtener y modificar estos atributos y calcular el salario anual y el bono.
 */
public class Empleado 
{
    
    // Constante que representa el porcentaje de bonificación aplicable a los empleados.
    private static final double BONO_PORCENTAJE = 0.10;

    // Atributos de la clase Empleado
    private String nombre;
    private int id;
    private double salario;

    /**
     * Constructor que crea un nuevo objeto Empleado con los valores especificados.
     *
     * @param nombre  el nombre del empleado
     * @param id      la identificación del empleado
     * @param salario el salario del empleado
     */
    public Empleado(String nombre, int id, double salario) 
    {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    // Métodos get y set para los atributos

    /**
     * Devuelve el nombre del empleado.
     *
     * @return el nombre del empleado
     */
    public String getNombre() 
    {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre el nuevo nombre del empleado
     */
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    /**
     * Devuelve la identificación del empleado.
     *
     * @return la identificación del empleado
     */
    public int getId() 
    {
        return id;
    }

    /**
     * Establece la identificación del empleado.
     *
     * @param id la nueva identificación del empleado
     */
    public void setId(int id) 
    {
        this.id = id;
    }

    /**
     * Devuelve el salario del empleado.
     *
     * @return el salario del empleado
     */
    public double getSalario() 
    {
        return salario;
    }

    /**
     * Establece el salario del empleado.
     *
     * @param salario el nuevo salario del empleado
     */
    public void setSalario(double salario) 
    {
        this.salario = salario;
    }

    // Método toString

    /**
     * Devuelve una representación en cadena de caracteres del objeto Empleado.
     *
     * @return una cadena que representa al empleado con su nombre, id y salario
     */
    @Override
    public String toString() 
    {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", salario=" + salario +
                '}';
    }

    // Métodos adicionales para resolver requerimientos funcionales

    /**
     * Calcula el salario anual del empleado.
     *
     * @return el salario anual del empleado
     */
    public double calcularSalarioAnual() 
    {
        return salario * 12;
    }

    /**
     * Calcula el bono que se otorgará al empleado basado en su salario y el porcentaje de bonificación.
     *
     * @return el bono que se otorgará al empleado
     */
    public double calcularBono() 
    {
        return salario * BONO_PORCENTAJE;
    }
}

