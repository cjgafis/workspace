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
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Panel que organiza los botones para agregar remover usuarios
 */
public class PanelBotonesAgregar extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    private static final String AGREGAR_AUTORIZADO = "AGREGAR_AUTORIZADO";

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    private JButton botonAgregarAutorizado;

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
     * Crea el Panel donde se colocaran los botones agregar y remover autorizados
     * 
     * @param elPadre - Instancia de la clase Interfaz - elPadre!=null
     */
    public PanelBotonesAgregar( InterfazClub elPadre )
    {

        padre = elPadre;
        setLayout( new FlowLayout( ) );
        // Botones Agregar Remover Sutorizados
        botonAgregarAutorizado = new JButton( );
        // inicializacion de botones
        inicializarBotones( botonAgregarAutorizado, "Agregar Autorizado", AGREGAR_AUTORIZADO, Color.black, KeyEvent.VK_A );
        add( botonAgregarAutorizado );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    /**
     * Define las propiedades para un boton. <br>
     * 
     * @param boton - Botón al cual se le definen las propiedades - boton!=null
     * @param etiqueta - Texto de presentación del boton - etiqueta!= null
     * @param comando - Accion asociada al boton - comando!= null
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
     * Método que se encarga de procesar eventos producidos por el usuario. <br>
     * 
     * @param e - Evento realizado por el usuario - e!=null <br>
     */

    public void actionPerformed( ActionEvent e )
    {
        String actionCommand = e.getActionCommand( );

        if( AGREGAR_AUTORIZADO.equals( actionCommand ) )
            padre.agregarAutorizado( );

    }
}