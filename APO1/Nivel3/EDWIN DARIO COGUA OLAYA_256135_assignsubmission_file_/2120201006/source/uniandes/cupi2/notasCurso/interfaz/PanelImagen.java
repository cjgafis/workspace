/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1
 * Imagen tomada de http://www.research.uniandes.edu.co/
 *
 * Proyecto Cupi2
 * Ejercicio: n3_notasCurso
 * Autor: Pablo Barvo - 09-Sep-2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.notasCurso.interfaz;

import javax.swing.*;
import javax.swing.border.*;

/**
 * Panel de la imagen del curso
 */
public class PanelImagen extends JPanel
{
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Etiqueta usada para mostrar la imagen
     */
    private JLabel etiquetaImagen;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Constructor del panel
     */
    public PanelImagen( )
    {
        setBorder( new EmptyBorder( 3, 3, 3, 3 ) );
        etiquetaImagen = new JLabel( new ImageIcon( "./data/imagenClase.png" ) );
        JPanel panelBorde = new JPanel( );
        panelBorde.setBorder( new TitledBorder( "" ) );
        panelBorde.add( etiquetaImagen );
        add( panelBorde );
    }
}
