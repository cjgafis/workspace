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
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * Panel donde se muestran los datos
 */
public class PanelDatos extends JPanel implements ActionListener
{
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Ventana principal
	 */
	private InterfazNotasCurso ventana;

	/**
	 * N�mero de estudiantes en el curso
	 */
	private int numEstudiantes;

	// -----------------------------------------------------------------
	// Atributos de la interfaz
	// -----------------------------------------------------------------

	/**
	 * Etiquetas de los n�meros de estudiantes
	 */
	private JLabel etiquetasNumeros[];

	/**
	 * Etiquetas de las notas de los estudiantes
	 */
	private JLabel etiquetasNotas[];

	/**
	 * Botones de cambiar nota
	 */
	private JButton btnCambiar[];

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Constructor del panel
	 * @param laVentana Ventana principal. laVentana != null.
	 * @param numEst N�mero de notas a manejar. numEst >0
	 */
	public PanelDatos( InterfazNotasCurso laVentana, int numEst )
	{
		// Guarda los datos
		ventana = laVentana;
		numEstudiantes = numEst;

		etiquetasNumeros = new JLabel[numEstudiantes];
		etiquetasNotas = new JLabel[numEstudiantes];
		btnCambiar = new JButton[numEstudiantes];

		setBorder( new TitledBorder( "Notas" ) );
		setLayout( new GridLayout( numEstudiantes, 3 ) );

		Font fuenteTexto = new JLabel( ).getFont( );
		fuenteTexto = fuenteTexto.deriveFont( fuenteTexto.getStyle( ) ^ Font.BOLD );

		// Crea los datos usando un ciclo
		for( int i = 0; i < numEstudiantes; i++ )
		{
			etiquetasNumeros[ i ] = new JLabel( "Estudiante " + Integer.toString( i + 1 ) + ": " );
			etiquetasNumeros[ i ].setFont( fuenteTexto );
			add( etiquetasNumeros[ i ] );

			etiquetasNotas[ i ] = new JLabel( "0.0" );
			etiquetasNotas[ i ].setForeground( Color.BLUE );
			etiquetasNotas[ i ].setHorizontalAlignment( JLabel.CENTER );
			add( etiquetasNotas[ i ] );

			btnCambiar[ i ] = new JButton( "Cambiar" );
			btnCambiar[ i ].setBackground( new Color( 245, 245, 245 ) );
			btnCambiar[ i ].addActionListener( this );
			btnCambiar[ i ].setActionCommand( Integer.toString( i ) );
			add( btnCambiar[ i ] );
		}
	}

	// -----------------------------------------------------------------
	// M�todos
	// -----------------------------------------------------------------

	/**
	 * Actualiza las notas en la interfaz
	 * @param nota Nota del estudiante.
	 * @param nunEstudiante N�mero de estudiante. 1 <= estudiante <= 12.
	 */
	public void refrescarNota( int nunEstudiante, double nota )
	{
		etiquetasNotas[ nunEstudiante - 1 ].setText( Double.toString( nota ) );
	}

	public void refrescarNotasALL(double notas[])
	{
		for(int i=0; i<notas.length; i++)
		{
			etiquetasNotas[i].setText(Double.toString(notas[i]));
		}

	}

	/**
	 * Manejo de eventos de los botones
	 * @param e Evento que gener� la acci�n. e != null.
	 */
	public void actionPerformed( ActionEvent e )
	{
		// Saca el numero del estudiante
		int estudiante = Integer.parseInt( e.getActionCommand( ) ) + 1;
		ventana.cambiarNota( estudiante );
	}
}