/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Proyecto Cupi2
 * Ejercicio: Club
 * Autor: Jorge Jim�nez- Julio 2005
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
 * Panel que organiza la busqueda de personas
 */
public class PanelBusquedaPersonas extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    private static final String BUSCAR_SOCIO_CONSUMOS = "BUSCAR_SOCIO_CONSUMOS";

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Texto de la c�dula
     */
    private JTextField textoCedulaSocioConsumos;

    /**
     * Bot�n Buscar
     */
    private JButton botonBuscarSocioConsumos;

    /**
     * Etiqueta de C�dula
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
     * Crea el Panel donde se organizar�n los objetos para mostrar las personas
     * 
     * @param elPadre - Instancia de la clase Interfaz - elPadre!=null
     */
    public PanelBusquedaPersonas( InterfazClub elPadre )
    {
        padre = elPadre;
        setLayout( new GridLayout( 3, 3 ) );
        setBorder( javax.swing.BorderFactory.createTitledBorder( null, "B�squeda de Socio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null ) );
        // Etiqueta c�dula del socio
        etiquetaCedula = new JLabel( );
        etiquetaCedula.setText( "C�dula Socio" );
        // Texto donde se colocar� la c�dula
        textoCedulaSocioConsumos = new JTextField( );
        // Bot�n B�squeda
        botonBuscarSocioConsumos = new JButton( );
        inicializarBotones( botonBuscarSocioConsumos, "Buscar", BUSCAR_SOCIO_CONSUMOS, Color.black, KeyEvent.VK_B );

        add( etiquetaCedula );
        add( textoCedulaSocioConsumos );
        add( new JLabel( "" ) );
        add( botonBuscarSocioConsumos );

    }
    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Define las propiedades para un boton. <br>
     * 
     * @param boton - Boton al cual se le definen las propiedades - boton!=null
     * @param etiqueta - Texto de presentacion del boton - etiqueta!= null
     * @param comando - Accion asociada al boton - comando!= null
     * @param colorFondo - Color del texto de presentacion - colorFondo!= null
     * @param evento - keyevent para la acci�n del boton - evento!=null
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

        if( BUSCAR_SOCIO_CONSUMOS.equals( actionCommand ) )
        {
            String cedulaSocio = textoCedulaSocioConsumos.getText( );
            if( cedulaSocio.equals( "" ) )
                JOptionPane.showMessageDialog( this, "El n�mero de c�dula no puede estar vacio" );
            else
            {
                try
                {
                    Integer.parseInt( cedulaSocio );
                }
                catch( Exception e2 )
                {
                    JOptionPane.showMessageDialog( this, "La c�dula solamente puede tener n�meros" );
                    return;
                }
                padre.buscarSocioConsumos( cedulaSocio );
            }
        }
    }
    /**
     * Retorna el valor del campo cedula
     * @return valor - Valor actual del campo - valor!= null
     */

    public String darValor( )
    {
        String valor = textoCedulaSocioConsumos.getText( );

        return valor;
    }
    /**
     * Cambia el valor del campo cedula
     * @param valor - Valor que tomara el nuevo campo - valor!=null <br>
     */

    public void asignarValor( String valor )
    {
        textoCedulaSocioConsumos.setText( valor );
    }
}
