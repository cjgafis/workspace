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

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Panel que administra las facturas de los usuarios
 */
public class PanelBusquedaFacturas extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    private static final String BUSCAR_SOCIO_FACTURAS = "BUSCAR_SOCIO_FACTURAS";

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Campo de cédula
     */
    private JTextField textoCedulaSocioFacturas;

    /**
     * Botón buscar
     */
    private JButton botonBuscarSocioFacturas;

    /**
     * Etiqueta cédula
     */
    private JLabel etiquetaCedula;

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
     * Crea el Panel donde se organizarán los objetos para mostrar Consumo
     * @param elPadre - instancia del panel contendor - elPadre!=null
     */
    public PanelBusquedaFacturas( InterfazClub elPadre )
    {
        padre = elPadre;
        // Etiqueta de la cedula
        etiquetaCedula = new JLabel( );
        setLayout( new GridLayout( 4, 2 ) );
        // Campo donde se colocara la cedula
        textoCedulaSocioFacturas = new JTextField( );
        // Botón busqueda de facturas
        botonBuscarSocioFacturas = new JButton( );
        inicializarBotones( botonBuscarSocioFacturas, "Buscar", BUSCAR_SOCIO_FACTURAS, Color.black, KeyEvent.VK_B );

        setBorder( javax.swing.BorderFactory.createTitledBorder( null, "Búsqueda de Facturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font( "Dialog", java.awt.Font.BOLD,
                12 ), java.awt.Color.black ) );
        etiquetaCedula.setText( "Cédula Socio" );

        add( etiquetaCedula );
        add( textoCedulaSocioFacturas );
        add( new JLabel( "" ) ); // Label organización grid
        add( botonBuscarSocioFacturas );
        add( new JLabel( "" ) );// Label organización grid
        add( new JLabel( "" ) );// Label organización grid

    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    /**
     * Define las propiedades para un botón. <br>
     * 
     * @param boton - Botón al cual se le definen las propiedades - boton!=null
     * @param etiqueta - Texto de presentación del boton - etiqueta!= null
     * @param comando - Acción asociada al botón - comando!= null
     * @param colorFondo - Color del texto de presentación - colorFondo!= null
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
     * Listener que se encarga de capturar eventos ejecutados por el usuario. <br>
     * @param e - Evento realizado por el usuario - e!=null <br>
     */

    public void actionPerformed( ActionEvent e )
    {
        String actionCommand = e.getActionCommand( );
        if( BUSCAR_SOCIO_FACTURAS.equals( actionCommand ) )
        {
            try
            {
                Integer.parseInt( textoCedulaSocioFacturas.getText( ) );
                padre.buscarSocioFacturas( textoCedulaSocioFacturas.getText( ) );
            }
            catch( Exception e2 )
            {
                JOptionPane.showMessageDialog( this, "La cédula solamente puede tener números" );
            }
        }
    }

    /**
     * Retorna el valor del campo cedula
     * @return valor - Valor actual del campo - valor!=null
     */

    public String darValor( )
    {
        String valor = textoCedulaSocioFacturas.getText( );

        return valor;
    }

    /**
     * Cambia el valor del campo cédula
     * @param valor - Valor que tomará el nuevo campo - valor!=null <br>
     */

    public void asignarValor( String valor )
    {
        textoCedulaSocioFacturas.setText( valor );
    }

}