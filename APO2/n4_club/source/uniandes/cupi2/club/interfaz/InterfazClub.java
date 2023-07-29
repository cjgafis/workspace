/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Proyecto Cupi2
 * Ejercicio: Club
 * Autor: Jorge Jiménez- Julio 2005
 * Autor inicial: Mario Sanchez
 * Autor: Pablo Barvo - 26-Ago-2005
 * Autor: Pablo Barvo - 21-Oct-2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.club.interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import uniandes.cupi2.club.mundo.Club;
import uniandes.cupi2.club.mundo.Socio;

/**
 * Ventana principal de la interfaz del club
 */
public class InterfazClub extends JFrame
{

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Contenedor de paneles (por tabs)
     */
    private JTabbedPane contenedor;

    /**
     * Panel contabilidad
     */
    private JPanel panelContabilidad;

    /**
     * Panel datos personales
     */
    private PanelDatosPersonales panelDatosPersonales;

    /**
     * Panel autorizados
     */
    private PanelAutorizados panelAutorizadosSocio;

    /**
     * Panel de botones de agregar
     */
    private PanelBotonesAgregar panelBotonesAgregar;

    /**
     * Panel de búsqueda de socios
     */
    private PanelBusquedaSocio panelBusquedaSocio;

    /**
     * Panel registro de consumos
     */
    private PanelRegistroConsumos panelRegistroConsumos;

    /**
     * Panel búsqueda de personas
     */
    private PanelBusquedaPersonas panelBusquedaPersonas;

    /**
     * Panel búsqueda de facturas
     */
    private PanelBusquedaFacturas panelBusquedaFacturas;

    /**
     * Panel de facturas
     */
    private PanelFacturas panelFacturas;

    /**
     * Panel opción 1
     */
    private PanelCalcular1 panelCalcular1;

    /**
     * Panel opción 2
     */
    private PanelCalcular2 panelCalcular2;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Club principal
     */
    private Club club;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------
    /**
     * Método que inicializa todos los paneles e iniicliza el club.
     */
    public InterfazClub( )
    {

        club = new Club( );

        setLayout( new java.awt.BorderLayout( ) );

        // Paneles de información
        panelDatosPersonales = new PanelDatosPersonales( this );
        panelAutorizadosSocio = new PanelAutorizados( );
        panelBotonesAgregar = new PanelBotonesAgregar( this );
        panelBusquedaSocio = new PanelBusquedaSocio( this );
        panelRegistroConsumos = new PanelRegistroConsumos( this );
        panelBusquedaPersonas = new PanelBusquedaPersonas( this );
        panelBusquedaFacturas = new PanelBusquedaFacturas( this );
        panelFacturas = new PanelFacturas( this );
        panelCalcular1 = new PanelCalcular1( this );
        panelCalcular2 = new PanelCalcular2( this );

        // Panel para organizar la información de autorizados
        JPanel panelAutorizados = new JPanel( );
        panelAutorizados.setLayout( new BorderLayout( ) );
        panelAutorizados.add( panelAutorizadosSocio, BorderLayout.CENTER );
        panelAutorizados.add( panelBotonesAgregar, BorderLayout.SOUTH );
        panelAutorizados.add( panelBusquedaSocio, BorderLayout.NORTH );

        // Panel para organizar la información de consumos
        JPanel panelConsumo = new JPanel( );
        panelConsumo.setLayout( new GridLayout( 3, 0 ) );
        panelConsumo.add( panelBusquedaPersonas );
        panelConsumo.add( panelRegistroConsumos );

        // Panel para organizar la información de facturas
        JPanel panelFactura = new JPanel( );
        panelFactura.setLayout( new BorderLayout( ) );
        panelFactura.add( panelBusquedaFacturas, BorderLayout.CENTER );
        panelFactura.add( panelFacturas, BorderLayout.SOUTH );

        // Panel para organizar la información de cálculos
        panelContabilidad = new JPanel( );
        panelContabilidad.setLayout( new GridLayout( 3, 0 ) );
        panelContabilidad.add( panelCalcular1 );
        panelContabilidad.add( panelCalcular2 );

        // Creación de los tabs
        contenedor = new JTabbedPane( );
        contenedor.addTab( "Afiliar", null, panelDatosPersonales, null );
        contenedor.addTab( "Autorizados", null, panelAutorizados, null );
        contenedor.addTab( "Consumos", null, panelConsumo, null );
        contenedor.addTab( "Facturas", null, panelFactura, null );
        contenedor.addTab( "Contabilidad", null, panelContabilidad, null );
        add( contenedor, java.awt.BorderLayout.CENTER );

        setTitle( "Club" );
        setResizable( false );
        setDefaultCloseOperation( javax.swing.JFrame.EXIT_ON_CLOSE );
        setPreferredSize( new Dimension( 300, 400 ) );
        pack( );
        setVisible( true );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Este método sirve para verificar la forma, y afiliar un nuevo socio.
     * @param cedula Cédula del socio
     * @param nombre Nombre del socio
     */
    public void afiliar( String cedula, String nombre )
    {
        try
        {
            club.afiliarSocio( cedula, nombre );
            JOptionPane.showMessageDialog( this, "El usuario ha sido ingresado" );
        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( this, e.getMessage( ) );
        }
        panelDatosPersonales.asignarValor( "Cédula", "" );
        panelDatosPersonales.asignarValor( "Nombre", "" );
        validate( );
    }

    /**
     * Este método sirve para agregar un nombre a la lista de personas autorizadas de un socio
     */
    public void agregarAutorizado( )
    {

        String msgError = null;
        String nombreAutorizado = panelAutorizadosSocio.darValor( );
        String cedulaSocio = panelBusquedaSocio.darValor( );
        if( cedulaSocio.equals( "" ) )
            msgError = "Primero debe buscar un socio";
        else if( nombreAutorizado.equals( "" ) ) // El nombre está vacio
            msgError = "El nombre no puede estar vacio";
        else
        {
            try
            {
                // Se agrega el autorizado y se actualiza la información del panel 
                club.agregarAutorizadoSocio(cedulaSocio, nombreAutorizado);
                ArrayList autorizados = new ArrayList( club.darAutorizadosSocio(cedulaSocio) );
                panelAutorizadosSocio.cambiarAutorizados( autorizados );
            }
            catch( Exception e )
            {
                msgError = e.getMessage( );
            }
        }

        if( msgError != null )
        {
            JOptionPane.showMessageDialog( this, msgError );
        }
        panelAutorizadosSocio.asignarValor( "" );

        validate( );
    }

    /**
     * Este método sirve para buscar los autorizados de un socio
     * @param cedulaSocio - cédula del socio a buscar - cedulaSocio!=null
     */
    public void buscarSocioAutorizados( String cedulaSocio )
    {

        String msgError = null;

        if( cedulaSocio.equals( "" ) )
            msgError = "El número de cédula no puede estar vacio";
        else if( !verificarNumero( cedulaSocio ) )
            msgError = "La cédula solamente puede tener números";
        else
        {
			try {
				ArrayList autorizados = club.darAutorizadosSocio(cedulaSocio);
				
				// Se actualiza la interfaz
				panelAutorizadosSocio.cambiarAutorizados( autorizados );
			} catch (Exception e) {
				msgError = e.getMessage();
			}
        }
        if( msgError != null )
            JOptionPane.showMessageDialog( this, msgError );

    }

    /**
     * Este método busca los nombres de las personas autorizadas y del socio dado un número de cédula y deja esta información en la lista.
     * @param cedulaSocio Cédula del socio
     */
    public void buscarSocioConsumos( String cedulaSocio )
    {
    	// se dan todos los autorizados del socio actual
    	try {
    		ArrayList nombres = club.darAutorizadosSocio(cedulaSocio);

    		// Se actualiza la interfaz
    		panelRegistroConsumos.cambiarClientes( nombres );
    	} catch (Exception e) {
    		JOptionPane.showMessageDialog( this, e.getMessage() );
		}
    }

    /**
     * Este método sirve para buscar las facturas de un cliente en particular y mostrarlas en la lista de facturas
     * @param cedula Cédula del socio
     */
    public void buscarSocioFacturas( String cedula )
    {
        try
        {
            // se muestran las facturas de un socio
            ArrayList facturas = club.darFacturasSocio(cedula);
            panelFacturas.cambiarFacturas( facturas );
        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( this, "No se encontró el socio" );
        }
    }

    /**
     * Este método se usa para pagar una factura
     *  
     */
    public void pagarFactura( )
    {
        String msgError = null;
        if( panelBusquedaFacturas.darValor( ).equals( "" ) )
            msgError = "El número de cédula no puede estar vacio";
        else if( !verificarNumero( panelBusquedaFacturas.darValor( ) ) )
            msgError = "La cédula solamente puede tener números";
        else if( !panelFacturas.hayFacturaSeleccionada( ) )
            msgError = "Debe seleccionar una factura para pagar";
        else
        {
            try {
            	String cedula = panelBusquedaFacturas.darValor( );
            	int facturaIndice = panelFacturas.darPosicionFacturaSeleccionada( );

            	club.pagarFacturaSocio(cedula, facturaIndice);
            	
            	actualizarFacturas( cedula );
			} catch (Exception e) {
				JOptionPane.showMessageDialog( this, msgError );
			}
        }
    }

    /**
     * Actualiza las facturas
     * @param cedulaSocio La cédula del socio del cual se deben mostrar las facturas
     */
    private void actualizarFacturas( String cedulaSocio )
    {
        try
        {
            // se muestran las facturas de un socio
            ArrayList facturas = club.darFacturasSocio( cedulaSocio );
            panelFacturas.cambiarFacturas( facturas );
        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( this, e.getMessage( ) );
        }
    }

    /**
     * Registra un nuevo consumo para un socio determinado.
     */
    public void registrarConsumo( )
    {
        String msgError = null;
        String concepto = panelRegistroConsumos.darValor( "Concepto" );
        String strValor = panelRegistroConsumos.darValor( "Valor" );
        String cedula = panelBusquedaPersonas.darValor( );
        if( cedula.equals( "" ) || concepto.equals( "" ) || strValor.equals( "" ) || !panelRegistroConsumos.hayClienteSeleccionado( ) )
            msgError = "Debe llenar todos los campos";
        else if( !verificarNumero( strValor ) )
            msgError = "El valor debe tener solamente números";
        else
        {
            String nombre = panelRegistroConsumos.darClienteSeleccionado( );
            double valor = Double.parseDouble( strValor );
            try
            {
            	club.registrarConsumo(cedula, nombre, concepto, valor);
            	
            	panelRegistroConsumos.asignarValor( "Concepto", "" );
            	panelRegistroConsumos.asignarValor( "Valor", "" );
            	validate( );
            }
            catch( Exception e )
            {
            	msgError = e.getMessage( );
            }
        }
        if( msgError != null )
            JOptionPane.showMessageDialog( this, msgError );
    }

    /**
     * Este método sirve para verificar que una cédula que tenga solamente dígitos
     * 
     * @param cedula La cedula que se quiere verificar - cedula !=null
     * @return Retorna true si la cadena tiene solamente dígitos; retorna false en caso contrario.
     */
    private boolean verificarNumero( String cedula )
    {
        try
        {
            Integer.parseInt( cedula );
            return true;
        }
        catch( Exception e )
        {
            return false;
        }
    }

    // -----------------------------------------------------------------
    // Métodos de extensión
    // -----------------------------------------------------------------

    /**
     * Solicita el cálculo de algún resultado
     */
    public void reqFuncOpcion1( )
    {
        String resultado = club.metodo1( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Solicita el cálculo de algún resultado
     */
    public void reqFuncOpcion2( )
    {
        String resultado = club.metodo2( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    // -----------------------------------------------------------------
    // Método Main
    // -----------------------------------------------------------------

    /**
     * Método principal de ejecución
     * @param args - argumentos de entrada en la ejecución - args!= null
     */
    public static void main( String[] args )
    {

        InterfazClub i = new InterfazClub( );
        i.setVisible( true );
    }

}
