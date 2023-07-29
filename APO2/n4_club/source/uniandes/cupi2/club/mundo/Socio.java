/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogot_ - Colombia)
 * Departamento de Ingenier_a de Sistemas y Computaci_n
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Proyecto Cupi2
 * Ejercicio: Club
 * Autor: Pablo Barvo - 21-Oct-2005
 * Autor: Jorge Jim_nez- Julio 2005
 * Autor inicial: Mario S_nchez
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package uniandes.cupi2.club.mundo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase que modela un socio
 */
public class Socio implements Serializable
{
    /**
	 * El serialVersionUID es un identificador unico para cada objeto que 
	 * se va a serializar, lo que ayuda a identificar la versión correcta 
	 * del objeto, incluso si se realizan cambios en sus atributos. 
	 */
	private static final long serialVersionUID = 1L;

	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /** Es la c_dula del socio */
    private String cedula;

    /** Es el nombre del socio */
    private String nombre;

    /** Son las facturas que tiene por pagar este socio */
    private ArrayList facturas;

    /** Son los nombres de las personas autorizadas para este socio */
    private ArrayList autorizados;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------
    /**
     * Crea un socio del club. <br>
     * <b>post: </b> Se cre_ un objeto socio con los valores pasados por par_metro y el vector de facturas fue inicializado as_ como el vector de autorizados. <br>
     * @param laCedula - Corresponde a la c_dula del socio nuevo.- laCedula!=null
     * @param elNombre - corresponde al nombre del socio nuevo - elNombre!=null
     *  
     */
    public Socio( String laCedula, String elNombre )
    {
        cedula = laCedula;
        nombre = elNombre;
        facturas = new ArrayList( );
        autorizados = new ArrayList( );
    }

    // -----------------------------------------------------------------
    // M_todos
    // -----------------------------------------------------------------

    /**
     * Este m_todo sirve para saber el nombre del socio. <br>
     * <b>post: </b> Retorn_ el nombre del socio <br>
     * @return nombre - nombre del socio -nombre!= null
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Este m_todo sirve para saber la c_dula del socio. <br>
     * <b>post: </b> Retorn_ la c_dula del socio <br>
     * @return c_dula - c_dula del socio - c_dula !=null
     */
    public String darCedula( )
    {
        return cedula;
    }

    /**
     * Este m_todo sirve para agregar una nueva persona autorizada a un socio. <br>
     * <b>pre: </b> La lista de autorizados debe estar inicializada. <br>
     * <b>post: </b> Se agreg_ un nuevo autorizado, con nombre distinto a todos los ya vinculados, y al del mismo socio <br>
     * @param nombreAutorizado - Es el nombre de la nueva persona autorizada para el socio. - nombreAutorizado!=null
     * @throws Exception - dispara una excepci_n si el autorizado ya exist_a en la lista de autorizados de este socio.
     * @throws Exception - dispara una excepci_n si el nombre del socio es igual al de nombre.
     */
    public void agregarAutorizado( String nombreAutorizado ) throws Exception
    {
        // Verificar que el nombre del socio no es el mismo del que se quiere
        // autorizar
        if( nombreAutorizado.equals( darNombre( ) ) )
        {
            throw new Exception( "Autorizado es el mismo Socio" );
        }
        // Si el nombre no exist_a entonces lo agregamos
        if( !existeAutorizado( nombreAutorizado ) )
        {
            autorizados.add( nombreAutorizado );
        }
        else
        {
            throw new Exception( "Autorizado ya existe" );
        }

    }

    /**
     * Elimina el autorizado del socio con el nombre dado. <br>
     * <b>pre: </b> La lista de autorizados debe estar inicializada. <br>
     * <b>post: </b> Se elimin_ un socio, con nombre igual a alguno de los vinculados <br>
     * @param nombreAutorizado - nombre de autorizado - nombreAutorizado!=null
     */
    public void eliminarAutorizado( String nombreAutorizado )
    {
        boolean encontro = false;
        int numAutorizados = autorizados.size( );
        for( int i = 0; i < numAutorizados && !encontro; i++ )
        {
            String a = ( String )autorizados.get( i );
            if( a.equals( nombreAutorizado ) )
            {
                encontro = true;
                autorizados.remove( i );
            }
        }
    }

    /**
     * Este m_todo sirve para pagar una factura dada. Cuando una factura se paga, desaparece del sistema. <br>
     * <b>pre: </b> La lista de facturas debe estar inicializada. <br>
     * <b>post: </b> Se borr_ la factura del vector del socio <br>
     * @param facturaIndice corresponde al _ndice dentro del vector de facturas que se requiere eliminar. Este _ndice es v_lido. - facturaIndice>0
     */
    public void pagarFactura( int facturaIndice )
    {
        facturas.remove( facturaIndice );
    }

    /**
     * Con este m_todo se registra un nuevo consumo para el socio realizado por _l mismo o por una de sus personas autorizadas. Registrar un consumo significa crear una
     * factura correspondiente al consumo y agregarla a la cuenta del socio. <br>
     * <b>pre: </b> La lista de facturas debe estar inicializada. <br>
     * <b>post: </b> Se agreg_ una nueva factura al vector del socio, Se verifico que es el socio o un autorizado por _l. <br>
     * @param nombreA El nombre de la persona que realiz_ el consumo. Este es un nombre v_lido, es decir, o es el nombre del socio o es el nombre de uno de sus autorizados.
     *        nombreA!=null
     * @param concepto Es la descripci_n del consumo. concepto!=null
     * @param valor Es el valor del consumo. valor>=0
     */
    public void registrarConsumo( String nombreA, String concepto, double valor )
    {

        Factura nuevaFactura = new Factura( nombreA, concepto, valor );
        facturas.add( nuevaFactura );
    }

    /**
     * M_todo que retorna la lista de facturas. <br>
     * <b>pre: </b> La lista de facturas debe estar inicializada. <br>
     * <b>post: </b> Retorn_ la lista de facturas <br>
     * @return facturas - Retorna una lista con todas las facturas pendientes de pago del socio. - facturas!=null
     */
    public ArrayList darFacturas( )
    {
        return facturas;
    }

    /**
     * M_todo que retorna la lista de autorizados por el socio. <br>
     * <b>pre: </b> La lista de autorizados debe estar inicializada. <br>
     * <b>post: </b> Retorn_ la lista de autorizados <br>
     * @return autorizados -Retorna una lista con los nombres de los autorizados por este Socio. -autorizados!=null
     */
    public ArrayList darAutorizados( )
    {
        return autorizados;
    }

    /**
     * M_todo que dice si un autorizado pertenece o no a lista del socio. <br>
     * <b>pre: </b> La lista de autorizados debe estar inicializada. <br>
     * <b>post: </b> Retorn_ un booleano indicando si el autorizado pertenece o no a la lista del socio <br>
     * @param nombreAutorizado nombre del autorizado a buscar - nombreAutorizado!=null
     * @return Retorna true si el nombre pasado por par_metro corresponde a uno de los autorizados de este socio.
     */
    private boolean existeAutorizado( String nombreAutorizado )
    {
        boolean encontro = false;

        int numAutorizados = autorizados.size( );
        for( int i = 0; i < numAutorizados && !encontro; i++ )
        {
            String a = ( String )autorizados.get( i );
            if( a.equals( nombreAutorizado ) )
                encontro = true;
        }
        return encontro;
    }

}