/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
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
 * Panel que administra el ingreso de usuarios
 */
public class PanelDatosPersonales extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    private static final String AFILIAR = "AFILIAR";

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Etiqueta nombre
     */
    private JLabel etiquetaNombre;

    /**
     * Etiqueta cédula
     */
    private JLabel etiquetaCedula;

    /*
     *  
     */
    private JTextField campoCedulaNuevoSocio;

    private JTextField campoNombreNuevoSocio;

    private JButton botonAfiliar;

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
     * Crea el Panel donde se organizarán los objetos para mostrar DatosPersonales
     * @param elPadre - instancia del panel contendor - elPadre!=null
     */
    public PanelDatosPersonales( InterfazClub elPadre )
    {

        padre = elPadre;

        botonAfiliar = new JButton( );

        inicializarBotones( botonAfiliar, "Afiliar", AFILIAR, Color.BLACK, KeyEvent.VK_F );
        setLayout( new GridLayout( 12, 3 ) );
        // Campo donde ira la cédula del nuevo socio
        campoCedulaNuevoSocio = new JTextField( );
        // Campo donde ira el nombre del nuevo socio
        campoNombreNuevoSocio = new JTextField( );
        // Campos de Ingreso de datos
        etiquetaCedula = new JLabel( );
        etiquetaNombre = new JLabel( );

        setBorder( javax.swing.BorderFactory.createTitledBorder( null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null ) );

        etiquetaNombre.setText( "Nombre " );

        etiquetaCedula.setText( "Cédula " );

        add( etiquetaNombre );
        add( campoNombreNuevoSocio );
        add( etiquetaCedula );
        add( campoCedulaNuevoSocio );
        add( new JLabel( "" ) );// label para generar orden el Grid
        add( botonAfiliar );
        add( new JLabel( "" ) );// label para generar orden el Grid
        add( new JLabel( "" ) );// label para generar orden el Grid
        add( new JLabel( "" ) );// label para generar orden el Grid
    }

    /**
     * Define las propiedades para un boton. <br>
     * 
     * @param boton - Botón al cual se le definen las propiedades - boton!=null
     * @param etiqueta - Texto de presentación del botón - etiqueta!= null
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
     * Se encarga de procesar eventos ejecutados por el usuario. <br>
     * 
     * @param e - Evento realizado por el usuario - e!=null <br>
     */

    public void actionPerformed( ActionEvent e )
    {
        String actionCommand = e.getActionCommand( );

        if( AFILIAR.equals( actionCommand ) )
        {
            //Valida los campos vacíos
            if( campoCedulaNuevoSocio.getText( ) == null || campoCedulaNuevoSocio.getText( ).length( ) == 0 )
            {
                JOptionPane.showMessageDialog( this, "Debe ingresar un numero de cédula." );
            }
            else if( campoNombreNuevoSocio.getText( ) == null || campoNombreNuevoSocio.getText( ).length( ) == 0 )
            {
                JOptionPane.showMessageDialog( this, "Debe ingresar el nombre del socio." );
            }
            else
            {
                //Valida el valor numerico de la cédula
                try
                {
                    Integer.parseInt( campoCedulaNuevoSocio.getText( ) );
                }
                catch( Exception e2 )
                {
                    JOptionPane.showMessageDialog( this, "El valor de la cédula debe ser numérico" );
                    return;
                }
                padre.afiliar( campoCedulaNuevoSocio.getText( ), campoNombreNuevoSocio.getText( ) );
            }
        }
    }
    /**
     * Cambia el valor de alguno de los campos de texto
     * @param tipo - Campo al cual se le cambiará el valor - tipo!=null
     * @param valor - Valor que tomará el nuevo campo - valor!=null <br>
     */

    public void asignarValor( String tipo, String valor )
    {
        if( tipo.equals( "Nombre" ) )
            campoNombreNuevoSocio.setText( valor );
        else if( tipo.equals( "Cédula" ) )
            campoCedulaNuevoSocio.setText( valor );
    }

    /**
     * Retorna el valor de alguno de los campos de texto
     * @param tipo - Campo al cual se le pide el valor - tipo!=null
     * @return valor - Valor actual del campo - valor!= null
     */

    public String darValor( String tipo )
    {
        String valor = null;
        if( tipo.equals( "Nombre" ) )
            valor = campoNombreNuevoSocio.getText( );
        else if( tipo.equals( "Cédula" ) )
            valor = campoCedulaNuevoSocio.getText( );

        return valor;
    }

}
