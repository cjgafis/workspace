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

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel que administra la opcion 1
 */
public class PanelCalcular1 extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    private static final String OPCION_1 = "OPCION_1";

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Bot�n calcular
     */
    private JButton botonCalcular;

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
     * Crea el Panel donde se organizaran los objetos para las calculos de opcion 1
     * @param elPadre - instancia del panel contendor - elPadre!=null
     */
    public PanelCalcular1( InterfazClub elPadre )
    {
        padre = elPadre;
        setLayout( new GridLayout( 3, 3 ) );
        setBorder( BorderFactory.createTitledBorder( null, "Guardar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null ) );

        // Bot�n calcular
        botonCalcular = new JButton( );
        inicializarBotones( botonCalcular, "Guardar", OPCION_1, Color.black );

        add( new JLabel( "" ) );
        add( botonCalcular );

    }
    // -----------------------------------------------------------------
    // Metodos
    // -----------------------------------------------------------------
    /**
     * Define las propiedades para un boton. <br>
     * 
     * @param boton - Boton al cual se le definen las propiedades - boton!=null
     * @param etiqueta - Texto de presentacion del boton - etiqueta!= null
     * @param comando - Accion asociada al boton - comando!= null
     * @param colorFondo - Color del texto de presentacion - colorFondo!= null
     */

    private void inicializarBotones( JButton boton, String etiqueta, String comando, Color colorFondo )
    {

        boton.setText( etiqueta );
        boton.setFocusable( false );
        boton.setActionCommand( comando );
        boton.addActionListener( this );
        boton.setForeground( colorFondo );
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
        if( OPCION_1.equals( actionCommand ) )
            padre.reqFuncOpcion1( );

    }
}
