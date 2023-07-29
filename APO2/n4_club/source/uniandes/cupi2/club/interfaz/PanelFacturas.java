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
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package uniandes.cupi2.club.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * Panel que administra las Facturas de los usuarios
 */
public class PanelFacturas extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    private static final String PAGAR_FACTURA = "PAGAR_FACTURA";

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Scroll de facturas
     */
    private JScrollPane scrollDesplazamiento;

    /**
     * Lista de facturas
     */
    private JList listaFacturas;

    /**
     * Botón pagar factura
     */
    private JButton botonPagarFactura;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * Instancia del la clase principal de la interfaz
     */

    private InterfazClub padre;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
    /**
     * Crea el panel de Facturas
     * @param elPadre - instancia del panel contendor - elPadre!=null
     */
    public PanelFacturas( InterfazClub elPadre )
    {
        padre = elPadre;
        setLayout( new BorderLayout( ) );
        setBorder( javax.swing.BorderFactory.createTitledBorder( null, "Facturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null ) );

        scrollDesplazamiento = new JScrollPane( );
        // Lista donde se almacenaran las facturas
        listaFacturas = new JList( );
        listaFacturas.setSelectionMode( javax.swing.ListSelectionModel.SINGLE_SELECTION );
        // Scroll que desplegara la lista de facturas
        scrollDesplazamiento.setVerticalScrollBarPolicy( javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
        scrollDesplazamiento.setViewportView( listaFacturas );

        botonPagarFactura = new JButton( );
        inicializarBotones( botonPagarFactura, "Pagar Factura", PAGAR_FACTURA, Color.black, KeyEvent.VK_P );

        add( scrollDesplazamiento, BorderLayout.CENTER );

        add( botonPagarFactura, BorderLayout.SOUTH );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Define las propiedades para un boton. <br>
     * 
     * @param boton - Botón al cual se le definen las propiedades - boton!=null
     * @param etiqueta - Texto de presentación del botón n - etiqueta!= null
     * @param comando - Accion asociada al boton - comando!= null
     * @param colorFondo - Color del texto de presentacion - colorFondo!= null
     * @param evento - keyevent para la acción del botón - evento!=null
     */

    private void inicializarBotones( JButton boton, String etiqueta, String comando, Color colorFondo, int evento )
    {

        boton.setText( etiqueta );
        boton.setFocusable( false );
        boton.setActionCommand( comando );
        boton.addActionListener( this );
        boton.setForeground( colorFondo );
        boton.setMnemonic( evento );
        boton.setDefaultCapable( false );

    }

    /**
     * Se encarga de procesar eventos ejecutados por el usuario. <br>
     * 
     * @param e - Evento realizado por el usuario - e!=null <br>
     */

    public void actionPerformed( ActionEvent e )
    {
        String actionCommand = e.getActionCommand( );

        if( PAGAR_FACTURA.equals( actionCommand ) )
            padre.pagarFactura( );

    }

    /**
     * Indica si alguna factura seleccionada
     * @return retorna true si hay una factura seleccionada; retorna false en caso contrario
     */
    public boolean hayFacturaSeleccionada( )
    {
        return listaFacturas.getSelectedIndex( ) != -1;
    }

    /**
     * Retorna el índice de la factura seleccionada
     * @return el índice de la factura seleccionada
     */
    public int darPosicionFacturaSeleccionada( )
    {
        return listaFacturas.getSelectedIndex( );
    }

    /**
     * Actualiza la lista de facturas mostrada
     * @param facturas La nueva lista con las facturas que se deben mostrar
     */
    public void cambiarFacturas( ArrayList facturas )
    {
        listaFacturas.setListData( facturas.toArray( ) );
    }

}
