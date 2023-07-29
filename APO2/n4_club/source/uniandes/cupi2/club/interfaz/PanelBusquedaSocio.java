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
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Panel que organiza los de busqueda de los socios
 */
public class PanelBusquedaSocio extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    private static final String BUSCAR_SOCIO_AUTORIZADOS = "BUSCAR_SOCIO_AUTORIZADOS";

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Campo de autorizados
     */
    private JTextField textoCedulaSocioAutorizados;

    /**
     * Botón de búsqueda
     */
    private JButton botonBuscarSocioAutorizados;

    /**
     * Etiqueta cédula
     */
    private JLabel etiquetaCedula;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Instancia del la clase principal Interfaz
     */

    private InterfazClub padre;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
    /**
     * Crea el Panel donde se organizaran los objetos para mostrar los socios
     * 
     * @param elPadre - Instancia de la clase Interfaz - elPadre!=null
     */
    public PanelBusquedaSocio( InterfazClub elPadre )
    {

        padre = elPadre;
        setLayout( new GridLayout( 2, 0 ) );
        setBorder( javax.swing.BorderFactory.createTitledBorder( null, "Búsqueda de Socio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null ) );
        // Etiqueta de la cédula
        etiquetaCedula = new JLabel( );
        etiquetaCedula.setText( "Cédula Socio" );
        // Texto donde se colocara la cédula
        textoCedulaSocioAutorizados = new JTextField( );
        // Botón de búsqueda
        botonBuscarSocioAutorizados = new JButton( );
        inicializarBotones( botonBuscarSocioAutorizados, "Buscar", BUSCAR_SOCIO_AUTORIZADOS, Color.black, KeyEvent.VK_B );

        add( etiquetaCedula );
        add( textoCedulaSocioAutorizados );
        add( new JLabel( "" ) );// label creado para generar orden en el grid
        add( botonBuscarSocioAutorizados );

    }
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Define las propiedades para un boton. <br>
     * 
     * @param boton - Boton al cual se le definen las propiedades - boton!=null
     * @param etiqueta - Texto de presentacion del boton - etiqueta!= null
     * @param comando - Accion asociada al boton - comando!= null
     * @param colorFondo - Color del texto de presentacion - colorFondo!= null
     * @param evento - keyevent para la acción del boton - evento!=null
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
     * 
     * @param e - Evento realizado por el usuario - e!=null <br>
     */

    public void actionPerformed( ActionEvent e )
    {
        String actionCommand = e.getActionCommand( );

        if( BUSCAR_SOCIO_AUTORIZADOS.equals( actionCommand ) )
            padre.buscarSocioAutorizados( textoCedulaSocioAutorizados.getText( ) );

    }
    /**
     * Retorna el valor del campo cedula
     * @return valor - Valor actual del campo - valor!=null
     */

    public String darValor( )
    {
        String valor = textoCedulaSocioAutorizados.getText( );

        return valor;
    }
    /**
     * Cambia el valor del campo cedula
     * @param valor - Valor que tomara el nuevo campo - valor!=null <br>
     */

    public void asignarValor( String valor )
    {
        textoCedulaSocioAutorizados.setText( valor );
    }
}
