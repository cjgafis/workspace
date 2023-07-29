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

package uniandes.cupi2.notasCurso.test;

import junit.framework.TestCase;
import uniandes.cupi2.notasCurso.mundo.Curso;

/**
 * Esta es la clase usada para verificar que los m�todos de la clase Curso est�n correctamente implementados
 */
public class CursoTest extends TestCase
{
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Es la clase donde se har�n las pruebas
     */
    private Curso curso;

    //-----------------------------------------------------------------
    // M�todos
    //-----------------------------------------------------------------

    /**
     * Construye un nuevo Curso vacia
     */
    private void setupEscenario1( )
    {
        curso = new Curso( );
        curso.cambiarNota( 1, 5.0 );
        curso.cambiarNota( 2, 4.2 );
        curso.cambiarNota( 3, 2.5 );
        curso.cambiarNota( 4, 3.6 );
        curso.cambiarNota( 5, 5.0 );
        curso.cambiarNota( 6, 2.0 );
        curso.cambiarNota( 7, 4.8 );
        curso.cambiarNota( 8, 4.9 );
        curso.cambiarNota( 9, 0.0 );
        curso.cambiarNota( 10, 0.1 );
        curso.cambiarNota( 11, 3.2 );
        curso.cambiarNota( 12, 3.0 );
    }
    
    /**
     * Construye un nuevo Curso vacia
     */
    private void setupEscenario2( )
    {
        curso = new Curso( );
        curso.cambiarNota( 1, 0.0 );
        curso.cambiarNota( 2, 1.2 );
        curso.cambiarNota( 3, 1.5 );
        curso.cambiarNota( 4, 1.6 );
        curso.cambiarNota( 5, 0.0 );
        curso.cambiarNota( 6, 1.0 );
        curso.cambiarNota( 7, 1.8 );
        curso.cambiarNota( 8, 1.9 );
        curso.cambiarNota( 9, 1.0 );
        curso.cambiarNota( 10, 1.1 );
        curso.cambiarNota( 11, 1.2 );
        curso.cambiarNota( 12, 1.0 );
    }
    
    /**
     * Construye un nuevo Curso vacia
     */
    private void setupEscenario3( )
    {
        curso = new Curso( );
        curso.cambiarNota( 1, 2.0 );
        curso.cambiarNota( 2, 3.2 );
        curso.cambiarNota( 3, 3.2 );
        curso.cambiarNota( 4, 3.4 );
        curso.cambiarNota( 5, 2.0 );
        curso.cambiarNota( 6, 3.0 );
        curso.cambiarNota( 7, 2.8 );
        curso.cambiarNota( 8, 2.9 );
        curso.cambiarNota( 9, 2.0 );
        curso.cambiarNota( 10, 2.1 );
        curso.cambiarNota( 11, 2.2 );
        curso.cambiarNota( 12, 3.0 );
    }
    
    /**
     * Construye un nuevo Curso vacia
     */
    private void setupEscenario4( )
    {
        curso = new Curso( );
        curso.cambiarNota( 1, 5.0 );
        curso.cambiarNota( 2, 4.2 );
        curso.cambiarNota( 3, 3.5 );
        curso.cambiarNota( 4, 3.6 );
        curso.cambiarNota( 5, 5.0 );
        curso.cambiarNota( 6, 4.0 );
        curso.cambiarNota( 7, 4.8 );
        curso.cambiarNota( 8, 4.9 );
        curso.cambiarNota( 9, 4.0 );
        curso.cambiarNota( 10, 4.1 );
        curso.cambiarNota( 11, 4.2 );
        curso.cambiarNota( 12, 4.0 );
    }

    /**
     * Prueba del Promedio
     */
    public void testPromedio( )
    {
        setupEscenario1( );

        assertEquals( "El promedio no es correcto.", 3.191666666666667, curso.promedio( ), 0 );
    }

    /**
     * Prueba de los estudiantes con nota mayor al promedio
     *  
     */
    public void testMayores( )
    {
        setupEscenario1( );

        assertEquals( "El numero de estudiantes por encima del promedio deben ser 7", 7, curso.cuantosEncimaPromedio( ) );
    }
    
    /**
     * Prueba para saber el rango con mas notas
     *  
     */
    public void testRangoConMasNotas ( ) 
    {
    	setupEscenario1( );

        assertEquals( "El rango con mas notas es el 3", 3, curso.rangoConMasNotas() );
        
        setupEscenario2( );

        assertEquals( "El rango con mas notas es el 1", 1, curso.rangoConMasNotas() );
        
        setupEscenario3( );

        assertEquals( "El rango con mas notas es el 2", 2, curso.rangoConMasNotas() );
        
        setupEscenario4( );

        assertEquals( "El rango con mas notas es el 3", 3, curso.rangoConMasNotas() );
    }
    
    public void testSumadasDanElNumero ( ) 
    {
    	setupEscenario1( );

        assertEquals( "El numero de notas para llegar a 30 es 8 ", 8, curso.sumadasDanElNumero(30));
        
        setupEscenario2( );

        assertEquals( "El numero de notas para llegar a 30 es -1 ", -1, curso.sumadasDanElNumero(30));
        
        setupEscenario3( );

        assertEquals( "El numero de notas para llegar a 30 es 12 ", 12, curso.sumadasDanElNumero(30));
        
        setupEscenario4( );

        assertEquals( "El numero de notas para llegar a 30 es 7 ", 7, curso.sumadasDanElNumero(30));
    }
}