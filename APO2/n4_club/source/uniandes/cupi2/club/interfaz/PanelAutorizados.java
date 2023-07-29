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
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 * Panel que administra los usuarios autorizados
 */
public class PanelAutorizados extends JPanel
{

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Etiqueta de nombre
     */
    private JLabel etiquetaNombre;

    /**
     * Texto para ingresar el autorizado
     */
    private JTextField textoNombreNuevoAutorizado;

    /**
     * Scroll de autorizados
     */
    private JScrollPane scrollDesplazamiento;

    /**
     * Lista de autorizados
     */
    private JList listaAutorizados;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel para el manejo de socios Autorizados
     */
    public PanelAutorizados( )
    {
        etiquetaNombre = new JLabel( );
        setLayout( new BorderLayout( ) );
        setBorder( javax.swing.BorderFactory.createTitledBorder( null, "Autorizados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null ) );

        etiquetaNombre.setText( "Nombre" );
        // Scroll Desplazamiento
        scrollDesplazamiento = new JScrollPane( );
        scrollDesplazamiento.setVerticalScrollBarPolicy( javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );

        // Lista Autorizados
        listaAutorizados = new JList( new DefaultListModel( ) );
        listaAutorizados.setSelectionMode( javax.swing.ListSelectionModel.SINGLE_SELECTION );
        scrollDesplazamiento.setViewportView( listaAutorizados );

        // Casilla Texto
        textoNombreNuevoAutorizado = new JTextField( );
        textoNombreNuevoAutorizado.setColumns( 10 );

        JPanel contenedor = new JPanel( );
        contenedor.setLayout( new BorderLayout( ) );
        contenedor.add( etiquetaNombre, BorderLayout.NORTH );
        contenedor.add( textoNombreNuevoAutorizado, BorderLayout.CENTER );
        contenedor.add( scrollDesplazamiento, BorderLayout.SOUTH );
        add( contenedor, BorderLayout.NORTH );

    }

    /**
     * Retorna el valor del campo Nuevo Socio
     * @return valor - Valor actual del campo - valor!=null
     */
    public String darValor( )
    {
        String valor = textoNombreNuevoAutorizado.getText( );

        return valor;
    }

    /**
     * Cambia el valor del campo del nuevo usuario
     * @param valor - Valor que tomara el nuevo campo - valor!=null <br>
     */
    public void asignarValor( String valor )
    {
        textoNombreNuevoAutorizado.setText( valor );
    }

    /**
     * Actualiza la lista de autorizados
     * @param autorizados La nueva lista con los autorizados que se deben mostrar
     */
    public void cambiarAutorizados( ArrayList autorizados )
    {
        listaAutorizados.setListData( new Object[0] );
        listaAutorizados.setListData( autorizados.toArray( ) );
    }
}
