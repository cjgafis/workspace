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
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Panel que administra los consumos de los usuarios
 */
public class PanelRegistroConsumos extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    private static final String REGISTRAR_CONSUMO = "REGISTRAR_CONSUMO";

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Etiqueta cliente
     */
    private JLabel etiquetaCliente;

    /**
     * Etiqueta concepto
     */
    private JLabel etiquetaConcepto;

    /**
     * Etiqueta valor
     */
    private JLabel etiquetaValor;

    /**
     * Botón registrar consumo
     */
    private JButton botonRegistrarConsumo;

    /**
     * Campo concepto
     */
    private JTextField textoConcepto;

    /**
     * Campo valor
     */
    private JTextField textoValor;

    /**
     * Campo clientes
     */
    private JComboBox comboClientes;

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
     * @param elPadre - instancia del panel contenedor - elPadre!=null
     */
    public PanelRegistroConsumos( InterfazClub elPadre )
    {
        padre = elPadre;
        // Etiquetas
        etiquetaValor = new JLabel( );
        etiquetaConcepto = new JLabel( );
        etiquetaCliente = new JLabel( );
        // Campos de Ingreso de Datos
        textoConcepto = new JTextField( );
        textoValor = new JTextField( );
        // ComboBox donde se desplegaran los clientes
        comboClientes = new JComboBox( new DefaultComboBoxModel( ) );
        // Boton Registro
        botonRegistrarConsumo = new JButton( );
        inicializarBotones( botonRegistrarConsumo, "Registrar", REGISTRAR_CONSUMO, Color.black, KeyEvent.VK_R );
        setLayout( new GridLayout( 4, 0 ) );
        setBorder( javax.swing.BorderFactory.createTitledBorder( null, "Registro de Consumos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null ) );

        etiquetaCliente.setText( "Cliente" );

        etiquetaConcepto.setText( "Concepto" );

        etiquetaValor.setText( "Valor" );

        add( etiquetaCliente );
        add( comboClientes );
        add( etiquetaConcepto );
        add( etiquetaValor );
        add( textoConcepto );
        add( textoValor );
        add( new JLabel( "" ) );
        add( botonRegistrarConsumo );

    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    /**
     * Define las propiedades para un botón. <br>
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
        if( REGISTRAR_CONSUMO.equals( actionCommand ) )
            padre.registrarConsumo( );

    }

    /**
     * Verifica si hay algún cliente seleccionado en el comboBox
     * @return retorna true si hay un cliente seleccionado
     */
    public boolean hayClienteSeleccionado( )
    {
        return comboClientes.getSelectedIndex( ) != -1;
    }

    /**
     * Retorna el cliente seleccionado en el combo box
     * @return cliente seleccionado
     */
    public String darClienteSeleccionado( )
    {
        return ( String )comboClientes.getSelectedItem( );
    }

    /**
     * Cambia los clientes mostrados en el combo box
     * @param clientes La lista de clientes que se mostrarán en el ComboBox
     */
    public void cambiarClientes( ArrayList clientes )
    {
        comboClientes.removeAllItems( );

        for( int i = 0; i < clientes.size( ); i++ )
        {
            String nombre = ( String )clientes.get( i );
            comboClientes.addItem( nombre );
        }
    }

    /**
     * Cambia el valor de alguno de los campos de texto
     * @param tipo - Campo al cual se le cambiara el valor - tipo!=null
     * @param valor - Valor que tomara el nuevo campo - valor!=null <br>
     */

    public void asignarValor( String tipo, String valor )
    {
        if( tipo.equals( "Concepto" ) )
            textoConcepto.setText( valor );
        else if( tipo.equals( "Valor" ) )
            textoValor.setText( valor );
    }

    /**
     * Retorna el valor de alguno de los campos de texto
     * @param tipo - Campo al cual se le pide el valor - tipo!=null
     * @return valor - Valor actual del campo - valor!= null
     */

    public String darValor( String tipo )
    {
        String valor = null;
        if( tipo.equals( "Concepto" ) )
            valor = textoConcepto.getText( );
        else if( tipo.equals( "Valor" ) )
            valor = textoValor.getText( );

        return valor;
    }

}
