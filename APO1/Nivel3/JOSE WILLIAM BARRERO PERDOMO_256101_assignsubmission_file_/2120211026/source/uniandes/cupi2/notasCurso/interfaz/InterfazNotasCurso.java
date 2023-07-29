/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Proyecto Cupi2
 * Ejercicio: n3_notasCurso
 * Autor: Pablo Barvo - 09-Sep-2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.notasCurso.interfaz;

import java.awt.*;

import javax.swing.*;

import uniandes.cupi2.notasCurso.mundo.*;

/**
 * Esta es la ventana principal de la aplicaci�n.
 */
public class InterfazNotasCurso extends JFrame
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Clase principal del mundo
     */
    private Curso curso;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Panel imagen del curso
     */
    private PanelImagen panelImagen;

    /**
     * Panel donde se muestran las notas
     */
    private PanelDatos panelDatos;

    /**
     * Panel de opciones adicionales
     */
    private PanelAdicionales panelAdicionales;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye la interfaz de notas del curso. <b>post: </b> Se inicializaron los componentes gr�ficos de la aplicaci�n.
     */
    public InterfazNotasCurso( )
    {
        // Crea la clase principal
        curso = new Curso( );
        // organizar el panel principal
        setLayout( new BorderLayout( ) );
        setSize( 650, 400 );
        setTitle( "Sistema de Manejo de Notas" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        panelImagen = new PanelImagen( );
        add( panelImagen, BorderLayout.WEST );
        panelDatos = new PanelDatos( this, Curso.TOTAL_EST );
        add( panelDatos, BorderLayout.CENTER );
        panelAdicionales = new PanelAdicionales( this );
        add( panelAdicionales, BorderLayout.SOUTH );
        refrescar();
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Cambia la nota de un estudiante.
     * @param estudiante Estudiante a modificar. 1 <= estudiante <=12.
     */
    public void cambiarNota( int estudiante )
    {
        String notaStr = JOptionPane.showInputDialog( this, "Nueva nota:", "Nota", JOptionPane.QUESTION_MESSAGE );
        try
        {
            if( notaStr != null )
            {
                double nota = Double.parseDouble( notaStr );
                // valida el valor de nota
                if( nota < 0 || nota > 5 )
                {
                    JOptionPane.showMessageDialog( this, "La nota debe tener un valor entre 0.0 y 5.0", "Error", JOptionPane.ERROR_MESSAGE );

                }
                else
                {
                    // Cambia la nota
                    curso.cambiarNota( estudiante, nota );
                    // Repinta el panel
                    panelDatos.refrescarNota( estudiante, curso.darNota( estudiante ) );
                }
            }
        }
        catch( NumberFormatException e )
        {
            JOptionPane.showMessageDialog( this, "La nota debe tener un valor num�rico. (ej. 2.5)", "Error", JOptionPane.ERROR_MESSAGE );
        }
    }
    
    public void refrescar()
    {
    	panelDatos.refrescarNotasALL(curso.getNotas());
    }

    /**
     * Muestra el promedio en un mensaje de texto
     */
    public void mostrarPromedio( )
    {
        JOptionPane.showMessageDialog( this, "Promedio: " + Double.toString( curso.promedio( ) ), "Promedio", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Muestra el n�mero de estudiantes con nota mayor al promedio
     */
    public void mostrarMayores( )
    {
        JOptionPane.showMessageDialog( this, "N�mero de estudiantes con nota mayor al promedio: " + Integer.toString( curso.cuantosEncimaPromedio( ) ), "Estudiantes", JOptionPane.INFORMATION_MESSAGE );
    }

    // -----------------------------------------------------------------
    // Puntos de Extensi�n
    // -----------------------------------------------------------------

    /**
     * M�todo para la extensi�n 1
     */
    public void reqFuncOpcion1( )
    {
        String resultado = curso.metodo1( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
        refrescar();
    }

    /**
     * M�todo para la extensi�n 2
     */
    public void reqFuncOpcion2( )
    {
        String resultado = curso.metodo2( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
        refrescar();
    }

    // -----------------------------------------------------------------
    // Programa principal
    // -----------------------------------------------------------------

    /**
     * Este m�todo ejecuta la aplicaci�n, creando una nueva interfaz
     * @param args. Argumentos de la aplicaci�n. No se utilizan.
     */
    public static void main( String[] args )
    {
        InterfazNotasCurso interfaz = new InterfazNotasCurso( );
        interfaz.setVisible( true );

    }
}