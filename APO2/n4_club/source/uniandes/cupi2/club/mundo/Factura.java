/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogot_ - Colombia)
 * Departamento de Ingenier_a de Sistemas y Computaci_n
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Proyecto Cupi2
 * Ejercicio: Club
 * Autor: Jorge Jim_nez- Julio 2005
 * Autor inicial: Mario S_nchez
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package uniandes.cupi2.club.mundo;

import java.io.Serializable;

/**
 * Clase que modela una factura en el club
 */
public class Factura implements Serializable
{
	private static final long serialVersionUID = 1L;

	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * Es la descripci_n del consumo que gener_ esta factura
     */
    private String concepto;

    /**
     * Es el valor del consumo que gener_ la factura
     */
    private double valor;

    /**
     * Nombre de aqu_l que hizo el consumo que gener_ la factura
     */
    private String nombre;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un objeto factura asociado a un consumo de un socio o de un autorizado.
     * @param elNombre corresponde al nombre del que hizo el consumo. Este nombre es v_lido en el Club. - elNombre!=null
     * @param elConcepto corresponde a el concepto del consumo - elConcepto!=null
     * @param elValor corresponde al valor del consumo
     */
    public Factura( String elNombre, String elConcepto, double elValor )
    {

        nombre = elNombre;
        concepto = elConcepto;
        valor = elValor;
    }

    // -----------------------------------------------------------------
    // M_todos
    // -----------------------------------------------------------------
    /**
     * Este m_todo sirve para conocer el concepto de la factura. <br>
     * <b>post: </b> Retorn_ el concepto de la factura <br>
     * @return concepto - concepto de la factura - concepto!=null
     */
    public String darConcepto( )
    {
        return concepto;
    }

    /**
     * Este m_todo sirve para saber el valor de la factura. <br>
     * <b>post: </b> Retorn_ el valor de la factura <br>
     * @return valor - valor de la factura - valor!=null
     */
    public double darValor( )
    {
        return valor;
    }

    /**
     * Este m_todo sirve para saber el nombre de quien hizo el consumo que gener_ la factura. <br>
     * <b>post: </b> Retorn_ el nombre que aparece en la factura <br>
     * @return nombre - nombre en la factura - nombre!=null
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Este metodo se usa para obtener una cadena que representa a la factura
     * @return factura - una cadena de caracteres con la informacion de la factura. Tiene concatenado: el concepto de la factura, el valor y el nombre del socio o del
     *         autorizado quien hizo el consumo - factura !=null
     */
    public String toString( )
    {
        String factura = concepto + "    $" + valor + "    (" + nombre + ")";
        return factura;
    }
}